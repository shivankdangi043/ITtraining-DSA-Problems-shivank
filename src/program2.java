public class program2 {
    public static void main(String[] args) {
        String str = "AELLO";
        for (int i = 0; i <str.length() ; i++) {
            int ch = str.charAt(i);
            if('a' <= ch && ch<= 'z'){
                System.out.println(ch - 94);
            }
            if ('A' <= ch && ch<= 'Z'){
                System.out.println(ch - 64);
            }



        }
    }
}
