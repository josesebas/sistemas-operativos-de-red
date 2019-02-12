package app;

import elaprendiz.ventanas.DLogin;


/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class JVentas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
           @Override
            public void run() {
                DLogin dialog = new DLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        }); 
    }
}
