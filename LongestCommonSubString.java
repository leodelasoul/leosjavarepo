package sortPackage;

import java.util.Arrays;

public class LongestCommonSubString {
	
	public static String[][] lengthLCS(String x, String y){
		
		int m = x.length();
		int n = y.length();
		
		int mStart = 0;
		int nStart = 0;
		
		for(int i = 1; i <= m; i++){
			mStart = i;
			
		}
		for(int i = 1; i <= n; i++){
			nStart = i;
			
		}
		
		//int xIdx = 0;
		//int yIdx = 0;
		
		String b [][] = new String [mStart][nStart];
		int c [][] = new int [m][n];
		for(int i = 1; i < m; i++){
			c[i][0] = 0;
			
		}
		for(int j = 1; j < n; j++){
			c[0][j] = 0;
			
		}
		for(int i = 1; i < m;i++){
			for(int j = 1; j < n; j++){
				if(i == j){
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = "links oben";
					
				}
				else if(c[i-1][j] >= c[i][j-1]){
					c[i][j] = c[i-1][j];
					b[i][j] = "oben";
				}
				else{
					c[i][j] = c[i][j-1];
					b[i][j] = "links";
				}
			}
			
		}
		return b;
	}
	
	public static void printLCS(String [][] b, String x, int i, int j){
		if(i == 0 || j == 0){
			return ;
		}
		if(b[i][j] == "links oben"){
			printLCS(b,x,i-1,j-1);
			System.out.println(x);
		}
		else if(b[i][j] == "oben")
			printLCS(b,x,i-1,j-1);
		else
			printLCS(b,x,i-1,j-1);
		
		
		}
	
	public static void main(String args []){
		String [][] a = lengthLCS("AGATTACCCAA","GCATTGGAGCATG");
		System.out.println(Arrays.toString(a));
		//(printLCS(a,);
	}
		
		
	}


