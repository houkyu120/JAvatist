package Structure;
//直接选择排序
public class SelectSort {
    public static void main(String[] args) {
        int[] arreyr = new int[]{2,3,1,5,40,9,6,7,8};
        for (int i = 0; i < arreyr.length; i++) {
            int num = i;
            for (int j = i; j < arreyr.length; j++) {
                if (arreyr[j] < arreyr[num]) {

                    num = j;
                }}
                if (i != num) {
                    int temp = arreyr[i];
                    arreyr[i] = arreyr[num];
                    arreyr[num]=temp;
                }

            }
        for (int a : arreyr) {
            System.out.println("a = " + a);
        }
        }
    }

