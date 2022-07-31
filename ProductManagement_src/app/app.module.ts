import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProListComponent } from './components/pro-list/pro-list.component';
import { CatListComponent } from './components/cat-list/cat-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { Routes,RouterModule } from '@angular/router';
import { ProductformComponent } from './components/productform/productform.component';
import { CategoryformComponent } from './components/categoryform/categoryform.component';

const route : Routes = [
  {path: '',component:WelcomeComponent},
  {path: 'products',component:ProListComponent},
  {path: 'categories',component:CatListComponent},
  {path: 'productform',component:ProductformComponent},
  {path: 'categoryform',component:CategoryformComponent}

]
@NgModule({
  declarations: [
    AppComponent,
    ProListComponent,
    CatListComponent,
    ProListComponent,
    CatListComponent,
    WelcomeComponent,
    ProductformComponent,
    CategoryformComponent,
    ProductformComponent,
    CategoryformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(route)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
