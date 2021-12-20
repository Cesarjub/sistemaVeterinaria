package Mascotas;

public class GetSetPersonas 
{
    private int clave;
    private String nombre, genero, direccion, telefono;
    
    public GetSetPersonas()
    {
        clave = 0;
        nombre = "";
        genero = "";
        direccion = "";
        telefono = "";
    }

    public void setClave(int clave) 
    {
        this.clave = clave;
    }

    public int getClave() 
    {
        return clave;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getTelefono() 
    {
        return telefono;
    }    
}
