package Arrays;

public class lab3_2dPrinting {

    public static void main(String[] args) {

        int[][] matrix={{1,2,3},{4,6,7},{8,4,6}};

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.println(matrix[i][j]);
            }

        }



    }

}
