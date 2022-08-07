import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { OrderService } from '../order.service';


@Component({
  selector: 'app-ordernow',
  templateUrl: './ordernow.component.html',
  styleUrls: ['./ordernow.component.css']
})
export class OrdernowComponent implements OnInit {

  title="OrderNow";

  constructor(private orderService: OrderService){}

  submit(submitForm: NgForm){

    this.orderService.getOrder(submitForm.value).subscribe(
      (resp) => {
        console.log(resp);
        submitForm.reset();
      },
      (err) => {
        console.log(err);
      }
    )

  }


  ngOnInit(): void {
  }


}
