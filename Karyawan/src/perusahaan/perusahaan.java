/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 */
public class perusahaan {
    private int id_perusahaan;
    private String no;
    private String nama;
    private String alamat;
    private int tahun;
    private String jenis;
    private String pemilik;
    private int jumlah_karyawan;
    private String status;
    private String pemasukan;

    public perusahaan() {
    }

    public perusahaan(int id_perusahaan, String no, String nama, String alamat, int tahun, String jenis, String pemilik, int jumlah_karyawan, String status, String pemasukan) {
        this.id_perusahaan = id_perusahaan;
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.tahun = tahun;
        this.jenis = jenis;
        this.pemilik = pemilik;
        this.jumlah_karyawan = jumlah_karyawan;
        this.status = status;
        this.pemasukan = pemasukan;
    }

    public int getId_perusahaan() {
        return id_perusahaan;
    }

    public void setId_perusahaan(int id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public int getJumlah_karyawan() {
        return jumlah_karyawan;
    }

    public void setJumlah_karyawan(int jumlah_karyawan) {
        this.jumlah_karyawan = jumlah_karyawan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(String pemasukan) {
        this.pemasukan = pemasukan;
    }
    
    
}
