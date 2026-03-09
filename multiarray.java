public class multiarray {
    public static void main(String[] args){
        int[][] arr = new int[3][3];// decleration and memory allocation

        int[][] arr1 ;// decleration

        arr1 = new int[3][3];// memory allocation

        int[][] arr2={{1,2,3},{2,1,3},{2,3,4}};//decleration and intialization 

        int[] arr3[];// alternative way of decleration

        int[][] arr4= new int[][]{{1,2,3},{2,1,3},{2,3,4}};// decleration, and intialization

        int arr5[][];// alternative way of decleration

        // jagged array
        int[][] arr6 = new int[3][];  // 3 rows, columns not defined yet

arr6[0] = new int[2];  // row 0 → 2 columns
arr6[1] = new int[4];  // row 1 → 4 columns
arr6[2] = new int[3];  // row 2 → 3 columns

    }
}
