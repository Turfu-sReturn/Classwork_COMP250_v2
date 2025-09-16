//import java.util.Arrays;
//
///* Write a class called Thursday. Inside the class write a public static method called getIntersectionSize() which takes two int arrays as input and returns an int indicating the number of elements that belong to the intersection of the input arrays.Assumptions: You can assume that the input arrays do not contain any duplicates.
//
//For example:
//
//    getIntersectionSize([1, 2, 3], [2, 3, 4]) returns 2
//
//    getIntersectionSize([5, 6], [7, 8]) returns 0
//
//    getIntersectionSize([10, 20, 30], [30, 40, 50]) returns 1
//
//    getIntersectionSize([], [1, 2, 3]) returns 0 */
//
//public class Thursday {
//    public static void main (String[] args) {
//        int[] a = {1, 2, 3};
//        int[] b = {2, 3, 4};
//        int num = getIntersectionSize(a, b);
//        System.out.println(num);
//    }
//
//    public static int getIntersectionSize (int[] x, int[] y) {
//
//        // My Solution
//
//        int numInBoth = 0;
//
//        for (int i = 0; i<x.length;i++) {
//            for (int j = 0; j<y.length;j++)
//                if (x[i] == y[j])
//                    numInBoth ++;
//        }
//        return numInBoth;
//    }
//
//    public static int getIntersectionSizeSolution (int[] a, int[] b) {
//        int size = 0;
//
//        int indexA = 0;
//        int indexB = 0;
//
//        while (indexA < a.length && indexB < b.length) {
//            if (a[indexA] == b[indexB]) {
//                size++;
//                indexB++;
//                indexA++;
//            } else if (a[indexA] < b[indexB]) {
//
//            }
//        }
//    }
//}
