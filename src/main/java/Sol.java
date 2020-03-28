import java.sql.SQLOutput;
import java.util.*;

public class Sol {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] split = s.split("[ .,?!']+");
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {

            System.out.println(split[i]);
        }
    }
}


