package Structure;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arreyr = new int[]{2, 3, 1, 5, 40, 9, 6, 7, 8};
        for (int i = 0; i < arreyr.length; i++) {
            for (int j = i; j < arreyr.length ; j++) {
                if (arreyr[i] > arreyr[j]) {
                    int temp = arreyr[i];
                    arreyr[i] = arreyr[j];
                    arreyr[j] = temp;

                }
            }

        }
        for (int a : arreyr) {
            System.out.println("a = " + a);
    }
}}
