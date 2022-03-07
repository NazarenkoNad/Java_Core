package homework7;

import java.io.IOException;

public class Lesson7 {

    public static void main(String[] args) throws IOException {
        RequestHandler requestHandler = new RequestHandler();
        float weather;
        float weather1;

        //System.out.println(RequestHandler.getCityID());
        //System.out.println(RequestHandler.getForecastForDay(RequestHandler.getCityID()));
        weather1 = Float.parseFloat(RequestHandler.getForecastForDay(RequestHandler.getCityID()));
        weather =  (weather1 - 32)/1.8f;
        System.out.println ("Температура в Москве сегодня составляет " + weather + " градусов С");
    }

}
