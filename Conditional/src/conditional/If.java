/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int i;
        int a = 0;
                   
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Mie Kuah");
        System.out.println("2. Nasi Goreng");
        System.out.print("Masukkan Pilihan : ");
        i = inp.nextInt();
     
        if (i == 1 ) {
            System.out.println("\nPilihan Anda No.1");
            System.out.println("Mie Kuah");
        } else if (i == 2) {  
            System.out.println("\nPilihan Anda No.2");
            System.out.println("Nasi Goreng");
        } else {
            System.out.println("\nInputan Salah");
        } 
    }
}
       
    
    
