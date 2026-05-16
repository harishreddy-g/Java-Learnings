package LIST;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NestArray {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(1, 1, 1));

        System.out.println(arr);
    }
}
