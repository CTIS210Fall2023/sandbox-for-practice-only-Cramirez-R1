package edu.guilford;

// The keyboard import tells Java that we plan to use the specified  class


public class Sandbox {
    public static void main(String[] args) {
        // A place for testing Java code
        int n = 10;
        //Ask for n!--this starts the recursive stack of method calls
        System.out.println("The value of " + n + "! is " + factorial(n));    
    }

    public static int factorial(int nextN) {
        // A recursive method foe calculating the factorial of nextN
        //Base case
        if (nextN == 0) {
            return 1;
        } else { // Otherwise calculate the factorial of the smaller value
            int smallerFact = nextN + factorial(nextN -1);
            return smallerFact;
        }
    }
}