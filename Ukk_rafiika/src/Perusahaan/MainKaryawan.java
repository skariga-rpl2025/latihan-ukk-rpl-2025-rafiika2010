/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perusahaan;

/**
 *
 * @author Lab Studio
 */
public class MainKaryawan {
    public static void main(String[] args) {
        Karyawan k =new Karyawan();
        
        k.setNIP("1234567");
        k.setNama("Rafii");
        k.setJabatan("CEO");
            
        System.out.println("===INFO PT.ABADI JAYA===");
        System.out.println("Nama : " + k.getNIP());
        System.out.println("Nama : " + k.getNama());
        System.out.println("Jabatan : " + k.getJabatan());
               
        
    }
}
