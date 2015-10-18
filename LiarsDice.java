import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class LiarsDice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] dice=new int[5];
        System.out.println("sheiyvanet kamatlis kombinacia");
        for (int i = 0; i < dice.length; i++) {
            dice[i]=scanner.nextInt();
        }
        System.out.println("dice status "+checkTwoPairCategory(dice));
    }

    private static Boolean checkTwoPairCategory(int[] dice) {
        ArrayList<Integer> numberOfOccurances = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            numberOfOccurances.add(countNum(dice, i));
        }
        Iterator<Integer> itr = numberOfOccurances.iterator();
        while(itr.hasNext()) {
            Integer number = itr.next();
            if (number != 2) {
                itr.remove();
            }
        }
        if (numberOfOccurances.size()==2) {
            return true;
        }
        return false;
    }

    public static int countNum(int[] dice, int number) {
        int counter = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == number) counter++;
        }
        return counter;
    }
}
