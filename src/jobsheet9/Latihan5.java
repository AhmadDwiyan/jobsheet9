/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

public class Latihan5 {
     public static int ngitung(int bil1, int bil2 ){
       return bil1 & bil2 ;
              
          
      }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-= MASUKAN NILAI =-");
        
        int a = ngitung(input.nextInt(),input.nextInt());
        int min,max;
        min=a[0];
        System.out.println("NILAI TERBESAR = "+a);
        
    
    }
}
