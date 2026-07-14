public class MultidimentionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 30;
        arr[0][1] = 50;
        arr[0][2] = 80;

        arr[1][0] = 40;
        arr[1][1] = 60;
        arr[1][2] = 90;

        arr[2][0] = 50;
        arr[2][1] = 40;
        arr[2][2] = 70;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
