package Assignment2.Matrix;

public class transpose {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int tr[][] = new int[3][3];

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                tr[i][j] = arr[j][i];
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
