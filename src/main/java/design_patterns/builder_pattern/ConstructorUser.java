package design_patterns.builder_pattern;

public class ConstructorUser {
    private final String firstName;
    private final String lastName;
    private String email;
    private String hobby;

    public ConstructorUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = null;
        this.hobby = null;
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

    public String getHobby() {
        return hobby;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        ConstructorUser bob = new ConstructorUser("bob","thornton");
        bob.setEmail("a@gmail.com");
        bob.setHobby("tennis");
    }
}
