package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestArray4 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(3,7,2));
        arr.add(Arrays.asList(9,1));
        arr.add(Arrays.asList(4,6));
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                max = Math.max(max, arr.get(i).get(j));
            }
        }
        System.out.println(max);
    }
}
