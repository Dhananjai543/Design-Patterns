package CreationalDesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        UserBuilder userBuilder = new FacebookUserBuilder();
        UserDirector userDirector = new UserDirector(userBuilder);
        User user = userDirector.constructUser();
        System.out.println(user);
    }
}
