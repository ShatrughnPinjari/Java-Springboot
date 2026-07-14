public class ArrayDemo {
    public static void main(String[] args) {
//        System.out.println("Shatrughn Pinjari");
        int[] arr = new int[3];

        int x = 100;
        for(int i=0; i<arr.length; i++){
            arr[i] = x;
            x++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}