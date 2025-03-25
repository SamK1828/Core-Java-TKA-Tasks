package MethodAssignments;

public class MethodsWithReturnType {

    // 1. Return "Hello, World!"
    public static String printHelloWorld() {
        return "Hello, World!";
    }

    // 2. Return the sum of two integers
    public static int printSum(int a, int b) {
        return a + b;
    }

    // 3. Return whether a number is even or odd
    public static String returnEvenOrOdd(int num) {
        return (num % 2 == 0) ? (num + " is Even") : (num + " is Odd");
    }

    // 4. Return the multiplication table of a number as a string
    public static String returnMultiplicationTable(int num) {
        StringBuilder table = new StringBuilder("Multiplication Table of " + num + ":\n");
        for (int i = 1; i <= 10; i++) {
            table.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
        }
        return table.toString();
    }

    // 5. Swap two numbers and return the result as a string
    public static String returnSwappedNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return "After Swap: a = " + a + ", b = " + b;
    }

    // 6. Return numbers from 1 to N as a string
    public static String returnNumbers(int n) {
        StringBuilder result = new StringBuilder("Numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // 7. Return whether a number is positive, negative, or zero
    public static String returnNumberType(int num) {
        if (num > 0) {
            return num + " is Positive";
        } else if (num < 0) {
            return num + " is Negative";
        } else {
            return num + " is Zero";
        }
    }

    // 8. Return numbers from N to 1 as a string
    public static String returnReverseNumbers(int n) {
        StringBuilder result = new StringBuilder("Numbers from " + n + " to 1: ");
        for (int i = n; i >= 1; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // 9. Return the square of a number
    public static int returnSquare(int num) {
        return num * num;
    }

    // 10. Return the cube of a number
    public static int returncube(int num) {
        return num * num * num;
    }

    // 11. Return the reverse of a number
    public static int returnReverse(int num) {
        int reverse = 0, temp = num;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse;
    }

    // 12. Return the ASCII value of a character
    public static int returnAsciiValue(char ch) {
        return (int) ch;
    }

    // 13. Return whether a character is a vowel or consonant
    public static String returnVowelOrConsonant(char ch) {
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return ch + " is a Vowel";
        } else if (Character.isLetter(ch)) {
            return ch + " is a Consonant";
        } else {
            return ch + " is not a valid letter.";
        }
    }

    // Main method to call all functions and display the results
    public static void main(String[] args) {
        System.out.println("1. " + printHelloWorld());
        System.out.println("2. Sum of 5 and 7: " + printSum(5, 7));
        System.out.println("3. " + returnEvenOrOdd(10));
        System.out.println("4. " + returnMultiplicationTable(7));
        System.out.println("5. " + returnSwappedNumbers(5, 7));
        System.out.println("6. " + returnNumbers(10));
        System.out.println("7. " + returnNumberType(-5));
        System.out.println("8. " + returnReverseNumbers(10));
        System.out.println("9. Square of 5: " + returnSquare(5));
        System.out.println("10. Cube of 5: " + returncube(5));
        System.out.println("11. Reverse of 1234: " + returnReverse(1234));
        System.out.println("12. ASCII value of 'A': " + returnAsciiValue('A'));
        System.out.println("13. " + returnVowelOrConsonant('A'));
        
    }

}
