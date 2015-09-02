package com.alexanderpinkerton.school;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("---Problem One A----");
        System.out.println(Assignment.gcd(12345678, 9876543210l));
        System.out.println("---Problem One B----");
        System.out.println(Assignment.gcd((long) Math.pow(5,12) - 1, (long) Math.pow(7,21) - 1));

        System.out.println("---Problem Two A----");
        Assignment.primeFactorization((long) Math.pow(5, 32) - 7);
        System.out.println("---Problem Two B----");
        Assignment.primeFactorization(8856433488048011l);

        System.out.println("---Problem Three A----");



    }
}
