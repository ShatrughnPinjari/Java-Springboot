public class ArrayDemo {
    public static void main(String[] args){

        int[] number = {1,2,3,4,5};
        String[] name = {"Tushar", "Aman"};

        System.out.println("Print primitive array");
        for(int i=0;i<number.length;i++){

            if(i==number.length-1){
                System.out.print(number[i] + "]");
            } else if(i==0){
                System.out.print("[" + number[i] + ", ");
            }
            else{
                System.out.print(number[i] + ", ");
            }
        }

        System.out.println();

        System.out.println("Print Non-primitive array");
        for(int i=0;i<name.length;i++){
            if(i==name.length-1){
                System.out.print(name[i] + "]");
            } else if(i==0){
                System.out.print("[" + name[i] + ", ");
            } else{
                System.out.print(name[i]+ ", ");
            }
        }
    }
}
