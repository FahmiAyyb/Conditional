/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
      char grade = 'A';
      switch(grade) {
         case 'A' :
            System.out.println("Sangat Bagus!");
            break;
         case 'B' :
            System.out.println("Bagus!");
            break;
         case 'C' :
            System.out.println("Kurang");
            break;
         case 'D' :
            System.out.println("Sangat Kurang");
            break;
         default :
            System.out.println("Inputan Salah");
      }
      System.out.println("\nNilai Anda : " + grade);
    }
}
