package Mascotas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
    Connection con;
    
    public Conexion()
    {}
    
    public Connection getConectar()
    {
        con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mascotas", "root", "");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            //System.out.println(e);
            con = null;
        }       
        
        return con;
    }
    
    public Connection getDesconectar()
    {
       con = null;
       return null;
    }
    
}
