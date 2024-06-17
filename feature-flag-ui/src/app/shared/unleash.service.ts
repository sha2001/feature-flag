import { Injectable } from '@angular/core';
import UnleashClient from "unleash-client/lib/client";

@Injectable({
  providedIn: 'root'
})
export class UnleashService {

  private unleash : UnleashClient;

  constructor() {
      this.unleash = new UnleashClient({
        instanceId: 'unleash-client',
        url: 'http://localhost:4242/api/',
        appName: 'my-app',
        refreshInterval: 10000,
        metricsInterval: 10000,
      }
  }

  async isFeatureEnabled(myFeature: string): Promise<Boolean> {
    return this.unleash.isEnabled(myFeature);
  }
}
