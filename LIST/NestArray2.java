package LIST;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class NestArray2 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(7,8,9));

        for(int i=0;i<arr.size();i++){
            for(int j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
