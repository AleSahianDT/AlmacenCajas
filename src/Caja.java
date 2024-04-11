public class Caja {
    private String nombre;
    private String empresa;
    private String codigo;

    public Caja(String nombre, String empresa, String codigo) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Nombre=" + nombre+
                "\n Empresa=" + empresa +
                "\n Numero=" + codigo;
    }
}
