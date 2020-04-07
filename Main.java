/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    public static void printing(int mat1[][])
    {
        for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat1[0].length;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static int solution(int mat1[][])
    {
        if (mat1 == null || mat1.length == 0 || mat1[0].length == 0)
         {return 0;}
         //code start
         int m = mat1.length;//3
         int n = mat1[0].length;//4
         int temp[][]=new int[m+1][n+1];
          for(int i=0;i<m+1;i++)
            {
               // int temp[]={};
                for(int j=0;j<n+1;j++)
                {
                   temp[i][j]=0;
                }
              // t[i]=temp;
            }
       //  printing(temp);
         for(int j=1;j<m+1;j++)
         {
             for(int i=1;i<n+1;i++)
            {
                temp[j][i]=mat1[j-1][i-1];
            }
         }
        
        for(int i=1;i<temp.length;i++)
        {
            for(int j=1;j<temp[0].length;j++)
            {
                if(temp[i][j]==0)
                {
                    temp[i][j]=0;
                }
                else{
                    
                    int min1 =minimum(temp[i-1][j],temp[i][j-1]);
                    
                    int min2 =minimum(min1,temp[i-1][j-1]);
                    
                    temp[i][j] = min2+1;
                    
                }
                
            }
            System.out.println();
        }
         printing(temp);
       
         int max=0;
         for(int i=0;i<temp.length;i++)
         {
             for(int j=0;j<temp[0].length;j++)
             {
                 if(max<temp[i][j])
                 {
                	 max=temp[i][j];
                 }
             }
             
         }
         
        return max; 
    }
    public static int minimum(int a,int b)
    {
        if(a<=b)
        {
            return a;
        }
        if(a>=b)
        {
            return b;
        }
        return 0;
    }
	public static void main(String[] args) {
		//int mat1[][]={{1,1,0,1},{1,1,0,1},{1,1,1,1}};
		int mat1[][]={{0,0,1,1,1},{1,0,1,1,1},{0,1,1,1,1},{1,0,1,1,1}};
		printing(mat1);
		System.out.println("hiiiiii");
		System.out.println(solution(mat1));
	}
}
