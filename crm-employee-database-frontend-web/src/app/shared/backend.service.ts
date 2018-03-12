import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Employee } from './employee.model';

@Injectable()
export class BackendService {
  constructor(private http: HttpClient) {}

  getAllEmployees(): Observable<Employee> {
    return <Observable<Employee>>this.http.get('/api/employees');
  }
}
