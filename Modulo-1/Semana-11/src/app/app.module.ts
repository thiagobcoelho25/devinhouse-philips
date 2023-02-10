import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

import { CaptalizePhillipsPipe } from './pipes/captalize-phillips.pipe';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FotosComponent } from './components/fotos/fotos.component';
import { ModalComponent } from './components/modal/modal.component';
import { InputComponent } from './components/input/input.component';
import { Exer8Component } from './components/exer8/exer8.component';

@NgModule({
  declarations: [
    AppComponent,
    CaptalizePhillipsPipe,
    NavbarComponent,
    FotosComponent,
    ModalComponent,
    InputComponent,
    Exer8Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
