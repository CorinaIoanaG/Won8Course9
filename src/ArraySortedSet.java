import java.util.Arrays;

public class ArraySortedSet {
    static Integer[] array = {98, 32, null, 13, -25, 145, 13, 2};
    static Integer[] arraySort;

    public static void main(String[] args) {
        orderUniqueArray();
        System.out.println(Arrays.toString(arraySort));
       }

    private static void orderUniqueArray() {
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
            for (Integer item:array){
                if (item == null){
                    position++;
                }
            }
            arraySort = new Integer[array.length - position];
            position = 0;
            for (Integer item:array){
                if(item != null){
                    arraySort[position] = item;
                    position++;
                }
            }
        }

    }

}




