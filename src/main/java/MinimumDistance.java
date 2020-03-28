import java.util.ArrayList;
import java.util.List;

public class MinimumDistance {
    public static void main(String[] args) {
        int[] a=new int[]{7,1,3,4,1,7};
        minimumDistances(a);
    }
    static int minimumDistances(int[] a) {
        List<Integer> distances=new ArrayList<>();
for(int i=1;i<a.length;i++){
    for(int x=i-1;x<a.length;x++){
        if(a[i]==a[x]){
            int abs = Math.abs(i - x);
            distances.add(abs);
        }
    }

}
int min=distances.get(0);
for(int i=1;i<distances.size();i++){
    if(distances.get(i)<min){
        min=distances.get(i);
    }
}
        System.out.println(min);
return min;
    }
}
