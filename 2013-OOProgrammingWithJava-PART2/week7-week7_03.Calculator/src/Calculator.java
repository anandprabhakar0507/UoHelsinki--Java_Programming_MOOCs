/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Calculator {
    private Reader reader;
    private int calculations = 0;
    
    public Calculator(){
        reader = new Reader();
    }
    
     public void start(){
         while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
     }
     
     private void sum(){
         int[] vs = getValues();
         System.out.println("sum of the values " + (vs[0] + vs[1]));
     }
     
     private void difference(){
         int[] vs = getValues();
         System.out.println("difference of the values " + (vs[0] - vs[1]));
     }
     
     private void product(){
         int[] vs = getValues();
         System.out.println("product of the values " + (vs[0] * vs[1]));
     }
     
     private int[] getValues(){
         System.out.print("Value1: ");
         int v1 = reader.readInteger();
         System.out.print("Value2: ");
         int v2 = reader.readInteger();
         
         calculations++; //if in this method, then we are performing a calculation.
         
         return new int[] {v1, v2};
     }
     
     private void statistics(){
         System.out.println("Calculations done " + calculations);
     }
     
    
}
