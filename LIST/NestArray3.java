package LIST;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NestArray3 {
    public static void main(String[] args) {
        List<List<Integer>>arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2));
        arr.add(Arrays.asList(3,4));
        arr.add(Arrays.asList(5,6));
        int sum =0;
        for(int i =0; i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                sum+=arr.get(i).get(j);
            }
        }
        System.out.println(sum);
    }
}
