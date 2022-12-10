import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { INotificacao } from 'src/app/models/notifications';
import { AddCurrencySpaceBetweenPipe } from 'src/app/pipes/pipe-route-lista';
import { NOTIFICATIONS_DATABASE } from 'src/app/utils/database';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  lista_botoes: string[] = ['Todos', 'Não lidos', 'Lidos']

  base_dados = NOTIFICATIONS_DATABASE
  output_filtro = "Todos"
  base_dados_filtrada = this.base_dados

  constructor(private route: ActivatedRoute, private router: Router, private pipe: AddCurrencySpaceBetweenPipe) {

  }

  ngOnInit(): void {
    this.route.url.subscribe((r) => {
      this.output_filtro = this.reverseStringLista(r[0].path)
      this.base_dados_filtrada = this.filtrarPorOutputFiltro(this.base_dados)
    });
  }

  returnOutputFiltro(output_filtro: string) {
    const pipeTransform = new AddCurrencySpaceBetweenPipe()
    const transformed = pipeTransform.transform(output_filtro.toLowerCase())
    this.router.navigate(['home', transformed])
    // console.log(this.route.snapshot.url[0].path)
  }

  private filtrarPorOutputFiltro(lista: INotificacao[]) {
    if (this.output_filtro === 'Lidos') {
      return this.base_dados.filter(item => item.lido === true)
    } else if (this.output_filtro === 'Não lidos') {
      return this.base_dados.filter(item => item.lido === false)
    } else {
      return this.base_dados
    }
  }

  private reverseStringLista(filtro_from_url: string) {
    if (filtro_from_url === 'lidos') {
      return 'Lidos'
    } else if (filtro_from_url === 'nao-lidos') {
      return 'Não lidos'
    } else {
      return 'Todos'
    }
  }

}
