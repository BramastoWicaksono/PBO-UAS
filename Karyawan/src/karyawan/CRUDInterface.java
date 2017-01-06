/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;
import java.util.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author sandhy putra
 */
public interface CRUDInterface {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<karyawan> read() throws SQLException;
    public karyawan readById(int id) throws SQLException;
    public void create(karyawan k) throws SQLException;
    public void delete(karyawan k) throws SQLException;
    public void update(karyawan k) throws SQLException;
}

