import java.util.*;

public class Task3{
    public static int Addition (int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1,n2, ans;
        int i = 0;
        while (i >= 0){
            System.out.print("Enter Number 1: ");
            n1 = in.nextInt();
            if (n1 == -1){
                break;
            }
            System.out.print("Enter Number 2: ");
            n2 = in.nextInt();

            ans = Task3.Addition(n1, n2);
            System.out.println("Sum is " +ans);
            i++;
            System.out.println("Operation performed " + i + " time");
            
        }
    }
}