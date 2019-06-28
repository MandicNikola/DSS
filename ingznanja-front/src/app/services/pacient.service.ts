import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Pacient } from '../model/Pacient';
import { PreventivniPregled } from '../model/PreventivniPregled';
import { Pregled } from '../model/Pregled';
import { CaseBaseInfo } from '../model/CaseBaseInfo';


const ROOT_URL = '//localhost:8081/api';

@Injectable({
  providedIn: 'root'
})
export class PacientService {

  constructor(private http: HttpClient) { }

  getPacients(): Observable<any> {
    return this.http.get(`${ROOT_URL}/pacients/all`);
  }



  getSimptoms(id: number): Observable<any> {
    return this.http.get(`${ROOT_URL}/pregled/simptoms/${id}`);
  }

  getTerapies(id: number, diagnose: string): Observable<any> {
    const body = {
      bolest: diagnose
    };
    return this.http.post(`${ROOT_URL}/pregled/diagnoseTerapyProlog/${id}`, body);
  }

  savePregled(idPregleda: number, terapija: string): Observable<any> {
    const body = {
      terapija
    };
    return this.http.post(`${ROOT_URL}/pregled/save/${idPregleda}`, body);
  }

  getSimptomsAll(): Observable<any> {
    return this.http.get(`${ROOT_URL}/simptoms/all`);
  }

  getBolesti(): Observable<any> {
    return this.http.get(`${ROOT_URL}/simptoms/bolesti`);
  }

  addPacient(body: Pacient): Observable<any> {
    return this.http.post(`${ROOT_URL}/pacients/add`, body);
  }

  getPacient(id: number): Observable<any> {
    return this.http.get(`${ROOT_URL}/pacients/${id}`);
  }

  noviPreventivniPregled(id: number): Observable<any> {
    return this.http.post(`${ROOT_URL}/preventivni/new/${id}`, {});
  }

  getPrevPregledDiagnostic(id: number): Observable<any> {
    return this.http.get(`${ROOT_URL}/preventivni/prevdiagnostic/${id}`);
  }

  savePreventivniPregled(idPregleda: number, body: PreventivniPregled): Observable<any> {
    return this.http.post(`${ROOT_URL}/preventivni/save/${idPregleda}`, body);
  }

  newPregled(idPacienta: number): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/new/${idPacienta}`, {});
  }

  diagnose(body: Pregled): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/diagnoseProlog`, body);
  }

  getPregledi(id: number): Observable<any> {
    return this.http.get(`${ROOT_URL}/pregled/getAll/${id}`);
  }

  getPreventivniPregledi(id: number): Observable<any> {
    return this.http.get(`${ROOT_URL}/preventivni/getAll/${id}`);
  }

  getDijagnostike(body: any): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/getDijagnostike`, body);
  }

  setDijagnostika(body: Pregled): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/setDijagnostika`, body);
  }

  setDijagnoza(body: Pregled): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/setDijagnoza`, body);
  }

  setTerapija(body: Pregled): Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/setTerapija`, body);
  }

  diganoseCase(body: CaseBaseInfo): Observable<any> {
    return this.http.post(`${ROOT_URL}/caseBased/case`, body);
  }

  getPregled(id: number ) : Observable<any> {
    return this.http.get(`${ROOT_URL}/pregled/get/${id}`);
  }

  setSimptoms(body: Pregled) : Observable<any> {
    return this.http.post(`${ROOT_URL}/pregled/setSimptoms`,body);
  }


}
