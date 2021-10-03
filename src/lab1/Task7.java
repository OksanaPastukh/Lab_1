package lab1;

public class Task7 {

    public static void main(final String[] args)
    {
        final User user1 = new User();
        user1.setFirstName("Petr");
        user1.setLastName("Petrov");
        user1.setAge(17);
        user1.setEmail("email@.com");
        System.out.print(user1.toString());

        System.out.println();

        final User user2 = new User();
        user2.setFirstName("Oksana");
        user2.setLastName("Pastukh");
        user2.setAge(17);
        user2.setEmail("email@.com");
        System.out.print(user2.toString());

        System.out.println();

        System.out.print(user1.equals(user2));
        System.out.println();
        System.out.print(user1.hashCode());
    }
}
