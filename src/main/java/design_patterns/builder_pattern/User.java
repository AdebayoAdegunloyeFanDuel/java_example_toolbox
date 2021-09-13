package design_patterns.builder_pattern;

public class User {
    private final String firstName; // Mandatory inputs due to final keyword
    private final String lastName; // Mandatory inputs due to final keyword
    private String email; // Optional - not final
    private String hobby;

    // this is our static class builder object within our User
    public static class UserBuilder{
        private final String firstName; // Mandatory inputs due to final keyword
        private final String lastName; // Mandatory inputs due to final keyword
        private String email; // Optional - not final
        private String hobby;

        public UserBuilder(String firstName, String lastname){
            this.firstName = firstName;
            this.lastName = lastname;
        }

        public UserBuilder setEmailAddress(String emailAddress){
            this.email = emailAddress;
            return this;
        }

        public UserBuilder setHobby(String hobby){
            this.hobby = hobby;
            return this;
        }

        public User buildUser(){
            return new User(this);
        }
    }

    // Stepping back into our User Class object

    private User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.hobby = userBuilder.hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        User janeDoe = new User.UserBuilder("jane", "doe").buildUser();
        User johnDoe = new User.UserBuilder("John", "doe").setEmailAddress("JD@Gmail.com").setHobby("tennis").buildUser();

        System.out.println(janeDoe.getEmail());
        System.out.println(johnDoe.getEmail());

    }
}
