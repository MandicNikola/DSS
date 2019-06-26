import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { PacientService } from '../../services/pacient.service';

import { Pacient } from '../../model/Pacient';
import { Pregled } from '../../model/Pregled';
import { PreventivniPregled } from '../../model/PreventivniPregled';

@Component({
  selector: 'app-pacient-details',
  templateUrl: './pacient-details.component.html',
  styleUrls: ['./pacient-details.component.css']
})
export class PacientDetailsComponent implements OnInit {

  idPacient : number;
  pacient : Pacient = new Pacient();

  preventivniPregledi : Array<PreventivniPregled> = [];
  pregledi : Array<Pregled> = [];


  constructor(
    private pacientService : PacientService,
    private router : Router,
    private route: ActivatedRoute
  ) { 
    this.idPacient = parseInt(this.route.snapshot.paramMap.get("id"));
    this.pacientService.getPacient(this.idPacient).subscribe(
      data => {
        this.pacient = data
        console.log(data);
      }
    );
    this.pacientService.getPregledi(this.idPacient).subscribe(
      data => this.pregledi = data
    );

    this.pacientService.getPreventivniPregledi(this.idPacient).subscribe(
      data => {this.preventivniPregledi = data
      console.log(this.preventivniPregledi);
      });

  }

  ngOnInit() {
  }

  back() : void {
    this.router.navigate(['/pacients']);
  }

  trackByIdentity = (index: number, item: Pregled) : number => (item.id); 

}
