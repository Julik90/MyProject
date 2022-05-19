public class Test1 {
    public static void main(String[] args){
        int a = 6;
        int b = 2;
        int y = sum (a, b);
        int w = max(a,b);
        System.out.println(y);
        System.out.println(w);
    }
        public static int sum(int a, int b){
            int sum = a+b;
            return sum;

        }
         public static int max(int a, int b) {
        if (a > b)
            return a;
        else
        return b;

        }}



