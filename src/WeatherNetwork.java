public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp <= 32) {
            forecast = "The forecast is freezing! Stay home!";
        } else if (temp <= 45) {
            forecast = "The forecast is chilly. Wear a coat!";
        } else {
            forecast = "It's warm. go outside!";  
        }
        
        System.out.println(forecast);
    }
}