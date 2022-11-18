/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsa_18012022;

/**
 *
 * @author LENOVO
 */
public class WarnetRecord {
     public static void main(String[] args) {
        WarnetExamle pelanggan = new WarnetExamle();

        pelanggan.setKode(1);
        pelanggan.setNamaPelanggan("rafiansyah");
        pelanggan.setJenisPelanggan(1);
        pelanggan.setTglMasuk(2);
        pelanggan.setJamMasuk(5);
        pelanggan.setJamKeluar(8);
        pelanggan.setLama(2);

        pelanggan.Print();
        pelanggan.Pembayaran();




    }
}