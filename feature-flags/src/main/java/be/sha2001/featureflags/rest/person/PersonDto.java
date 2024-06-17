package be.sha2001.featureflags.rest.person;


import lombok.Builder;

@Builder
public record PersonDto(
        String id,
        String name,
        String surname,
        int age,
        String email,
        String phone) {

}
