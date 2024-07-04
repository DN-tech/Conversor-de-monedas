import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestMoneda {
    public MonedaRecord request (String base, String objetivo) throws IOException, InterruptedException {

        String api ="221e6dda2edbe5b6b5b3c76c";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"
                + api + "/pair/" + base + "/" + objetivo);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json, MonedaRecord.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
