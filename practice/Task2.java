import java.util.*;

public class Task2{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int n = 10;
        int sum;
        int no = 0;
        int rem = 0;

        System.out.println("Armstrong Numbers are: ");

        for (int i=0;i<=num;i++){
            no = i;
            sum = 0;
            while (no > 0) {
                rem = no%n;
                sum = sum + (int) Math.pow(rem, 3);
                no = no / n;
            }
            if (sum == i){
                System.out.print(sum + ", ");
            }
        }

    }
}