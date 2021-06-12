package perpustakaan;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.math.BigDecimal;
import java.io.FileWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.text.Document;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class GUIPERPUS extends javax.swing.JFrame {
    Connection k = kabel.sambungna();
    int id_selected;
    public String txtpenerbit;
    Object[] kolom = {"", "ISBN", "JUDUL", "PENULIS", "PENERBIT", "JB"};
    Object[][] data = null;
    public GUIPERPUS() {
        initComponents();
        readData("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButton = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        btnR = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        MASUKANDATABUKUPERPUSTAKAAN = new java.awt.Label();
        txtsearch = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        COME = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtJUDUL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPENULIS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        btnRform = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JB_F = new javax.swing.JRadioButton();
        JB_N = new javax.swing.JRadioButton();
        PILIHPENERBIT = new javax.swing.JComboBox<>();
        EXTRACT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setForeground(new java.awt.Color(102, 102, 0));

        tb_buku.setBorder(new javax.swing.border.MatteBorder(null));
        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ISBN", "JUDUL", "PENULIS", "PENERBIT", "JENIS BUKU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_buku);
        tb_buku.getAccessibleContext().setAccessibleName("tb.buku");

        btnR.setText("RESET DATA");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnU.setText("UPDATE");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnD.setText("DELETE");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        MASUKANDATABUKUPERPUSTAKAAN.setBackground(new java.awt.Color(51, 204, 0));
        MASUKANDATABUKUPERPUSTAKAAN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MASUKANDATABUKUPERPUSTAKAAN.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        MASUKANDATABUKUPERPUSTAKAAN.setForeground(new java.awt.Color(51, 51, 51));
        MASUKANDATABUKUPERPUSTAKAAN.setName(""); // NOI18N
        MASUKANDATABUKUPERPUSTAKAAN.setText(" APLIKASI DATA BASE BUKU PERPUSTAKAAN");

        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        COME.setText("LOGOUT");
        COME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMEActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("form");

        jLabel1.setText("ISBN");

        txtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNActionPerformed(evt);
            }
        });
        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISBNKeyTyped(evt);
            }
        });

        jLabel2.setText("JUDUL BUKU");

        jLabel4.setText("PENULIS");

        jLabel6.setText("JENIS BUKU");

        btnC.setText("CREATE DATA");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnRform.setText("RESET FORM");
        btnRform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRformActionPerformed(evt);
            }
        });

        jLabel3.setText("PENERBIT");

        RadioButton.add(JB_F);
        JB_F.setSelected(true);
        JB_F.setText("FIKSI");

        RadioButton.add(JB_N);
        JB_N.setText("NON-FIKSI");

        PILIHPENERBIT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Erlangga", "Gramedia", "elex media", "viva publising", "zamrud", "intan pariwara", "graha pustaka", "PT CIPTA ADI PUSTAKA", "PT DELTA PAMUNGKAS" }));
        PILIHPENERBIT.setName(""); // NOI18N
        PILIHPENERBIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PILIHPENERBITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PILIHPENERBIT, 0, 246, Short.MAX_VALUE)
                            .addComponent(txtISBN)
                            .addComponent(txtJUDUL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JB_F)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPENULIS)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRform, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC)
                            .addComponent(JB_N))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPENULIS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PILIHPENERBIT, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JB_F)
                        .addComponent(JB_N)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRform, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        txtISBN.getAccessibleContext().setAccessibleName("");
        txtISBN.getAccessibleContext().setAccessibleParent(this);
        txtJUDUL.getAccessibleContext().setAccessibleName("");
        txtJUDUL.getAccessibleContext().setAccessibleParent(this);
        txtPENULIS.getAccessibleContext().setAccessibleParent(this);

        EXTRACT.setText("EXTRACT");
        EXTRACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXTRACTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUKANDATABUKUPERPUSTAKAAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EXTRACT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearch)
                            .addComponent(SEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(COME, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EXTRACT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(COME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUKANDATABUKUPERPUSTAKAAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        MASUKANDATABUKUPERPUSTAKAAN.getAccessibleContext().setAccessibleName("APLIKASI DATA BUKU PERPUSTAKAAN"); // NOI18N
        MASUKANDATABUKUPERPUSTAKAAN.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        try {
            Statement st = k.createStatement();
            st.executeUpdate("DELETE FROM buku WHERE id= " + id_selected);
            readData("");
            JOptionPane.showMessageDialog(this, "Data telah terhapus");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        search();
    }//GEN-LAST:event_SEARCHActionPerformed

    private void btnRformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRformActionPerformed
        resetForm();
    }//GEN-LAST:event_btnRformActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        try {
            Statement st = k.createStatement();
            String query = "TRUNCATE TABLE " + "buku";
            st.executeUpdate(query);
            readData("");
            JOptionPane.showMessageDialog(this, "semua data telah dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(GUIPERPUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRActionPerformed

    private void tb_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bukuMouseClicked
        try {
            int baris = tb_buku.getSelectedRow();
            if (baris != -1) {
                String id = tb_buku.getValueAt(baris, 0).toString();
                String isbn = tb_buku.getValueAt(baris, 1).toString();
                String judul = tb_buku.getValueAt(baris, 2).toString();
                String penulis = tb_buku.getValueAt(baris, 3).toString();
                String penerbit = tb_buku.getValueAt(baris, 4).toString();
                String jb = tb_buku.getValueAt(baris, 5).toString();
                id_selected = Integer.parseInt(id); 
                txtISBN.setText(isbn);
                txtJUDUL.setText(judul);
                txtPENULIS.setText(penulis);
                PILIHPENERBIT.setSelectedItem(penerbit);
                if (jb.equalsIgnoreCase("fiksi")) {
                    JB_F.setSelected(true);
                } else {
                    JB_N.setSelected(true);
                }
                btnC.setEnabled(false);
                btnU.setEnabled(true);
                btnD.setEnabled(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tb_bukuMouseClicked

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        Update();
    }//GEN-LAST:event_btnUActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        Create();
        resetForm();
    }//GEN-LAST:event_btnCActionPerformed

    private void COMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMEActionPerformed
        int pilihan = JOptionPane.showOptionDialog(this, "Yakin Mau LOG OUT?", "Warning !!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (pilihan == JOptionPane.YES_OPTION) {
            login OUT = new login();
            OUT.show();
            dispose();
        } 
    }//GEN-LAST:event_COMEActionPerformed

    private void PILIHPENERBITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PILIHPENERBITActionPerformed
        if (PILIHPENERBIT.getSelectedItem() == "--Pilih--") {
            PILIHPENERBIT.requestFocus();
            txtpenerbit = null;
        } else {
            if (PILIHPENERBIT.getSelectedItem() == "Erlangga") {
                txtpenerbit = "Erlangga";
            } else if (PILIHPENERBIT.getSelectedItem() == "Gramedia") {
                txtpenerbit = "Gramedia";
            } else if (PILIHPENERBIT.getSelectedItem() == "elex media") {
                txtpenerbit = "elex media";
            } else if (PILIHPENERBIT.getSelectedItem() == "viva publising") {
                txtpenerbit = "viva publising";
            } else if (PILIHPENERBIT.getSelectedItem() == "zamrud") {
                txtpenerbit = "zamrud";
            } else if (PILIHPENERBIT.getSelectedItem() == "intan pariwara") {
                txtpenerbit = "intan pariwara";
            } else if (PILIHPENERBIT.getSelectedItem() == "graha pustaka") {
                txtpenerbit = "graha pustaka";
            } else if (PILIHPENERBIT.getSelectedItem() == "PT CIPTA ADI PUSTAKA") {
                txtpenerbit = "PT CIPTA ADI PUSTAKA";
            } else if (PILIHPENERBIT.getSelectedItem() == "PT DELTA PAMUNGKAS") {
                txtpenerbit = "PT DELTA PAMUNGKAS";
            }
        }
    }//GEN-LAST:event_PILIHPENERBITActionPerformed

    private void EXTRACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXTRACTActionPerformed
        Object[] ekstrak = {"PDF", "EXCELL"};
        int pilihan = JOptionPane.showOptionDialog(this, "Pilih, ekstrak dan share", "ekstrak", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,ekstrak,ekstrak[1]);
        if (pilihan == JOptionPane.YES_OPTION) {
            pdf();
        } else if (pilihan == JOptionPane.NO_OPTION) {
            excell();
        }
    }//GEN-LAST:event_EXTRACTActionPerformed

    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyTyped
        int c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txtISBN.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtISBNKeyTyped

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPERPUS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COME;
    private javax.swing.JButton EXTRACT;
    private javax.swing.JRadioButton JB_F;
    private javax.swing.JRadioButton JB_N;
    private java.awt.Label MASUKANDATABUKUPERPUSTAKAAN;
    private javax.swing.JComboBox<String> PILIHPENERBIT;
    private javax.swing.ButtonGroup RadioButton;
    private javax.swing.JButton SEARCH;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnRform;
    private javax.swing.JButton btnU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtJUDUL;
    private javax.swing.JTextField txtPENULIS;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
    public final void readData(String where) {    
        try {
            DefaultTableModel Model = new DefaultTableModel(data,kolom);
            tb_buku.setModel(Model);
            Statement perintah = k.createStatement();
            String query = "SELECT * FROM buku "+where;
            ResultSet hasil = perintah.executeQuery(query);
            while (hasil.next()) {
                int id = hasil.getInt("id");
                BigDecimal ISBN = hasil.getBigDecimal("ISBN");
                String JUDUL = hasil.getString("JUDUL");
                String PENULIS = hasil.getString("PENULIS");
                String PENERBIT = hasil.getString("PENERBIT");
                String JB = hasil.getString("JB").equals("F") ? 
                        "FIKSI" : "NON-FIKSI";
                Object[] datas = {id,ISBN,JUDUL,PENULIS,PENERBIT,JB};
                Model.addRow(datas);
            }
            tb_buku.getColumnModel().getColumn(0).setMinWidth(0);
            tb_buku.getColumnModel().getColumn(0).setMaxWidth(0);
        } catch (SQLException e) {
        }
    }
    private void Create() {
        try {
            String ISBN = txtISBN.getText();
            String judul = txtJUDUL.getText();
            String penulis = txtPENULIS.getText();
            String Penerbit = txtpenerbit;
            String jb = JB_F.isSelected() ? "F" : "N";
            if (ISBN.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ISBN harus ada");
            } else if (judul.isEmpty()) {
                JOptionPane.showMessageDialog(this, "JUDUL harus ada");
            } else {
                //insert data ke database
                BigInteger newISBN = new BigInteger(ISBN);
                Statement st = k.createStatement();
                String query = "INSERT INTO buku (ISBN,JUDUL,PENULIS,PENERBIT,JB) "
                        + "VALUES ('" + newISBN + "','" + judul + "','" + penulis + "','" + Penerbit + "','" + jb + "')";
                st.executeUpdate(query);
                readData("");
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void search() {
        try {
            String key = txtsearch.getText();
            String where = key.isEmpty() ? "" : ""
                    + "WHERE "
                    + "ISBN LIKE '%" + key + "%' OR "
                    + "JUDUL LIKE '%" + key + "%' OR "
                    + "PENULIS LIKE '%" + key + "%' OR "
                    + "PENERBIT LIKE '%" + key + "%' OR "
                    + "JB LIKE '%" + key + "%'";
            readData(where);
        } catch (Exception e) {
        }
    }

    private void Update() {
        try {
            String Isbn = txtISBN.getText();
            String Judul = txtJUDUL.getText();
            String jb = JB_F.isSelected() ? "F" : "N";
            String penulis =txtPENULIS.getText();
            String penerbit=txtpenerbit;
            if(Isbn.isEmpty()){
                JOptionPane.showMessageDialog(this, "ISBN wajib diisi");
            } else if(Judul.isEmpty()){
                JOptionPane.showMessageDialog(this, "Judul wajib diisi");
            } else {
                //insert data ke database
                BigDecimal newISBN = new BigDecimal(Isbn);
                Statement st = k.createStatement();
                String query = "UPDATE buku SET "
                        + "ISBN='"+newISBN+"',"
                        + "JUDUL='"+Judul+"',"
                        + "PENULIS='"+penulis+"',"
                        + "PENERBIT='"+penerbit+"',"
                        + "JB='"+jb+"' "
                        + "WHERE id="+id_selected;
                st.executeUpdate(query);
                readData(""); 
                resetForm();
                JOptionPane.showMessageDialog(this, "Data berhasil dubah");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); 
        }
    }

    private void excell() {
        FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                TableModel tModel = tb_buku.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));
                // write header
                for (int i = 0; i < tModel.getColumnCount(); i++) {
                    fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
                }
                fileWriter.write("\n");
                // write record
                for (int i = 0; i < tModel.getRowCount(); i++) {
                    for (int j = 0; j < tModel.getColumnCount(); j++) {
                        fileWriter.write(tModel.getValueAt(i, j).toString() + "\t");
                    }
                    fileWriter.write("\n");
                }
                fileWriter.close();
                JOptionPane.showMessageDialog(this,"file excell telah tersimpan silahkan cek file manager anda");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    private void pdf() {
PrinterJob pdf= PrinterJob.getPrinterJob();
        pdf.setJobName("Cetak PDF");
        try {
             pdf.setPrintable((Graphics pg,PageFormat pf,int page)->{
            if (page > 0){
                    return Printable.NO_SUCH_PAGE;
            }
                Graphics2D g2 = (Graphics2D) pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            tb_buku.paint (g2);
            return Printable.PAGE_EXISTS;
            });
        if (pdf.printDialog()==false){
            return;
        }
        pdf.print();
         JOptionPane.showMessageDialog(this, "file pdf sudah tereksport");
        } catch (PrinterException e) {
        JOptionPane.showMessageDialog(this,"Data gagal diekspor"); 
                }
    }
    private void resetForm() {
        txtISBN.setText("");
        txtJUDUL.setText("");
        txtPENULIS.setText("");
        PILIHPENERBIT.setSelectedItem("--Pilih--");
        JB_F.setSelected(true);
        btnC.setEnabled(true);
        btnR.setEnabled(true);
        btnU.setEnabled(false);
        btnD.setEnabled(false);
        btnRform.setEnabled(true);
        PILIHPENERBIT.requestFocus();
    }
}
