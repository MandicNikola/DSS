import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { PacientService } from '../../services/pacient.service';

import { Pacient } from '../../model/Pacient';

@Component({
  selector: 'app-pacient-details',
  templateUrl: './pacient-details.component.html',
  styleUrls: ['./pacient-details.component.css']
})
export class PacientDetailsComponent implements OnInit {

  idPacient : number;
  pacient : Pacient = new Pacient();

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
  }

  ngOnInit() {
  }

  back() : void {
    this.router.navigate(['/pacients']);
  }

}
