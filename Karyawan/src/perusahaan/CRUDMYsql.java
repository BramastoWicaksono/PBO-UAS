/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author sandhy putra
 */
public class CRUDMYsql implements CRUDMYSQLInterface {
    private Connection conn;
    @Override
    public void OpenConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/perusahaan", "root","");
    }

    @Override
    public void CloseConnection() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<perusahaan> read() throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from perusahaan");
        ArrayList<perusahaan> list = new ArrayList();
        while (rs.next()){
            perusahaan pe = new perusahaan();
            pe.setId_perusahaan(rs.getInt(1));
            pe.setNo(rs.getString(2));
            pe.setNama(rs.getString(3));
            pe.setAlamat(rs.getString(4));
            pe.setTahun(rs.getInt(5));
            pe.setJenis(rs.getString(6));
            pe.setPemilik(rs.getString(7));
            pe.setJumlah_karyawan(rs.getInt(8));
            pe.setStatus(rs.getString(9));
            pe.setPemasukan(rs.getString(10));
            list.add(pe);
        }
        return list;
    }

    @Override
    public perusahaan readById(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from perusahaan where id_perusahaan = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        perusahaan pe = new perusahaan();
        while (rs.next()) {
            pe.setId_perusahaan(rs.getInt(1));
            pe.setNo(rs.getString(2));
            pe.setNama(rs.getString(3));
            pe.setAlamat(rs.getString(4));
            pe.setTahun(rs.getInt(5));
            pe.setJenis(rs.getString(6));
            pe.setPemilik(rs.getString(7));
            pe.setJumlah_karyawan(rs.getInt(8));
            pe.setStatus(rs.getString(9));
            pe.setPemasukan(rs.getString(10));
            
        }
        return pe;
    }

    @Override
    public void create(perusahaan p) throws SQLException {
        String query = "insert into perusahaan(no, nama, alamat, tahun, jenis, pemilik, jumlah_karyawan, status, pemasukan) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, p.getNo());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getAlamat());
        ps.setInt(4, p.getTahun());
        ps.setString(5, p.getJenis());
        ps.setString(6, p.getPemilik());
        ps.setInt(7, p.getJumlah_karyawan());
        ps.setString(8, p.getStatus());
        ps.setString(9, p.getPemasukan());
        ps.execute();
    }

    @Override
    public void delete(perusahaan p) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from perusahaan where id_perusahaan=?");
        ps.setInt(1, p.getId_perusahaan());
        ps.execute();
    }

    @Override
    public void update(perusahaan p) throws SQLException {
        String query = "update perusahaan set no=?, nama=?, alamat=?, tahun=?, jenis=?, pemilik=?, jumlah_karyawan=?, status=?, pemasukan=? where id_perusahaan=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, p.getNo());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getAlamat());
        ps.setInt(4, p.getTahun());
        ps.setString(5, p.getJenis());
        ps.setString(6, p.getPemilik());
        ps.setInt(7, p.getJumlah_karyawan());
        ps.setString(8, p.getStatus());
        ps.setString(9, p.getPemasukan());
        ps.setInt(10, p.getId_perusahaan());
        ps.execute();
    }
}

