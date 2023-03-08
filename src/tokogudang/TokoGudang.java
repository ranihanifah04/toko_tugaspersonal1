/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokogudang;

/**
 *
 * @author user
 */
//import scanner untuk input dan import package java math
//untuk kebutuhan membulatkan angka di belakang koma
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class TokoGudang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    //mendeklarasi variable
        String nama,barang;
        int qty;
        double hargabeli,hargajual;
        
        System.out.println("Masukkan Nama: ");
        nama = in.next();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        
        System.out.println("Selamat Datang, " + nama + "!");
        
        System.out.print("Masukkan nama barang yang mau ditambah: ");
        barang = in.next();
        
        System.out.print("Masukkan jumlah barang yang mau ditambah: ");
        qty = in.nextInt();
        
        System.out.print("Masukkan harga beli untuk barang tersebut: ");
        hargabeli = in.nextDouble();
        
        System.out.print("Masukkan harga jual untuk barang tersebut: ");
        hargajual = in.nextDouble();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        
    //membulatkan dua angka di belakang koma
        BigDecimal hargabeli1 = new BigDecimal(hargabeli).setScale(2, RoundingMode.CEILING);
        BigDecimal hargajual1 = new BigDecimal(hargajual).setScale(2, RoundingMode.CEILING);
        
        System.out.println("Nama Barang:" + barang);
        System.out.println("Jumlah Barang:" + qty);
        System.out.println("Harga Beli: Rp." + hargabeli1);
        System.out.println("Harga Jual: Rp." + hargajual1);
        
    }
    
}
