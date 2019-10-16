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
public class PBO210118048Latihan36TargetSaldo {

    public static void main(String[] args) {
        
        Tabungan tabungan = new Tabungan();
        tabungan.saldoAwal = 3_500_000;
        tabungan.saldoTarget = 6_000_000;
        tabungan.bunga = 0.08;
        tabungan.hitungSaldoTarget(tabungan.saldoAwal, tabungan.bunga);
    }

}
