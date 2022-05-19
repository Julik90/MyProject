public class array {
    public static void main(String[] args){
        int m = 0;
        for(int i=2; i<=20; i++){
            if(i%2 == 0) m++;
        }
        int[] Arr = new int[m];
        for(int i=2, b=0; i<=20; i++){
            if(i%2 == 0){
                Arr [b] = i;
                System.out.print(Arr[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }

    }
}
