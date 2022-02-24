package lesson7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class RequestHandler {

    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();

    public static String getCityID() throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "WoILLDsnY9bP75aJAVrBPnAtKynSDL1e")
                .addQueryParameter("q", "Moscow")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String jsonOfCities = response.body().string();
        String cityID = objectMapper.readTree(jsonOfCities).get(0).at("/Key").asText();
        return cityID;

    }

    public static String getForecastForDay(String cityID) throws IOException {
        HttpUrl httpUrl1 = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment(cityID)
                .addQueryParameter("apikey", "WoILLDsnY9bP75aJAVrBPnAtKynSDL1e")
                .build();

        Request reguest1 = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl1)
                .build();

        Response response1 = okHttpClient.newCall(reguest1).execute();
        String jsonOfForecast = response1.body().string();
        System.out.println(jsonOfForecast);
     //   String ForecastForDay;
        String ForecastForDay = objectMapper.readTree(jsonOfForecast).get(0)at("Headline").asText();
      //  System.out.println(ForecastForDay);
      //  String ForecastForDay = objectMapper.readTree(jsonOfForecast).get("Temperature").asText();
     //   String cityID = objectMapper.readTree(jsonOfCities).get(0).at("/Key").asText();



        return ForecastForDay;

    }

}