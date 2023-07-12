public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        try
        {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception s) {
            System.out.println("Something went wrong.");
        }
        System.out.println("Hello");
    }



}
