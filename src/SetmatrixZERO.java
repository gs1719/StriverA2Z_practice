public class SetmatrixZERO {


    public static void main(String[] args) {
        SetmatrixZERO setmatrixZERO = new SetmatrixZERO();
        int[][] matrix = {
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println("col = " + column);
        System.out.println("row = " + row);
        printMatrix(matrix);
        System.out.println("=======================");
        setmatrixZERO.setZeroes(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr1: matrix){
            for(int value: arr1){
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {
       int row = matrix.length;
       int column = matrix[0].length;

       //copying the matrix for temporary basis
        int[][] newMatrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for(int j=0;j<column;j++){
                newMatrix[i][j]=matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(newMatrix[i][j] == 0){
                    for (int k = 0; k < row; k++) {
                        matrix[k][j]=0;//00 10 20 30
                    }

                    for (int k = 0; k < column; k++) {
                        matrix[i][k]=0;//00 01 02
                    }
                }
            }
        }
    }

}