import java.util.*;
public class patterns {
    public static void main(String args[]){
        //Scanner sc= new Scanner(System.in);
        //int n =sc.nextInt();
        //int m = sc.nextInt();
        //for(int i=1;i<=4;i++){
        //    for(int j=1;j<=5;j++){
        //        System.out.print("*");
        //    }System.out.println();
        //}
   /*  for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            if(i==1||j==1||i==4|| j==5){
          System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println();
    }*/
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            //if(i==1&j==1||i==2&j==2)//||i==3&j==3||i==4&j==4)
            /*{
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            //}*/
            System.out.print("*");
        }System.out.println();
    }
        
    }
}
