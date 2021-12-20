package Mascotas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class VentanaAltaMascotas extends javax.swing.JFrame {

    public VentanaAltaMascotas() throws SQLException 
    {
        initComponents();
        
        cn = new Conexion();
        ldv = new LeerDatosVeterinaria();
        cl = new Consultas();
        gsm = new GetSetMascotas();
        
        lista = new ArrayList <String>();
        
        this.setLocationRelativeTo(null);  
        
        jTextField1.setEditable(false);
        jTextField4.setEditable(false);
        
        jPanel3.setVisible(false);
        
        this.setConexion();     
        
        lista = cl.getLlenarComboIdPersona();
        
        jComboBox1.addItem("Selecciona");
        
        for(int i = 0; i < lista.size(); i++)
            jComboBox1.addItem(lista.get(i));
        
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
            jLabel9.setText("Conectado");
            //jLabel9.setForeground(Color.GREEN);
        }
        else
        {
           jLabel9.setText("Desconectado"); 
           jLabel9.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta de mascotas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Propietario");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 10, 100, 15);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(70, 30, 100, 20);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 20, 220, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 32, 32);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 50, 490, 70);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(160, 20, 70, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pawprint (1).png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(410, 190, 70, 60);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(160, 40, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Genero:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 110, 60, 15);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Macho", "Hembra" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(40, 130, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Edad:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(360, 20, 50, 15);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(360, 40, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Especie:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(170, 110, 60, 15);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Perro", "Gato", "Hamster", "Pajaro" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(170, 130, 100, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(190, 210, 100, 23);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Normal", "Enfermo", "Fallecido" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(300, 130, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Estatus");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(300, 110, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jPanel3.add(jLabel11);
        jLabel11.setBounds(160, 70, 170, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(360, 70, 100, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 150, 100, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel14);
        jLabel14.setBounds(170, 150, 100, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel15);
        jLabel15.setBounds(300, 150, 100, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Clave:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(40, 20, 70, 15);
        jPanel3.add(jTextField4);
        jTextField4.setBounds(40, 40, 90, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel17);
        jLabel17.setBounds(40, 70, 100, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 140, 490, 260);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Registro de mascotas");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 10, 200, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 400, 270, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 440);

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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
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

        setBounds(0, 0, 538, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jComboBox1.setSelectedIndex(0);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jLabel11.setText(null);
        jLabel12.setText(null);
        jLabel13.setText(null);
        jLabel14.setText(null);
        jLabel15.setText(null);
        jLabel17.setText(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(ldv.getLeerNombre(jTextField2.getText()))
            jLabel11.setText(null);     
        else
          jLabel11.setText("Nombre incorrecto");   
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char car = evt.getKeyChar();
        
        if((car<'0' || car>'9')) 
            evt.consume();
        
         if (jTextField3.getText().length() == 2)
             evt.consume();
       
         if(jTextField3.getText().length() > 0)
             jLabel12.setText(null);
         
        /* if(jTextField3.getText().length() == 0)
            jLabel12.setText("Edad incorrecta");
         else
           jLabel12.setText(null); */ 
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if(jComboBox2.getSelectedItem() == "Selecciona")
            jLabel13.setText("Opcion incorrecta"); 
        else
            jLabel13.setText(null);
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if(jComboBox3.getSelectedItem() == "Selecciona")
            jLabel14.setText("Opcion incorrecta"); 
        else
            jLabel14.setText(null);
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        if(jComboBox4.getSelectedItem() == "Selecciona")
            jLabel15.setText("Opcion incorrecta"); 
        else
            jLabel15.setText(null);
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try 
        {
            if(jComboBox1.getSelectedItem() == "Selecciona")
            {
                jPanel3.setVisible(false);
                jTextField1.setText(null);
            }
            else
            {
                jTextField4.setText(String.valueOf(cl.getGenerarIdMascota()));   
                jPanel3.setVisible(true);
                jTextField1.setText(cl.getNombrePersona(Integer.parseInt((String) jComboBox1.getSelectedItem())));
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try
        {
            gsm.setClave(Integer.parseInt(jTextField4.getText()));
            gsm.setNombre(jTextField2.getText());
            gsm.setEdad(Integer.parseInt(jTextField3.getText()));
            gsm.setGenero(jComboBox2.getSelectedItem().toString());
            gsm.setEspecie(jComboBox3.getSelectedItem().toString());
            gsm.setEstatus(jComboBox4.getSelectedItem().toString());
            gsm.setClavePrs(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
        }
        catch (Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);    
        }
        
        if (jTextField4.getText().length() == 0)
            jLabel17.setText("Clave incorrecta"); 
        else
            jLabel17.setText(null);   
        
        if(ldv.getLeerNombre(jTextField2.getText()))
            jLabel11.setText(null);     
        else
          jLabel11.setText("Nombre incorrecto");  
        
        if (jTextField3.getText().length() >= 1)
            jLabel12.setText(null);
        else
            jLabel12.setText("Edad incorrecta");         
        
        if(jComboBox2.getSelectedItem() == "Selecciona")
            jLabel13.setText("Opcion incorrecta"); 
        else
            jLabel13.setText(null);
        
        if(jComboBox3.getSelectedItem() == "Selecciona")
            jLabel14.setText("Opcion incorrecta"); 
        else
            jLabel14.setText(null);
        
        if(jComboBox4.getSelectedItem() == "Selecciona")
            jLabel15.setText("Opcion incorrecta"); 
        else
            jLabel15.setText(null);        

        if(jTextField4.getText().length() > 0 & ldv.getLeerNombre(jTextField2.getText()) && jTextField3.getText().length() >= 1
           && jComboBox2.getSelectedItem() != "Selecciona" && jComboBox3.getSelectedItem() != "Selecciona" && jComboBox4.getSelectedItem() != "Selecciona")
        {
            if(cl.getLlenarMascotas(gsm.getClavePrs(), gsm.getClave(), gsm.getNombre(), gsm.getEdad(),
                    gsm.getGenero(), gsm.getEspecie(), gsm.getEstatus()))
            {
                JOptionPane.showMessageDialog(null,"Los datos han sido guardado","Mascota guardada", 1);  
                
                jComboBox1.setSelectedIndex(0);
                jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField4.setText(null);
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);
                jLabel11.setText(null);
                jLabel12.setText(null);
                jLabel13.setText(null);
                jLabel14.setText(null);
                jLabel15.setText(null);
                jLabel17.setText(null);                
            }
            else
                JOptionPane.showMessageDialog(null,"No se han guardado los datos","!! ERROR !!", 2);              
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
            java.util.logging.Logger.getLogger(VentanaAltaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAltaMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new VentanaAltaMascotas().setVisible(true);
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
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private Conexion cn;
    private LeerDatosVeterinaria ldv;
    private Consultas cl;
    private GetSetMascotas gsm;
    
    private ArrayList <String> lista;
}
