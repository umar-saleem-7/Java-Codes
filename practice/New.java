import java.util.*;

public class New{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = in.nextInt();

        if (size == 0){
            System.out.println("Array is Empty!");
        } else {
            int[] arr = new int[size];
            System.out.print("Array: ");
            for (int i=0;i< size;i++){
                arr[i] = in.nextInt();
            }
            
            int max_element = 0;
            int min_element = 36897944;
            int num = 0;
            for (int i=0;i<size;i++){
                num = arr[i];
                if (num > max_element){
                    max_element = num;
                }
                if (num < min_element){
                    min_element = num;
                }
            }

            System.out.println("Largest number in array : " + max_element);
            System.out.println("Samllest number in array : " + min_element);
        }
    }
}