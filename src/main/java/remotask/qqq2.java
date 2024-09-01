package remotask;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class qqq2 {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        // create a request
        HttpRequest request = HttpRequest.newBuilder(
                //http://localhost:8080/api/cryptos
                        //URI.create("https://crypto-wallet-backend-ubzr.onrender.com/api/projects"))
                        URI.create("http://localhost:8080/api/wallets?email=chao22@gmail.com"))
                .GET()

                .header("accept", "application/json")
                .header("token", "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoiIiwibmFtZSI6IjEyMzQ1IiwiaXNBZG1pbiI6ZmFsc2UsImVtYWlsIjoiY2hhbzIyQGdtYWlsLmNvbSJ9.ffOr_nUfeuVE43LMnird2d2c9zSPOT83QtJDOkIvKKBY6Cxq86TE2_S1qXZTLDch4eJ8KGBFnCcZxJwSCd4kEQ")
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String s = response.body().toString();
            ObjectMapper objectMapper = new ObjectMapper();

            List<Wallets> wallets = objectMapper.readValue(s, new TypeReference<List<Wallets>>(){});
            for (Wallets wallet: wallets) {
                System.out.println(wallet);
            }
        } catch(Exception e) {
            System.out.println(e);
        }

    }




}
