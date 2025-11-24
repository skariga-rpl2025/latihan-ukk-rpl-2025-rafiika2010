/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Lab Studio
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        
        k.setNopol("R 4 FI");
        k.setNamaMerk("Vario 150");
        k.setTahunTerbit(2019);
        
        System.out.println("~~~INFO KENDARAAN~~");
        System.out.println("Nopol : " + k.setNopol());
        System.out.println("Nama Merk : " + k.setNamaMerk());
        System.out.println("Tahun Terbit : " + k.setTahunTerbit());
    }
}
