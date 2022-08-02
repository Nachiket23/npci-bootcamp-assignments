import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';

@Component({
  selector: 'app-buyer',
  templateUrl: './buyer.component.html',
  styleUrls: ['./buyer.component.css']
})
export class BuyerComponent implements OnInit {

  product: Product[]
  constructor(private service: ManagmentServiceService) { }

  ngOnInit(): void {
    this.listOfProduct();
  }

  listOfProduct(){
    this.service.getAllProducts().subscribe(data=>{
      this.product=data
    })
  }

}
