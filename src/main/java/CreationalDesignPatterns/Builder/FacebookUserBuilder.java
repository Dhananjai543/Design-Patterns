package CreationalDesignPatterns.Builder;

public class FacebookUserBuilder implements UserBuilder{

    private User user;

    public FacebookUserBuilder() {
        this.user = new User();
    }

    @Override
    public UserBuilder withFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    @Override
    public UserBuilder withLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    @Override
    public UserBuilder withAddress(String address) {
        user.setAddress(address);
        return this;
    }

    @Override
    public UserBuilder withPhoneNumber(int phoneNumber) {
        user.setPhoneNumber(phoneNumber);
        return this;
    }

    @Override
    public User build() {
        return user;
    }
}
