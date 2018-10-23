package genmethod;

public class GenMethod {

    public static < E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {6, 15, 24, 33, 42};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        System.out.println("Printing Integer Array");
        printArray(intArray);
        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}
