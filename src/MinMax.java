import java.rmi.dgc.VMID;

public class MinMax {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 4;

        int max;
        int min;
        int medium;

        if (x > y) {
            max = x;
            medium = y;
        } else {
            max = y;
            medium = x;
        }

        if (z > max && z > medium) {
            min = medium;
            medium = max;
            max = z;
        } else {
            if (z > max) {
                min = max;
                max = medium;
                medium = z;
            } else if (z > medium) {
                min = medium;
                medium = z;
            } else {
                min = z;
            }
        }

        System.out.println("min = " + min + "    medium = " + medium + "   max = " + max);
    }
}
