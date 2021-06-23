package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class distinctElements {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int[][] M = new int[N][N];
            String[] arr = in.readLine().trim().split("\\s+");
            for (int i = 0; i < N * N; i++)
                M[i / N][i % N] = Integer.parseInt(arr[i]);

            System.out.println(distinct(M, N));
        }
    }

    static int distinct(int[][] matrix, int N)
    {
        int count = 0;
        // make a empty map
        Map<Integer, Integer> ans = new HashMap<>();

        // Insert the elements of
        // first row in the map and
        // initialize with 1
        for (int j = 0; j < N; j++) {
            ans.put(matrix[0][j], 1);
        }

        // Traverse the matrix from 2nd row
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {

                // If the element is present in the map
                // and is not duplicated in the current row
                if (ans.get(matrix[i][j]) != null
                        && ans.get(matrix[i][j]) == i) {

                    // Increment count of the element in
                    // map by 1
                    ans.put(matrix[i][j], i + 1);

                    // If we have reached the last row
                    if (i == N - 1) {

                        // Print the element
                        // System.out.print(matrix[i][j]+ " ");
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
