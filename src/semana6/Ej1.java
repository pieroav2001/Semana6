
package semana6;
import java.util.Scanner;

public class Ej1 {
/*
    
    Contar cuántos números impares ingresa el usuario. 
    El programa debe detenerse cuando se ingrese el número 0,
    y debe mostrar la cantidad total de números impares ingresados.
    Datos:
    numero=2,5,4,3,7,11,13,0
    contadorImp=5
*/

  
    public static void main(String[] args) {
 
        Scanner leer = new Scanner(System.in);

        int numero;
        int contadorImp = 0;

        System.out.println("Ingrese numeros enteros y finalice con un 0:");

        numero = leer.nextInt();

        while (numero != 0) {
            if (numero % 2 != 0) {
                contadorImp++;
            }
            numero = leer.nextInt();
        }

        System.out.println("Los Numeros impares ingresados es: " + contadorImp);
    }
}
