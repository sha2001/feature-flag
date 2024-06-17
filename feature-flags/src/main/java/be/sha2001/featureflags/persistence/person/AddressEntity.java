package be.sha2001.featureflags.persistence.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(schema = "feature_flags", name = "address")
@Getter
@Setter
public class AddressEntity {
    @Id
    private UUID id;
    private String address;
    private String city;
    private String country;
    private String postalCode;
}
