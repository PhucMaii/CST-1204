public class App {
        // Method whose name is main
        // It is also of type public, which means accessible to all 
        // void, this void means this method doesn't return anything
        // Exception its a situation which gets executed when your program breaks
    public static void main(String[] args) throws Exception {

        
        // This is for printing on the consoles, just like console.log in js
        System.out.println("Hello, World!");

        // This variable is of type string
        String userName = "binmai";

        // This variable is of type integer
        int age = 18;

        // We are concatenating strings
        System.out.println(userName + " is " + age + " years old.");

        boolean isCool = true;

        // Implicit Typecasting 
        short num = 20; 
        int num2 = num;

        System.out.println(num2);

        // Explicit Typecasting 
        int num3 = 20; 
        short num4 = (short)num3;

        System.out.println(num4);
    }
}
