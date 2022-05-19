public class array0 {
    public static void main(String[] args){
        int m = 0;
        for(int i=1; i<=99; i++){
            if(i%2-1 == 0) m++;
        }
        int[] Arr = new int[m];
        for(int i=1, b=0; i<=99; i++){
            if(i%2-1 == 0){
                Arr [b] = i;
                System.out.print(Arr[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int b=Arr.length-1; b>=0; b--) {
            System.out.print(Arr[b]+" ");
        }

    }
}
