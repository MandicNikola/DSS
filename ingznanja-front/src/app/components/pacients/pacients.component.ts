import { Component, OnInit } from '@angular/core';
import { PacientService } from '../../services/pacient.service';
import { Router, ActivatedRoute } from '@angular/router';

import { Pacient } from '../../model/Pacient';

@Component({
  selector: 'app-pacients',
  templateUrl: './pacients.component.html',
  styleUrls: ['./pacients.component.css']
})
export class PacientsComponent implements OnInit {

  pacients: Array<Pacient> = [];
  filterPacients: Array<Pacient> = []

  filterIme : string = '';
  filterPrezime : string = '';
  filterGodiste : number ;

  constructor(
    private pacientService: PacientService,
    private router : Router,
    private route: ActivatedRoute
  ) { 
    this.pacientService.getPacients().subscribe(
      data => { 
        this.pacients = data;
        this.filterPacients = data;
      }
    );
  }

  ngOnInit() {
  }

  filter() : void {
    const { 
      filterIme,
      filterPrezime,
      filterGodiste,
      pacients
    } = this;

    let filterData = pacients;
    filterIme && filterData ? filterData = filterData.filter( o => o.ime.toLowerCase().includes(filterIme.toLowerCase())) : filterData;
    filterPrezime && filterData ? filterData = filterData.filter( o => o.prezime.toLowerCase().includes(filterPrezime.toLowerCase())) : filterData;
    filterGodiste && filterData ? filterData = filterData.filter( o => o.godiste <= filterGodiste) : filterData;

    this.filterPacients = filterData;

  }

  trackByIdentity = (index: number, item: Pacient) : number => (item.id);

  onDetailsClick(id : number) : void {
    this.router.navigate(['/details',id]);
  }

  preventivniPregled(id : number) : void {
    this.pacientService.noviPreventivniPregled(id).subscribe( idPr => {
      this.router.navigate(['/preventive',idPr , id]);
    })
  }


}
