package Lesson8;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(15, 15, 24, 10, 3, 15, 2, 4, 18));
        List<Integer> nullNumbers = new ArrayList<>();
        List<Integer> numbersOdd = doOdd(numbers);
        System.out.println(numbersOdd);
        System.out.println(countUnique(numbers));
        System.out.println(countUnique(nullNumbers));
    }

    private static   List<Integer> doOdd(List<Integer> workList){

        List<Integer> result = new ArrayList<>();
        for (Integer integer : workList) {
            if (integer % 2 == 0){
                result.add(integer);
            }
        }

        return result;
    }

    private static int countUnique(List<Integer> workList){
        HashSet<Integer> setResult = new HashSet<>(workList);
        return setResult.size();
    }

//    private static boolean isUnique (Map<String,String>){
//        return false;
//    }
}
