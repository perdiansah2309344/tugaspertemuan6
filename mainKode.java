/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author LENOVO
 */
public class mainKode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek pertama
        persegiPanjang persegiPanjang1 = new persegiPanjang(1, 1);
        System.out.println("PersegiPanjang1:");
        System.out.println("Panjang = " + persegiPanjang1.getPanjang());
        System.out.println("Lebar = " + persegiPanjang1.getLebar());
        System.out.println("Luas = " + persegiPanjang1.getLuas());
        System.out.println("Keliling = " + persegiPanjang1.getKeliling());
        System.out.println();

        // Objek kedua
        persegiPanjang persegiPanjang2 = new persegiPanjang(30, 40);
        System.out.println("PersegiPanjang2:");
        System.out.println("Panjang = " + persegiPanjang2.getPanjang());
        System.out.println("Lebar = " + persegiPanjang2.getLebar());
        System.out.println("Luas = " + persegiPanjang2.getLuas());
        System.out.println("Keliling = " + persegiPanjang2.getKeliling());
        System.out.println();

        // Objek ketiga
        persegiPanjang persegiPanjang3 = new persegiPanjang(25, 35);
        System.out.println("PersegiPanjang3:");
        System.out.println("Panjang = " + persegiPanjang3.getPanjang());
        System.out.println("Lebar = " + persegiPanjang3.getLebar());
        System.out.println("Luas = " + persegiPanjang3.getLuas());
        System.out.println("Keliling = " + persegiPanjang3.getKeliling());
    }
}