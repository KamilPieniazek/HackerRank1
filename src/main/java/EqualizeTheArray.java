import java.util.ArrayList;
import java.util.List;

public class EqualizeTheArray {

    //https://www.hackerrank.com/challenges/equality-in-a-array/forum
    static int equalizeArray(int[] arr) {
        int i;
        int a;
        int count = 1;
        List<Integer> same = new ArrayList<>();
        int[] counts = new int[arr.length];


        for (int x = 0; x < arr.length; x++) {
            same.add(arr[x]);
        }

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

        System.out.println(same.size()-max);

        int answer=same.size()-max;
        return answer;
    }
}
