package LIST;
import java.util.*;

public class NestArray5 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,6));
        arr.add(Arrays.asList(7,9));
        int even =0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                 if(arr.get(i).get(j) % 2 == 0){
                even++;
            }
            }
           
        }
        System.out.println(even);
    }
}
