import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './pages/about/about.component';
import { HomeComponent } from './pages/home/home.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    children: [
      {
        path: "",
        redirectTo: 'todos',
        pathMatch: 'full'
      },
      {
        path: 'nao-lidos',
        component: HomeComponent
      },
      {
        path: 'todos',
        component: HomeComponent
      },
      {
        path: 'lidos',
        component: HomeComponent
      }
    ]
  },
  {
    path: 'about',
    component: AboutComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
