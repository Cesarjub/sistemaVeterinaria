package Mascotas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaMostrarPersona extends javax.swing.JFrame {

    public VentanaMostrarPersona() throws SQLException 
    {
        initComponents();
        
        this.setLocationRelativeTo(null); 
        
        cn = new Conexion();
        cl = new Consultas();
        
        this.setConexion();
        
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        
        jButton1.setVisible(false);
        
        //Icono de la Ventana
        try{
            Image img = ImageIO.read(new File("calendar.png"));
            this.setIconImage(img);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }          
    }
   
    public void setConexion()
    {
        if(cn.getConectar() != null)
        {
            jLabel1.setText("Conectado");
            //jLabel9.setForeground(Color.GREEN);
        }
        else
        {
           jLabel1.setText("Desconectado"); 
           jLabel1.setForeground(Color.red);
        }
    }
    
    public void setPersona(int id)
    {
        String nombre = "", genero = "", domicilio = "", telefono = "";
        
        String consulta = "SELECT * FROM personas WHERE ID_prs = '" + id + "'";

        nombre = cl.getConsultas(consulta, "nombre_prs");
        genero = cl.getConsultas(consulta, "genero_prs");
        telefono = cl.getConsultas(consulta, "telefono_prs");
        domicilio = cl.getConsultas(consulta, "domicilio_prs");
        
        if(genero.equals("Masculino"))
        {
            jLabel2.setIcon(new ImageIcon("src/Imagenes/boy-broad-smile (2).png"));
        }
        else if(genero.equals("Femenino"))
        {
            jLabel2.setIcon(new ImageIcon("src/Imagenes/chica.png"));    
        }
        else
        {
            jLabel2.setText("X");
        }        

        jLabel4.setText(String.valueOf(id));
        jLabel3.setText(nombre);
        jLabel5.setText(genero);
        jLabel6.setText(telefono);
        jLabel7.setText(domicilio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil de personas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(40, 160, 410, 10);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 80);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(70, 40, 100, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(190, 60, 290, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 87, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(160, 190, 160, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(160, 230, 160, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(160, 270, 230, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Genero:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 190, 90, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 230, 100, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Direccion:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 270, 90, 17);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rubbish-bin.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(430, 10, 30, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(390, 10, 30, 30);

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(200, 320, 110, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        jButton2.setText("  Mostrar mascotas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(250, 120, 160, 20);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(160, 220, 110, 30);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(160, 260, 240, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 11, 500, 360);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 370, 120, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 410);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/animal-prints.png"))); // NOI18N
        jMenuItem2.setText("Mascotas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prescription (1).png"))); // NOI18N
        jMenuItem3.setText("Menu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 528, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        
        jButton1.setVisible(true);
        
        jTextField1.setText(jLabel6.getText());
        jTextField2.setText(jLabel7.getText());        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try 
        {
            VentanaPrincipalVeterinaria vpv = new VentanaPrincipalVeterinaria();
            
            this.setVisible(false);
            vpv.setVisible(true);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try 
        {
            VentanaMostrarMascotas vmm = new VentanaMostrarMascotas();
            
            this.dispose();
            vmm.setVisible(true);
            vmm.setLLenarComboMascotas(Integer.parseInt(jLabel4.getText()));
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try 
        {
            VentanaMostrarMascotas vmm = new VentanaMostrarMascotas();
            
            this.dispose();
            vmm.setVisible(true);
            vmm.setLLenarComboMascotas(Integer.parseInt(jLabel4.getText()));
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       int op = 0; 
       
        op = JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar a " + jLabel3.getText() + "?", "Modificar", JOptionPane.YES_NO_OPTION);
           
        if(op == JOptionPane.YES_OPTION)
        {
            if(jTextField1.getText().length() > 0 && jTextField2.getText().length() > 0)
            {
                try 
                {
                    if(cl.getModificarPersonas(Integer.parseInt(jLabel4.getText()), jTextField1.getText(), jTextField2.getText()))
                    {
                        JOptionPane.showMessageDialog(null, jLabel3.getText() + " ha sido modificado","Contacto modificado", 1);      
                        
                        VentanaPrincipalVeterinaria vpv = new VentanaPrincipalVeterinaria();
            
                        this.dispose();
                        vpv.setVisible(true);
                    }
                    else
                       JOptionPane.showMessageDialog(null,"El contacto no se ha podido modificar","!! ERROR !!", 2);   
                } 
                catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error: " +e,"!! ERROR !!", 2);  
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","!! ERROR !!", 2);  
        }
        else
        {
          jTextField1.setVisible(false);
          jTextField2.setVisible(false);
          
          jLabel6.setVisible(true);
          jLabel7.setVisible(true);
          
          jButton1.setVisible(false);
        }
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       int op = 0; 
       
        op = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar a " + jLabel3.getText() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
           
        if(op == JOptionPane.YES_OPTION)
        {
            if(cl.getEliminarPersonas(Integer.parseInt(jLabel4.getText())))
            {
                JOptionPane.showMessageDialog(null, jLabel3.getText() + " ha sido eliminado","Persona eliminada", 1);      
                        
                try 
                {
                    VentanaPrincipalVeterinaria vpv = new VentanaPrincipalVeterinaria();
                                    
                    this.dispose();
                    vpv.setVisible(true); 
                } 
                catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error: " +e,"!! ERROR !!", 2); 
                }               
            }
            else
                JOptionPane.showMessageDialog(null,"La oersona no se ha podido eliminar","!! ERROR !!", 2); 
        }
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaMostrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new VentanaMostrarPersona().setVisible(true);
                } 
                catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private Conexion cn;
    private Consultas cl;
}
