import java.util.Scanner;

public class printnthPrime {

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }  

    public static void main(String[] args) {
        System.out.println("Enter nth prime number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2; 
        int count = 0; 
        while(true){
            if(isPrime(i)==true){
                count++;
            }
            if(count==n){
                break;
            }
            i++; 
        }
        System.out.println(i);   
    }
}
