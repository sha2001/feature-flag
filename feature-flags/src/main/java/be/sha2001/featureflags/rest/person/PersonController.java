package be.sha2001.featureflags.rest.person;


import be.sha2001.featureflags.business.person.Person;
import be.sha2001.featureflags.business.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persons")
public class PersonController {


    private final PersonService personService;
    private final PersonMapper personMapper;


    /** get person by id */
    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable("id") String id) {
        Optional<Person> person = personService.getPersonById(id);


        return person.map(value -> ResponseEntity.ok(personMapper.toTDto(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    /** get person by id */
    @GetMapping()
    public ResponseEntity<List<PersonDto>> getPersons() {
        List<Person> persons = personService.getAllPersons();


        return ResponseEntity.ok(personMapper.toTDto(persons));

    }


    public ResponseEntity<PersonDto> savePerson(PersonDto personDto) {
        Person person = personMapper.toDomain(personDto);
        Person savedPerson = personService.savePerson(person);
        return ResponseEntity.ok(personMapper.toTDto(savedPerson));
    }

}
