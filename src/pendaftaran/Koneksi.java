package pendaftaran;

/**
 *
 * @author Thony
 */
public class Koneksi {
    private java.sql.Connection koneksi;
    
    public java.sql.Connection connect(){
        // Connect to driver
        try{
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver database ditemukan.");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Driver database tidak ditemukan.");
        }
        // Connect to database
        try{
            String url="jdbc:sqlite:Pendaftaran.sqlite";
            koneksi=java.sql.DriverManager.getConnection(url);
            System.out.println("Database ditemukan");
        }catch(Exception e){
            System.out.println("Database tidak ditemukan");
            javax.swing.JOptionPane.showMessageDialog(null, "Database tidak ditemukan!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return koneksi;
    }
}