     //Problem3-Java

    package tendemloop;
	import java.util.Scanner;
	public class Problem3{
	  
	    public static void main(String[] args)
	    {
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Value for n");
	        int n=sc.nextInt();
	        int m=1;
	        
	        for (int i=1 ;i<n;i++)
	        {
	        	System.out.print(m+" ");
	        	m=m+2;
	        }
	    }
	}



