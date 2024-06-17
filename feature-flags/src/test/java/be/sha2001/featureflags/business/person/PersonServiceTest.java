package be.sha2001.featureflags.business.person;

import be.sha2001.featureflags.common.exception.BusinessException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    private static final String ID = "id";
    @InjectMocks
    PersonService personService;

    @Mock
    PersonPersistence personPersistence;

    @Mock
    Person person;

    @Test
    void getPersonById_whenPersonExists_returnsOptionalWithperson() {

        when(personPersistence.getPersonById(ID)).thenReturn(Optional.of(person));
        Optional<Person> person = personService.getPersonById(ID);
        assertTrue(person.isPresent());
        verify(personPersistence).getPersonById(ID);
    }

    @Test
    void getPersonById_whenPersonNotExists_returnsEmpty() {
        when(personPersistence.getPersonById(ID)).thenReturn(Optional.empty());
        Optional<Person> person = personService.getPersonById(ID);
        assertTrue(person.isEmpty());
        verify(personPersistence).getPersonById(ID);

    }

    @Test
    void savePerson_withPerson_notException() {

        personService.savePerson(person);
        verify(personPersistence).savePerson(person);
    }

    @Test
    void save_withNull_throwsException() {


        assertThrows(BusinessException.class, ()-> personService.savePerson(null));
        verifyNoMoreInteractions(personPersistence);
    }
}