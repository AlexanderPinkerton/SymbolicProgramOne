package com.alexanderpinkerton.school;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("---Problem One A----");
        System.out.println(Assignment.gcd(12345678, 9876543210l));
        System.out.println("---Problem One B----");
        System.out.println(Assignment.gcd((long) Math.pow(5, 12) - 1, (long) Math.pow(7, 21) - 1));

        System.out.println("---Problem Two A----");
        Assignment.primeFactorization((long) Math.pow(5, 32) - 7);
        System.out.println("---Problem Two B----");
        Assignment.primeFactorization(8856433488048011l);

        System.out.println("---Problem Three A----");
        Matrix A = new Matrix(6,6, new double[][]{
                {824,-65,-814,-741,-979,-764},
                {216,663,880,916,617,-535},
                {597,-245,79,747,477,-535},
                {-906,-905,-266,-8,765,448},
                {-348,470,-608,-686,702,61},
                {-49,-433,966,902,-942,712}});

        Matrix B = new Matrix(6,6, new double[][]{
                {761,-892,-564,-826,251,-414},
                {-44,-214,235,-781,421,-340},
                {881,444,360,932,700,725},
                {-750,-637,-915,192,617,41},
                {509,-167,127,628,51,837},
                {-28,57,-13,-436,-720,222}});

        Matrix result = Assignment.MatrixAdd(A,B);
        result.print();

        System.out.println("---Problem Three B----");
        Assignment.MatrixMultiply(A,B).print();



        System.out.println("---Problem Four A----");

        int[] setA = {1,2,3,4,7};
        int[] setB = {0,2,4,5,6};

        System.out.println(Arrays.toString(Assignment.union(setA,setB)));



        System.out.println("---Problem Four B----");

    }
}
