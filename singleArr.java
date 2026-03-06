import java.util.Scanner;

public class singleArr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // only decleration
        int[] arr;

        //decleration and memory allocation
        int[] arr1 = new int[4];

        //decleration and intialization

        int[] arr2 = {1,2,3,4,5};

        // decleration, memory allocation and intialization
        int[] arr3;
        arr3 = new int[]{6,7,8,9,10};

        // user input for arr
        System.out.println("enter the size of the arraay:");
        int size = input.nextInt();
        arr =new int[size];
        System.out.println("enter the elements of the array:");
        for(int i=0; i<size ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("elements of Arr:");
        printArray(arr);
        System.out.println("elements of arr1:");
        printArray(arr1);
        System.out.println("elements of arr2:");
        printArray(arr2);
        System.out.println("elements of arr3:");
        printArray(arr3);
        // ananymous array(without reference variable)
        System.out.println("elements of anonymous array:");
        printArray(new int[]{11,12,13,14,15});
        input.close();
    }

    static void printArray(int[] array){
        for(int a :array){
            System.out.print(a + " ");
        }
        System.out.println();

    }
}
