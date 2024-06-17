package be.sha2001.featureflags.persistence.person;

import be.sha2001.featureflags.business.person.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper {

    List<Person> toDomain(List<PersonEntity> entities);

    PersonEntity toEntity(Person person);
    Person toDomain(PersonEntity personEntity);
}
