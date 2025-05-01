package org.example;

import java.util.Arrays;

public class SumaMaxima {
    public static void main(String[] args) {
        System.out.println("El arreglo");
        int [] arreglo = {-1,1,5,9,-11,-5,8,7,6,3};
        int maxSubArreglo = SumaMaximaDelArreglo(arreglo);
        System.out.println("La suma maxima es: " + maxSubArreglo );
    }
    public static int SumaMaximaDelArreglo(int[] arreglo){
        int suma = 0;
        int maximaSuma = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
            if(suma > maximaSuma){
                maximaSuma = suma;
            }if(suma < 0){
                suma  = 0;
            }

        }
        return maximaSuma;
    }
}

