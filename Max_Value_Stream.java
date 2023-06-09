import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Max_Value_Stream {

	
	public static void main(String[] args) {
		List<Integer> list=List.of(1,21,21,31,32,12);
		
		 OptionalInt  Final_List=list.stream().mapToInt(i->i).max(); 
	
		System.out.println(Final_List); 
		 
	}
}
