/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perusahaan;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public final class perushaanGUI extends javax.swing.JFrame {
    private final CRUDMYsql crud = new CRUDMYsql();
    private final DefaultTableModel model = new DefaultTableModel();
    private String Status;
    private perusahaan p;
    
    /** Creates new form perushaanGUI */
    public perushaanGUI() {
        initComponents();
        this.kolomTabel();
        this.getAllData();
    }
     public void kolomTabel() {
        model.addColumn("Id Perusahaan");
        model.addColumn("Nomor");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Tahun Berdiri");
        model.addColumn("Jenis Perusahaan");
        model.addColumn("Pemilik");
        model.addColumn("Jumlah Karyawan");
        model.addColumn("Status");
        model.addColumn("Pemasukkan");
        tblPerusahaan.setModel(model);
    }

    public void getAllData() {
        try {
            model.setRowCount(0);
            crud.OpenConnection();
            ArrayList<perusahaan> list = crud.read();
            System.out.println(list.size());
            list.forEach((data)-> {
             model.addRow(new Object[]{
             data.getId_perusahaan(),
             data.getNo(),
             data.getNama(),
             data.getAlamat(),
             data.getTahun(),
             data.getJenis(),
             data.getPemilik(),
             data.getJumlah_karyawan(),
             data.getStatus(),
             data.getPemasukan()
             });
        });
        crud.CloseConnection();
        } catch (SQLException | ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Gagal Mengambil Data" + ex.getMessage());
        }
    }
    private void editData() {
       if (Status.equals("add")){
           txtid.setText("");
           txtno.setText("");
           txtnama.setText("");
           txtalamat.setText("");
           txttahun.setText("");
           txtjenis.setText("");
           txtpemilik.setText("");
           txtjumlah.setText("");
           txtstatus.setText("");
           txtpemasukan.setText("");
       }
       txtid.setEditable(false);
       txtno.setEditable(true);
       txtnama.setEditable(true);
       txtalamat.setEditable(true);
       txttahun.setEditable(true);
       txtjenis.setEditable(true);
       txtpemilik.setEditable(true);
       txtjumlah.setEditable(true);
       txtstatus.setEditable(true);
       txtpemasukan.setEditable(true);
       btnSimpan.setEnabled(true);
       btnBatal.setEnabled(true);
       btnTambah.setEnabled(false);
       btnUbah.setEnabled(false);
       btnHapus.setEnabled(false);
       btnKeluar.setEnabled(false);
       txtnama.requestFocus();
}
    public void readData(){
    txtid.setEditable(true);
       txtno.setEditable(false);
       txtnama.setEditable(false);
       txtalamat.setEditable(false);
       txttahun.setEditable(false);
       txtjenis.setEditable(false);
       txtpemilik.setEditable(false);
       txtjumlah.setEditable(false);
       txtstatus.setEditable(false);
       txtpemasukan.setEditable(false);
       btnSimpan.setEnabled(false);
       btnBatal.setEnabled(false);
       btnTambah.setEnabled(true);
       btnUbah.setEnabled(true);
       btnHapus.setEnabled(true);
       btnKeluar.setEnabled(true);
    }
    public void kosongkanText(){
    txtid.setText("");
           txtno.setText("");
           txtnama.setText("");
           txtalamat.setText("");
           txttahun.setText("");
           txtjenis.setText("");
           txtpemilik.setText("");
           txtjumlah.setText("");
           txtstatus.setText("");
           txtpemasukan.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txttahun = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        txtpemilik = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txtpemasukan = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerusahaan = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("id_perusahaan");

        jLabel2.setText("no");

        jLabel3.setText("nama");

        jLabel4.setText("alamat");

        jLabel5.setText("tahun");

        jLabel6.setText("jenis");

        jLabel7.setText("pemilik");

        jLabel8.setText("jumlah_karyawan");

        jLabel9.setText("status");

        jLabel10.setText("pemasukan");

        txtid.setEditable(false);

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.setEnabled(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        tblPerusahaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPerusahaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerusahaanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerusahaan);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("PT.PUTRA MULIA");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Form yang terhubung Database MYSQL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKeluar)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txttahun, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtalamat)
                                    .addComponent(txtid)
                                    .addComponent(txtno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 133, Short.MAX_VALUE))
                                            .addComponent(txtstatus)
                                            .addComponent(txtpemasukan)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtpemilik, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(txtjenis))))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel11)
                .addGap(0, 237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtpemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtpemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        readData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        perusahaan p;
        if (Status.equals("add")) {
            try {
                if (txtno.getText().isEmpty() || txtnama.getText().isEmpty() || txtalamat.getText().isEmpty()
                        || txttahun.getText().isEmpty() || txtjenis.getText().isEmpty() || txtpemilik.getText().isEmpty()
                        || txtjumlah.getText().isEmpty() || txtstatus.getText().isEmpty() || txtpemasukan.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                }else{
                    crud.OpenConnection();
                    p = new perusahaan();
                    p.setNo(txtno.getText());
                    p.setNama(txtnama.getText());
                    p.setAlamat(txtalamat.getText());
                    p.setTahun(Integer.parseInt(txttahun.getText()));
                    p.setJenis(txtjenis.getText());
                    p.setPemilik(txtpemilik.getText());
                    p.setJumlah_karyawan(Integer.parseInt(txtjumlah.getText()));
                    p.setStatus(txtstatus.getText());
                    p.setPemasukan(txtpemasukan.getText());
                    crud.create(p);
                    getAllData();
                    readData();
                    crud.CloseConnection();
                    JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
                }     
            } catch (SQLException | ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" +ex.getMessage());
            }
        }else{
            try {
                if (txtno.getText().isEmpty() || txtnama.getText().isEmpty() || txtalamat.getText().isEmpty()
                        || txttahun.getText().isEmpty() || txtjenis.getText().isEmpty() || txtpemilik.getText().isEmpty()
                        || txtjumlah.getText().isEmpty() || txtstatus.getText().isEmpty() || txtpemasukan.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Data Harus diisi semua");
            }else {
                    crud.OpenConnection();
                    p = new perusahaan();
                    p.setId_perusahaan(Integer.parseInt(txtid.getText()));
                    p.setNo(txtno.getText());
                    p.setNama(txtnama.getText());
                    p.setAlamat(txtalamat.getText());
                    p.setTahun(Integer.parseInt(txttahun.getText()));
                    p.setJenis(txtjenis.getText());
                    p.setPemilik(txtpemilik.getText());
                    p.setJumlah_karyawan(Integer.parseInt(txtjumlah.getText()));
                    p.setStatus(txtstatus.getText());
                    p.setPemasukan(txtpemasukan.getText());
                    crud.update(p);
                    getAllData();
                    readData();
                    crud.CloseConnection();
                    JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
                }
        }
            catch (SQLException | ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" +ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        Status = "add";
        this.editData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
         Status = "edit";
        if (txtno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data dahulu");
        } else {
            editData();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
         if (p == null) {
            JOptionPane.showMessageDialog(null, "Pilih data dahulu");
        } else {
            try {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Hapus data?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    crud.OpenConnection();
                    crud.delete(p);
                    getAllData();
                    crud.CloseConnection();
                    p = null;
                    kosongkanText();
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Hapus data gagal");
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblPerusahaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerusahaanMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int baris = tblPerusahaan.getSelectedRow();
            crud.OpenConnection();
            p = crud.readById(Integer.parseInt(tblPerusahaan.getValueAt(baris, 0).toString()));
            crud.CloseConnection();
            txtid.setText(Integer.toString(p.getId_perusahaan()));
            txtno.setText(p.getNo());
            txtnama.setText(p.getNama());
            txtalamat.setText(p.getAlamat());
            txttahun.setText(Integer.toString(p.getTahun()));
            txtjenis.setText(p.getJenis());
            txtpemilik.setText(p.getPemilik());
            txtjumlah.setText(Integer.toString(p.getJumlah_karyawan()));
            txtstatus.setText(p.getStatus());
            txtpemasukan.setText(p.getPemasukan());
 
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ambil data gagal");
        }
    }//GEN-LAST:event_tblPerusahaanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(perushaanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perushaanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perushaanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perushaanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perushaanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPerusahaan;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtpemasukan;
    private javax.swing.JTextField txtpemilik;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txttahun;
    // End of variables declaration//GEN-END:variables

   

}
