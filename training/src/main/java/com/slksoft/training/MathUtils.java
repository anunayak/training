package com.slksoft.training;
/**
 * 
 * @author Anuradha
 * @version 1.0
 * This is a simply utility class for mathematical operations.
 *
 */
public final class MathUtils {
	/**
	 * Constructors is made private so that this class cannot be instantiated!
	 */
	private MathUtils(){
		/**
		 * @param num Input for which you want to calculate
		 */
		
	}
	public static long factorial(int num){
		int sign=1;
		if(num<0){
			num=num*-1;
			sign=-1;
		}
		long f=1;
		for (int i=1;i<=num;i++){
			f*=i;
		}
		return f*sign;
	}
}
