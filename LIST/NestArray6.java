package LIST;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NestArray6 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5));
        arr.add(Arrays.asList(6));

        for(int i =0;i<arr.size();i++){
            int sum =0;
            for (int j=0;j<arr.get(i).size();j++){
                sum+= arr.get(i).get(j);
            }
            System.out.println(sum);
        }
    }
}
