package array;

public class NuanceInterviewProblem {
    public static void main(String[] args) {
        int number = 1972;
        isNumber(number);
    }

    private static void isNumber(int number) {

        int rem = 0;
        while (number > 0){
            rem = rem + number % 10;
            number = number / 10;
        }

        System.out.println(rem);

        if (rem > 9)
            isNumber(rem);
        else if (rem == 1)
            System.out.println("Number is perfect");
        else
            System.out.println("Number is not perfect");

    }
}
