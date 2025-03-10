import java.util.*;

public class cal{
    public static void main(String[] args){
        int num1, num2, add, sub, mul, div;
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Value 1 :");
        num1 = in.nextInt();

        System.out.println("Please Enter Value 2 :");
        num2 = in.nextInt();

        System.out.print("Result : ");

        if (args[0].equals("-")){
            add = num1-num2;
            System.out.println(add);

        }
        if (args[0].equals("+")){
            sub = num1+num2;
            System.out.println(sub);

        }
        if (args[0].equals("x")){
            mul = num1*num2;
            System.out.println(mul);

        }
        if (args[0].equals("/")){
            div = num1/num2;
            System.out.println(div);

        }
        
    }
}