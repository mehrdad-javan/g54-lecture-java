package se.lexicon;

public class JavaFundamentals1 {

    // Java Comments
    // This is a single line comment
    /*
        This is a regular multi-line comment
        add multiple lines
    */

    /**
     * This is a Java Doc (Documentation Comments)
     * Used to create Documentations for the java codes
     */

    // psvm + Tab
    public static void main(String[] args) {
        // sout + Tab
        System.out.println("Hello World!");

        // ## Variable Declaration ##
        // To declare a primitive variable:
        // [data type] [variableName] = value;
        int speed = 100;
        System.out.println("Speed: " + speed);
        double salary = 30000.00;
        float area = 10.45f;
        //char grade = 'A';
        char specialChar = '\u2764'; // or copy its char like: ❤
        System.out.println(specialChar);
        long balance = 50000000000000L;


        // ### Operators In Java ###
        int numberOne = 10;
        int numberTwo = 5;
        System.out.println(numberOne + numberTwo); // 15
        System.out.println(numberOne - numberTwo); // 15
        int result = numberOne * numberTwo;
        System.out.println(result); // 50

        int division = numberOne / numberTwo; // returns the quotient
        int modules = numberOne % numberTwo; // returns the remainder

        // ### Increment and Decrement operators
        int number = 0;
        System.out.println(++number); // 1
        System.out.println(number++); // 0


        // ### Comparison Operators
        int a = 10, b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true


        // ### Selections ###
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        int grade = 56;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) { // 61 to 70
            System.out.println("Grade: C");
        } else if (grade >= 55 || grade >= 60) {
            System.out.println("Grade: FX");
        } else {
            System.out.println("Grade: F");
        }
        // ctrl + alt + L used to reformat the code

        // switch statement
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }


        // String in Java
        String firstName = "Mehrdad";
        String lastName = "Javan";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(firstName + " " + lastName);


        Person erik = new Person(); // object 1
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "Programming";
        System.out.println(erik.fullName());

        Person anna = new Person(); // object 2
        anna.firstName = "Anna";
        anna.lastName = "Andersson";
        anna.age = 54;
        anna.hobby = "Gaming";
        System.out.println(anna.fullName());


        JavaFundamentals1.displayMenu();

    }


    // implement a logic that is responsible to display a menu in the console.
    public static void displayMenu() {
        System.out.println("## Calculator App ##");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("0. Exit");
    }

    public static int addition(int n1, int n2) {
        return n1 + n2;
    }

    // declare a static method to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        // Fahrenheit= (Celsius * 9 / 5) + 32;
        return (celsius * 9 / 5) + 32;
    }

    public static boolean login(String username, String password){
        // validate  the params
        // hash password
        // compare username
        // compare password
        // and more logics as needed...
        return true;
    }


}
