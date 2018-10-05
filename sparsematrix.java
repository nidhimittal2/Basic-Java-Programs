import java.util.*;
class sparsematrix
{
  public static void main(String args[])
  {
    sparsematrix obj=new sparsematrix();

    Scanner sc = new Scanner(System.in);
         System.out.println("Enter the dimensions of the matrix: ");
         int m = sc.nextInt();
         int n = sc.nextInt();
         double[][] mat = new double[m][n];
obj.input(mat);
int x=obj.parse(mat);
if(x==0)
{
  System.out.println("Not a sparse matrix");
}
else
System.out.println("a sparse matrix");

}
void input(mat[][])
{

    int row=mat.length;
    int col=mat[0].length;

         System.out.println("Enter the elements of the matrix: ");
         for(int i=0; i<m.length; i++)
         {
             for(int j=0; j<m[i].length; j++)
             {
                 mat[i][j] = sc.nextDouble();

             }
         }
       }
       boolean parse(mat[][])
       {
         int row=mat.length;
         int col=mat[0].length;
int zeros = 0;
         for(int i=0; i<m.length; i++)
         {
             for(int j=0; j<m[i].length; j++)
             {
                 if(mat[i][j] == 0)
                 {
                     zeros++;
                 }
             }
         }

         if(zeros > (m*n)/2)
         {
            return 1;
         }
         else
         {
             return 0;
         }
     }
 }
