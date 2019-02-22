import java.util.Scanner;

public class find_max_in_array {
    static int row,colum;
    public static void main(String[] args) {

        inputArraySize();
        int arr[][]=new int[row][colum];
        inputArray(arr);
        System.out.println("Max of value in array is: "+ findMax(arr));

    }
    static int findMax(int arr[][]){
        int max=arr[0][0];
        for (int i=0;i<row;i++){
            for (int j=0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    static void inputArraySize(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Row of matrix: ");
        row=sc.nextInt();
        System.out.print("Column of matrix: ");
        colum=sc.nextInt();
    }
    static void inputArray(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<row;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("a["+i+"]"+"["+j+"]=");
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
