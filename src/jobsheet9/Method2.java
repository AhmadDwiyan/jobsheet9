/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;
public class Method2 {
    public static double ngitung(double bil1, double bil2, double hasil ){
       hasil = bil1*bil2;
       return hasil;
       
          
      }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     System.out.println("MASUKAN ANGKA !!");
     double bil1 =input.nextDouble();
     System.out.println("MASUKAN ANGKA LAGI");
     double bil2=input.nextDouble();
     
     double ujian;
     double hasil = 0;
     double ngitung = ngitung(bil1,bil2,hasil);
     System.out.println("HASILNYA ADALAH "+ngitung);
        
    }
       
        
    }
    
