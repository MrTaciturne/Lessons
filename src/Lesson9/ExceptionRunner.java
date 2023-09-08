package Lesson9;

import java.util.Random;

public class ExceptionRunner {

    public static void main(String[] args) {

//        1
//        String n = null;
//        try {
//            n.length();
//        } catch (NullPointerException nul) {
//            nul.printStackTrace();
//            System.out.println("кака нулевая");
//        }

//        2
//        try {
//            arrayExeption();
//        } catch (ArrayIndexOutOfBoundsException arr){
//            System.out.println("Так вот бывает");
//        } finally {
//            System.out.println("Эрейная кака");
//            System.out.println("Program is dead");
//        }
//    }
//
//    private static void arrayExeption (){
//        throw new ArrayIndexOutOfBoundsException();
//    }

//    3
//        try {
//            myExcept();
//        } catch (PupaException pup){
//            pup.printStackTrace();
//        }
//    }
//
//    private static void myExcept(){
//        throw new PupaException();
//    }

//        4
//        try {
//            throw new SecurityException();
//        } catch (SecurityException sec) {
//            throw new PupaException(sec);
//        }

//        5
        try {
            randEx();
        } catch (PupaException p) {
            System.out.println("Пупа");
        } catch (SecurityException s) {
            System.out.println("Security");
        } catch (RuntimeException r) {
            System.out.println("RunTime");
        }

//        try {
//            randEx();
//        } catch (PupaException | SecurityException | RuntimeException r){
//
//        }
    }

    public static Random random = new Random();


    private static void randEx() {
        int i = random.nextInt(3);
        switch (i) {
            case 0:
                throw new RuntimeException();
            case 1:
                throw  new PupaException();
            case 2:
                throw new SecurityException();
        }
    }
}
