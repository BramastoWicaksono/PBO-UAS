/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sandhy putra
 */
public class CRUDSQLite implements CRUDInterface{
 private Connection conn;
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:karyawan.db");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<karyawan> read() throws SQLException {
       Statement stat = conn.createStatement();
       ResultSet rs = stat.executeQuery("select * from karyawan");
       ArrayList<karyawan> listkaryawan = new ArrayList();
       while (rs.next()){
       karyawan k = new karyawan();
       k.setId_Karyawan(rs.getInt(1));
       k.setNIK(rs.getNString(2));
       k.setNama(rs.getNString(3));
       k.setJenis_Kelamin(rs.getString(4));
       k.setAgama(rs.getNString(5));
       k.setAlamat(rs.getString(6));
       k.setTTL(rs.getString(7));
       k.setEmail(rs.getString(8));
       k.setJabatan(rs.getString(9));
       k.setJumlah_Anak(rs.getInt(10));
       k.setGaji(rs.getString(11));
       listkaryawan.add(k);
       }  
       return listkaryawan;
    }

    @Override
    public karyawan readById(int Id_Karyawan) throws SQLException {
        String query = "select * from karyawan where Id_Karyawan = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, Id_Karyawan);
        ResultSet rs = ps.executeQuery();
        karyawan k = new karyawan();
        while (rs.next()){
        k.setId_Karyawan(rs.getInt(1));
        k.setNIK(rs.getNString(2));
        k.setNama(rs.getNString(3));
        k.setJenis_Kelamin(rs.getString(4));
        k.setAgama(rs.getNString(5));
        k.setAlamat(rs.getString(6));
        k.setTTL(rs.getString(7));
        k.setEmail(rs.getString(8));
        k.setJabatan(rs.getString(9));
        k.setJumlah_Anak(rs.getInt(10));
        k.setGaji(rs.getString(11));
       }
        return k;
    }

    @Override
    public void create(karyawan k) throws SQLException {
        String query = "insert into karyawan(Id_Karyawan,NIK,Nama,Jenis_Kelamin,Agama,Alamat,TTL,Email,Jabatan,Jumlah_Anak,Gaji) values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, k.getId_Karyawan());
        ps.setString(2, k.getNIK());
        ps.setString(3, k.getNama());
        ps.setString(4, k.getJenis_Kelamin());
        ps.setString(5, k.getAgama());
        ps.setString(6, k.getAlamat());
        ps.setString(7, k.getTTL());
        ps.setString(8, k.getEmail());
        ps.setString(9, k.getJabatan());
        ps.setInt(10, k.getJumlah_Anak());
        ps.setString(11, k.getGaji());
        ps.execute();
    }

    @Override
    public void delete(karyawan k) throws SQLException {
        String query = "delete from karyawan where Id_Karyawan=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, k.getId_Karyawan());
        ps.execute();
    }

    @Override
    public void update(karyawan k) throws SQLException {
        String query = "update karyawan set Id_Karyawan=?, NIK=?, Nama=?, Jenis_Kelamin=?, Agama=?, Alamat=?, TTl=?, Email=?, Jabatan=?,"
                + "Jumlah_Anak=?, Gaji=?, where Id_Karyawan=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, k.getId_Karyawan());
        ps.setString(2, k.getNIK());
        ps.setString(3, k.getNama());
        ps.setString(4, k.getJenis_Kelamin());
        ps.setString(5, k.getAgama());
        ps.setString(6, k.getAlamat());
        ps.setString(7, k.getTTL());
        ps.setString(8, k.getEmail());
        ps.setString(9, k.getJabatan());
        ps.setInt(10, k.getJumlah_Anak());
        ps.setString(11, k.getGaji());
        ps.execute();
    }
    
   
}
