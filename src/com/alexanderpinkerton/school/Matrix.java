package com.alexanderpinkerton.school;

/***
 * Author: Alexander Pinkerton
 * Date: 9/01/2015
 ***/

public class Matrix {

    int rows;
    int columns;
    double[][] data;


    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(int rows, int columns, double[][] data){

        this.rows = rows;
        this.columns = columns;
        this.data = data;

    }


    public void setValue(int row, int column, double value){
            data[row][column] = value;
    }


    public double getValue(int row, int column){
            return data[row][column];
    }

    public double[][] getData(){
        return data;
    }


    public void print(){
        for(int i=0;i<rows;i++){
            System.out.print("[ ");
            for(int j=0;j<columns;j++){
                System.out.print( "\t" + getValue(i,j) + "\t");
            }
            System.out.println(" ] ");
        }
    }






}
