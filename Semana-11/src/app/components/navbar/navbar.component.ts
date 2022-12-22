import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {

  lista_links = ['Home', 'Preços', 'Informações']

  page: string = this.lista_links[0]

  setPage(value: string) {
    this.page = value
  }
}
