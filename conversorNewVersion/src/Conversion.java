public class Conversion {
    public Moneda conversion(Moneda moneda, Moneda otraMoneda) {
        Moneda monedaConvertida = new Moneda();
        monedaConvertida.setNombre("Conversión: ");
        monedaConvertida.setConversionRates(moneda.getConversionRates()*
                otraMoneda.getConversionRates());

        return monedaConvertida;
    }
}
