public class Encryption {
    public static void main(String[] args) {
        String s = "Kamil jest super";
        encryption(s);
    }

    static String encryption(String s) {

        s = s.replaceAll("\\s+", "");

        double sqrt = Math.sqrt(s.length());
        int value = (int) sqrt;
      String [] ss= s.split("\\n", value + 1);
        System.out.println(s);
        return s;
    }
}
