package eventosinsulares;

import java.util.ArrayList;
/**
 * Clase Promotor
 * @autor Ana Isabel Ponce Pérez
 */
public class Promotor {
    private String dni;
    private int telefono;
    private String direccion;
    private String cuentaBancaria;
    private ArrayList<Eventos> eventos;
    /**
     * Constructor promotor
     * @param dni
     * @param telefono
     * @param direccion
     * @param cuentaBancaria
     */
    public Promotor(String dni, int telefono, String direccion, String cuentaBancaria) {
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.eventos=new ArrayList<Eventos>();
    }
    public String getDni() {
        return dni;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
    public ArrayList<Eventos> getEventos() {
        return eventos;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    /**
     * Metodo crearEvento le pasamos los param que se muestran a continuacion para
     * crear un nuevo evento y se añade al arrayList de eventos del promotor
     * @param nombre
     * @param fecha
     * @param lugar
     * @param aforo
     * @param estado
     */
    public void crearEvento(String nombre, String fecha, String lugar, int aforo, String estado) {
        Eventos event=new Eventos(nombre,fecha,lugar,aforo,estado);
        if(!this.eventos.contains(event)){
            this.eventos.add(event);
        }
    }
    /**
     * Método mostrarEventos muestra los eventos añadidos por el Promotor
     * @return
     */
    public String mostrarEventos() {
        String event="";
        for (int i = 0; i < eventos.size() ; i++) {
            event+=eventos.get(i).toString();
        }
        return event;
    }
    @Override
    public String toString() {
        return "Promotor:" +
                "dni:" + dni +
                "telefono:" + telefono +
                "direccion:" + direccion + '\'' +
                "cuentaBancaria:" + cuentaBancaria + '\'' +
                "eventos:"+ eventos;
    }
}
