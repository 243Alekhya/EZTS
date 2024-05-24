package java1;

public class secondlar {
	    public static void main(String[] args) {
	        int[] Array={10,7,12,89,76};
	        int firstnum=Array[0],secondnum=-1;
	        for(int i=0;i<Array.length;i++){
	            if(firstnum<Array[i]){
	                firstnum=Array[i];
	            }
	        }
	        for(int i=0;i<Array.length;i++){
	            if(Array[i]>secondnum && Array[i]!=firstnum){
	                secondnum=Array[i];
	            }
	        }
	        // for(int i=0;i<Array.length;i++){
	        //     if()
	        // }
	        System.out.println("the largest number is:"+secondnum);
	    }
	}

