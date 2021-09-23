package strings;

class RomanToNumber {
    public static void main(String[] args) {
        String str = "CMXVI";
        romanToDecimal(str);
    }
    // Finds decimal value of a given roman numeral
    public static int romanToDecimal(String str) {

        int sum = 0 ;

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);

            switch(ch){
                case 'I' : sum = sum + 1;
                    continue;
                case 'V' : sum = sum + 5;
                    continue;
                case 'X' : sum = sum + 10;
                    continue;
                case 'L' : sum = sum + 50;
                    continue;
                case 'C' : sum = sum + 100;
                    continue;
                case 'D' : sum = sum + 500;
                    continue;
                case 'M' : sum = sum + 1000;
                    continue;
            }

        }
        System.out.println(sum);
        return sum;
    }
}