import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double valor;
        RequestMoneda requestMoneda = new RequestMoneda();
        Conversor conversor = new Conversor();
        MostradorDeMenu mostrador = new MostradorDeMenu();
        String busqueda = "";
        String seleccionAnteior;

        String base;
        String objetivo;
        try {
            boolean continuador = true;
            System.out.println("Bienvenido :D");
            while (continuador) {
                continuador = mostrador.Cotinuar();

                base = "";
                objetivo = "";
                if (!continuador) {
                    break;
                }

                busqueda = mostrador.MostrarMenu();
                seleccionAnteior = busqueda;

                base = conversor.selector(busqueda);
                mostrador.mostrarSeleccion(busqueda);

                System.out.println("Ingrese la cantidad de su moneda base " +
                        "que desea convertir");
                valor = scann.nextDouble();

                Moneda moneda = new Moneda(base, valor);

                busqueda = mostrador.MostrarNextMenu(seleccionAnteior);
                objetivo = conversor.selector(busqueda);
                mostrador.mostrarSeleccion(busqueda);

                MonedaRecord monedaRecord = requestMoneda.request(base,objetivo);
                Moneda otraMoneda = new Moneda(monedaRecord.target_code(),
                        monedaRecord.conversion_rate());
                Conversion conversion = new Conversion();
                Moneda monedaConvertida = conversion.conversion(moneda, otraMoneda);

                System.out.println("Moneda base: " + moneda.getPais() + "código "
                        + moneda.getNombre() + " valor: " + moneda.getConversionRates()
                        + "\n****************************************************************"
                        + "\n" + "Moneda objetivo: " + otraMoneda.getPais()
                        + " código " + otraMoneda.getNombre() + " valor "
                        + otraMoneda.getConversionRates()
                        + "\n****************************************************************"
                        + "\n" + monedaConvertida.getNombre() + "\nSu conversion es: "
                        + monedaConvertida.getConversionRates() + " " + otraMoneda.getPais()
                        + "\n****************************************************************"
                        + "\n****************************************************************");
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Gracias por usar el servicio. Vuelva pronto... :D");
    }
}
