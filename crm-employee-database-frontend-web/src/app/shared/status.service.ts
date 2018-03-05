import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class StatusService {

  constructor(private http: HttpClient) {}

  getApplicationStatus(): Observable<any> {
    return this.http.get('/api/status');
  }

}
