/* Name: Yikang Lin
* File: Main.java
* Desc:
*
* The main driver program for pre-course assignment
*
* This program implements binary search on integers
*/


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static boolean binaryIteration(int needle, int[] array) {
		int middlePosition=array.length/2;
		int lastPosition=array.length-1;
		int firstPosition=0;
		while(firstPosition<=lastPosition) {
			if(needle>array[middlePosition]) {
				firstPosition=middlePosition;
				middlePosition=(lastPosition-firstPosition)/2;
			}
			else {
				lastPosition=middlePosition;
				middlePosition=(lastPosition-firstPosition)/2;
			}
			if(array[middlePosition]==needle)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean binaryRecursion(int needle, int[] array) {
		
		return true;
	}

}
