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
public class KetuaOsis {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        int votingA = 0 ;
        int votingB = 0 ; 
        String input;
        
        System.out.println("=~=~VOTING KETOS~=~=");
        System.out.println("(ketik\"selesai\"untuk mengakhiri)");
        
        while(true){
            System.out.println("MASUKAN VOTE ANDA A/B");
            input = inp.next();
            
            if(input.equalsIgnoreCase("selesai"))
            break;
            
            
            if(input.equalsIgnoreCase("A"))
            votingA++;
            else if (input.equalsIgnoreCase("B"))
            votingB++;
            else
            System.out.println("Pilihan tidak valid");
                    
                
        }
        System.out.println("\n====TOTAL PEMENANG SUARA===");
        System.out.println("TOTAL SUARA A : " + votingA);
        System.out.println("TOTAL SUARA B : " + votingB);
    }
}
