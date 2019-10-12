/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan39.objectorientednilaiterbesardannilaiterkecil;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Menghitung nilai terbesar dan terkecil dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan39ObjectOrientedNilaiTerbesarDanNilaiTerkecil {
    public static Scanner input = new Scanner(System.in);
    public static void insertNilai(int i,String namaP) {
        int[] nilaiArr = new int[1000];
        for(int j = 1; j <= i;j++) {
        System.out.print("Masukan Nilai Mahasiswa Ke-"+j+" ");
            nilaiArr[j] = input.nextInt();
        }
        Nilai nilai = new Nilai();
        nilai.hasil(namaP, i, nilaiArr);
    }
    public static void main(String[] args) {
        int n;
        String namaP;
        System.out.println("=======Program Nilai Terbesar dan Nilai Terkecil Nilai Mahasiswa========");
        System.out.print("Masukan nama Petugas : ");
        namaP = input.nextLine();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        insertNilai(n, namaP);
        
    }
    
}
