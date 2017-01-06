/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sandhy putra
 */
public interface CRUDMYSQLInterface {
    public void OpenConnection() throws ClassNotFoundException, SQLException;
    public void CloseConnection() throws SQLException;
    public ArrayList<perusahaan> read() throws SQLException;
    public perusahaan readById(int id) throws SQLException;
    public void create (perusahaan p) throws SQLException;
    public void delete (perusahaan p) throws SQLException;
    public void update (perusahaan p) throws SQLException;
}
