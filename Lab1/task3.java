public class task3 {


        public static void main(String[] args) {

            int[] numbers  = {5, 3, 8, 1, 2, 7, 4, 6};


            int max = 0;
            int min = 99999;


            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }


            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }





}
