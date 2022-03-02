package FindMaximum;

public class FindMaximum<E extends Comparable<E>> {
    E[] array;
    public FindMaximum(E[] array){
        this.array = array;
        findMax(array);
    }

    public static void main(String[] args) {
        Integer[] intArray = {6,2,3};
        Double[] doubleArray = {6.5,2.8,3.2};
        String[] stringArray = {"Apple","Peach","Banana"};
        new FindMaximum(intArray);
        new FindMaximum(doubleArray);
        new FindMaximum(stringArray);

    }

    public static <E extends Comparable<E>> E findMax(E[] array){
        E max;
        max = array[0];
        for (E e : array) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        printMax(max);
        return max;
    }

    public static <E> void printMax(E max){
        System.out.println("Maximum is " + max);
    }

}

