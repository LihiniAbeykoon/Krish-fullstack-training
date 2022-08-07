import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8082';

  public getOrder(orderData: any){
    return this.http.post(this.API +'/save/order',orderData);
  }
}
