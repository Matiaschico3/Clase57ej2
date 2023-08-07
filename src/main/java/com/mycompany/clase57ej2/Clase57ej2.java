
package com.mycompany.clase57ej2;

import java.util.ArrayList;
import java.util.List;


public class Clase57ej2 {

    public static void main(String[] args) {
//       Error ArrayIndex
//       int[] a = new int [2];
//       a[-1]=3;

        int[] a = new int [2];
        try{
            a[-1]=8;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de rango");
        }
}
}