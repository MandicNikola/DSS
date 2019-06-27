import { Component, OnInit } from '@angular/core';
import { PacientService } from '../services/pacient.service';
import { ActivatedRoute, Router } from '@angular/router';

import { Pregled } from '../model/Pregled';
import { CaseBaseInfo } from '../model/CaseBaseInfo';
@Component({
  selector: 'app-pregled',
  templateUrl: './pregled.component.html',
  styleUrls: ['./pregled.component.css']
})
export class PregledComponent implements OnInit {

  idPacient: number;
  idPregled: number;
  pregled: Pregled = new Pregled();
  simptoms: string[] = [];
  selectMode: string = 'RULE';

  dijagnostike: string[] = [];
  potencijalneBolesti: string[] = [];

  selectBolest: string = '';
  showBolest: boolean = false;

  selectDijagnostika: string = '';
  showDijagnostika: boolean = false;

  id: string;
  constructor(private router: Router, private pacientService: PacientService, private route: ActivatedRoute) {
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
  diagnose(): void {
    const { selectMode } = this;
    if (selectMode === 'RULE') {
      this.pacientService.diagnose(this.pregled).subscribe(
        data => {
          this.potencijalneBolesti = data;
          this.showDijagnostika = false;
          this.showBolest = true;
        }
      );
    }
    else {
      let caseBaseInfoBody : CaseBaseInfo = new CaseBaseInfo();
      caseBaseInfoBody.idPregleda = this.idPregled;
      caseBaseInfoBody.simptomi = this.pregled.simptoms;
      this.pacientService.diganoseCase(caseBaseInfoBody).subscribe(
        data => {
          console.log(data);
        }
      );
    }
  }

  diagnostika(): void {
    const body = { bolest: this.selectBolest };
    this.pacientService.getDijagnostike(body).subscribe(
      dijagnostike => {
        this.dijagnostike = dijagnostike;
        this.showDijagnostika = true;
      }
    );
  }

  save(): void {
    let pregled: Pregled = new Pregled();
    pregled.id = this.idPregled;
    pregled.dijagnostika = this.selectDijagnostika;
    this.pacientService.setDijagnostika(pregled).subscribe(
      response => this.router.navigate(['/pacients'])
    );

  }

  back(): void {
    this.router.navigate(['/pacients']);
  }

}
