import { Component } from '@angular/core';

import { StorageService } from '../services/storage.service';

@Component({
  selector: 'app-form-exer07',
  templateUrl: './form-exer07.component.html',
  styleUrls: ['./form-exer07.component.scss'],
})
export class FormExer07Component {

  email: string = ''
  senha: string = ''
  constructor(private storage_service: StorageService) { }

  enviarDados() {
    this.storage_service.sendToLocalStorage({ email: this.email, senha: this.senha })
  }

}
