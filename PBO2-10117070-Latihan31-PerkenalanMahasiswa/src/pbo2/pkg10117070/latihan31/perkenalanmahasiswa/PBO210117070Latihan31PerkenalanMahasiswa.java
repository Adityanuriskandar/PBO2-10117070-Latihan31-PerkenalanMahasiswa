/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan31.perkenalanmahasiswa;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program menampilkan data perkenalan
 */
public class PBO210117070Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mhs1.nim = "10110256";
        mhs1.nama = "Riski Adam Kurniawan";
        mhs1.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mhs2 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mhs2.nim = "10117070";
        mhs2.nama = "Aditya Nur Iskandar";
        mhs2.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mhs3 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs3.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mhs4 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awalludin";
        mhs4.perkenalkanDiri();
    }
    
}
