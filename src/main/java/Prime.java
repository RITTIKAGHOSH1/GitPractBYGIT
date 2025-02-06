import java.util.*;
public class Prime {

    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i!=0){
                c++;

                if(n/i!=i){
                    c++;

                }
            }
        }
        if(c==2) return true;
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }
}
