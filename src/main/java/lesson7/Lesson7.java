package lesson7;

import java.io.IOException;

public class Lesson7 {

    public static void main(String[] args) throws IOException {
        RequestHandler requestHandler = new RequestHandler();

       System.out.println(RequestHandler.getCityID());
        System.out.println(RequestHandler.getForecastForDay(RequestHandler.getCityID()));

    }

}
