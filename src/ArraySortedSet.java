import java.util.Arrays;
import java.util.Scanner;

public class ArraySortedSet {
    private Integer[] array;

    private Integer[] arraySort;

    public static void main(String[] args) {
        int element;
        ArraySortedSet arraySorted = new ArraySortedSet(new Integer[]{98, 32, null, 13, -25, 145, 13, 2, 189, null});
        arraySorted.orderUniqueArray();
        System.out.println(Arrays.toString(arraySorted.getArray()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to add");
        element = scanner.nextInt();
        arraySorted.add(element);
        System.out.println(Arrays.toString(arraySorted.getArray()));
        System.out.println("Enter the index of element you want to see");
        element = scanner.nextInt();
        System.out.println("Element is  " + arraySorted.get(element));
        System.out.println("Enter the index of element you want to remove");
        element = scanner.nextInt();
        arraySorted.remove(element);
        System.out.println(Arrays.toString(arraySorted.getArray()));
    }

    public ArraySortedSet(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    // Sorts the array, eliminate duplicates and nulls
    public void orderUniqueArray() {
        if (array != null) {
            int position;
            for (int i = 0; i < array.length; i++) {
                Integer minim = array[i];
                position = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null && array[i] != null) {
                        if (array[j] <= minim) {
                            minim = array[j];
                            position = j;
                        }
                    }
                }
                if (i == 0 || array[position] != array[i]) {
                    array[position] = array[i];
                    array[i] = minim;
                } else if (array[position] == array[i]) {
                    array[position] = null;
                    array[i] = minim;
                }
            }
            position = 0;
            for (Integer item : array) {
                if (item == null) {
                    position++;
                }
            }
            arraySort = new Integer[array.length - position];
            position = 0;
            for (Integer item : array) {
                if (item != null) {
                    arraySort[position] = item;
                    position++;
                }
            }
            array = new Integer[arraySort.length];
            array = arraySort;
        }
    }
    // Adds an element into an ordered, unique array

    public void add(int element) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > element) {
                    arraySort = new Integer[array.length + 1];
                    for (int j = 0; j < array.length + 1; j++) {
                        if (j < i) {
                            arraySort[j] = array[j];
                        } else if (j == i) {
                            arraySort[j] = element;
                        } else if (j > i) {
                            arraySort[j] = array[j - 1];
                        }
                    }
                    array = new Integer[arraySort.length];
                    array = arraySort;
                    return;
                } else if (array[i] == element) {
                    return;
                }
            }
            if (array[array.length - 1] < element) {
                arraySort = new Integer[array.length + 1];
                for (int i = 0; i < array.length; i++) {
                    arraySort[i] = array[i];
                }
                arraySort[array.length] = element;
                array = new Integer[arraySort.length];
                array = arraySort;
            }
        }
    }

    public Integer get(int element) {
        if (element > 0 && element < array.length) {
            return array[element];
        }
        return null;
    }

    // Removes an element from array at given index
    public void remove(int element) {
        if (array != null && element < array.length && element >= 0) {
            arraySort = new Integer[array.length - 1];
            for (int i = 0; i < element; i++) {
                arraySort[i] = array[i];
            }
            for (int i = element; i < arraySort.length; i++) {
                arraySort[i] = array[i + 1];
            }
            array = new Integer[arraySort.length];
            array = arraySort;
        }
    }

}




