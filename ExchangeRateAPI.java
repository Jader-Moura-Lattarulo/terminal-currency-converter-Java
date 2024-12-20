import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ExchangeRateAPI {
    String apiKey = "a3c0e66f7491f67994afb96c";

    String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

    URL url;

    {
        try {
            url = new URL(url_str);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    HttpURLConnection request;

    {
        try {
            request = (HttpURLConnection) url.openConnection();
            request.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    JsonParser jp = new JsonParser();
    JsonElement root;

    {
        try {
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    JsonObject jsonobj = root.getAsJsonObject();

    String req_result = jsonobj.get("result").getAsString();

    public void fetchExchangeRate() {
    }
}
