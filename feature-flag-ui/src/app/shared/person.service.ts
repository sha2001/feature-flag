import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Person} from "./person";

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  baseUrl:string = "http://localhost:8082";


  constructor(private httpClient : HttpClient) { }

  getAllPersons(): Observable<Person[]>   {
    return this.httpClient.get<Person[]>(this.baseUrl + '/api/persons');
  }
}
