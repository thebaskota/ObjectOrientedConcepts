```java
import java.util.Scanner;
public class MatrixMul
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i,j,k,r1 = 3,c1 = 3,r2 = 3,c2 = 3;
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];
        System.out.println("Enter the first matrix");
        for( i = 0; i < r1 ; i++)
        {
            for(j = 0; j < c1 ; j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for( i = 0; i < r2 ; i++)
        {
            for(j = 0; j < c2 ; j++)
            {
                b[i][j] = input.nextInt();
            }
        }
        for( i = 0; i < r2 ; i++)
        {
            for(j = 0; j < c2 ; j++)
            {
                c[i][j] = 0;
               for(k = 0; k< r1;k++)
               {
                   c[i][j] =c[i][j] + a[i][k] * b[k][j];  
                }
            }
        }
        for( i = 0; i < r2 ; i++)
        {
            for(j = 0; j < c2 ; j++)
            {
                System.out.print(c[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
```
