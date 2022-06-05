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

public class dataPasok extends javax.swing.JInternalFrame {
    
    Connection konek;
    Statement st;
    ResultSet rs;
    
    int idBuku, idDis;
    
     private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Distributor");
        model.addColumn("Judul Buku");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal");
        try{
            String sql = "SELECT pasok.id_pasok, distributor.nama_distributor, buku.judul, pasok.jumlah, pasok.tanggal FROM pasok, distributor, buku WHERE distributor.id_distributor=pasok.id_distributor AND buku.id_buku=pasok.id_buku";
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_pasok"), rs.getString("nama_distributor"), rs.getString("judul"), rs.getString("jumlah"), rs.getString("tanggal")
                });
                
            }
            tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
     private void bersih(){
         tId.setText("");
         cDis.setSelectedIndex(0);
         cBuku.setSelectedIndex(0);
         tJumlah.setText("");  
     }

    
    public dataPasok() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bReset = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bSimpan = new javax.swing.JButton();
        cDis = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cBuku = new javax.swing.JComboBox<>();
        tId = new javax.swing.JTextField();
        bHapus = new javax.swing.JButton();
        tJumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();

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
        jLabel1.setText("Transaksi Buku Masuk");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form"));

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah : ");

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        cDis.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cDisPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDisActionPerformed(evt);
            }
        });

        jLabel2.setText("ID : ");

        jLabel3.setText("Distributor : ");

        cBuku.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cBukuPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBukuActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        jLabel4.setText("Buku : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tId)
                        .addComponent(tJumlah)
                        .addComponent(cDis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSimpan)
                    .addComponent(bUbah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHapus)
                    .addComponent(bReset))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tData);

        jLabel6.setText("Pencarian : ");

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "insert into pasok values(NULL,'"+idDis+"', '"+idBuku+"', '"+tJumlah.getText()+"', now())"; 
            konek = config.Konek();
            st = konek.createStatement();
            st.executeUpdate(sql);
            tampil();
            bersih();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        try{
            String sql = "select * from distributor";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                cDis.addItem(rs.getString("nama_distributor"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
           try{
            String sql = "select * from buku";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                cBuku.addItem(rs.getString("judul"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
           
        tampil();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDisActionPerformed

    private void cBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBukuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cBukuActionPerformed

    private void cDisPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cDisPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            String sql = "select * from distributor where nama_distributor= '"+cDis.getSelectedItem()+"'";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                idDis = rs.getInt("id_distributor");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cDisPopupMenuWillBecomeInvisible

    private void cBukuPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cBukuPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            String sql = "select * from buku where judul= '"+cBuku.getSelectedItem()+"'";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                idBuku = rs.getInt("id_buku");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cBukuPopupMenuWillBecomeInvisible

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bResetActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        // TODO add your handling code here:
        int baris = tData.getSelectedRow();
        tId.setText(tData.getModel().getValueAt(baris, 1).toString());
        cDis.setSelectedItem(tData.getModel().getValueAt(baris, 2).toString());
        cBuku.setSelectedItem(tData.getModel().getValueAt(baris, 3).toString());
        tJumlah.setText(tData.getModel().getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tDataMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "select * from distributor where nama_distributor= '"+cDis.getSelectedItem()+"'";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                idDis = rs.getInt("id_distributor");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            String sql = "select * from buku where judul= '"+cBuku.getSelectedItem()+"'";
            konek = config.Konek();
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                idBuku = rs.getInt("id_buku");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            String sql = "update pasok set id_distributor='"+idDis+"', id_buku= '"+idBuku+"', jumlah= '"+tJumlah.getText()+"', tanggal= now() where id_pasok='"+tId.getText()+"'"; 
            konek = config.Konek();
            st = konek.createStatement();
            st.executeUpdate(sql);
            tampil();
            bersih();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "delete from pasok where id_pasok='"+tId.getText()+"'"; 
            konek = config.Konek();
            st = konek.createStatement();
            st.executeUpdate(sql);
            tampil();
            bersih();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id");
        model.addColumn("Distributor");
        model.addColumn("Judul Buku");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal");
        try{
            String sql = "SELECT pasok.id_pasok, distributor.nama_distributor, buku.judul, pasok.jumlah, pasok.tanggal FROM pasok, distributor, buku WHERE distributor.id_distributor=pasok.id_distributor AND buku.id_buku=pasok.id_buku and (pasok.id_pasok like '%"+tCari.getText()+"%' or distributor.nama_distributor like '%"+tCari.getText()+"%' or buku.judul like '%"+tCari.getText()+"%' or pasok.jumlah like '%"+tCari.getText()+"%' or pasok.tanggal like'%"+tCari.getText()+"%')";
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                    no, rs.getString("id_pasok"), rs.getString("nama_distributor"), rs.getString("judul"), rs.getString("jumlah"), rs.getString("tanggal")
                });
                
            }
            tData.setModel(model);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tCariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cBuku;
    private javax.swing.JComboBox<String> cDis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tData;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tJumlah;
    // End of variables declaration//GEN-END:variables
}
