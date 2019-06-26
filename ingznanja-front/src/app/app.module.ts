import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { AppRoutingModule } from './app-routing.module';
import { MainComponent } from './main/main.component';
import { PregledComponent } from './pregled/pregled.component';
import { PacientsComponent } from './components/pacients/pacients.component';
import { PacientComponent } from './components/pacient/pacient.component';
import { PacientDetailsComponent } from './components/pacient-details/pacient-details.component';
import { PreventiveComponent } from './components/preventive/preventive.component';


@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    MainComponent,
    PregledComponent,
    PacientsComponent,
    PacientComponent,
    PacientDetailsComponent,
    PreventiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
