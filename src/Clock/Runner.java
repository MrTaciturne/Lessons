package Clock;

import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {

        Clock whatch = new Clock(1, 4, 6);
        System.out.println(whatch.seconds());
        System.out.println(whatch.time());
    }

}
