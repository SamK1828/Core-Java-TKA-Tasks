package MethodsAssignments;

public class MethodsQns {

    // 1. Print "Hello, World!"
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    // 2. Print the sum of two integers
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 3. Check if a number is even or odd
    public static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    // 4. Print the multiplication table of a number up to 10
    public static void printMultiplicationTable(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // 5. Swap two numbers without returning anything
    public static void swapNumbers(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        a ^= b ^= a ^= b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // 6. Print numbers from 1 to N
    public static void printNumbers(int n) {
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 7. Check if a number is positive, negative, or zero
    public static void checkNumberType(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }
    }

    // 8. Print numbers from N to 1
    public static void printReverseNumbers(int n) {
        System.out.println("Numbers from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 9. Print the square of a number
    public static void printSquare(int num) {
        System.out.println("Square of " + num + " is " + (num * num));
    }

    // 10. Print the cube of a number
    public static void printCube(int num) {
        System.out.println("Cube of " + num + " is " + (num * num * num));
    }

    // 11. Print the reverse of a number
    public static void printReverse(int num) {
        int reverse = 0, temp = num;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + reverse);
    }

    // 12. Print ASCII value of a character
    public static void printAsciiValue(char ch) {
        System.out.println("ASCII value of '" + ch + "' is " + (int) ch);
    }

    // 13. Check if a character is a vowel or consonant
    public static void checkVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println(ch + " is not a valid Character.");
        }
    }

    // Main method to call all functions using class name
    public static void main(String[] args) {
        
        // Calling all methods
        MethodsQns.printHelloWorld();
        
        MethodsQns.printSum(10, 20);
        
        MethodsQns.checkEvenOrOdd(15);
        
        MethodsQns.printMultiplicationTable(5);
        
        MethodsQns.swapNumbers(7, 3);
        
        printNumbers(10);
        
        checkNumberType(-5);
        
        printReverseNumbers(7);
        
        printSquare(6);
        
        printCube(4);
        
        printReverse(1234);
        
        printAsciiValue('A');
        
        checkVowelOrConsonant('e');
    }
}
