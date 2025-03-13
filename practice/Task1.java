import java.util.*;

public class Task1{
    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("Array is missing!");
        } else {
            System.out.print("Array: [");
            for (int i=0;i< args.length-1;i++){
                System.out.print(args[i]);
                System.out.print(", ");
            }
            System.out.print(args[args.length-1]);
            System.out.println(']');

            int max_element = 0;
            int min_element = 36897944;
            int num = 0;
            for (int i=0;i<args.length;i++){
                num = Integer.parseInt(args[i]);
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