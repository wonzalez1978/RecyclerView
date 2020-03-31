package cl.desafiolatam.recyclerview;

public class Restaurante {
    private String nombre;
    private String urlPhotp;
    private float valoracion;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlPhotp() {
        return urlPhotp;
    }

    public void setUrlPhotp(String urlPhotp) {
        this.urlPhotp = urlPhotp;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Restaurante(String nombre, String urlPhotp, float valoracion, String direccion) {
        this.nombre = nombre;
        this.urlPhotp = urlPhotp;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }
}
