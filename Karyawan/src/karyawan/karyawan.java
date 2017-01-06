/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author sandhy putra
 */
public class karyawan {
    private int Id_Karyawan;
    private String NIK;
    private String Nama;
    private String Jenis_Kelamin;
    private String Agama;
    private String Alamat;
    private String TTL;
    private String Email;
    private String Jabatan;
    private int Jumlah_Anak;
    private String Gaji;

    public karyawan() {
    }

    public karyawan(int Id_Karyawan, String NIK, String Nama, String Jenis_Kelamin, String Agama, String Alamat, String TTL, String Email, String Jabatan, int Jumlah_Anak, String Gaji) {
        this.Id_Karyawan = Id_Karyawan;
        this.NIK = NIK;
        this.Nama = Nama;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.Agama = Agama;
        this.Alamat = Alamat;
        this.TTL = TTL;
        this.Email = Email;
        this.Jabatan = Jabatan;
        this.Jumlah_Anak = Jumlah_Anak;
        this.Gaji = Gaji;
    }

    public int getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(int Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenis_Kelamin() {
        return Jenis_Kelamin;
    }

    public void setJenis_Kelamin(String Jenis_Kelamin) {
        this.Jenis_Kelamin = Jenis_Kelamin;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public int getJumlah_Anak() {
        return Jumlah_Anak;
    }

    public void setJumlah_Anak(int Jumlah_Anak) {
        this.Jumlah_Anak = Jumlah_Anak;
    }

    public String getGaji() {
        return Gaji;
    }

    public void setGaji(String Gaji) {
        this.Gaji = Gaji;
    }
    
    
}
