/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import static java.lang.System.exit;
import java.util.Scanner;
import data.*;

/**
 *
 * @author windows 10
 */
public class AppKasir {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        DataMakanan makanan = new DataMakanan();
        DataMinuman minuman = new DataMinuman();
        Hitung hit = new Hitung();
        
        System.out.println("\t\tKASIR SEDERHANA");
        System.out.println("================================================");
        do{
            System.out.println("\nPILIHAN");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Bayar");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            
            switch(pilih){
                case 1 :
                    System.out.println("\tDAFTAR MENU");
                    makanan.menu_makanan();
                    minuman.menu_minuman();
                    break;
                
                case 2 :
                     System.out.println("\n\tBAYAR");
                     int totalbayar = 0, bayar = 0, total = 0;
                     do{
                        System.out.println("\nTotal : "+totalbayar);
                        System.out.println("Pilih yang akan dibayar :");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Kembali");
                        System.out.print("Pilih : ");
                        int pilih1 = input.nextInt();
                        System.out.println("");
                        
                        switch (pilih1) {
                            case 1:
                                total = hit.ht_makanan(bayar);
                                break;
                            case 2:
                                total = hit.ht_minum(bayar);
                                break;
                            case 3:
                                AppKasir.main(args);
                                break;
                            default:
                                break;
                        }
                        totalbayar = totalbayar+total; 
                     }while(true);
                
                case 3 :
                    exit(0);
                    break;
            }
            
        }while(true);
        
    }
}
