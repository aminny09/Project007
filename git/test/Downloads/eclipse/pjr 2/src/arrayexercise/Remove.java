package arrayexercise;

public class Remove {
	public static void main(String []args) {
		 
		        int []x = {10,20,20,30,30,40,50,50};  
		        int z =x.length;  
		        z= removeDuplicateElements(x,z);    
		        for (int t=0; t<z; t=t+1) {  
		           System.out.print(x[t]+" ");  
		    }  
		}

	private static int removeDuplicateElements(int a[] , int b) {
	                              if(b==0||b==1) {    
		                           return b;
	                              }
	                              int[] d=new int[b];
		                           int j = 0;  
		                           for (int i=0; i<b-1; i=i+1)  
		                               if (a[i] != a[i+1])  
		                                   d[j=j+1] = a[i];  
		                                 
		                             
		                           d[j=j+1] = a[b-1];
		                          for(int r=0;r<j;r=r+1)
		                        	  a[j=j+1]=d[r];
		                        	 
		                           return j; 
	                              }
	 
}	

