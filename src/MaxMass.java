public class MaxMass {

    public static void main(String[] args) {

        int[] mass = {2, 5, 1, 10, 8, 4};
        int max = 0, maxi = 0, mini = 0;
        int min = mass [0];

        for (int i=0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                maxi = i;
            }
            if (mass[i] < min) {
                min = mass[i];
                mini = i;
            }
        }
        System.out.println("Max number under index " + maxi + " (" + max + ")");
        System.out.println("Min number under index " + mini + " (" + min + ")");
    }
}
