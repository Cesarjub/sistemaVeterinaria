package Mascotas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaMostrarMascotas extends javax.swing.JFrame {

    public VentanaMostrarMascotas() throws SQLException 
    {
        initComponents();

        this.setLocationRelativeTo(null); 
        
        cn = new Conexion();
        cl = new Consultas();
        
        this.setConexion();        
        
        jTextField1.setVisible(false);
        
        jComboBox2.setVisible(false);
        
        jButton2.setVisible(false);
        
        jPanel4.setVisible(false);
        
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
            jLabel15.setText("Conectado");
            //jLabel9.setForeground(Color.GREEN);
        }
        else
        {
           jLabel15.setText("Desconectado"); 
           jLabel15.setForeground(Color.red);
        }
    } 
    
    public void setLLenarComboMascotas(int id)
    {
        ArrayList<String> lista = new ArrayList <String>();        
        
        try 
        {   
            jComboBox1.addItem("Selecciona");
            
            lista = cl.getLlenarComboMascotas(id);
            
            for(int i = 0; i < lista.size(); i++)
                jComboBox1.addItem(lista.get(i));  
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }
    
    public void setMostrarMascotas(String nom)
    {
        String id = "", edad = "", genero = "", especie = "", estatus = "", propietario = "";
        
        String consulta = "SELECT * FROM mascotas WHERE nombre_mct = '" + nom + "'";     
        
        id = cl.getConsultas(consulta, "ID_mct");
        edad = cl.getConsultas(consulta, "edad_mct");
        genero = cl.getConsultas(consulta, "genero_mct");
        especie = cl.getConsultas(consulta, "especie_mct");
        estatus = cl.getConsultas(consulta, "estatus_mct");
        propietario = cl.getConsultas(consulta, "ID_prs");
        
        jLabel5.setText(nom);
        jLabel6.setText(id);
        jLabel8.setText(edad);
        jLabel10.setText(genero);
        jLabel12.setText(especie);
        jLabel14.setText(estatus);
        jLabel16.setText(propietario);
        
        if(especie.equals("Perro"))
        {
            jLabel1.setIcon(new ImageIcon("src/Imagenes/perro.png"));  
        }
        else if(especie.equals("Gato"))
        {
            jLabel1.setIcon(new ImageIcon("src/Imagenes/gato.png"));  
        }
        else if(especie.equals("Hamster"))
        {
            jLabel1.setIcon(new ImageIcon("src/Imagenes/hamster.png"));  
        }        
        else if(especie.equals("Pajaro"))
        {
            jLabel1.setIcon(new ImageIcon("src/Imagenes/pajaro.png"));  
        }        
        else
        {
            jLabel1.setText("X");
        }                
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil de mascotas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mascotas:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 70, 15);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(110, 20, 100, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 10, 490, 60);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 70, 70);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(70, 40, 90, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3);
        jLabel3.setBounds(370, 10, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rubbish-bin.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4);
        jLabel4.setBounds(410, 10, 30, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel5);
        jLabel5.setBounds(240, 52, 130, 20);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(40, 150, 410, 10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel6);
        jLabel6.setBounds(240, 80, 130, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eye.png"))); // NOI18N
        jButton1.setText("  Mostrar propietario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(230, 110, 160, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Edad:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(60, 180, 60, 17);

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(180, 280, 130, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(140, 180, 50, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Genero:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(50, 210, 70, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(140, 210, 90, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Especie:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(50, 240, 70, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(140, 240, 100, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Estatus:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(250, 180, 70, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jLabel14);
        jLabel14.setBounds(330, 180, 90, 20);
        jPanel4.add(jTextField1);
        jTextField1.setBounds(140, 170, 70, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Enfermo", "Fallecido" }));
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(330, 180, 110, 20);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel16);
        jLabel16.setBounds(340, 230, 70, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 80, 490, 320);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 400, 140, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 450);

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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (3).png"))); // NOI18N
        jMenuItem3.setText("Propietario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prescription (1).png"))); // NOI18N
        jMenuItem2.setText("Menu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 540, 481);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jLabel8.setVisible(false);
        jLabel14.setVisible(false);
        
        jTextField1.setVisible(true);
        
        jComboBox2.setVisible(true);
        
        jButton2.setVisible(true);
        
        jTextField1.setText(jLabel8.getText());
        
        jComboBox2.setSelectedItem(jLabel14.getText());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem() == "Selecciona")
        {
            jPanel4.setVisible(false);
            jMenuItem3.setEnabled(false);
        }
        else
        {
            jMenuItem3.setEnabled(true);
            this.setMostrarMascotas((String) jComboBox1.getSelectedItem());
            jPanel4.setVisible(true);    
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try 
        {
            VentanaMostrarPersona vmp = new VentanaMostrarPersona();
            
            this.setVisible(false);
            vmp.setVisible(true);
            vmp.setPersona(Integer.parseInt(jLabel16.getText()));
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try 
        {
            VentanaMostrarPersona vmp = new VentanaMostrarPersona();
            
            this.setVisible(false);
            vmp.setVisible(true);
            vmp.setPersona(Integer.parseInt(jLabel16.getText()));
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       int op = 0; 
       
        op = JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar a " + jLabel5.getText() + "?", "Modificar", JOptionPane.YES_NO_OPTION);
           
        if(op == JOptionPane.YES_OPTION)
        {
            if(jTextField1.getText().length() > 0)
            {
                try 
                {
                    if(cl.getModificarMascotas(Integer.parseInt(jLabel6.getText()), Integer.parseInt(jTextField1.getText()), jComboBox2.getSelectedItem().toString()))
                    {
                        JOptionPane.showMessageDialog(null, jLabel5.getText() + " ha sido modificado","Mascota modificada", 1);      
                        
                        VentanaPrincipalVeterinaria vpv = new VentanaPrincipalVeterinaria();
            
                        this.dispose();
                        vpv.setVisible(true);
                    }
                    else
                       JOptionPane.showMessageDialog(null,"La mascota no se ha podido modificar","!! ERROR !!", 2);   
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
          jComboBox2.setVisible(false);
          
          jLabel8.setVisible(true);
          jLabel14.setVisible(true);
          
          jButton2.setVisible(false);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       int op = 0; 
       
        op = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar a " + jLabel5.getText() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
           
        if(op == JOptionPane.YES_OPTION)
        {
            if(cl.getEliminarMascotas(Integer.parseInt(jLabel6.getText())))
            {
                JOptionPane.showMessageDialog(null, jLabel5.getText() + " ha sido eliminado","Mascota eliminada", 1);      
                        
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
                JOptionPane.showMessageDialog(null,"La mascota no se ha podido eliminar","!! ERROR !!", 2); 
        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaMostrarMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new VentanaMostrarMascotas().setVisible(true);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private Conexion cn;
    private Consultas cl;
}
