/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan36.targetsaldo;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan saldo sampai target yang telah ditentukan
 */
public class Tabungan {
    
    public int saldoAwal,saldoTarget;
    public double bunga;
    
    public double hitungSaldoTarget(int saldoAwal, double bunga) {
        int i = 1;
        do {
            saldoAwal += saldoAwal * 0.08; 
            System.out.print("Saldo di bulan ke-" + i +" Rp."); i++;
            System.out.printf("%,10d%n" , saldoAwal);
            if(saldoAwal >= saldoTarget)
                break;
        } while (i <= 10);
        return saldoAwal;
    }

}
