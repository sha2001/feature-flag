package be.sha2001.featureflags.persistence.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(schema = "feature_flags", name = "person")
@Getter
@Setter
public class PersonEntity {
    @Id
    private UUID id;
    private String name;
    private String surname;
    private int age;
    @OneToOne
    private AddressEntity address;
}
