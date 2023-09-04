package Lesson7;

public final class PairUtil {

    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        Pair<K, V> pair1 = pair;
        Object container = pair1.getFirstElement();
        pair1.setFirstElement((K) pair1.getSecondElement());
        pair1.setSecondElement((V) container);
        return (Pair) pair1;
    }

}
