package be.sha2001.featureflags.rest.person;

import be.sha2001.featureflags.business.person.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto toTDto(Person person);
    Person toDomain(PersonDto personDto);

    List<PersonDto> toTDto(List<Person> persons);
}
