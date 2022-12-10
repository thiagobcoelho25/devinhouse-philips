import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {

  @Input('input_lista_botoes')
  lista_botoes: string[] = []

  @Input('input_botao_atual')
  botao_atual: string = ""

  // @Output()
  // output_filtro: EventEmitter<string> = new EventEmitter<string>();

  // getTypeButton(valro_bottao: string) {
  //   this.botao_atual = valro_bottao
  //   this.output_filtro.emit(valro_bottao)
  // }
}
