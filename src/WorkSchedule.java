public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 3;   //3rd day of the week...
        boolean holiday = true;
         
        // IF - ELSE IF - ELSE HERE!
        if (holiday) {
            System.out.println("no work");
        } else if (day == 6 || day == 7) {
            System.out.println("no work");
        } else {
            System.out.println("work");
        }
        
        }

    }