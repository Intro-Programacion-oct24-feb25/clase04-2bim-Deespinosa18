/*
 * generar una solucion que mpermita sumar dos numeros a traves de un metodo, 
los numeros deben ser ingresados por teclado en el metodo main el metodo que genera
la suma debe verifdicar que lso dos numeros sean positivos para realizar la op
caso contrario debe devolver cero 
 */
package ejemplos3;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int valor1,valor2;
        System.out.println("Ingrese el primer valor");
        valor1 = entrada.nextInt();
        
         System.out.println("Ingrese el segundo valor");
         valor2 = entrada.nextInt();
        // 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        if (a <1 || b <1) {
           
           suma=0;
        } else{
            suma = a + b;
        }
        
        
        return suma;
        // return a + b;
    }
    
    
}
