package Mascotas;

public class GetSetMascotas 
{
    private int clave, edad, clavePrs;
    private String nombre, genero, especie, estatus;
    
    GetSetMascotas()
    {
        clave = 0;
        edad = 0;
        nombre = "";
        genero = "";
        especie = "";
        estatus = "";
        clavePrs = 0;
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
    
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEspecie(String especie) 
    {
        this.especie = especie;
    }    

    public String getEspecie() 
    {
        return especie;
    }
    
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setEstatus(String estatus) 
    {
        this.estatus = estatus;
    }

    public String getEstatus() 
    {
        return estatus;
    }

    public void setClavePrs(int clavePrs) 
    {
        this.clavePrs = clavePrs;
    }

    public int getClavePrs() 
    {
        return clavePrs;
    }
    
}
