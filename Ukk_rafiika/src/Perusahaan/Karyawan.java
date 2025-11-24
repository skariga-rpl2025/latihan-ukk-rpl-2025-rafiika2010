/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perusahaan;

/**
 *
 * @author Lab Studio
 */
public class Karyawan {
    private String NIP;
    private String Nama;
    private String Jabatan;
    
    
    public String getNIP(){
        return NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getJabatan(){
        return Jabatan;
    }
    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }
}
