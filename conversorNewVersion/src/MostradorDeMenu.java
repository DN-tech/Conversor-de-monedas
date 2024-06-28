import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostradorDeMenu {
    public String mensaje = "Seleccione un número para elejir su moneda";
    public List monedas = new ArrayList<>();
    public String usDolar = "\n2- Dolar EstadoUnidense: USD";
    public String cordoba = "\n1- Cordoba de Nicaragua: NIO";
    public String caDolar = "\n3- Dolar Canadiense: CAD";
    public String boliviano = "\n4- Boliviano de Bolivia: BOB";

    Scanner scann = new Scanner(System.in);

    public void MostrarMenu() {
        monedas.add(cordoba);
        monedas.add(usDolar);
        monedas.add(caDolar);
        monedas.add(boliviano);
        String busqueda = "";

        System.out.println("Ingrese su moneda base: ");
        System.out.println(mensaje + " " +  monedas);

        monedas.remove(cordoba);
        monedas.remove(usDolar);
        monedas.remove(caDolar);
        monedas.remove(boliviano);
    }

    public void MostrarNextMenu(String busqueda) {
        switch (busqueda) {
            case "1":
                monedas.add(usDolar);
                monedas.add(caDolar);
                monedas.add(boliviano);
                break;
            case "2":
                monedas.add(cordoba);
                monedas.add(caDolar);
                monedas.add(boliviano);
                break;
            case "3":
                monedas.remove(cordoba);
                monedas.remove(usDolar);
                monedas.remove(boliviano);
                break;
            case "4":
                monedas.remove(cordoba);
                monedas.remove(usDolar);
                monedas.remove(caDolar);
                break;
        }

        System.out.println("Ingrese su moneda objetivo: ");
        System.out.println(mensaje + " " +  monedas);

        monedas.remove(cordoba);
        monedas.remove(usDolar);
        monedas.remove(caDolar);
        monedas.remove(boliviano);
    }

    public boolean Cotinuar() {
        boolean continuador = true;
        String guardaOpcion = "";
        System.out.println("Seleccione que desea hacer: ");
        System.out.println("""
                    1- Hacer una conversión de monedas
                    0- Salir """);
        var opcion = scann.nextLine();
        guardaOpcion = opcion;

        System.out.println(" esta es opcion " + opcion);

        switch (opcion) {
            case "1":
                System.out.println(" esta es opcion " + opcion);
                continuador = true;
                break;
            case "0":
                System.out.println(" esta es opcion " + opcion);
                continuador = false;
                break;

        }
        return continuador;
    }

    public void mostrarSeleccion(String busqueda){
        System.out.println("entras a mostrar seleccion en Mostrador de menu");
        switch (busqueda){
            case "1":
                System.out.println("Su selección es: " + cordoba);
                break;
            case "2":
                System.out.println("Su selección es: " + usDolar);
                break;
            case "3":
                System.out.println("Su selección es: " + caDolar);
                break;
            case "4":
                System.out.println("Su selección es: " + boliviano);
                break;
            default:
                System.out.println("Su selección no es valida " + busqueda);
                break;
        }
    }
}
