package Lesson7;

public class General {

    public static void main(String[] args) {

        List list = new List(10);
        list.add(15);
        list.add("pupa");
        list.add("lupa");

        Object o = list.get(2);

        Single<String> single1 = new Single<>("Dise");
        Single<String> single2 = new Single<>("Rise");
        Single<Single> single3 = new Single<>(single2);
        Single<Integer> single4 = new Single<>(22);
        Single<String> single5 = new Single<>(single1.getElement());
        System.out.println(single5.getElement());

        Pair<String, Integer> pair = new Pair<>("Dog", 2);
        PairUtil.swap(pair);
        System.out.println(pair.getFirstElement() + " " + pair.getSecondElement());
    }
}
