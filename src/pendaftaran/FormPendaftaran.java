/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pendaftaran;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thony
 */
public class FormPendaftaran extends javax.swing.JPanel {

    private DefaultTableModel DftTableModel;
    private java.sql.Connection koneksi = new Koneksi().connect();
    
    /** Creates new form FormPendaftaran */
    public FormPendaftaran() {
        initComponents();
        isiTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        panelTab = new javax.swing.JTabbedPane();
        panelPendaftaran = new javax.swing.JPanel();
        lblNim = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        lblTelepon = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        banner1 = new pendaftaran.Banner();
        jPanel1 = new javax.swing.JPanel();
        scTabel = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(159, 207, 81));
        setPreferredSize(new java.awt.Dimension(500, 370));

        panelTab.setBackground(new java.awt.Color(255, 255, 255));
        panelTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelTab.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        panelPendaftaran.setBackground(new java.awt.Color(255, 255, 255));

        lblNim.setText("NIM");

        lblNama.setText("Nama");

        lblTelepon.setText("No. Telepon");

        btnSimpan.setBackground(new java.awt.Color(255, 255, 153));
        btnSimpan.setText("OK");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout banner1Layout = new javax.swing.GroupLayout(banner1);
        banner1.setLayout(banner1Layout);
        banner1Layout.setHorizontalGroup(
            banner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        banner1Layout.setVerticalGroup(
            banner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPendaftaranLayout = new javax.swing.GroupLayout(panelPendaftaran);
        panelPendaftaran.setLayout(panelPendaftaranLayout);
        panelPendaftaranLayout.setHorizontalGroup(
            panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPendaftaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPendaftaranLayout.createSequentialGroup()
                        .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNim)
                            .addComponent(lblNama)
                            .addComponent(lblTelepon))
                        .addGap(49, 49, 49)
                        .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(txtTelepon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNim, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        panelPendaftaranLayout.setVerticalGroup(
            panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPendaftaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNim)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelepon)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelTab.addTab("Form Pendaftaran", panelPendaftaran);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        scTabel.setViewportView(tabel);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefresh)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap())
        );

        panelTab.addTab("Data Pendaftar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        insert_data();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        isiTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pendaftaran.Banner banner1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JPanel panelPendaftaran;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JScrollPane scTabel;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    public void insert_data(){
        try{
            String sql = "insert into anggota(anggota_nim, anggota_nama, anggota_telepon) values (?, ?, ?);";
            java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
            
            stmt.setString(1, txtNim.getText());
            stmt.setString(2, txtNama.getText());
            stmt.setString(3, txtTelepon.getText());
            
            stmt.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null, "Data sudah disimpan.", "Informasi", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtNim.setText(null);
            txtNama.setText(null);
            txtTelepon.setText(null);
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Data gagal disimpan.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void isiTable(){
        Object row[] = {"No.", "NIM", "Nama", "Telepon"};
        DftTableModel = new DefaultTableModel(null, row);
        tabel.setModel(DftTableModel);
        
        try{
            String sql = "select * from anggota order by anggota_id asc";
            java.sql.Statement stmt = koneksi.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString("anggota_id");
                String nim = rs.getString("anggota_nim");
                String nama = rs.getString("anggota_nama");
                String telepon = rs.getString("anggota_telepon");
                Object[] data = {id, nim, nama, telepon};
                DftTableModel.addRow(data);
            }
        }catch(Exception e){
            
        }
    }
}