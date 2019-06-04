/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.productarrayapplication;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author lizardo
 */
public class ProductArrayApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\nEJEMPLOS");
        
        long[] ej1 = {1,2,3,4,5};
        System.out.println("\nEjemplo 1: Probando " + Arrays.toString(ej1) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej1)));
        
        long[] ej2 = {}; 
        
        System.out.println("\nEjemplo 2: Probando " + Arrays.toString(ej2) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej2)));
        
        long[] ej3 = {0}; 
        
        System.out.println("\nEjemplo 3: Probando " + Arrays.toString(ej3) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej3)));
        
        long[] ej4 = {1}; 
        
        System.out.println("\nEjemplo 4: Probando " + Arrays.toString(ej4) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej4)));
        
        long[] ej5 = {1,2}; 
        
        System.out.println("\nEjemplo 5: Probando " + Arrays.toString(ej5) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej5)));
        
        long[] ej6 = null; 
        
        System.out.println("\nEjemplo 6: Probando " + Arrays.toString(ej6) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej6)));
        
        long[] ej7 = new long[0];
        
        System.out.println("\nEjemplo 7: Probando " + Arrays.toString(ej7) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej7)));
       
        long[] ej8 = {1, 0, 3, 0, 5};
        
        System.out.println("\nEjemplo 8: Probando " + Arrays.toString(ej8) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej8)));
        
        long[] ej9 = {1, 2, 3, 0, 5};
        System.out.println("\nEjemplo 9: Probando " + Arrays.toString(ej9) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej9)));
        
        long[] ej10 = {0, 3, 5, 6, 5};
        System.out.println("\nEjemplo 10: Probando " + Arrays.toString(ej10) +
                " - Resultado "+ Arrays.toString(calculateProductArrayBasic(ej10))+"\n");
    }

    public static long[] calculateProductArrayBasic(long[] input) {

        if (input != null) {

            long[] parte1 = Arrays.copyOfRange(input, 0, input.length);
            long[] parte2 = Arrays.copyOfRange(input, 0, input.length);
            long[] multi = null;
            long[] resultado = new long[input.length];

            for (int i = 0; i < input.length; i++) {

                parte1 = Arrays.copyOfRange(input, 0, i);
                parte2 = Arrays.copyOfRange(input, i + 1, input.length);

                multi = ArrayUtils.addAll(parte1, parte2);

                long product = Arrays.stream(multi).reduce((num1, num2) -> num1 * num2).orElse(1);

                resultado[i] = product;
            }

            return resultado;
        } else {
            return null;
        }
    }
}