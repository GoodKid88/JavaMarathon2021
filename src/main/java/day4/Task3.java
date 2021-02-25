package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int bigSum = 0;
        int bigSumIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (0 + Math.random() * 50);

                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            if (sum > bigSum) {
                bigSum = sum;
                bigSumIndex = i;
            }
            System.out.println();
        }
        System.out.println(bigSumIndex);
    }
}
