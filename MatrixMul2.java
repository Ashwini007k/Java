import java.util.*;
class MatrixMul2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rep,sum=0;
do
{
System.out.println("Enter values of row and column of matrix A:");
int r1=sc.nextInt();
int c1=sc.nextInt();
System.out.println("Enter values of row and column of matrix B:");
int r2=sc.nextInt();
int c2=sc.nextInt();
if(c1==r2)
{
int A[][]=new int[r1][c1];
int B[][]=new int[r2][c2];
int C[][]=new int[r1][c2];
System.out.println("Enter values in matrix A:\n");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
A[i][j]=sc.nextInt();
}
System.out.println("Enter values in matrix B:\n");
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
B[i][j]=sc.nextInt();
}
System.out.println("Matrix obtained after multiplication is of order "+r1+","+c2+" and its value is:\n");
for(int c=0;c<r1;c++)
{
for(int d=0;d<c2;d++)
{
for(int k=0;k<r2;k++)
{
sum=sum+A[c][k]*B[k][d];
}
C[c][d]=sum;
sum=0;
}
}
for(int i=0;i<r1;i++)
{
for(int j=0;j<c2;j++)
System.out.println(C[i][j]);}
}
else
System.out.println("Matix multiplication is not possible for given dimensions of matrices!!!");
System.out.println("Want to multiply more matrices?(Enter 1 for yes or 0 for no)");
rep=sc.nextInt();
}
while(rep==1);
}
}
