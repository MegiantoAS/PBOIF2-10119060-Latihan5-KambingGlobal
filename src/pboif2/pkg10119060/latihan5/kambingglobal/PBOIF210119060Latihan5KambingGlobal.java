/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan5.kambingglobal;
import java.util.Scanner;

/**
 *
 * @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program ini berisi program jumlah kambing
 */
public class PBOIF210119060Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //variabel jumlah kambing menjadi instance
    
    int jumlahKambing= 88;
    //method untuk menampilkan jumlah kambing
    
     public void getJumlahKambing(){
         System.out.println("Jumlah Kambing : " + jumlahKambing);    
     }
     public void tambahKambing(){
         jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah " + jumlahKambing);
    }
     public static void main(String[] args){
         //TODO code application logic here
         PBOIF210119060Latihan5KambingGlobal KambingSusu = new PBOIF210119060Latihan5KambingGlobal();
         
         //menampilkan jumlah kambing yang ada saat petama x berjalan
         KambingSusu.getJumlahKambing();
         
         //menambah satu kambing
         KambingSusu.tambahKambing();
         
         //menampilkan jumlah kambing yang ada
         KambingSusu.getJumlahKambing();
     }
    
}
