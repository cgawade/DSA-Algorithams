package basic;

public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        int range = 100 ;
        generatePrimeNUmber(range);

    }

    private static void generatePrimeNUmber(int range) {
        int count = 0;

        for (int i = 3; ; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = true;
                }
            }

            if(!flag) {
                count++;
                System.out.println(i);
                if (count == range)
                    break;
            }

        }

    }
}
