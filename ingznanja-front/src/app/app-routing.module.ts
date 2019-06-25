import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { PregledComponent } from './pregled/pregled.component';
import { PacientsComponent } from './components/pacients/pacients.component';
import { PacientComponent } from './components/pacient/pacient.component';
import { PacientDetailsComponent } from './components/pacient-details/pacient-details.component';


const routes : Routes = [
  {path: '', redirectTo: '/pacients', pathMatch: 'full'},
  {path: 'pacients', component: PacientsComponent},
  {path: 'pregled/:id', component: PregledComponent},
  {path: 'pacient', component: PacientComponent },
  {path: 'details/:id', component: PacientDetailsComponent  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
