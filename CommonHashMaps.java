import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by GeoLabOwl on 18.10.15.
 */
public class CommonHashMaps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String, String> map1=new HashMap<>();
        HashMap<String, String> map2=new HashMap<>();
        int lengthOfMap=scanner.nextInt();
        String key="";
        String value="";
        System.out.println("sheavset pirveli map");
        for (int i = 0; i < lengthOfMap; i++) {
            key="oto";
            value="dato";
            map1.put(key,value);
        }
        System.out.println("sheavset meore map");
        for (int j = 0; j < lengthOfMap; j++) {
            key="oto";
            value="dato";
            map2.put(key,value);
        }
        System.out.println(commonKeyValuePairs(map1,map2));
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
                if(it1Mem.equals(it2.next())){
                    it2Mem=it2.next();
                    if (map1.get(it1Mem).equals(map2.get(it2Mem))){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
