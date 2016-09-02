/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a07;

import java.util.Arrays;

/**
 *
 * @author danx_
 */
public class quickSortClass {

    //Constructor
    public quickSortClass() {
    }

    public static int[] quickSort(int[] array, int inicio, int fin) {
        int pivot;
        
        pivot = array[(inicio + fin) / 2]; //Pivot es el medio del array.
        
        int i = inicio;
        int j = fin;
        
        while(i <= j) { //Se repite hasta que llegue a la mitad, para que no vuelva a cambiar.
            //Verifica si hay un dato menor al pivote(izquierda), si lo hay avanza la posicion al siguiente, y vueleve a verificar
            while (array[i] < pivot) {
                i++;
            }
            //Verifica si hay un dato mayor al pivote (derecha), si lo hay disminuye una posicion, y vueleve a verificar
            while (array[j] > pivot) {
                j--;
            }
            // Si no cumple con las condiciones anteriores entnces cambiara los datos de posicion
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            
            System.out.println(Arrays.toString(array));
            
            if (inicio < j) {
                quickSort(array, inicio, j);
            }
            
            if (i < fin ) {
                quickSort (array, i, fin);
            }
            
        }
        return array;
    }
}
