import java.util.Random;

public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 200;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if (margin >= 300) {
            System.out.println("Gryffindor wins the championship");
        } else if (margin >= 0) {
             System.out.println("Gryffindor comes in second");
        } else if (margin >= -100) {
             System.out.println("Gryffindor comes in third");
        } else {
            System.out.println("Gryffindor comes in fourth");
        }
    }
}