import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Pacient } from '../model/Pacient';
import { PreventivniPregled } from '../model/PreventivniPregled';


const ROOT_URL = '//localhost:8081/api';

@Injectable({
  providedIn: 'root'
})
export class PacientService {

  constructor(private http: HttpClient) { }

  getPacients() : Observable<any> {
    return this.http.get(`${ROOT_URL}/pacients/all`);
  }

  getPregledi(id : number) : Observable<any> {
    return this.http.get(`${ROOT_URL}/pacients/pregledi/${id}`);
  }

  getSimptoms(id : number) : Observable<any> {
    return this.http.get(`${ROOT_URL}/pregled/simptoms/${id}`);
  }

  diagnose(id : number) : Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/diagnoseProlog/${id}`, {});
  }

  getTerapies(id: number, diagnose: string) : Observable<any>
  {
    const body = {
      bolest : diagnose
    };
    return this.http.post(`${ROOT_URL}/pregled/diagnoseTerapyProlog/${id}`, body);
  }

  savePregled(idPregleda : number, terapija: string) : Observable<any> {
    const body = {
      terapija
    };
    return this.http.post(`${ROOT_URL}/pregled/save/${idPregleda}`, body);
  }

  getSimptomsAll() : Observable<any> {
    return this.http.get(`${ROOT_URL}/simptoms/all`);
  }

  getBolesti() : Observable<any> {
    return this.http.get(`${ROOT_URL}/simptoms/bolesti`);
  }

  addPacient(body: Pacient) : Observable<any> {
    return this.http.post(`${ROOT_URL}/pacients/add`,body);
  }

  getPacient(id : number) : Observable<any> {
    return this.http.get(`${ROOT_URL}/pacients/${id}`);
  }

  noviPreventivniPregled(id: number) : Observable<any> {
    return this.http.post(`${ROOT_URL}/preventivni/new/${id}`,{});
  }

  getPrevPregledDiagnostic(id: number) : Observable<any> {
    return this.http.get(`${ROOT_URL}/preventivni/prevdiagnostic/${id}`);
  }

  savePreventivniPregled(idPregleda: number, body: PreventivniPregled) : Observable<any> {
    return this.http.post(`${ROOT_URL}/preventivni/save/${idPregleda}`, body);
  }

}
