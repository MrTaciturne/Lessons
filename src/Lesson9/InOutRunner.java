package Lesson9;

import java.io.*;

public class InOutRunner {

    private static final String VAULS = "уеыаоэяиюУЕЫАОЭЯИЮ";

    public static void main(String[] args) throws IOException {

        File lukomorie = new File("resorce/test.txt");
        try (BufferedReader buf = new BufferedReader(new FileReader(lukomorie))) {
            String s;
            while ((s = buf.readLine()) != null){
                final String[] s1 = s.split(" ");
                for (int i = 0; i < s1.length; i++) {
                    if (VAULS.indexOf(s1[i].charAt(0)) != -1) {
                        System.out.print(s1[i] + " ");
                    }
                }
            }
        }
    }
}
