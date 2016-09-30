package ru.parsentev.task_001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private double result;
    private static final Logger log = getLogger(Calculator.class);

    public double getResult() {
        return this.result;
        //throw new UnsupportedOperationException();
    }

    public void add(double first, double second) {

        this.result = first + second;
        //throw new UnsupportedOperationException();
    }

    public void substract(double first, double second) {
        this.result = first - second;
       // throw new UnsupportedOperationException();
    }

    public void multiple(double first, double second) {


        this.result = first * second;

    }

    public void div(double first, double second) {

        if(second==0d){
            throw new IllegalStateException("Division by zero");
        }else {
            this.result = first / second;

        }
    }

    public void expand(double first, double second) {
        if( second == 1 ){
            this.result = first;
        }
        for(int i=1 ; i<second ; i++){
            this.result *= first;
        }
      //  throw new UnsupportedOperationException();
    }
}
