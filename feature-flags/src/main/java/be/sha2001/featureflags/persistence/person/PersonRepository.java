package be.sha2001.featureflags.persistence.person;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends ListCrudRepository<PersonEntity, UUID> {
}
