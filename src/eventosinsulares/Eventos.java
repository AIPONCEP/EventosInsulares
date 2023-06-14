package eventosinsulares;
/**
 * Clase Eventos
 * @autor Ana Isabel Ponce Pérez
 */
public class Eventos {
    private String nombre;
    private String fecha;
    private String lugar;
    private int aforo;
    private String estado;
    /**
     * Constructor clase Eventos
     * @param nombre
     * @param fecha
     * @param lugar
     * @param aforo
     * @param estado
     */
    public Eventos(String nombre, String fecha, String lugar, int aforo, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.aforo = aforo;
        this.estado = estado;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public String getLugar() {
        return lugar;
    }
    public int getAforo() {
        return aforo;
    }
    public String getEstado() {
        return estado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return    "Evento: "+
                "\nNombre: "+nombre+
                "\nFecha: "+fecha+
                "\nLugar: "+lugar+
                "\nAforo: "+aforo+
                "\nEstado: "+estado;
    }
}
