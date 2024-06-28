public class Conversor {

    public Conversor() {
    }

    public String selector(String busqueda){

        switch (busqueda) {
            case "1":
                busqueda = "NIO";
                break;
            case "2":
                busqueda = "USD";
                break;
            case "3":
                busqueda = "CAD";
                break;
            case "4":
                busqueda = "BOB";
                break;
            default:
                System.out.println("Introduzca una opción válida. ");
                break;
        }
        return busqueda;
    }
}
