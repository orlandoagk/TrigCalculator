package edu.eci.escuelaing.arep.components;


public class Calculator {
    public static double calculateTrigonometric(String operation,String number){
        double numberAtReturn = 0;

        switch (operation){
            case "sin":{
                numberAtReturn = Math.sin(Double.parseDouble(number));
                break;
            } case "cos":{
                numberAtReturn = Math.cos(Double.parseDouble(number));
                break;
            } case "tan":{
                numberAtReturn = Math.tan(Double.parseDouble(number));
                break;

            }
        }

        return numberAtReturn;


    }
}
