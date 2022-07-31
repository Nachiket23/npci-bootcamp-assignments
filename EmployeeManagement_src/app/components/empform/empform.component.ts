import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';

@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent implements OnInit {

  formModel = new Employee(0,"","",null,0,0,0,0);
  constructor() { }

  ngOnInit(): void {
    
  }

  onSubmit(){}

}
