import java.math.BigInteger;

public class Bday {
    public static void main(String[] args) {
        taumBday(10, 10, 1, 1, 1);
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long b1 = b;
        long w1 = w;
        long bc1 = bc;
        long wc1 = wc;
        long z1 = z;
        long costB = 0;
        long costW = 0;
        if (bc1 > (wc1 + z1)) {
            bc1 = wc1 + z1;
        }

        costB = bc1 * b1;

        if (wc1 > (bc1 + z1)) {
            wc1 = bc1 + z1;
        }
        costW=wc1*w1;

        return costB + costW;
    }

}
