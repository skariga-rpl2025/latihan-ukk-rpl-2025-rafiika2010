/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latian1;

import java.util.Scanner;

/**
 *
 * @author Lab Studio
 */
public class DaftarGYm {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        int total = 0;
        String lagi;
        
        System.out.println("====Masukan para pendaftar===");
        do{
            System.out.println("Nama anggota : ");
            String nama = inp.nextLine();
            
            total++;
            System.out.println("Daftar anggota lagi? (ya/tidak) ");
            lagi = inp.nextLine();
            
        }while (lagi.equalsIgnoreCase("ya"));
        System.out.println("------------------------------------");
        System.out.println("Total yang daftar : " +total);
    }
}
