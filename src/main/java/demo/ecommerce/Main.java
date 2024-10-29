package demo.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] a = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        System.out.println(addToArrayForm(a, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder s = new StringBuilder();
        for (Integer i : num) {
            s.append(i);
        }
        int n = 0;
        if (!s.isEmpty()) n = Integer.parseInt(s.toString());
        int a = n + k;
        List<Integer> res = new ArrayList<Integer>();
        for (String d : Integer.toString(a).split("")) {
            res.add(Integer.parseInt(d));
        }
        return res;
    }

}