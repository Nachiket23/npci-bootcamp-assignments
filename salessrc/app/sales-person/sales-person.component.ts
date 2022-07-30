import { Component, OnInit } from '@angular/core';
import { Salesperson } from '../salesperson';

@Component({
  selector: 'app-sales-person',
  templateUrl: './sales-person.component.html',
  styleUrls: ['./sales-person.component.css']
})
export class SalesPersonComponent implements OnInit {

  name : string= "Nachiket";
  salesPersonList: Salesperson [] = [
    new Salesperson("Arun", "Kumar", "arun@gmail.com", 25000, "300"),
    new Salesperson("Ram", "Kumar", "ram@gmail.com", 26000, "400"),
    new Salesperson("Shyam", "Kumar", "shyam@gmail.com", 27000, "500")

  ] 

  formModel : Salesperson = new Salesperson("","","",0,"");
  // s1 : Salesperson = new Salesperson("Arun", "Kumar", "arun@gmail.com", 25000, 300)
  constructor() { }

  

  ngOnInit(): void {
    
  }

  onSubmit(){
    console.log(this.formModel);
    this.salesPersonList.push(this.formModel);
    
  }

}
