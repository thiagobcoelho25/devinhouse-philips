import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: "addbetweenspace" })
export class AddCurrencySpaceBetweenPipe implements PipeTransform {
  transform(name: string): string {
    if (name.split(" ").length > 1) {
      return name.normalize('NFD').replace(/[\u0300-\u036f]/g, "").replaceAll(" ", "-")
    } else {
      return name;
    }
  }
}
