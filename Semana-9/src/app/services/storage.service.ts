import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor() { }


  sendToLocalStorage(data: any) {
    sessionStorage.setItem('data', JSON.stringify(data))
  }
}
