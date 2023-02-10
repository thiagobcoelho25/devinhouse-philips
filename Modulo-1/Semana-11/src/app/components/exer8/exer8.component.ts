import { Component } from '@angular/core';

@Component({
  selector: 'app-exer8',
  templateUrl: './exer8.component.html',
  styleUrls: ['./exer8.component.css']
})
export class Exer8Component {

  lista: string[] = []
  input_string: string = ""

  add() {
    if (this.input_string.length > 0) {
      this.lista.push(this.input_string)
      this.input_string = ""
    }
  }
}
