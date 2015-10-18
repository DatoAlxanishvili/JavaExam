import java.util.ArrayList;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class LiarsDice {
    public static void main(String[] args){

    }
    private Boolean checkTwoPairCategory (int [] dice){
        ArrayList<Integer> numberOfOccurances=new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            numberOfOccurances.add(countNum(dice,i));
        }
        for (int i = 0; i < numberOfOccurances.size(); i++) {
            if(numberOfOccurances.get(i)==2 || numberOfOccurances.get(i)==1){

            }
        }
        return true;
    }
    public static int countNum(int[] dice,int number){
        int counter=0;
        for (int i = 0; i < dice.length; i++) {
            if(dice[i]==number) counter++;
        }
        return counter;
    }
}
