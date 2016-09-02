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
public class EDDMartínezCA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {209, 101, 389, 5, 0, -7, 43, -1, -56};
        System.out.println("Arreglo desordenado: \n" + Arrays.toString(arreglo));
        arreglo = quickSortClass.quickSort(arreglo, 0, arreglo.length - 1);
        System.out.println("Arreglo Ordenado: \n" + Arrays.toString(arreglo));
    }
    
}