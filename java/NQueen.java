import java.util.Scanner;
import java.math.*;
public class NQueen {
	public static int[][] board;
	public static int n;
	public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
		board=new int[n][n];
		place(0);
		System.out.println("\nFinal Matrix is :");
		print();
	}
	public static boolean place(int row)
	{
		System.out.println("Matrix Received:");print();

		for(int i=0;i<n;i++)
		{
			if(board[row][i]<=-1) continue;
			place1(row,i);
			if((row+1)==n) return true;//last queen
			if(!isNextRowVacant(row+1))
			{
				System.out.println("Row "+row+" is being unplaced");
				if(row!=0)
				unplace(row);
				continue;
			}
			if(place(row+1))
				return true;
			else {
				unplace(row);continue;}
		}
		return false;
	}
	public static void place1(int i,int j)//gives all negative values in matrix 
	{
		board[i][j]=i+1;
		for(int c=0;c<n;c++)//elements in row put to -1
		{
			if(c!=j)
			board[i][c]-=1;
			if(c!=i)
				board[c][j]-=1;
		}
		int t=1;
		while(t<n)
		{
			if(i-t>-1&&j-t>-1)
			{
				board[i-t][j-t]-=1;
			}
			if(i+t<n&&j+t<n)
			{
				board[i+t][j+t]-=1;
			}
			if(i-t>-1&& j+t<n)
			{
				board[i-t][j+t]-=1;
			}
			if(i+t<n&&j-t>-1)
			{
				board[i+t][j-t]-=1;
			}
			++t;
		}
		System.out.println("After Placing negative values in row "+i);
		print();
	   	
	}
	public static void unplace(int row)
	{
		System.out.println("Unplace is called");
		int i1=row,j1=0;
			for(j1=0;j1<n;j1++)
				if(board[row][j1]==row+1)
					break;
		board[row][j1]=0;
		for(int c=0;c<n;c++)//elements in row put to -1
		{
			if(c!=j1&&board[i1][c]<=-1)
			board[i1][c]+=1;
			if(c!=i1&&board[c][j1]<=-1)
				board[c][j1]+=1;
		}
		int t=1;
		while(t<n)
		{
			if(i1-t>-1&&j1-t>-1)
			{
				if(board[i1-t][j1-t]<=-1)
				board[i1-t][j1-t]+=1;
			}
			if(i1+t<n&&j1+t<n)
			{
				if(board[i1+t][j1+t]<=-1)
				board[i1+t][j1+t]+=1;
			}
			if(i1-t>-1&& j1+t<n)
			{
				if(board[i1-t][j1+t]<=-1)
				board[i1-t][j1+t]+=1;
			}
			if(i1+t<n&&j1-t>-1)
			{
				if(board[i1+t][j1-t]<=-1)
				board[i1+t][j1-t]+=1;
			}
			++t;
		}
		System.out.println("After Unplacing row"+row);
		print();
	   	
	}
	
	public static boolean isNextRowVacant(int row)
	{
		int c=0;
		for(int j=0;j<n;j++)
		{
			if(board[row][j]<=-1)
				++c;
		}
		if(c==4)
			return false;
		else return true;
	}
	public static void print()
	{
		for(int i1=0;i1<n;i1++)
		{
			for(int j1=0;j1<n;j1++)
				System.out.print(board[i1][j1]+" ");
			System.out.println();
		}
		System.out.println();
	}
}
