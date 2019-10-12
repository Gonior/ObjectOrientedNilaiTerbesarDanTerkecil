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
public class Terbesar {
    private int h;
    public int cari(int i, int arr[]) {
        for (int z = 1;z<=i;z++) {
            if (arr[z] > h)
                h = arr[z];
        }
        return h;
    }
    
}
