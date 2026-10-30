public class Matrix{
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }IO.println();


        int[][][] HD={{{1,2,3,},{4,5,6}},{{7,8,9},{10,11,12}}};
        IO.println(HD[0][1][2]);
        for(int i=0;i<HD.length;i++){
            for(int j=0;j<HD.length;j++){
                for(int k=0;k<3;k++){
                    IO.println(HD[i][j][k]+" ");
                }
            }
            IO.println();
        }
        IO.println();
     }
}