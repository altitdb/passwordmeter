import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {

  public date = Date.now();
  private TIMER = 300000;
  private interval: any;
  public versionsNotifier;

  constructor() {
    this.loadingKeysStorage();
   }

  ngOnInit() {
    this.interval = setInterval(() => {
      this.date = Date.now();
    }, this.TIMER);
  }


  private loadingKeysStorage() {
    this.versionsNotifier = {};
    for (let index = 0; index < localStorage.length; index++) {
      const key = localStorage.key(index);
      this.versionsNotifier[key] = JSON.parse(localStorage.getItem(key)) || {};
    }
  }

  updateVersions() {
    this.loadingKeysStorage();
  }

}
