import java.util.Locale;

public class program3 {
    public static void main(String[] args) {
        String str = "praveen";
        str = str.toUpperCase();
        String res = "";
        for (int i = 0; i <str.length()/2 ; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(str.length()-1);
            res = res + ch1 + ch2;

        }
        if( str.length()%2 != 0){
            char ch3 = str.charAt(str.length()/2);
            res = res+ch3;
        }
        System.out.println(res);
    }
}
