/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos3;

import java.util.Scanner;



/**
 *
 * @author reroes
 */
public class Ejemplo0811 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcion, limite, tabla;
        
        System.out.println("Ingrese la opcion que desea usar");
        opcion = entrada.nextInt();
        
        System.out.println("Ingrese el limite");
        limite = entrada.nextInt();
        
         System.out.println("Ingres la tabla");
         tabla = entrada.nextInt();
        // 
        String mensajeSuma= "";
       
        
        switch (opcion){
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
                break;
            case 2:
                mensajeSuma = obtenerTablaMultiplicar(limite, tabla);
                break;
        
        }
        
        6
       
        
        System.out.printf("%s\n", mensajeSuma);

    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
