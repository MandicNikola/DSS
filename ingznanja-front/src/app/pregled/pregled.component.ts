import { Component, OnInit } from '@angular/core';
import { PacientService } from '../services/pacient.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pregled',
  templateUrl: './pregled.component.html',
  styleUrls: ['./pregled.component.css']
})
export class PregledComponent implements OnInit {

  simptoms : string[];
  id : string;
  constructor(private pacientService : PacientService, private route: ActivatedRoute) {
    pacientService.getSimptomsAll().subscribe(data => {
      this.simptoms = data;
     
    });
   }

  ngOnInit() {
    this.id = this.route.snapshot.params['id'];
    console.log(this.id);
  }

}
