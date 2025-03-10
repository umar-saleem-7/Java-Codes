import java.util.*;

public class Task2{
    public static void main(String[] args){

        System.out.print("Original Array: [");
        for (int i=0;i< args.length-1;i++){
            System.out.print(args[i]);
            System.out.print(", ");
        }
        System.out.print(args[args.length-1]);
        System.out.println(']');

        int oddc=0;
        int evenc=0;
        int num;
        for (int i=0;i<args.length;i++){
            num = Integer.parseInt(args[i]);
            if(num % 2 == 0){
                evenc++;
            }
            else{
                oddc++;
            }
        }
        System.out.print("Count of even numbers :");
        System.out.println(evenc);
        System.out.print("Count of odd numbers :");
        System.out.println(oddc);
    }
}