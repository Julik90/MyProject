public class Homework2 {
    public static void main(String[] args) {
        home1();
    }

    public static void home1 () {
        int i = 1;
        if ( i > 0 ) {
            System.out.print(i+=1);
        } else {
            System.out.print(i-=2);
        }
        if ( i == 0 ) {
            System.out.print(i=10);
        }
        System.out.print(i);
    }

    public static void home2() {

    }
}
