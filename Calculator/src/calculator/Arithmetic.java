/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Joseph
 */

/* Singleton class to be used for calculator GUI */

public class Arithmetic {
    
    private static Arithmetic arithmetic = new Arithmetic();
    
    /*Create a private instructor for singleton class*/
    
    private Arithmetic() {}
    
    public static Arithmetic getCalculation()
    {
        return arithmetic;
    }
    
    public static double getCalculation(double num2, int selection, double num1)
    {
        switch(selection)
        {
            // If the operator is a plus
            case 1: 
                return num1 + num2;
            // If the operator is subtraction
            case 2:
                return num1 - num2;
            //If the operator is multiplication
            case 3:
                return num1 * num2;
            //If the operator is division
            case 4:
                return num1 / num2;
            //If the opetator is a pow 
            case 5:
                return pow(num1, num2);
            default:
                break;
        }
        
        return -1;
    }
    
    public static double pow(double base, double power)
    {
        System.out.println(power);
        if (power == 1)
        {
            return base;
        }
        
        
        if( power < 0)
        {
            return 1 /(pow(base, -power));
        }
        else
        {
            return base * pow(base, power-1);
        }
    }
    

}
