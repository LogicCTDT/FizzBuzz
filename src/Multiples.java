public class Multiples {

    public static void main(String[] args) {
        int res = 0;
        for (int j = 1; j <1000; j++){
            boolean d3 = j % 3 == 0;
            boolean d5 = j % 5 == 0;
            if (d3 || d5) {
                res++;
            }

        }
        System.out.println(res);
    }
}
