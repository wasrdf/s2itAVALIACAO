package br.com.s2it;

public class ExercicioCalcularC {
	
	 public static int calcularC(String a, String b) {
		 
		 
	        if (a == null || b == null) {
	            return -2; 
	        }
	        System.out.println("VALOR DE A:" + a + " VALOR DE B: " + b);
	        String c = "";
	        int maior = Math.max(a.length(), b.length());
	        for (int i = 0; i <= maior; i++) {
	            if (i < a.length()) {
	                c += a.charAt(i);
	            }
	            if (i < b.length()) {
	                c += b.charAt(i);
	            }
	        }
	        
	        if(Integer.valueOf(c) < 1000000) {
	        	return Integer.valueOf(c);
	        } else {
	        	return -1;
	        }
	    }
	  

	    public static void main(String[] args) {
	    	
	    	System.out.println(calcularC("13", "2456"));
	    	
	    }
	
}
