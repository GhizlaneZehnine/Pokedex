package com.example.pokedex;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class HTTPRequest {
    private CloseableHttpClient httpClient;
    private HttpGet request;

    public HTTPRequest() {
        this.httpClient = HttpClientBuilder.create().build();
    }

    /**
     * Equivalent de la méthode GET du protocol HTTP
     * @param uri L'url de la requête GET
     * @return résultat sous format json
     */
    public String get(String uri){
        String jsonResponse = "";
        HttpGet request = new HttpGet(uri);
        request.addHeader("content-type", "application/json");
        HttpResponse result = null;
        try {
            result = httpClient.execute(request);
            jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }
}
