package be.sha2001.featureflags.rest.person.v1;

import be.sha2001.featureflags.business.person.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class PersonMapperTest {

    PersonMapper personMapper = Mappers.getMapper( PersonMapper.class );

    @Test
    void toTDto() {

        Person person = new Person();
        person.setId("1");
        person.setName("name test");
        person.setSurname("surname test");
        PersonDto dto = personMapper.toTDto(person);
        assertNotNull(dto);
        assertEquals(dto.name(), person.getName());
        assertEquals(dto.surname(), person.getSurname());
        assertEquals(dto.id(), person.getId());
    }

    @Test
    void toDomain() {
    }

    @Test
    void testToTDto() {
    }
}