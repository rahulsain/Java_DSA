package arrays;

public class arraySum {
    public static void main(String[] args){
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//                sum += arr[i][j];
//        System.out.print(sum);

    }
}
