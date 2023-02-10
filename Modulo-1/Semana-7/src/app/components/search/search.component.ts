import { Component, EventEmitter, Output } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {


  @Output("output-search")
  newItemEvent = new EventEmitter<string>();

  @Output("clear-search")
  clear_search = new EventEmitter<string>();

  search_form = new FormGroup({
    input_search: new FormControl('')
  })

  onSubmit(event: Event) {
    this.newItemEvent.emit(this.search_form.get('input_search')?.value || "")
    event.preventDefault()
  }

  onReset(event: Event) {
    this.clear_search.emit()
  }
}
