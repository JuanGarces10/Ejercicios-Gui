/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia.gui.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Window extends javax.swing.JFrame {
    
    JCheckBox vcuadros[];
    JButton btnAceptar;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        CreacionVentana();
    }
    
    public void CreacionVentana(){
        
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300,600);
        
        vcuadros = new JCheckBox[10];
        
        String vtextos[] = {"rojo","verde","azul","rosa","celeste",
            "morado","amarillo","marrón","naranja","blanco"};
        
                
        int i;
        for(i=0;i<vcuadros.length;i++){
            vcuadros[i]=new JCheckBox();
            vcuadros[i].setText(vtextos[i]);
            vcuadros[i].setBounds(10, 10+30*i, 100, 20);
            this.getContentPane().add(vcuadros[i]);
        }
        
        btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(10,360,100,20);
        this.getContentPane().add(btnAceptar);
        
        btnAceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnAceptarActionPerformed(evt);
            }
        });
    }
    
    public void btnAceptarActionPerformed(ActionEvent evt){
        int i;
        int cont=0;
        
        for(i=0;i<vcuadros.length;i++){
            if(vcuadros[i].isSelected()){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+cont+" cuadros seleccionados");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
