import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostradorDeMenu {
//    public String objetivo = "";
    public String mensaje = "Seleccione un número para elejir su moneda";
    public List monedas = new ArrayList<>();
    public String usDolar = "\n2- Dolar EstadoUnidense: USD";
    public String cordoba = "\n1- Cordoba de Nicaragua: NIO";
    public String caDolar = "\n3- Dolar Canadiense: CAD";
    public String boliviano = "\n4- Boliviano de Bolivia: BOB";
    public String opcion = "";
    public boolean continuador = true;
    public String busqueda = "";

    Scanner scann = new Scanner(System.in);

    public String MostrarMenu() {
        monedas.add(cordoba);
        monedas.add(usDolar);
        monedas.add(caDolar);
        monedas.add(boliviano);

        System.out.println("Ingrese su moneda base: ");
        System.out.println(mensaje + " " +  monedas);

        busqueda = scann.next();

        monedas.remove(cordoba);
        monedas.remove(usDolar);
        monedas.remove(caDolar);
        monedas.remove(boliviano);

        return busqueda;
    }

    public String MostrarNextMenu(String seleccionAnterior) {
        System.out.println("Ingrese su moneda objetivo: ");

        switch (seleccionAnterior) {
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
                monedas.add(cordoba);
                monedas.add(usDolar);
                monedas.add(boliviano);
                break;
            case "4":
                monedas.add(cordoba);
                monedas.add(usDolar);
                monedas.add(caDolar);
                break;
        }

        System.out.println(mensaje + " " +  monedas);
        busqueda = scann.next();

        if (busqueda.equals(seleccionAnterior)) {
            System.out.println("Lo siento, ya elejiste esa opción. " +
                    "\nIntentalo nuevamente");
            monedas.remove(cordoba);
            monedas.remove(usDolar);
            monedas.remove(caDolar);
            monedas.remove(boliviano);
            MostrarNextMenu(seleccionAnterior);
        }

        monedas.remove(cordoba);
        monedas.remove(usDolar);
        monedas.remove(caDolar);
        monedas.remove(boliviano);

        return busqueda;
    }

    public void MostrarOpciones() {
        System.out.println("Seleccione que desea hacer: ");
        System.out.println("""
                    1- Hacer una conversión de monedas
                    2- Historial de conversiones (Comming soon)
                    0- Salir""");
    }

    public boolean Cotinuar() {

        MostrarOpciones();
        opcion = scann.next();
        switch (opcion) {
            case "1":
                continuador = true;
                break;

            case "0":
                continuador = false;
                break;
            default:
                System.out.println("opcion no válida");
                Cotinuar();
                break;
        }
        return continuador;
    }

    public void OpcionArchivo() {

    }

    public void mostrarSeleccion(String busqueda){
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
