import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizerTheArray {

    static int equalizeArray(int[] arr) {
        int i;
        int a;
        int count = 1;
        List<Integer> same = new ArrayList<>();
        int[] counts = new int[arr.length];


        for (int x = 0; x < arr.length; x++) {
            same.add(arr[x]);
        }
        System.out.println(same.size());
        for ( a = 0; a < same.size(); a++) {
            for (int b = a+1; b < same.size(); b++) {
                if (same.get(a).equals(same.get(b))) {
                    count++;
                }
            }
            counts[a] = count;

            count=1;
        }
        int max=counts[0];
        for (i = 1; i < counts.length; i++) {
            if (max < counts[i]) {
                max = counts[i];
            }
        }
        int answer=same.size()-max;
        return answer;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
