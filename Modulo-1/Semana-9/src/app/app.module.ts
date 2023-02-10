import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { FormMateriaComponent } from './form-materia/form-materia.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ItemCardComponent } from './item-card/item-card.component';
import { FormExer07Component } from './form-exer07/form-exer07.component';

@NgModule({
  declarations: [
    AppComponent,
    FormMateriaComponent,
    NavbarComponent,
    ItemCardComponent,
    FormExer07Component
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
