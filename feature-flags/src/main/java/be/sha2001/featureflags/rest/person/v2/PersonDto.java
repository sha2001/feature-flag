package be.sha2001.featureflags.rest.person.v2;


import lombok.Builder;

@Builder
record PersonDto(
        String id,
        String name,
        String surname,
        int age,
        String email,
        String phone) {

}
