import java.lang.StringBuffer;

public class Zadanie3 {
    public static String delete(String str, String substr) {
        StringBuffer s = new StringBuffer(str);
        StringBuffer k = new StringBuffer(substr);
        int i,j,pomoc=0;
        for(i=0;i<s.length();i++) {
            for(j=0;j<k.length();j++) {
                if ((s.charAt(i) == k.charAt(j)) && pomoc>k.length()+1) {
                    s.deleteCharAt(i);
                }
                else {
                    pomoc += 1;
                }
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String a = "rabarbarrararara";
        String e = "b";
        System.out.println(delete(a, e));
    }
}
