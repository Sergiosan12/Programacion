import java.io.*;
import java.net.*;
import java.util.*;
import org.json.*;

public class CryptoAPI {
    // ...

    public Map<String, Double> fetchPrices() {
        String apiUrl = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";
        Map<String, Double> prices = new HashMap<>();

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Print the raw JSON data
            System.out.println("API Response: " + content.toString());

            JSONArray jsonArray = new JSONArray(content.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String coinName = jsonObject.getString("id");
                double coinPrice = jsonObject.getDouble("current_price");
                prices.put(coinName, coinPrice);
            }

            in.close();
            con.disconnect();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return prices;
    }
    public double exchange(String fromCoin, String toCoin, double amount) {
        Map<String, Double> prices = fetchPrices();

        Double fromPrice = prices.get(fromCoin);
        Double toPrice = prices.get(toCoin);

        if (fromPrice == null || toPrice == null) {
            throw new IllegalArgumentException("One or both of the cryptocurrencies are not supported.");
        }

        return (amount * fromPrice) / toPrice;
    }
}