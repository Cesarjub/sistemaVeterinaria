package Mascotas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Consultas 
{
    private Conexion cn;    
    private PreparedStatement ps;  
    private ResultSet resultado;
    private Statement sentencia;
    
    public Consultas() throws SQLException
    {
        cn = new Conexion();
        sentencia = cn.getConectar().createStatement();
    }
    
    public int getGenerarIdPersona()
    {
        int id = 0;
        
        try 
        {
            ps = cn.getConectar().prepareStatement("SELECT MAX(ID_prs) FROM personas");
            resultado = ps.executeQuery();
            
            while(resultado.next())
            {
                id = resultado.getInt(1) + 1;
            }
            
            ps.close();
            resultado.close();
            cn.getDesconectar();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    
        return id;
    }
    
    public boolean getLlenarPersonas(int cl, String nom, String gn, String dr, String tel) throws SQLException
    {
        try
        {
            ps = cn.getConectar().prepareStatement("INSERT INTO personas (ID_prs, nombre_prs, genero_prs, domicilio_prs, telefono_prs)"
                + "VALUES (?,?,?,?,?)");
            
            ps.setInt(1, cl);
            ps.setString(2, nom);
            ps.setString(3, gn);
            ps.setString(4, dr);
            ps.setString(5, tel);

            ps.executeUpdate();
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public int getGenerarIdMascota()
    {
        int id = 0;
        
        try 
        {
            ps = cn.getConectar().prepareStatement("SELECT MAX(ID_mct) FROM mascotas");
            resultado = ps.executeQuery();
            
            while(resultado.next())
            {
                id = resultado.getInt(1) + 5;
            }
            
            ps.close();
            resultado.close();
            cn.getDesconectar();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
    
        return id;
    }    
    
    public boolean getLlenarMascotas(int idPer, int cl, String nom, int ed, String gn, String esp, String est)
    {
        try
        {
            ps = cn.getConectar().prepareStatement("INSERT INTO mascotas (ID_mct, nombre_mct, edad_mct, genero_mct, especie_mct,"
                    + "estatus_mct, ID_prs) VALUES (?,?,?,?,?,?,?)");
            
            ps.setInt(1, cl);
            ps.setString(2, nom);
            ps.setInt(3, ed);
            ps.setString(4, gn);
            ps.setString(5, esp);
            ps.setString(6, est);
            ps.setInt(7, idPer);

            ps.executeUpdate();
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }        
    }

   public ArrayList <String> getLlenarComboIdPersona() throws SQLException
   {
       ArrayList <String> lista = new ArrayList <String>();
      
       String consulta = "SELECT * FROM personas";
       
       resultado = sentencia.executeQuery(consulta);
       
       while(resultado.next())
       {
           lista.add(resultado.getString("ID_prs"));
       }
       
       return lista;
   }
   
   public String getNombrePersona(int id) throws SQLException
   {
       String nom = "";
       
       String consulta = "SELECT * FROM personas WHERE ID_prs = '" + id + "'";
       
        resultado = sentencia.executeQuery(consulta);
        
        resultado.next();
        
        nom = String.valueOf(resultado.getString("nombre_prs"));
        
        return nom;
   }
   
   public ResultSet getLlenarTablas(String consulta)
   {
        try 
        {                   
            resultado = sentencia.executeQuery(consulta);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
        }
        
        return resultado;
   }   
   
   public String getConsultas(String consulta, String campo)
   {
        String cl = "";   
        
        try 
        {
            resultado = sentencia.executeQuery(consulta);
            
            resultado.next();
            
            cl = String.valueOf(resultado.getString(campo));          
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cl;
   }
   
   public ArrayList <String> getLlenarComboMascotas(int id) throws SQLException
   {
       ArrayList <String> lista = new ArrayList <String>();
      
       String consulta = "SELECT * FROM mascotas where ID_prs = " + id;
       
       resultado = sentencia.executeQuery(consulta);
       
       while(resultado.next())
       {
           lista.add(resultado.getString("nombre_mct"));
       }
       
       return lista;
   }   

    public boolean getModificarPersonas(int cl, String tel, String dir) throws SQLException
    {
        try
        {
            String consulta = "UPDATE personas SET domicilio_prs = '" + dir + "', telefono_prs = '" + tel + "' WHERE ID_prs = " + cl;
            
            sentencia.executeUpdate(consulta);
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }   

    public boolean getModificarMascotas(int cl, int ed, String est) throws SQLException
    {
        try
        {
            String consulta = "UPDATE mascotas SET edad_mct = '" + ed + "', estatus_mct = '" + est + "' WHERE ID_mct = " + cl;
            
            sentencia.executeUpdate(consulta);
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    } 
    
    public boolean getEliminarMascotas(int cl)
    {
        try
        {
            String consulta = "DELETE FROM mascotas WHERE ID_mct = " + cl;
            
            sentencia.executeUpdate(consulta);
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }        
    }
    
    public boolean getEliminarPersonas(int cl)
    {
        try
        {
            String consulta1 = "DELETE FROM mascotas WHERE ID_prs = " + cl;
            String consulta2 = "DELETE FROM personas WHERE ID_prs = " + cl;
            
            sentencia.executeUpdate(consulta1);
            sentencia.executeUpdate(consulta2);            
            cn.getDesconectar();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }        
    }    
    
}
