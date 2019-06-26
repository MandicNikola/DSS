import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

import { PacientService } from '../../services/pacient.service';
import { Bolest } from '../../model/Bolest';
import { Pacient } from '../../model/Pacient';

@Component({
  selector: 'app-pacient',
  templateUrl: './pacient.component.html',
  styleUrls: ['./pacient.component.css']
})
export class PacientComponent implements OnInit {

  bolesti: Array<Bolest> = [];
  pacient: Pacient = new Pacient();

  constructor(
    private pacientService : PacientService,
    private router : Router,
    private route: ActivatedRoute
  ) { 
    this.pacientService.getBolesti().subscribe(
      data => this.bolesti = data
    );
  }

  ngOnInit() {
  }

  addPacient() : void {
    console.log(this.pacient);
    this.pacientService.addPacient(this.pacient).subscribe(
      data => {
        window.alert('Pacijent uspesno dodat!');
        this.router.navigate(['/pacients']);
      },
      error => window.alert('Greska!')
      
    );
  }


}
