import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class CreadorDeArchivo {
    Gson gson = new Gson();

    public CreadorDeArchivo(MonedaRecord monedaRecord) throws IOException {
        FileWriter escribir = new FileWriter("Historial.json");
        escribir.write(gson.toJson(monedaRecord));
//        escribir.toString();
        try {
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MonedaRecord CreadorDeArchivo(MonedaRecord monedaRecord) throws IOException {
        FileWriter escribir = new FileWriter("Historial.json");
        escribir.write(gson.toJson(monedaRecord));
//        escribir.toString();
        escribir.close();
        return new Gson().fromJson(String.valueOf(monedaRecord), MonedaRecord.class);
    }

    public void addHistorial() {

    }
}
