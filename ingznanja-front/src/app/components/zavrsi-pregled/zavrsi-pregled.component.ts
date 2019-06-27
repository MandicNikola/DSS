import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { PacientService } from '../../services/pacient.service';

import { Bolest } from '../../model/Bolest';
import { Pregled } from '../../model/Pregled';

@Component({
  selector: 'app-zavrsi-pregled',
  templateUrl: './zavrsi-pregled.component.html',
  styleUrls: ['./zavrsi-pregled.component.css']
})
export class ZavrsiPregledComponent implements OnInit {

  idPregleda : number;
  
  bolesti: Array<Bolest> = [];
  selectedBolest : string = '';

  terapije: Array<string> = [];
  selectedTerapija : string = '';
  showTerapije : boolean = false;

  constructor(
    private pacientService : PacientService,
    private router : Router,
    private route: ActivatedRoute
  ) {
    this.idPregleda = parseInt(this.route.snapshot.paramMap.get("id"));
    this.pacientService.getBolesti().subscribe(
      response => {
        console.log(response);
        this.bolesti = response;
        this.selectedBolest = this.bolesti[0].naziv;
      }
    );
  }

  ngOnInit() {
  }

  terapies() : void {
    let pregled : Pregled = new Pregled();
    pregled.id = this.idPregleda;
    pregled.dijagnoza = this.selectedBolest;
    this.pacientService.setDijagnoza(pregled).subscribe(
      terapije => {
        this.terapije = terapije
        this.selectedTerapija = this.terapije[0];
        this.showTerapije = true;
      }
    );
  }

  finish() : void {
    let pregled : Pregled = new Pregled();
    pregled.id = this.idPregleda;
    pregled.terapija = this.selectedTerapija;
    this.pacientService.setTerapija(pregled).subscribe(
      terapije => {
        this.router.navigate['/pacients'];
      }
    );
  }

}
