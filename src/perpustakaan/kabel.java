package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class kabel {
    public static Connection sambungna(){
        Connection k = null;
        Statement perintah;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            k=DriverManager.getConnection("jdbc:mysql://localhost:3307/db_perpus","root", "");
            perintah = k.createStatement();
             return k;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
        return k;
    }
    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
