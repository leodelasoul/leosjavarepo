package sortPackage;


public class LongestCommonSubString {
	
	static String [][] lengthLCS(String X,String Y){
        int m = X.length();
        int n = Y.length();
		String[][] b = new String[m+1][n+1];
		int [][] c = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++)
			c[i][0] = 0;
		for(int j=0; j<=n; j++)
			c[0][j] = 0;
		
		for (int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(X.charAt(i-1)==Y.charAt(j-1)){
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]="links oben";
				}
				else if (c[i-1][j] >= c[i][j-1]){
					c[i][j]=c[i-1][j];
					b[i][j]="oben";
				}
				else{
					c[i][j]=c[i][j-1];
					b[i][j]="links";
				}
			}
		}
				
		return b;	
	}
	
	static void printLCS(String [][] b, String X,int i,int j){
		if (i==0 || j==0)
			return;
		if (b[i][j]=="links oben"){
			printLCS(b,X,i-1,j-1);
			System.out.print(X.charAt(i-1));
		}
		else if (b[i][j]=="oben"){
			printLCS(b,X,i-1,j);
		}
		else
			printLCS(b,X,i,j-1);
	}

	public static void main(String[] args) {
		String X = "AGATTACCCAA";
		String Y = "GCATTGGAGCATG";

		String b[][] = lengthLCS(X, Y);
		
		System.out.print("LCS of \"" + X + "\" and \"" + Y + "\" is \"");
		printLCS(b, X, X.length(), Y.length());
		System.out.print("\"");
	}
}

