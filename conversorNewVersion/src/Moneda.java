public class Moneda {
    String pais;
    String codigo;
    Double valor;

    public Moneda(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;

        if (this.codigo.equalsIgnoreCase("NIO")) {
            this.pais = "Córdoba(s) Nicaragüense(s)";
        } else if (this.codigo.equalsIgnoreCase("USD")) {
            this.pais = "Dolar(es) EstadoUnidense(s)";
        } else if (this.codigo.equalsIgnoreCase("CAD")) {
            this.pais = "Dolar(es) Canadiense(s)";
        } else if (this.codigo.equalsIgnoreCase("BOB")) {
            this.pais = "Boliviano(s) de Bolivia";
        } else {
            this.pais = "Pais no encontrado. ";
        }
    }

    public Moneda() {
    }

    public String getPais() {
        return pais;
    }

    public String getNombre() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.codigo = nombre;
    }

    public Double getConversionRates() {
        return valor;
    }

    public void setConversionRates(Double divisa) {
        this.valor = divisa;
    }

    @Override
    public String toString() {
        return "Moneda {" +
                " pais = '" + pais + '\'' +
                ", divisa = " + valor +'\'' +
                ", nombre = " + codigo +
                '}';
    }
}
