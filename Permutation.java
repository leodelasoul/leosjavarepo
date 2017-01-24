import java.util.Arrays;

//https://de.wikipedia.org/wiki/Fehlstand


public class Permutation {
	
	private int [] p;
	private int n;
	
	
	public Permutation(){
		setN(20);
		this.p  = new int[n+1];
	}
	
	
	public void setN(int newN){
		this.n = newN;
		for(int i = 0; i < p.length; i++){
			p[i] = i;
			
		}
		
		
	}

	public int checkInversion(int[] p){
		int invCount = 0;
		int j = 1;
		for(int i = 0; i < p.length - 1; i++){
			j++;
			if(p[i] > p[j])
				invCount++;
		}
		return invCount;
	}
	
	/*
	public int getLehmerCode(){ 	
		//TODO
	}
	
	*/
	
	public int size(){
		int arrSize = 0;
		while(arrSize <= p.length){
			arrSize++ ;
			break;
		}
		return arrSize;
	}
	
	
	public String toString(int[] p){
		String str = Arrays.toString(p); 
		return str;
		 
	 }
	

}
