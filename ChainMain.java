package javagit;

import java.util.*;


public class ChainMain {
	
	private static SeparateChainHashSet<Integer> hashList;
	
	private static int firstHashing = 1;
	//private static int secondHashing = 1;
	private static ChainMain mainObject;
	
	public static void main(String args []){
		
		
		hashList = new SeparateChainHashSet();
		mainObject = new ChainMain();
		
		while(firstHashing > 11){
		hashList.add(firstHashing);
		firstHashing++;
		}
		
		
		hashList.remove(firstHashing);
		
		System.out.println(hashList.size());
		System.out.println(hashList.toString());

		
		
	}

}
