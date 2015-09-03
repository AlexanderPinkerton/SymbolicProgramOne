package com.alexanderpinkerton.school;

/**
 * Created by Ace on 9/2/2015.
 */
public class Assignment {

    //This is a recursive implementation of GCD calculation.
    public static long gcd(long a, long b){
        if (b==0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }

    //This is a recursive implementation of prime factorization.
    public static void primeFactorization(long n){
        //Start the divider at 2.
        int div = 2;
        //Whether a factor has been found for n.
        boolean factored = false;

        //n must be a positive number.
        if(n<=0){return;}

        //If n is divisible by 2, Print 2 as a factor and recursively call this method to continue the process on the other term.
        if(n % div == 0){
            System.out.println(div);
            primeFactorization(n / 2);
        }else{
            //If n is not divisible by two, add one to the divisor and try again until a divisor is found. This is wasteful but it works.
            while(!factored && div < n){
                if(n % ++div == 0){
                    System.out.println(div);
                    factored = true;
                    primeFactorization(n / div);
                }
            }
        }
    }



    public static Matrix MatrixAdd(Matrix A, Matrix B){

        if(A.rows == B.rows && A.columns == B.columns){
            Matrix result = new Matrix(A.rows,A.columns);

            for(int i=0;i<A.rows;i++){
                for(int j=0;j<A.columns;j++){
                    result.setValue(i,j, A.getValue(i,j) + B.getValue(i,j));
                }
            }

            return result;

        }else{
            //Throw exceptions.
            return null;
        }

    }


    public static Matrix MatrixMultiply(Matrix A, Matrix B){

        if(A.columns == B.rows) {
            Matrix result = new Matrix(A.rows, B.columns);

            for (int i = 0; i < A.rows; i++) { // aRow
                for (int j = 0; j < B.columns; j++) { // bColumn
                    for (int k = 0; k < A.columns; k++) { // aColumn
                        result.getData()[i][j] += A.getData()[i][k] * B.getData()[k][j];
                    }
                }
            }

            return result;
        }else{
            return null;
        }
    }

}
