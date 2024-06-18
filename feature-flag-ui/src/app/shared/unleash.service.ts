import { Injectable } from '@angular/core';
import {initialize, Unleash} from "unleash-client";

@Injectable({
  providedIn: 'root'
})
export class UnleashService {
  private unleash: Unleash;




  constructor() {
    this.unleash = initialize( {
      url: 'http://localhost:4242/api/',
      appName: 'my-app',
      customHeaders: { Authorization: 'default:development.unleash-insecure-api-token' },
    })
  }

  public isFeatureEnabled(myFeature: string): Boolean {
    return  this.unleash.isEnabled(myFeature);
  }
}
