import java.util.*;
public class primeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
                break;
            //System.out.println("it is a prime number");
                
            }
            /*else{
                isprime=false;
                System.out.println("composite number");
            }*/
        }if(isprime){
            //if(n==1)
            //System.out.println("neither prime nor composite number ");
            //else{
                System.out.println("prime number");
            //}
        }
        else{
            System.out.println("composite number");
        }

        
    }
}
