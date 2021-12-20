public class Factorial {

    public static void main(String[] args) {

        int num = 5, i = 1, fact = 1;
        
        while(i <= num)
        {
            fact *=i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, fact);
    }
}