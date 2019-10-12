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
public class Terkecil {
    private int l;
    public int cari(int i,int arr[]) {
        l = arr[1];
        for (int m = 1; m <= i;m++) {
            if (arr[m] < l )
                l = arr[m];
        }
        return l;
    }
}
