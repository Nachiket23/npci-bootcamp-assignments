import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';

@Component({
  selector: 'app-categoryform',
  templateUrl: './categoryform.component.html',
  styleUrls: ['./categoryform.component.css']
})
export class CategoryformComponent implements OnInit {

  formModel: Category = new Category(0,"")
  constructor(private service: ManagmentServiceService, private route: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.service.saveCategory(this.formModel).subscribe(()=>{
      this.route.navigateByUrl("/categories")
    });
  }

}
