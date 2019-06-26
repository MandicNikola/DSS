import { Component, OnInit } from '@angular/core';
import { PacientService } from '../../services/pacient.service';
import { Router, ActivatedRoute } from '@angular/router';

import { Pacient } from '../../model/Pacient';
import { PreventivniPregled } from '../../model/PreventivniPregled';
import { VirtualTimeScheduler } from 'rxjs';

@Component({
  selector: 'app-preventive',
  templateUrl: './preventive.component.html',
  styleUrls: ['./preventive.component.css']
})
export class PreventiveComponent implements OnInit {

  idPregled : number;
  idPacient : number;
  dijagnostika : Array<string> = [];
  pacient : Pacient = new Pacient();
  preventivniPregled : PreventivniPregled = new PreventivniPregled();

  constructor(
    private pacientService: PacientService,
    private router : Router,
    private route: ActivatedRoute
  ) {
    this.idPregled = parseInt(this.route.snapshot.paramMap.get("id"));
    this.idPacient = parseInt(this.route.snapshot.paramMap.get("idPacient"));
    this.pacientService.getPrevPregledDiagnostic(this.idPregled).subscribe(
      data => {
        this.dijagnostika = data;
      }
    );
    this.pacientService.getPacient(this.idPacient).subscribe(
      data => this.pacient = data
    );
    this.preventivniPregled.id = this.idPregled;
    this.preventivniPregled.pacientId = this.idPacient;

  }

  ngOnInit() {
  }

  preventive() : void {
    this.pacientService.savePreventivniPregled(this.idPregled,this.preventivniPregled).subscribe(
      response => this.router.navigate(['/pacients'])
    );
    
  }

}
