import { Directive, HostListener, Input } from '@angular/core';
import { NgControl } from '@angular/forms';

@Directive({
  selector: '[appMaxlength]'
})
export class MaxlengthDirective {


  @Input()
  max_number: number = 0

  constructor(private control: NgControl) {

  }

  @HostListener('input', ['$event'])
  onEvent($event: InputEvent) {
    // console.log($event);
    const words: string = this.control.value

    /*
    The Model-Driven form approach
    https://stackoverflow.com/questions/40682717/angular-2-input-directive-modifying-form-control-value
    */
    if (this.control.value.length > this.max_number) {
      this.control.control?.setValue(words.slice(0, this.max_number));
    }

  }
}
