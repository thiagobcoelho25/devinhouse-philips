import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FiltroComponent } from './components/filtro/filtro.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { CardComponent } from './components/card/card.component';
import { AddCurrencySpaceBetweenPipe } from './pipes/pipe-route-lista';

@NgModule({
  declarations: [
    AppComponent,
    FiltroComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent,
    CardComponent,
    AddCurrencySpaceBetweenPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  // providers: [AddCurrencySpaceBetweenPipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
