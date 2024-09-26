
package semana6;
 import java.util.Scanner;

public class Ej2 {
/*
    sume números enteros positivos ingresados por el usuario.
    El programa debe detenerse cuando se ingrese un número negativo 
    y mostrar la suma total de los números positivos.
    DATOS:
    numero=2,5,7,2,4,1,9,-6
    suma=30
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese números enteros positivos y para terminar ponga un numero negativo:");

        numero = leer.nextInt();

        while (numero >= 0) {
            suma += numero;
            numero = leer.nextInt();
        }

        System.out.println("La suma total de los números positivos es: " + suma);
    }
}

