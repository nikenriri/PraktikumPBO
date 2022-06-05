package contentKasir;

/**
 *
 * @author niken riri
 */

import inc.config;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class dataBuku extends javax.swing.JInternalFrame {
    
    Connection konek = config.Konek();
    Statement st;
    ResultSet rs;
    
    private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Judul");
        model.addColumn("No ISBN");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun");
        model.addColumn("Harga Pokok");
        model.addColumn("Harga Jual");
        model.addColumn("PPN");
        model.addColumn("Diskon");
        try{
            String sql = "select * from buku";
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_buku"), rs.getString("judul"), rs.getString("noisbn"), rs.getString("penulis"), rs.getString("penerbit"), rs.getString("tahun"), rs.getString("harga_pokok"), rs.getString("harga_jual"), rs.getString("ppn"), rs.getString("diskon")
                });
                
            }
            tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void bersih(){
        tId.setText("");
        tJudul.setText("");
        tIsbn.setText("");
        tPenulis.setText("");
        tPenerbit.setText("");
        tTahun.setText("");
        tPokok.setText("");
        tJual.setText("");
        tPpn.setText("");
        tDiskon.setText("");
        //tId.setEditable(false);
    }

    public dataBuku() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel11 = new javax.swing.JLabel();
        tPokok = new javax.swing.JTextField();
        tTahun = new javax.swing.JTextField();
        tPenerbit = new javax.swing.JTextField();
        tPenulis = new javax.swing.JTextField();
        tIsbn = new javax.swing.JTextField();
        tJudul = new javax.swing.JTextField();
        tId = new javax.swing.JTextField();
        tJual = new javax.swing.JTextField();
        tPpn = new javax.swing.JTextField();
        tDiskon = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Buku");

        jLabel2.setText("ID : ");

        jLabel3.setText("Judul : ");

        jLabel4.setText("No ISBN : ");

        jLabel5.setText("Penulis : ");

        jLabel6.setText("Penerbit : ");

        jLabel7.setText("Tahun : ");

        jLabel8.setText("Harga Pokok : ");

        jLabel9.setText("Harga Jual : ");

        jLabel10.setText("PPN : ");

        jLabel11.setText("Diskon : ");

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Judul", "No ISBN", "Penulis", "Penerbit", "Tahun", "Harga Pokok", "Harga Jual", "PPN", "Diskon"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        JScrollPane.setViewportView(tData);

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tCariKeyPressed(evt);
            }
        });

        jLabel12.setText("Pencarian : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tId)
                                    .addComponent(tJudul)
                                    .addComponent(tIsbn)
                                    .addComponent(tPenulis)
                                    .addComponent(tPenerbit)
                                    .addComponent(tTahun)
                                    .addComponent(tPokok, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tJual)
                                    .addComponent(tPpn)
                                    .addComponent(tDiskon)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bReset, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(bUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(tJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(tIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tPokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tPpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSimpan)
                            .addComponent(bUbah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bHapus)
                            .addComponent(bReset))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "insert into buku values(NULL,'"+tJudul.getText()+"', '"+tIsbn.getText()+"', '"+tPenulis.getText()+"', '"+tPenerbit.getText()+"', '"+tTahun.getText()+"', NULL, '"+tPokok.getText()+"', '"+tJual.getText()+"', '"+tPpn.getText()+"', '"+tDiskon.getText()+"')";
            st = konek.createStatement();
            st.executeUpdate(sql);
            
            bersih();
            tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        bersih();  
    }//GEN-LAST:event_bResetActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        // TODO add your handling code here:
        int baris = tData.getSelectedRow();
        tId.setText(tData.getModel().getValueAt(baris, 1).toString());
        tJudul.setText(tData.getModel().getValueAt(baris, 2).toString());
        tIsbn.setText(tData.getModel().getValueAt(baris, 3).toString());
        tPenulis.setText(tData.getModel().getValueAt(baris, 4).toString());
        tPenerbit.setText(tData.getModel().getValueAt(baris, 5).toString());
        tTahun.setText(tData.getModel().getValueAt(baris, 6).toString());
        tPokok.setText(tData.getModel().getValueAt(baris, 7).toString());
        tJual.setText(tData.getModel().getValueAt(baris, 8).toString());
        tPpn.setText(tData.getModel().getValueAt(baris,9).toString());
        tDiskon.setText(tData.getModel().getValueAt(baris, 10).toString());
    }//GEN-LAST:event_tDataMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_formInternalFrameOpened

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "update buku set judul= '"+tJudul.getText()+"', noisbn= '"+tIsbn.getText()+"', penulis= '"+tPenulis.getText()+"', penerbit= '"+tPenerbit.getText()+"', tahun= '"+tTahun.getText()+"', harga_pokok= '"+tPokok.getText()+"', harga_jual= '"+tJual.getText()+"', ppn= '"+tPpn.getText()+"', diskon= '"+tDiskon.getText()+"' where id_buku= '"+tId.getText()+"'";
            st = konek.createStatement();
            st.executeUpdate(sql);
            
            bersih();
            tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "delete from buku where id_buku= '"+tId.getText()+"'";
            st = konek.createStatement();
            st.executeUpdate(sql);
            
            bersih();
            tampil();
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void tCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Judul");
        model.addColumn("No ISBN");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun");
        model.addColumn("Harga Pokok");
        model.addColumn("Harga Jual");
        model.addColumn("PPN");
        model.addColumn("Diskon");
        try{
            String sql = "select * from buku where id_buku like '%"+tCari.getText()+"%' or judul like '%"+tCari.getText()+"%' or noisbn like '%"+tCari.getText()+"%' or penulis like '%"+tCari.getText()+"%' or penerbit like '%"+tCari.getText()+"%'";
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_buku"), rs.getString("judul"), rs.getString("noisbn"), rs.getString("penulis"), rs.getString("penerbit"), rs.getString("tahun"), rs.getString("harga_pokok"), rs.getString("harga_jual"), rs.getString("ppn"), rs.getString("diskon")
                });
                
            }
             tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tCariKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
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
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tDiskon;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tIsbn;
    private javax.swing.JTextField tJual;
    private javax.swing.JTextField tJudul;
    private javax.swing.JTextField tPenerbit;
    private javax.swing.JTextField tPenulis;
    private javax.swing.JTextField tPokok;
    private javax.swing.JTextField tPpn;
    private javax.swing.JTextField tTahun;
    // End of variables declaration//GEN-END:variables
}
