/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latian1;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Lab Studio
 */
public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner (new InputStreamReader(System.in));
        
        
        System.out.println("MATEMATIKA DASAR");
        System.out.println("Silahkan pilih menu : ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Pembagian (/)");
        System.out.println("4. Perkalian (*)");
        
        System.out.println("Silahkan masukan Nomor menu yang anda ingikan :) !!");
        int pi1 = input.nextInt();
        
        System.out.println("Masukan angka pertma ");
        double angka1 = input.nextDouble();
         
        System.out.println("Masukan angka kedua ");
       double angka2 = input.nextDouble();
       
       double hasil = 0;
        
        switch (pi1) {
            case 1:
              hasil = angka1 + angka2 ;
              break ;
            case 2:
                hasil = angka1 - angka2 ;
                break;
            case 3 :
                hasil = angka1/angka2;
                break;
            case 4 :    
                hasil = angka1*angka2;
                break;
            default:
                System.out.println("Eror pilihan tidak ada ");
                
            
        }
        System.out.println("Hasil = " + hasil);
    }
    
}
