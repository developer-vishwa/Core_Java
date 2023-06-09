import java.util.List;
import java.util.stream.*;

public class Map_Stream {

	
	
	public static void main(String[] args) {
		
			
			List<Integer> number=List.of(4,5,6,8,4,7,4);
			
			List<Integer> finalnumber=number.stream().map(i->i*i+i).collect(Collectors.toList());
		     
			System.out.println(finalnumber);
		
	}
}
