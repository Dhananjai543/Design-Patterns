package CreationalDesignPatterns.Builder;

public interface UserBuilder {

    UserBuilder withFirstName(String firstName);

    UserBuilder withLastName(String lastName);

    UserBuilder withAddress(String address);

    UserBuilder withPhoneNumber(int phoneNumber);

    User build();
}
