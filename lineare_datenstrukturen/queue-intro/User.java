/**
 * A basic user with a name and age.
 */
public class User {

    private String name;
    private int age;

    public User(String pName, int pAge) {
        this.name = pName;
        this.age = pAge;
    }

    /**
     * Returns the name of the user.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the age of the user.
     * @return
     */
    public int getAge() {
        return this.age;
    }
}