package LIST;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NestArray7 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2));
        arr.add(Arrays.asList(3,4));
        int element = 3;
        for(int i=0;i<arr.size();i++){

            for(int j=0;j<arr.get(i).size();j++){
                if(arr.get(i).get(j)==element){
                    System.out.println("Element Found..");
                    break;
                }
            }
        }
    }
}
