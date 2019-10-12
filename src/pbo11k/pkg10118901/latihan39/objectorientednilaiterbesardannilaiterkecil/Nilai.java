/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan39.objectorientednilaiterbesardannilaiterkecil;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Menghitung nilai terbesar dan terkecil dengan konsep orientasi objek
 */
public class Nilai {
   private int nilaiH;
   private int nilaiL;
   public void hasil(String VarNamaP, int varI, int varNilaiArr[]) {
        Terbesar h = new Terbesar();
        Terkecil l = new Terkecil();
        nilaiH = h.cari(varI, varNilaiArr);
        nilaiL = l.cari(varI, varNilaiArr);
        System.out.println("");
        System.out.println("Nilai terbesar adalah "+nilaiH);
        System.out.println("Nilai terkecil adalah "+nilaiL);
        System.out.println("");
        System.out.println("Nama Petugas : "+ VarNamaP);
    }
}
