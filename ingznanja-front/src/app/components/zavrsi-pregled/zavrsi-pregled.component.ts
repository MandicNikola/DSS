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

  pregled : Pregled = new Pregled();

  showGrafPregleda : boolean = false;

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

    this.pacientService.getPregled(this.idPregleda).subscribe(
      response => this.pregled = response
    );
    
  }

  ngOnInit() {
  }

  terapies() : void {
    let pregledSend : Pregled = new Pregled();
    pregledSend.id = this.idPregleda;
    pregledSend.dijagnoza = this.selectedBolest;
    this.pacientService.setDijagnoza(pregledSend).subscribe(
      terapije => {
        this.terapije = terapije
        this.selectedTerapija = this.terapije[0];
        this.showTerapije = true;
      }
    );
  }

  finish() : void {
    let pregledSend : Pregled = new Pregled();
    pregledSend.id = this.idPregleda;
    pregledSend.terapija = this.selectedTerapija;
    this.pacientService.setTerapija(pregledSend).subscribe(
      terapije => {
        this.router.navigate(['/pacients']);
      }
    );
  }

  showGraf() : void {
    this.pregled.dijagnoza = this.selectedBolest;
    this.pregled.terapija = this.selectedTerapija;

    this.showGrafPregleda = !this.showGrafPregleda;
  }

}
