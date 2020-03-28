import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);

        birthday(s, 3, 2);
    }

    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        int i = 0;
        int p=0;

        while (i < s.size()) {
            sum = sum + s.get(i);
            p++;
            if (sum > d) {
                sum=s.get(i);
                p=0;
            }
            if (sum == d&&p==m) {
                count++;
                sum = s.get(i);
                p=1;
            }else{
                sum=s.get(i);
                p=1;
            }
            i++;
        }
        System.out.println(count);
        return count;
    }
}
