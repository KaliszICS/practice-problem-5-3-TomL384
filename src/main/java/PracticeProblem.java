/**
 * File Name: 5.3 add/remove array
 * Author: Tom Leung
 * Date Created: April 30, 2026
 * Date Last Edited: April 30, 2026
 */
public class PracticeProblem{
	public static void main(String[] args) {
	}
	
	public static String[] addString(String s1, String[] arr,int theindex){
	    String[] arr1 = new String[arr.length+1];
	    int exclude = 0;
	    for (int i2 = 0; i2 < arr1.length; i2++){
	        
	        if (i2 != theindex ){
	            arr1[i2] = arr[exclude];
	            exclude++;
	        }
	        
	        else{
	            arr1[i2] = s1;
	        }
	        
	    }
	    return arr1;
	}
	
	public static char[] removeChars(char[] arr, char c1){
	    int count = 0;
	    int exclude = 0;
	    for (int i1 = 0; i1 < arr.length; i1++){
	        if (arr[i1] == c1 ){
	            count++;
	        }
	    }
	    char[] arr1 = new char[arr.length - count];
	    for (int i2 = 0; i2 < arr.length; i2++){
	        if (arr[i2] != c1){
	            arr1[exclude] = arr[i2];
	            exclude++;
	        }
	    }
	    return arr1;
	}
	
	
}

