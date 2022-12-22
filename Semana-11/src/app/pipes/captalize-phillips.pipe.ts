import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'captalizePhillips'
})
export class CaptalizePhillipsPipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): unknown {
    return value.split(" ").map(ele => ele.charAt(0).toUpperCase() + ele.slice(1)).join(" ");
  }

}
