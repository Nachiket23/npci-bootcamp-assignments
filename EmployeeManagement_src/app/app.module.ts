import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpListComponent } from './components/emp-list/emp-list.component';
import { DeptListComponent } from './components/dept-list/dept-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { EmpformComponent } from './components/empform/empform.component';
import { FormsModule } from '@angular/forms';
const route : Routes = [
  
  {path: 'empform',component:EmpformComponent},
  {path:'',component:WelcomeComponent},
  {path:'employees',component:EmpListComponent},
  {path:'departments',component:DeptListComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    DeptListComponent,
    WelcomeComponent,
    EmpformComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot(route),
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
