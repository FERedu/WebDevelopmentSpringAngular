import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { StatusService } from './shared/status.service';
import { HttpClientModule } from '@angular/common/http';
import { Route, RouterModule } from '@angular/router';
import { EmployeeCreateComponent } from './employee-create/employee-create.component';
import { BackendService } from './shared/backend.service';
import { FormsModule } from '@angular/forms';

const appRoutes: Route[] = [
  { path: 'employees/new', component: EmployeeCreateComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    EmployeeCreateComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    StatusService,
    BackendService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
