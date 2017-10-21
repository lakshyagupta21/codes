
import java.util.*;

import java.lang.*;

import java.io.*;



class Solution
{

	private static final int MOD = 1000000000+7;

	public static void main (String[] args) throws Exception

	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while(t-- != 0){

			long n = Long.parseLong(br.readLine());

			System.out.println(fib(n));

		}

	}
	
	private static long fib(long n){

		long arr[][] = {{1,1},{1,0}};

		power(arr,n+1);

		return arr[0][0];

	}

	private static void power(long arr[][],long n){

		if(n == 0 || n == 1){

			return;

		}

		long a[][] = {{1,1},{1,0}};

		power(arr,n/2);

		multiply(arr,arr);

		if(n % 2 != 0){

			multiply(arr,a);

		}

	}
 
	private static void multiply(long F[][], long M[][])
{

	  long x =  (((F[0][0]*M[0][0])% MOD) + (F[0][1]*M[1][0])%MOD);

	  long y =  (((F[0][0]*M[0][1])% MOD) + (F[0][1]*M[1][1])%MOD);

	  long z =  (((F[1][0]*M[0][0])% MOD) + (F[1][1]*M[1][0])%MOD);

	  long w =  (((F[1][0]*M[0][1])% MOD) + (F[1][1]*M[1][1])%MOD);

	 
 F[0][0] = x;

	  F[0][1] = y;

	  F[1][0] = z;

	  F[1][1] = w;

	}

}