import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] array = createArray(10, 10, 1);
        printArray(array);
        printArray(reverseArray(array));
        int[] array1 = new int[] {1, 2, 4, 5, 5, 6};
        int[] array2 = new int[] {6, 5, 4, 3, -4 };
        System.out.println(findMax(array));
        System.out.println(findMin(array));
        System.out.println(getAvverage(array));
        System.out.println(getGeometricMean(array));
        System.out.println(isIncreasingSequance(array));
        System.out.println(isIncreasingSequance(array1));
        System.out.println(isDecreasingSequance(array));
        System.out.println(isDecreasingSequance(array2));
        System.out.println(getLocalMax(array));
        System.out.println(getLocalMin(array));
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i : array ) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int[] createArray( int n, int max, int min){
        int[]  array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = new Random().nextInt(max - min) + min;
        }
        return array;
    }
    public static int[] createArray( int n){
        return createArray(n, 10, -10);
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array ) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static double getAvverage(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    public static double getGeometricMean(int[] array){
        double product = 1;
        for ( int i: array) {
            if (i >= 0){
                product *= i;
            }
            else return -1;
        }
        return Math.pow(product, 1. / array.length);
    }

    public static boolean isIncreasingSequance(int[] array){
        int previous = array[0];
        for ( int i : array) {
           if (previous > i){
               return false;
           }
           previous = i;
        }
        return true;
    }

    public static boolean isDecreasingSequance(int[] array){
        int previous = array[0];
        for ( int i : array) {
            if (previous < i){
                return false;
            }
            previous = i;
        }
        return true;
    }

    public static int getLocalMax(int[] array){
        for (int i = 1; i < array.length - 1; i++){
            if (array[i-1] < array[i] && array[i] > array[i + 1]){
                return i;
            }
        }
        return -1;
    }

    public static int getLocalMin(int[] array){
        for (int i = 1; i < array.length - 1; i++){
            if (array[i-1] > array[i] && array[i] < array[i + 1]){
                return i;
            }
        }
        return -1;
    }

    public static int[] reverseArray(int[] array){
        for (int i =  0; i < array.length / 2; i++){
            int left = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = left;
        }
        return array;
    }
}
