 public class SomeTasks {
 public static void main(final String[] args) { 
   final int length = args.length;
   final int STUDENT_NUMBER = 590850;
     if (length == 0) {
       System.out.println(STUDENT_NUMBER);
       return;
	 }
     if (length == 1) { 
	   final int N = Integer.parseInt(args[0]);
       long sum = 0;
         for (long i = 1; i <= N; i++) {
           long old_sum = i * (long) i;
	       sum = old_sum + sum;
             if (sum < old_sum) {
              System.err.println("Overflow at i = " + (i -1));
			 System.exit(1);
		     }
	     }
		 {		
		 System.out.println(sum);
	     }		
         return; 	  
	 }
	 if (length == 2) { 
	   final long x = Long.parseLong(args[0]);
       final long y = Long.parseLong(args[1]);
	     if (y > 0){
		   System.out.println(x/y);
		 }
	     else if (x > 0){
	       System.out.println(y/x);
		 }
	    else if (x <= 0 || y <= 0) { 
	      System.out.println((-x) + (-y));
	     }
	     return; 
	 }
     if (length == 3) {
	   final int a = Integer.parseInt(args[0]);
       final int b = Integer.parseInt(args[1]);
       final boolean c = Boolean.parseBoolean(args[2]);
         for (int i = a; i < b; i++) {
	       System.out.print(i+" ");
         }
         if (c == true) {
           System.out.println(b+ " " + b);
	     }
         else if (c == false) {
           System.out.println(b);
         }  
         return;
	 }
	 if (length == 4) {
       final int N = args.length;
       final String[] a  = new String[N];
       final int[] Len = new int [100];
	     for (int i = 0; i < N; i++) {
           a[i] = args[i]; 
		   Len[i] = a[i].length();
	     }
	     int min_length = Len[0];
           for (int i = 1; i < N; i++) {
		     if (Len[i] < min_length) min_length = Len[i];
	       }
		   for (int i = 0; i < N; i++) {
		     if (a[i].length() == min_length) 
		       System.out.println("\"" + a[i] + "\"");
	       }
		   return;
	 }
	 if (length >= 5){
       final int N = args.length;
       final int[] a = new int [N];
       boolean b = true;
         for (int i = 0; i < N; i++) {
           a[i] = Integer.parseInt(args[i]); } 
             int t = 0;
               for (int i = 0; i < N; i++) {
	             for (int j = i; j < N-1; j++) {
	               if (a[j+1]<a[i]) {
		             t = a[j+1];
		             a[j+1] = a[i];
		             a[i] = t;
	               }
	             }	 
	           }  
               for (int i = 0; i < N-1; i++) {
                 if ((a[i+1] - a[i]) != 1) {
	               b = false;
 	             }
               }
	           System.out.println(b);
               return;
			   }
  }
}
 
  
 
 
 
 
 
		
			 
			 
		 
		 
	
			 
		 
		
	
	
 
 

	
 
 
 
 
 
 
		 
		
	   
 
 
 
		
 
 
 

 
 
 



		
		
	 
     
   
     
     
  
