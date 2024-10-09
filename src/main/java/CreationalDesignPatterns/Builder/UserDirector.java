package CreationalDesignPatterns.Builder;

public class UserDirector {

    private UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User constructUser() {
        return userBuilder.withFirstName("John")
                .withLastName("Doe")
                .withAddress("1234 Elm St")
                .withPhoneNumber(1234567890)
                .build();
    }

}
