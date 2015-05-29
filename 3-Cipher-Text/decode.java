import java.util.HashMap;

public class decode {
	
	public static void main(String[] args) {
		HashMap<String,String>cipher=new HashMap<String,String>();
		cipher.put("r","f");
		cipher.put("o","h");
		cipher.put("i","u");
		cipher.put("m","z");
		cipher.put("g","s");
		cipher.put("a","t");
		cipher.put("p","w");
		cipher.put("n","y");
		String word="wfhsftzzuys";
         decodeIt(word,cipher);
	}
	
    public static void decodeIt(String  word,HashMap<String,String> cipher ){
    	
    	String[] result=word.split("");
    	String word1 = "";
    	 for (String letters:result) {
    		for (String s : cipher.values()) {
  	               if (s.equals(letters)) {
  	            	   for(String key:cipher.keySet())
  	            		   if(cipher.get(key).equals(s))
            		    word1 += key;
                }
            }
        }
        System.out.println(word1);
        
    }
 }

