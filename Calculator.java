/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAYANIKA
 */
import java.util.Scanner;
public class Calculator extends Functionalities {
    public static void main(String[] args) {
        Functionalities ob= new Functionalities();
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter second number: ");
        num2=scanner.nextInt();
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("CHOOSE AN OPERATION TO PERFORM:");
        int choice=scanner.nextInt();
        switch(choice) {
            case 1:System.out.println("Result= "+add(num1,num2));
                    break;
            case 2:System.out.println("Result= "+subtract(num1,num2));
                    break;
            case 3:System.out.println("Result= "+multiply(num1,num2));
                    break;
            case 4:System.out.println("Result= "+divide(num1,num2));
                    break;
            default:System.out.println("Choose a valid operation!");
        }
    }
}
