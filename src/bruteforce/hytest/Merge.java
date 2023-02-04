package bruteforce.hytest;
import java.util.*;
import java.util.stream.Collectors;

public class Merge{

    public static String[] uniqNames(String[] names1, String[] names2) {
        String[] target = new String[names1.length + names2.length];
        int index =0;

        for (int i = 0; i < names1.length; i++) {
            target[index++] = names1[i];
        }
        for (int i = 0; i < names2.length; i++) {
            target[index++] = names2[i];
        }

        List<String> value = Arrays.stream(target).distinct().collect(Collectors.toList());

        String[] result = value.toArray(new String[0]);
        return result;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Seoul", "Incheon", "Gyeonggi"};
        String[] names2 = new String[] {"Seoul", "Cheonan", "Busan"};
        String[] value = uniqNames(names1, names2);
        for (String v:
             value) {
            System.out.print(v+" ");
        }
// should print Seoul, Incheon, Gyeonggi, Cheonan, Busan
    }
}

