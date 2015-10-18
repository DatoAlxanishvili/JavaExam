import java.util.Scanner;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class FromStringToInt {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(power(10,2));
        System.out.println(parseInt(word));
    }
    private static int parseInt(String st){
        int x=0;
        int answer=0;
        for (int i = 0; i < st.length(); i++) {
             x=(st.charAt(i)-48)*power(10,st.length()-1-i);
             answer+=x;
        }
        return answer;
    }
    public static int power(int x,int n){
        int a=1;
        for (int i = 0; i <n; i++) {
            a=a*x;
        }
        x=a;
        return x;
    }
}

