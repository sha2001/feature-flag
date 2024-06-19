package be.sha2001.featureflags.rest.person.v1;


import lombok.Builder;

@Builder
record PersonDto(
        String id,
        String name,
        String surname){
}
