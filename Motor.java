/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.posttest1;

/**
 *
 * @author NITRO 5
 */
public class Motor {
    private final String merk;
    private final String jenis;
    private final int tahunProduksi;

    public Motor(String merk, String jenis, int tahunProduksi) {
        this.merk = merk;
        this.jenis = jenis;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "merk='" + merk + '\'' +
                ", jenis='" + jenis + '\'' +
                ", tahunProduksi=" + tahunProduksi +
                '}';
    }
}
