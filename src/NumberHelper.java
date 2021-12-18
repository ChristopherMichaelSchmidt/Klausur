import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {

        int[] array = { 1,2,2,4,5,6,7,7};
        System.out.println(isSortedArray(array));

        System.out.println(Arrays.toString(removeDuplicates(array)));


    }






    public static boolean isSortedArray(int[] numbers){
        boolean hilf = true;
        int hilf2=Integer.MIN_VALUE;
        for (int i=0; i<numbers.length;i++){
            if(hilf2<numbers[i]){ hilf2 = numbers[i];}
            else if(hilf2>=numbers[i]){ hilf = false;

        }

    }
        return hilf;
}



    public static int[] removeDuplicates(int[] numbers){


        for (int i=0; i<numbers.length;i++) {

            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;

                }

            }


        }
        return numbers;








}
}

