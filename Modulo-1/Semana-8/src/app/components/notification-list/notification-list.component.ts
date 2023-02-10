import { Component } from '@angular/core';
import { DADOS } from './dados';

@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.css']
})
export class NotificationListComponent {
  DADOS = DADOS

  FuncaoAlterarLido(id: number) {
    const item = this.DADOS.find(item => item.id === id)
    if(item) {
      item.lido = item.lido == true ? false : true
    }
  }
}
