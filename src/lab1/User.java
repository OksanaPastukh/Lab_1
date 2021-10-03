package lab1;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + email;
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;
        if(((User) o).getFirstName().equals(this.getFirstName())
                && ((User) o).getLastName().equals(this.getLastName())
               && ((User) o).getEmail().equals(this.getEmail())) return (true && age == user.age);
       else
           return false;
    }
    @Override
    public int hashCode() {
        return 31 * age +
                31 * this.getFirstName().hashCode() +
                31 * this.getLastName().hashCode() +
                31 * this.getEmail().hashCode();
    }
}
