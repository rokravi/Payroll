import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * allowance.java
 *
 * Created on Apr 10, 2017, 12:16:19 PM
 */

/**
 *
 * @author DAV
 */
public class allowance extends javax.swing.JFrame {

    /** Creates new form allowance */
    public allowance() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1054, 879));
        getContentPane().setLayout(null);

        jButton5.setFont(new java.awt.Font("Old English Text MT", 0, 18));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ree1.PNG"))); // NOI18N
        jButton5.setText("CLAER ALL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(230, 620, 170, 50);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        jLabel1.setText("Employee id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 110, 23);

        jTextField1.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(520, 20, 160, 32);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SE.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, -30, 130, 80);

        jButton3.setFont(new java.awt.Font("Old English Text MT", 0, 22));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SAVE.PNG"))); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 620, 160, 50);

        jButton2.setFont(new java.awt.Font("Old English Text MT", 0, 22));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK.PNG"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 620, 170, 50);

        jButton4.setFont(new java.awt.Font("Old English Text MT", 0, 22)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C1.PNG"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(720, 620, 140, 50);

        jTextField15.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField15);
        jTextField15.setBounds(660, 530, 160, 32);

        jLabel21.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel21.setText("Bonus");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(130, 530, 47, 24);

        jLabel20.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel20.setText("Lunch");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(130, 450, 49, 24);

        jTextField14.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField14);
        jTextField14.setBounds(660, 450, 150, 32);

        jLabel19.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel19.setText("Medical");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(130, 380, 60, 24);

        jTextField13.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField13);
        jTextField13.setBounds(660, 370, 150, 32);

        jTextField16.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField16);
        jTextField16.setBounds(880, 410, 110, 32);

        jLabel22.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel22.setText("Extra (Excl From Salary)");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(850, 350, 189, 24);

        jLabel18.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel18.setText("OverTime");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(130, 310, 71, 24);

        jTextField12.setFont(new java.awt.Font("Segoe Print", 0, 14));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(660, 310, 150, 32);

        jLabel15.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel15.setText("Bonus AND Incentives For The Month of.. ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(90, 250, 310, 24);

        jTextField2.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(660, 250, 150, 20);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 14));
        jLabel2.setText("Empolyiee id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 190, 130, 24);

        jTextField3.setFont(new java.awt.Font("Segoe Print", 0, 14));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(660, 180, 150, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "fname", "lname", "gender", "email", "contact", "doj", "designation", "salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 980, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nki.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -20, 1040, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
            c.createStatement();
            PreparedStatement p;
            String sql="insert into allowance(id,dates,overtime,medical,lunch,bonus,total) values(?,?,?,?,?,?,?)";
            p=c.prepareStatement(sql);
            p.setString(1,jTextField3.getText());
            p.setString(2,jTextField2.getText());
            p.setString(3,jTextField12.getText());
            p.setString(4,jTextField13.getText());
            p.setString(5,jTextField14.getText());
            p.setString(6,jTextField15.getText());
            p.setString(7,jTextField16.getText());
            p.execute();
            JOptionPane.showMessageDialog(null,"record added succesfully");


        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"error",1);
        }



}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m=(DefaultTableModel)jTable1.getModel();
        try{
            ResultSet rs;
            PreparedStatement pst;
            Connection con=null;
            Class.forName("java.sql.DriverManager");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
            Statement s=con.createStatement();
            String a=jTextField1.getText();
            String sql="Select*from addition where id='"+a+"';";
            rs=s.executeQuery(sql);
            pst=con.prepareStatement(sql);
            while(rs.next()) {
                String s1=rs.getString("id");
                String s2=rs.getString("fname");
                String s3=rs.getString("lname");
                String s4=rs.getString("gender");
                String s5=rs.getString("email");
                String s6=rs.getString("contact");
                String s7=rs.getString("doj");
                String s8=rs.getString("designation");
                String s9=rs.getString("salary");
                m.addRow(new Object[]{s1,s2,s3,s4,s5,s6,s7,s8,s9});

            }
            rs.close();
            s.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
            int total=0;
            int ot=Integer.parseInt(jTextField12.getText());
            int medical=Integer.parseInt(jTextField13.getText());
            int lunch=Integer.parseInt(jTextField14.getText());
            int bonus=Integer.parseInt(jTextField15.getText());
            total=(ot+bonus)-(lunch+medical);
            jTextField16.setText(""+total);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
         new welcome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTable1.setModel(new DefaultTableModel(null,new String[]{"id","fname","lname","gender","email","contact no","doj","designation","salary"}));
}//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allowance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
