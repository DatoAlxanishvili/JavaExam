import java.util.Scanner;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class SimpleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the sequence");
        int num=scanner.nextInt();

        int previousNumber=0;
        int count=0;
        int countMax=0;
        while(num!=0){
           if(num>previousNumber) count++;
            if(num<previousNumber) {
                count=1;
            }
            if(countMax<count) countMax=count;
            previousNumber=num;
            num=scanner.nextInt();

        }
        System.out.println("Length of the max subsequence: "+countMax);
    }
}
