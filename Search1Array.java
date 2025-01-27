import java.util.Scanner;

public class Search1Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();

        int marks[] = new int[size];
        
        System.out.println("enter the elements into the array:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.println("Your array is:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
            // searching an element in array
            System.out.println("\nenter the element to search:");
            int x = sc.nextInt();
       
            for(int i = 0; i < marks.length; i++) {
            if(marks[i]== x){
                System.out.println("Your Searching element is found at index " + i);
            }else{
                System.out.println("element not found");
            }
        
        }


    }
}