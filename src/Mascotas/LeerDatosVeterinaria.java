package Mascotas;

public class LeerDatosVeterinaria 
{
    public LeerDatosVeterinaria()
    {}

    public boolean getLeerNombre(String nom)
    {
        try
        {
            return nom.matches("^([a-z]+[ ]?[a-z]+[ ]?[a-z]+)$"); 
        } 
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
    
    public boolean getLeerTelefono(String telefono)
    {
        try
        {
            return telefono.matches("^([0-9]{10})$"); 
        } 
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
    
}
