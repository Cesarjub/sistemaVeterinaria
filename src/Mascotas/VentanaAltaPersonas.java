package Mascotas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class VentanaAltaPersonas extends javax.swing.JFrame {

    public VentanaAltaPersonas() throws SQLException 
    {
        initComponents();
        
        cn = new Conexion();
        ldv = new LeerDatosVeterinaria();
        gsp = new GetSetPersonas();
        cl = new Consultas();
        
        this.setLocationRelativeTo(null); 
        
        this.setConexion();
        
        jTextField1.setEditable(false);        
        
        jTextField1.setText(String.valueOf(cl.getGenerarIdPersona()));
        
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
            jLabel7.setText("Conectado");
            //jLabel9.setForeground(Color.GREEN);
        }
        else
        {
           jLabel7.setText("Desconectado"); 
           jLabel7.setForeground(Color.red);
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta de personas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de personas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 510, 30);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 50, 15);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(30, 40, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 100, 60, 15);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(30, 120, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Genero:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 100, 50, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Femenino", "Masculino" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(290, 120, 100, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Domicilio:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 180, 70, 15);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(30, 200, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 180, 80, 15);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(290, 200, 140, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(200, 280, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 70, 150, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 150, 220, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(290, 140, 210, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 230, 220, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 230, 160, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/family.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(430, 250, 70, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 50, 510, 330);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 380, 270, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 420);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wiping-swipe-for-floors.png"))); // NOI18N
        jMenuItem1.setText("Limpiar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
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

        setBounds(0, 0, 557, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try 
        {
            VentanaPrincipalVeterinaria vpv = new VentanaPrincipalVeterinaria();
            
            this.dispose();
            vpv.setVisible(true);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jComboBox1.setSelectedIndex(0);
        jLabel8.setText(null);
        jLabel9.setText(null);
        jLabel10.setText(null);
        jLabel11.setText(null);
        jLabel12.setText(null);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(ldv.getLeerNombre(jTextField2.getText()))
            jLabel9.setText(null);     
        else
          jLabel9.setText("El nombre es incorrecto");   
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if(jTextField3.getText().length() < 3)
            jLabel11.setText("El domicilio es incorrecto");  
        else
            jLabel11.setText(null);   
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char car = evt.getKeyChar();
        
        if((car<'0' || car>'9')) 
            evt.consume();
        
        if (jTextField4.getText().length()== 10)
        {
            evt.consume();
            jLabel12.setText(null);
        }
        else
            jLabel12.setText("El telefono es incorrecto");                 
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedItem() == "Selecciona")
            jLabel10.setText("Selecciones una opcion valida"); 
        else
            jLabel10.setText(null);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try
        {
            gsp.setClave(Integer.parseInt(jTextField1.getText())); 
            gsp.setNombre(jTextField2.getText());
            gsp.setGenero(jComboBox1.getSelectedItem().toString());
            gsp.setDireccion(jTextField3.getText());
            gsp.setTelefono(jTextField4.getText());  
        }
        catch(NumberFormatException e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);  
        }
                
        if(jTextField1.getText().length() == 0)
            jLabel8.setText("La clave es incorrecta");   
        else
            jLabel8.setText(null);         
        
        if(ldv.getLeerNombre(jTextField2.getText()))
            jLabel9.setText(null);    
        else
            jLabel9.setText("El nombre es incorrecto");     
        
        if(jTextField3.getText().length() > 3)
            jLabel11.setText(null);
        else
            jLabel11.setText("El domicilio es incorrecto");   
        
        if(jTextField4.getText().length() == 10)
            jLabel12.setText(null);
        else
            jLabel12.setText("El telefono es incorrecto");
        
        if(jComboBox1.getSelectedItem() == "Selecciona")
            jLabel10.setText("Selecciones una opcion valida"); 
        else
            jLabel10.setText(null);
                
        
        if(jComboBox1.getSelectedItem() != "Selecciona" & jTextField1.getText().length() > 0 & ldv.getLeerNombre(gsp.getNombre())
                & ldv.getLeerTelefono(gsp.getTelefono()) && jTextField3.getText().length() > 3)
        {
            try 
            {
                if(cl.getLlenarPersonas(gsp.getClave(), gsp.getNombre(), gsp.getGenero(), gsp.getDireccion(), gsp.getTelefono()))
                {
                    JOptionPane.showMessageDialog(null,"Los datos han sido guardado","Persona guardada", 1);                
                    
                    jTextField1.setText(String.valueOf(cl.getGenerarIdPersona()));
                    jTextField2.setText(null);
                    jTextField3.setText(null);
                    jTextField4.setText(null);
                    jComboBox1.setSelectedIndex(0);                    
                    jLabel8.setText(null);
                    jLabel9.setText(null);
                    jLabel10.setText(null);
                    jLabel11.setText(null);
                    jLabel12.setText(null);
                }
                else
                    JOptionPane.showMessageDialog(null,"No se han guardado los datos","!! ERROR !!", 2);
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null,"Existe un error: " + e,"!! ERROR !!", 2);
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","!! ERROR !!", 2);

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new VentanaAltaPersonas().setVisible(true);
                } 
                catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private Conexion cn;
    private LeerDatosVeterinaria ldv;
    private Consultas cl;
    private GetSetPersonas gsp;
}
