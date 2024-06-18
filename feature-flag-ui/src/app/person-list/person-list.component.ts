import {Component, OnInit} from '@angular/core';
import {PersonService} from "../shared/person.service";
import {Person} from "../shared/person";
import {NgForOf} from "@angular/common";
import {UnleashService} from "../shared/unleash.service";

@Component({
  selector: 'app-person-list',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './person-list.component.html',
  styleUrl: './person-list.component.css'
})
export class PersonListComponent implements OnInit{
  protected persons: Person[] = [];
  private isFeatureEnabled: Boolean = false

  constructor(private personService: PersonService, private unleashService: UnleashService) {
  }



  ngOnInit(): void {

    this.isFeatureEnabled = this.unleashService.isFeatureEnabled('my-feature');

    if (this.isFeatureEnabled)
    {
      this.personService.getAllPersons().subscribe((response) => {
        this.persons = response;
      });
    }
  }
}
