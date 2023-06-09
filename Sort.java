import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	
	public static void main(String[] args) {
		
	List<Integer> list=List.of(12,21,223,12,323,121,12);
	
	List<Integer> finallist=list.stream().sorted().collect(Collectors.toList());
		
	System.out.println(finallist);
	
	
	}
}
