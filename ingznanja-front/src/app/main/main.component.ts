import { Component, OnInit } from '@angular/core';
import { PacientService } from '../services/pacient.service';

import { Pacient } from '../model/Pacient';
import { Pregled } from '../model/Pregled';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  pacients : Pacient[];
  pregledi : Pregled[];
  selectedPacient : Pacient;
  selectedPregled : Pregled;
  simptoms : any;
  diagnose : boolean;
  terapy : boolean;
  showDiagnoses : boolean;
  showTerapies : boolean;
  diagnoses : string[];
  terapies : string[];

  constructor(private pacientService : PacientService ) { 
    this.pacientService.getPacients().subscribe(pacients => {
      this.pacients = pacients;
      this.diagnose = false;
      this.terapy = false;
      this.showTerapies = false;
      this.showDiagnoses = false;
    });
  }

  onDetailsClick(id : number) : void {
    this.pacientService.getPregledi(id).subscribe(pregledi => {
      this.pregledi = pregledi;
      this.selectedPacient = this.pacients.find(o => o.id === id);
      this.showDiagnoses = false;
      this.showTerapies = false;
      this.selectedPregled = null;
    });
  }

  onPregledClick(id : number) : void {
    this.pacientService.getSimptoms(id).subscribe(simptomi => {
      this.simptoms = simptomi;
      this.selectedPregled = this.pregledi.find(o => o.id === id);
      const { selectedPregled : { dijagnoza, terapija } } = this;
      if(!dijagnoza)
        this.diagnose = true;
      else if(!terapija)
        this.terapy = true;

      this.showDiagnoses = false;
      this.showTerapies = false;
    });
  
  }

  chooseDiagnose(dijagnoza : string) : void {
    const { selectedPacient,
       selectedPregled 
    } = this;
    
    this.pacientService.getTerapies(selectedPregled.id,dijagnoza).subscribe( data => {
      this.terapies = data;
      this.pacientService.getPregledi(selectedPacient.id).subscribe((data) => 
      { 
        this.pregledi = data
        this.selectedPregled = this.pregledi.find(( o ) => o.id === selectedPregled.id);
        this.showDiagnoses = false;
        this.showTerapies = true;
        this.diagnose = false;
      });
    });
  }

  terapyClick() : void {
    const { selectedPregled: {id ,dijagnoza} } = this;
    this.pacientService.getTerapies(id, dijagnoza).subscribe( data => {
      this.terapies = data;
      this.showTerapies = false;   
    });
    
  }

  chooseTerapy(idPregleda : number, terapija: string) : void {
    this.pacientService.savePregled(idPregleda, terapija).subscribe(() => {
      this.showDiagnoses = false;
      this.selectedPregled.terapija = terapija;
      this.pacientService.getPregledi(this.selectedPacient.id).subscribe((data) => 
      {
        this.pregledi = data;
      })
    });
  }

  diagnoseClick(id : number) : void {
    this.pacientService.diagnose(id).subscribe(data =>{
      this.diagnoses = data;
      this.showDiagnoses = true;
    });
  }

  noviPregled(id : number) : void {
  }

  ngOnInit() {
  }

}
