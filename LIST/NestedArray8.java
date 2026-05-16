package LIST;

import java.util.*;

public class NestedArray8 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            System.out.println("Enter the Size of row " + (i + 1) + ": ");
            int size = input.nextInt();
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the elements of row" + (i + 1) + " column" + (j + 1));
                row.add(input.nextInt());
            }
            arr.add(row);
        }
        
        for(int i =0;i<arr.size();i++){
            for(int j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }

    }
}
