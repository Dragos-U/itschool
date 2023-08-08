package session_4.practice;

public class MemoryReference {

    public static void main(String[] args) {
        String greetingOne =  "Hello";
        String greetingTwo =  "Hello";
        System.out.println(greetingOne == greetingTwo); // compare the contain
        System.out.println(greetingOne.equals(greetingTwo));

        User user1 = new User();
        User user2 = new User();
        user2 = user1;
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2)); // false since equals is not overriden

        int number = 5;
        double number2 =5.0;
        System.out.println(number == number2);




    }

}
