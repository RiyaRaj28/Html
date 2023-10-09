public class printnthPrime {

    static boolean checkPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 

    }
    public static void main(String[] args) {
        
        
    }
}
