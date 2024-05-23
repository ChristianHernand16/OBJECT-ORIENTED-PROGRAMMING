package ClasesBase;

public class Usuario {

    protected int id;
    protected String nombre;
    protected String clave;
    protected String departamento;
    protected int tipo;
    protected String fechacreacion;

    public Usuario(int id, String nombre, String clave, String departamento,
                   int tipo, String fechacreacion) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.departamento = departamento;
        this.tipo = tipo;
        this.fechacreacion = fechacreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }


}
