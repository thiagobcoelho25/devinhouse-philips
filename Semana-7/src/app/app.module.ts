import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RightSideComponent } from './pages/right-side/right-side.component'
import { HeaderComponent } from './components/header/header.component';
import { LeftSideComponent } from './pages/left-side/left-side.component';
import { FormComponent } from './components/form/form.component';
import { MaxlengthDirective } from './directives/maxlength.directive';
import { CardComponent } from './components/card/card.component';
import { SearchComponent } from './components/search/search.component';
import { ArticleComponent } from './components/article/article.component';

@NgModule({
  declarations: [
    AppComponent,
    RightSideComponent,
    HeaderComponent,
    LeftSideComponent,
    FormComponent,
    MaxlengthDirective,
    CardComponent,
    SearchComponent,
    ArticleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
