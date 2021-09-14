package rokravi1;


import java.sql.*;
import javax.swing.JOptionPane;


public class DB_connect {
    
    
    Connection con=null;
    public static Connection ConnerDB(){
         try{
                    Class.forName("java.sql.DriverManager");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
                    return con;
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    
    } 
    
}
