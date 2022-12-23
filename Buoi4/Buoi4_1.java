package Buoi4;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Buoi4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        char[] a = new char[s.length()];
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                a[i] = s.charAt(i);
                if (!map.containsKey(a[i])) {
                    map.put(a[i], 1);
                } else {
                    int cnt = map.get(a[i]) + 1;
                    map.put(a[i], cnt);
                }
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
