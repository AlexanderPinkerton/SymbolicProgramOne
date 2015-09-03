package com.alexanderpinkerton.school;

/**
 * Created by Ace on 9/3/15.
 */
public class Matrix {

    int rows;
    int columns;
    double[] data;


    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public Matrix(int rows, int columns, double[] data){

        this.rows = rows;
        this.columns = columns;
        this.data = data;

    }


    public void setValue(int row, int column, double value){

        if(row*column < data.length){
            data[row*column] = value;
        }

    }


    public double getValue(int row, int column){

        if(row*column < data.length){
            return data[row*column];
        }else{
            return -123456789;
        }

    }

    public double[] getData(){
        return data;
    }







}
