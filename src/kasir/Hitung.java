/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author windows 10
 */
public class Hitung {
   Scanner in = new Scanner(System.in);
   
   public int ht_makanan(int bayar){
       int total = 0;
       System.out.println("_____MAKANAN______");
       System.out.print("Nama makanan\t: ");
       String makan = in.next();
       System.out.print("Jumlah\t\t: ");
       int jum = in.nextInt();
       switch (makan) {
           case "MieGoreng":
               total = jum * 16000;
               break;
           case "NasiGoreng":
               total = jum * 15000;
               break;
           case "Magelangan": 
               total = jum * 17000;
               break;
       }
       System.out.println("Harga : "+total);
       return(total);
   } 
   
   public int ht_minum(int bayar){
       int total = 0;
       System.out.println("_____MINUMAN______");
       System.out.print("Nama minuman\t: ");
       String minum = in.next();
       System.out.print("Jumlah\t\t: ");
       int jum = in.nextInt();
       switch (minum) {
           case "EsJeruk":
               total = jum * 3000;
               break;
           case "EsTeh":
               total = jum * 2000;
               break;
           case "EsBuah": 
               total = jum * 5000;
               break;
       }
       System.out.println("Harga : "+total);
       return(total);
   } 
}
