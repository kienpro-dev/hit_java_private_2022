package Buoi3;

import java.util.Scanner;
import java.util.TreeMap;

public class Buoi3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int cnt = map.get(arr[i]) + 1;
                map.put(arr[i], cnt);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
