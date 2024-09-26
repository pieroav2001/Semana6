
package semana6;

import java.util.Scanner;
public class Ej3 {
    /*
    registre las calificaciones de estudiantes. 
    El programa debe permitir la entrada de calificaciones 
    hasta que se ingrese una calificación de 0
    
    Datos:
    calificacion=10,20,13,9,0
    promedio=13
    
    */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        double calificacion;
        double suma = 0;
        int contador = 0;

        System.out.println("Ingrese las calificaciones de los estudiantes:");
        
        calificacion = leer.nextDouble();

        while (calificacion != 0) {
            suma += calificacion;
            contador++;
            calificacion = leer.nextDouble();
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            System.out.println("No se ingresaron calificaciones");
        }
    }
}
