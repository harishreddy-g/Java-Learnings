public class Stringarray {
    public static void main(String[] args){
        String[] arr= new String[5]; //  Single dimensional String array decleration and memory allocation
        arr[0] = "Hello";
        arr[1] = "World";   
        arr[2] = "Java";
        arr[3] = "Programming";
        arr[4] = "Language";
        System.out.println("Single dimensional String array elements:");
        for(String s: arr){
            System.out.println(s);
        }
        // Multi dimensional String array decleration and memory allocation
        String[][] arr2 = new String[2][3];
        arr2[0][0] = "Hello";
        arr2[0][1] = "World";
        arr2[0][2] = "Java";
        arr2[1][0] = "Programming";
        arr2[1][1] = "Language";
        arr2[1][2] = "Array";
        System.out.println();
        System.out.println();
        System.out.println("Multi dimensional String array elements:");
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + "    ");
                
            }
            System.out.println();
        }
    }
}
