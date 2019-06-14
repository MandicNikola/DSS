import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { MainComponent } from './main/main.component';
import { PregledComponent } from './pregled/pregled.component';

const routes : Routes = [
  {path: '', redirectTo: '/index', pathMatch: 'full'},
  {path: 'index', component: MainComponent},
  {path: 'pregled/:id', component: PregledComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
