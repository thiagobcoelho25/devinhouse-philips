import { Component, Input } from '@angular/core';
import { Card } from 'src/app/interfaces/card';


@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {

  @Input()
  cards: Card = { Total: 0, FrontEnd: 0, BackEnd: 0, FullStack: 0, SoftSkill: 0 }
}
