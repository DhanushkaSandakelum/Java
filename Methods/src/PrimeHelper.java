public class PrimeHelper {
    public static boolean isPrime(int val) {
        int count = 0;

        if(val <= 0){
            return false;
        }

        for (int i = 1; i <= val; i++) {
            if(val % i == 0){
                count++;

                if(count > 2) {
                    return false;
                }
            }
        }

        return true;
    }
}
