/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author LENOVO
 */
class persegiPanjang {
    int panjang;
    int lebar;

    persegiPanjang() {
        panjang = 0;
        lebar = 0;
    }

    persegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    int getLuas() {
        return panjang * lebar;
    }

    int getKeliling() {
        return 2 * (panjang + lebar);
    }
}
