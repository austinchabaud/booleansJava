public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:        
        switch (day) {
            case "Monday": System.out.println("No"); break;
            case "Tuesday": System.out.println("no"); break;
            case "Wednesday": System.out.println("no "); break;
            case "Thursday": System.out.println("no"); break;
            case "Friday": System.out.println("sure"); break;
            case "Saturday": System.out.println("no"); break;
            case "Sunday": System.out.println("no"); break;
            default: System.out.println("what is that?"); break;

        }

    }
}