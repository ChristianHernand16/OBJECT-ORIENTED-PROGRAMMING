package ClasesBase;

public class SeleccionFutbol
{

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad)
    {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    

    public void Concentrarse()
    {
        System.out.println("Concentrase");

    }

    public void Viajar()
    {
        System.out.println("Viajar");
    }

    public String getNombres()
    {
       return (this.Nombre + " " + this.Apellidos);
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + '}';
    }
    
    
}