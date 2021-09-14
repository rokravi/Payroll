package splashscreen;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAV
 */


    /**
     * @param args the command line arguments
     */
   class Main {

    public static void main(String[] args) {

        // TODO code application logic here
        JWindow window = new JWindow();
        window.getContentPane().add(new JLabel("",new ImageIcon("C:\\Users\\DAV\\Desktop\\rti.gif"),SwingConstants.CENTER));
        window.setBounds(450, 400, 500, 500);
        window.setVisible(true);

        try
        {
            Thread.sleep(3000);

        }
        catch(InterruptedException e){}
         window.dispose();

    

}
}