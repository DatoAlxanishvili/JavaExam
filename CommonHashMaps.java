import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class CommonHashMaps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        HashMap<String, String> map1=new HashMap<>();
        HashMap<String, String> map2=new HashMap<>();
        System.out.println("sheiyvanet mapis zoma:");
        int lengthOfMap=scanner1.nextInt();
        String key="";
        String value="";
        System.out.println("sheavset pirveli map");
        for (int i = 0; i < lengthOfMap; i++) {
            System.out.println("sheiyvanet key");
            key=scanner.nextLine();
            System.out.println("sheiyvanet value");
            value=scanner.nextLine();
            map1.put(key,value);
        }

        System.out.println("sheavset meore map");
        for (int j = 0; j < lengthOfMap; j++) {
            System.out.println("sheiyvanet key");
            key=scanner.nextLine();
            System.out.println("sheiyvanet value");
            value=scanner.nextLine();
            map2.put(key,value);
        }
        System.out.println("saerto elementta raodenoba:"+commonKeyValuePairs(map1,map2));
    }
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2){
        Iterator<String> it1=map1.keySet().iterator();
        Iterator<String> it2=map2.keySet().iterator();
        String it1Mem="";
        String it2Mem="";
        int count=0;
        while (it1.hasNext()) {
            it1Mem=it1.next();
            while (it2.hasNext()) {
                it2Mem=it2.next();
                if(it1Mem.equals(it2Mem) && map1.get(it1Mem).equals(map2.get(it2Mem))){
                        count++;

                }

            }
            it2=map2.keySet().iterator();
        }
        return count;
    }
}
