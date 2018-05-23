import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { PasswordService } from './password.service';
import { Subscription } from 'rxjs/Subscription';
import { PasswordResponse } from '../domain/domain';

@Component({
  selector: 'app-password',
  templateUrl: './password.component.html',
  styleUrls: ['./password.component.scss']
})
export class PasswordComponent implements OnInit {

  public response: PasswordResponse = new PasswordResponse();
  private subscription: Subscription = new Subscription();

  constructor(
    private _passwordService: PasswordService
  ) { }

  ngOnInit() {
  }

  public checkPassword(password) {
    this.subscription.add(
      this._passwordService.checkPassword(password).subscribe(suc => {
        this.response = suc;
      }, error => {
        this.response = new PasswordResponse();
      })
    );
  }

}