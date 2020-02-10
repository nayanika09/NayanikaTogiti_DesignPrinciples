/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAYANIKA
 */

public class Functionalities {
    public static int add(int num1,int num2) {
        return num1+num2;
    }
    public static int subtract(int num1,int num2) {
        return num1-num2;
    }
    public static int multiply(int num1,int num2) {
        return num1*num2;
    }
    public static int divide(int num1,int num2) {
       
            if(num2==0) {
            throw new ArithmeticException("Divide by zero!");
            }
            else {
                return num1/num2;
            }
        
    } 
   
}
