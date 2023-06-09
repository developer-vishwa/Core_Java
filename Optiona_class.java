import java.util.Optional;

public class Optiona_class {

	public static void main(String[] args) {
	
		String str= "abs";
		Optional<String> obj =Optional.ofNullable(null);
		
		//Value Present or Not
		System.out.println(obj.isPresent());
	
	    //System.out.println(obj.get());
	     
	    System.out.println("orElse: 1 "+obj.orElse("Value is not present"));  
	    System.out.println(obj.empty());
	    System.out.println(obj.filter((s)->s.equals("abs")));
	  
	}

}
