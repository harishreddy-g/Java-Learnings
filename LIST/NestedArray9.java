package LIST;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NestedArray9 {
    public static void main(String[] args) {
        List<List<Integer> >arr= new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5,6));
         System.out.println("Original matrix :");
         for(List<Integer> row: arr){
            System.out.println(row);
         }
         System.out.println("Matrix Transpose :");

         int rows = arr.size();
         int col= arr.get(0).size();
         for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.print(arr.get(j).get(i) +" ");
            }
            System.out.println();
         }
    }
}
