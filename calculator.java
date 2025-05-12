import java.util.*;
public class calculator{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a:");
        double a= sc.nextDouble();
        System.out.println("enter b:");
        double b= sc.nextDouble();
        System.out.println(" enter operator 1-->+,2-->-,3-->*,4-->/,5-->%");
        int operator=sc.nextInt();
        double  result;
        switch(operator){
            case 1:
             result=a + b;
             System.out.println(result);
             break;
            case 2:
             result =a-b;
             System.out.println(result);
             break;
            case 3:
            result = a*b;
            System.out.println(result);
            break;
            case 4:
            result = a/b;
            System.out.println(result);
            break;
            case 5:
            result = a%b;
            System.out.println(result);
            break;
            default:
            System.out.println("invalid operator");



        }
        
    }
}