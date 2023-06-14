package eventosinsulares;
import java.util.Scanner;
/**
 * Clase Main/Principal
 * Aquí pobramos los métodos del promotor
 */
public class EventosInsulares {
  
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        Promotor promotor=new Promotor("45789854E",928415698,"Las Arenas","ES65-4875-4598-6254");

        System.out.println("Rellena los siguientes campos para crear tu evento");

        System.out.println("Nombre:");
        String nombre=sc.nextLine();

        System.out.println("Fecha:");
        String fecha=sc.nextLine();

        System.out.println("Lugar:");
        String lugar=sc.nextLine();

        System.out.println("Aforo maximo");
        int aforo=sc.nextInt();

        System.out.println("Estado (confimado, postpuesto, cancelado):");
        String estado=sc.next();

        promotor.crearEvento(nombre,fecha,lugar,aforo,estado);

        System.out.println(promotor.mostrarEventos());
    }
    
}
