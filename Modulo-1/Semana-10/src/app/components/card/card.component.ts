import { Component, Input } from '@angular/core';
import { INotificacao } from 'src/app/models/notifications';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent {

  @Input()
  card_elemento?: INotificacao
}
