/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Utilidades.ES;

/**
 *
 * @author Antonio
 */
public class CPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[] numeros = new int[5];
        //numeros[0] = 5;
        
        int[] numeros = {5, 4, 23, 88, 100};
        
        //parImpar(numeros);
        
        mayoresMenores50(ES.leerEntero("Introduzca el tamaño del array: "));
        
        
    }
    
    /**
     * Método que indica por pantalla cuantos números pares e impares contiene un array
     * @param n array para el que se quiere realizar la operación
     */
    private static void parImpar(int[] n){        
        int par = 0, impar = 0;
        //for(inic variable   ; condición; incrementamos variable)
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 == 0)
                par++;
            else
                impar++;
        }
        
        //for each
        for(int num:n){
            if(num % 2 == 0)
                par++;
            else
                impar++;
        }
        
        
        System.out.format("El array tiene %d números pares y %d números impares", par, impar);
    }
    
    /**
     * Método que indica por pantalla cuantos números pares e impares contiene un array
     * @param n array para el que se quiere realizar la operación
     */
    private static void parImparV2(int[] n){        
        int par = 0;
        
        //for each
        for(int num:n){
            if(num % 2 == 0)
                par++;
        }
        
        
        System.out.format("El array tiene %d números pares y %d números impares", par, n.length - par);
    }
    
    /**
     * Método que crea un array de números aleatorios e indica cuales son mayores que 50 y cuantos menores.
     * @param tamanio tamaño del array
     */
    private static void mayoresMenores50(int tamanio){
        int mayores50 = 0;
        
        if(tamanio >= 0){
            int[] numeros = new int[tamanio];
            
            for(int i = 0; i < numeros.length; i++){
                // rellenar el array con valores entre 0 y 100
            }
            
            for(int n: numeros){
                System.out.print( n + ", ");
                if(n > 50)
                    mayores50++;
            }
            
            System.out.println(" de los cuales " + mayores50 +  " números son mayor de 50 y " + (numeros.length-mayores50) + " son menores de dicho valor");
        }
        else{
            System.out.println("No se ha podido realizar la operación ya que el tamaño del array introducido es negativo.");
        }
    }
    
    /**
     * Método que crea un array de números aleatorios e indica cuales son mayores que 50 y cuantos menores.
     * @param tamanio tamaño del array
     */
    private static void mayoresMenores50VerFernando(int tamanio){
        int mayores50 = 0;
        
        if(tamanio >= 0){
            int[] numeros = new int[tamanio];
            int[] numMayores50 = new int[tamanio];
            int[] numMenores50 = new int[tamanio];
            int posMayor50 = 0, posMenor50 = 0;
            
            for(int i = 0; i < numeros.length; i++){
                // rellenar el array con valores entre 0 y 100
            }
            
            for(int n: numeros){                
                if(n > 50){
                    numMayores50[posMayor50] = n;
                    posMayor50++;
                }
                else{
                    numMenores50[posMenor50] = n;
                    posMenor50++;
                }
            }
            
            // otro for recorro numMayores50 y muestro los valores y digo cuantos hay (posMayor50)
            // lo mismo para numMenores50
        }
        else{
            System.out.println("No se ha podido realizar la operación ya que el tamaño del array introducido es negativo.");
        }
    }
    
}
