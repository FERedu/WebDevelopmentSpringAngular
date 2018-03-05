import { Component, OnInit } from '@angular/core';
import { StatusService } from './shared/status.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
  applicationStatus: string;

  constructor(private statusService: StatusService) {}

  ngOnInit(): void {
    this.statusService.getApplicationStatus()
      .subscribe(response => {
        this.applicationStatus = response.status;
      }, () => {
        this.applicationStatus = 'DOWN';
      });
  }
}
