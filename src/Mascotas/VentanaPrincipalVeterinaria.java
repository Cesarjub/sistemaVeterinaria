package Mascotas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class VentanaPrincipalVeterinaria extends javax.swing.JFrame {

    public VentanaPrincipalVeterinaria() throws SQLException 
    {
        initComponents();
        
        cn = new Conexion();
        cl = new Consultas();
        
        this.setLocationRelativeTo(null); 
        
        this.setConexion();
        
        //Tabla de personas
        th1 = jTable1.getTableHeader();        
        
        dtm1 = new DefaultTableModel(filas1, columnas1)
        {
            public boolean isCellEditable(int fil, int col)
            {
                return false;
            }
        };         
        
        DefaultTableCellRenderer renderer1 = (DefaultTableCellRenderer) 
                jTable1.getTableHeader().getDefaultRenderer(); 
        
        renderer1.setHorizontalAlignment(0);        
        
        th1.setReorderingAllowed(false);

        th1.setFont(new Font("Calibri", Font.PLAIN, 13));
        
        th1.setForeground(Color.BLACK);  
        
        th1.setResizingAllowed(false);

        dtm1.fireTableDataChanged();
        
        jTable1.setModel(dtm1); 
        
        this.setLLenarTablaPersonas("SELECT ID_prs, nombre_prs FROM personas");
        
        //Tabla de mascotas
        th2 = jTable2.getTableHeader();        
        
        dtm2 = new DefaultTableModel(filas2, columnas2)
        {
            public boolean isCellEditable(int fil, int col)
            {
                return false;
            }
        };         
        
        DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer) 
                jTable2.getTableHeader().getDefaultRenderer(); 
        
        renderer2.setHorizontalAlignment(0);        
        
        th2.setReorderingAllowed(false);

        th2.setFont(new Font("Calibri", Font.PLAIN, 13));
        
        th2.setForeground(Color.BLACK);  
        
        th2.setResizingAllowed(false);

        dtm2.fireTableDataChanged();
        
        jTable2.setModel(dtm2);  
        
        this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas");
        
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
            jLabel11.setText("Conectado");
            //jLabel9.setForeground(Color.GREEN);
        }
        else
        {
           jLabel11.setText("Desconectado"); 
           jLabel11.setForeground(Color.red);         
        }
    }   
    
    public void setLLenarTablaPersonas(String consulta)
    {
        try 
        {
            resultado1 = cl.getLlenarTablas(consulta);            

            while(resultado1.next())
            {
                dtm1.addRow(new Object[] {resultado1.getInt("ID_prs"), resultado1.getString("nombre_prs")});
            }                
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }
    
    public void setLLenarTablaMascotas(String consulta)
    {
        try 
        {
            resultado2 = cl.getLlenarTablas(consulta);
            
            while(resultado2.next())
            {
                
                dtm2.addRow(new Object[] {resultado2.getInt("ID_mct"), resultado2.getString("nombre_mct"), resultado2.getInt("ID_prs")});
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veterinaria");
        jPanel9.add(jLabel1);
        jLabel1.setBounds(290, 20, 110, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinary.png"))); // NOI18N
        jPanel9.add(jLabel6);
        jLabel6.setBounds(580, 10, 70, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-group.png"))); // NOI18N
        jButton1.setText("  Agregar  personas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel9.add(jButton1);
        jButton1.setBounds(490, 120, 170, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jButton2.setText("  Agregar mascotas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel9.add(jButton2);
        jButton2.setBounds(490, 170, 170, 33);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID:");
        jPanel9.add(jLabel12);
        jLabel12.setBounds(30, 50, 18, 15);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinarian.png"))); // NOI18N
        jPanel9.add(jLabel10);
        jLabel10.setBounds(390, 320, 40, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaccine.png"))); // NOI18N
        jPanel9.add(jLabel9);
        jLabel9.setBounds(290, 320, 40, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dog (1).png"))); // NOI18N
        jPanel9.add(jLabel7);
        jLabel7.setBounds(240, 320, 40, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cat.png"))); // NOI18N
        jPanel9.add(jLabel2);
        jLabel2.setBounds(190, 320, 40, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/track.png"))); // NOI18N
        jPanel9.add(jLabel4);
        jLabel4.setBounds(140, 320, 40, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cat (1).png"))); // NOI18N
        jPanel9.add(jLabel5);
        jLabel5.setBounds(90, 320, 40, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dog.png"))); // NOI18N
        jPanel9.add(jLabel3);
        jLabel3.setBounds(340, 320, 40, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stethoscope.png"))); // NOI18N
        jPanel9.add(jLabel8);
        jLabel8.setBounds(40, 330, 40, 40);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Clave", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel10.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 400, 160);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField1);
        jTextField1.setBounds(0, 0, 120, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Genero", "Femenino", "Masculino" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox2);
        jComboBox2.setBounds(240, 10, 110, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh-button.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel13);
        jLabel13.setBounds(370, 0, 20, 40);

        jTabbedPane3.addTab("Personas", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estatus", "Normal", "Enfermo", "Fallecido" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel11.add(jComboBox1);
        jComboBox1.setBounds(240, 10, 110, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Dueño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel11.add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 400, 160);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel11.add(jTextField2);
        jTextField2.setBounds(0, 0, 120, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh-button.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel14);
        jLabel14.setBounds(370, 0, 20, 40);

        jTabbedPane3.addTab("Mascotas", jPanel11);

        jPanel9.add(jTabbedPane3);
        jTabbedPane3.setBounds(30, 70, 400, 230);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel9.add(jLabel11);
        jLabel11.setBounds(540, 340, 110, 20);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 680, 400);

        jMenu1.setText("File");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh-arrow.png"))); // NOI18N
        jMenuItem4.setText("Actualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

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

        jMenu2.setText("New");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (3).png"))); // NOI18N
        jMenuItem2.setText("Personas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/animal-prints.png"))); // NOI18N
        jMenuItem3.setText("Mascotas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 684, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try 
        {
            VentanaAltaPersonas vap = new VentanaAltaPersonas();
            
            this.dispose();
            vap.setVisible(true);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try 
        {
            VentanaAltaMascotas vam = new VentanaAltaMascotas();
            
            this.dispose();
            vam.setVisible(true);
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try
        {
            VentanaAltaMascotas vam = new VentanaAltaMascotas();

            this.dispose();
            vam.setVisible(true);
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try
        {
            VentanaAltaPersonas vap = new VentanaAltaPersonas();

            vap.setVisible(true);
            this.dispose();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error: " +e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        String campoSel = "";        
        
        try 
        {
            VentanaMostrarPersona vmp = new VentanaMostrarPersona();
            
            if(fila == -1)
            {
                
            }
            else
            {
                campoSel = jTable1.getValueAt(fila, 0).toString();
                this.setVisible(false);
                vmp.setVisible(true);
                vmp.setPersona(Integer.parseInt(campoSel));
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        
        if((car<'0' || car>'9')) 
            evt.consume();        
        
        TableRowSorter trs = new TableRowSorter(dtm1);
        
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                //super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
                trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 0));
            }
        });
        
        jTable1.setRowSorter(trs);
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char car = evt.getKeyChar();
        
        if((car<'0' || car>'9')) 
            evt.consume();        
        
        TableRowSorter trs = new TableRowSorter(dtm2);
        
        jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                //super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
                trs.setRowFilter(RowFilter.regexFilter(jTextField2.getText(), 0));
            }
        });
        
        jTable2.setRowSorter(trs);
        
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int fila = jTable2.getSelectedRow();
        String campoSel = "";
        
        try 
        {
            VentanaMostrarMascotas vmm = new VentanaMostrarMascotas();    
            
            if(fila == -1)
            {
                
            }
            else
            {
                campoSel = jTable2.getValueAt(fila, 2).toString();
                
                this.dispose();
                vmm.setVisible(true);
                vmm.setLLenarComboMascotas(Integer.parseInt(campoSel));
            }            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int a = jTable1.getRowCount()-1;
        
        if(jComboBox2.getSelectedItem().equals("Femenino"))
        {
            for (int i = a; i >= 0; i--) 
            {
                dtm1.removeRow(dtm1.getRowCount()-1);             
            }
            
            this.setLLenarTablaPersonas("SELECT ID_prs, nombre_prs FROM personas WHERE genero_prs = 'Femenino'");
        }
        else if(jComboBox2.getSelectedItem().equals("Masculino")) 
        {
            for (int i = a; i >= 0; i--) 
            {
                dtm1.removeRow(dtm1.getRowCount()-1);             
            }            
            
            this.setLLenarTablaPersonas("SELECT ID_prs, nombre_prs FROM personas WHERE genero_prs = 'Masculino'");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        int a = jTable1.getRowCount()-1;
        
        jComboBox2.setSelectedIndex(0);
        
        for (int i = a; i >= 0; i--) 
        {
            dtm1.removeRow(dtm1.getRowCount()-1);             
        }
            
        this.setLLenarTablaPersonas("SELECT ID_prs, nombre_prs FROM personas");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int a = jTable1.getRowCount()-1;
        
        jComboBox2.setSelectedIndex(0);
        
        for (int i = a; i >= 0; i--) 
        {
            dtm1.removeRow(dtm1.getRowCount()-1);             
        }
            
        this.setLLenarTablaPersonas("SELECT ID_prs, nombre_prs FROM personas");
        
        int b = jTable2.getRowCount()-1;
        
        jComboBox1.setSelectedIndex(0);
        
        for (int i = b; i >= 0; i--) 
        {
            dtm2.removeRow(dtm2.getRowCount()-1);             
        }
            
        this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas");        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int a = jTable2.getRowCount()-1;
        
        if(jComboBox1.getSelectedItem().equals("Normal"))
        {
            for (int i = a; i >= 0; i--) 
            {
                dtm2.removeRow(dtm2.getRowCount()-1);             
            }
            
                this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas WHERE estatus_mct = 'Normal'");
        }
        else if(jComboBox1.getSelectedItem().equals("Enfermo"))
        {
            for (int i = a; i >= 0; i--) 
            {
                dtm2.removeRow(dtm2.getRowCount()-1);             
            }
            
                this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas WHERE estatus_mct = 'Enfermo'");
        }
        else if(jComboBox1.getSelectedItem().equals("Fallecido"))
        {
            for (int i = a; i >= 0; i--) 
            {
                dtm2.removeRow(dtm2.getRowCount()-1);             
            }
            
                this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas WHERE estatus_mct = 'Fallecido'");
        }
        
        /*if(jTable2.getModel().getRowCount() <= 0)
            JOptionPane.showMessageDialog(null,"No hay datos","!! ERROR !!", 2); */
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        int a = jTable2.getRowCount()-1;
        
        jComboBox1.setSelectedIndex(0);
        
        for (int i = a; i >= 0; i--) 
        {
            dtm2.removeRow(dtm2.getRowCount()-1);             
        }
            
        this.setLLenarTablaMascotas("SELECT ID_mct, nombre_mct, ID_prs FROM mascotas");
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipalVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    new VentanaPrincipalVeterinaria().setVisible(true);
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private Conexion cn;
    private Consultas cl;
    private ResultSet resultado1, resultado2, resultado3, resultado4;    
    private DefaultTableModel dtm1, dtm2;
    private JTableHeader th1, th2;   
    
    String filas1 [][] = {};
    String columnas1 [] = {"Clave de personas", "Nombre"};   
    
    String filas2 [][] = {};
    String columnas2 [] = {"Clave de mascotas", "Nombre", "Propietario"};       
}
