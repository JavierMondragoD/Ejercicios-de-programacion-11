/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class PalabrasLargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
    String palabra1, palabra2, mayor = "";
    int conteo1, conteo2, diferencia;
   
    System.out.print("Ingresa una palabra: ");
    palabra1 = ingreso.next();
    System.out.print("Ingresa otra palabra: ");
    palabra2 = ingreso.next();
    conteo1 = palabra1.length();//cuenta nro de letras
    conteo2 = palabra2.length();
    diferencia = Math.abs(conteo1 - conteo2); //valor absoluto
   
    if (conteo1 > conteo2){
      System.out.printf("\nLa palabra mayor es %s\n", palabra1);
    }
    if (conteo1 < conteo2){
      System.out.printf("\nLa palabra mayor es %s\n", palabra2);
    }
    if(conteo1 == conteo2){
      System.out.printf("\nLas palabras tienen la misma longitud\n");
    }
   
    System.out.printf("La diferencia es de %d letra(s)\n", diferencia);
    }
    
}
