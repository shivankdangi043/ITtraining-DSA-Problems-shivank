
public class campusQ {
    public static void main(String[] args) {

        String str = "World Wide Web";
        str = str.toUpperCase();

        String[] ans = str.split(" ");
        int sum = 0;

        for (String s : ans) {
            for (int i = 0; i < s.length() / 2; i++) {

                int ch1 = s.charAt(i) - 64;
                int ch2 = s.charAt(s.length() - 1 - i) - 64;

                int dif = Math.abs(ch1 - ch2);
                sum += dif;
            }

            if (s.length() % 2 != 0) {
                int ch3 = s.charAt(s.length() / 2);
                sum += ch3;
            }
        }

        System.out.println(sum);
    }
}
