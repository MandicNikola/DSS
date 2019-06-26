import { Component, OnInit } from '@angular/core';
import { PacientService } from '../services/pacient.service';
import { ActivatedRoute } from '@angular/router';

import { Pregled } from '../model/Pregled';
@Component({
  selector: 'app-pregled',
  templateUrl: './pregled.component.html',
  styleUrls: ['./pregled.component.css']
})
export class PregledComponent implements OnInit {

  idPacient : number;
  idPregled : number;
  pregled : Pregled = new Pregled(); 
  simptoms : string[] = [];
  selectMode : string = 'RULE';
  id : string;
  constructor(private pacientService : PacientService, private route: ActivatedRoute) {
    pacientService.getSimptomsAll().subscribe(data => {
      this.simptoms = data;
    });
    this.idPregled = parseInt(this.route.snapshot.paramMap.get("id"));
    this.idPacient = parseInt(this.route.snapshot.paramMap.get("idPacient"));
    this.pregled.id = this.idPregled;
    


  }

  ngOnInit() {
    this.id = this.route.snapshot.params['id'];
    console.log(this.id);
  }

  //zavrsiti ovo iz dijagnoze sta nam treba
  diagnose() : void {
      this.pacientService.diagnose(this.pregled).subscribe(
        data => console.log(data)
      );
  }

}
