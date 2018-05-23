import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PasswordResponse, PasswordRequest } from '../domain/domain';

@Injectable()
export class PasswordService {

  constructor(private _httpClient: HttpClient) { }

  checkPassword(password) {
    var ip = window.location.origin;
    const url = ip + '/api/v1/password/check';
    var request = new PasswordRequest();
    request.password = password;
    return this._httpClient.post<PasswordResponse>(url, request);
  }
}
