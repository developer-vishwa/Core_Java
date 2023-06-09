import java.util.stream.Stream;

public class Filter_String {

	
	public static void main(String[] args) {
		

		String Emp[]= {"first","second","third"};
		
		Stream<String> Arr=Stream.of(Emp);
		
		
		Arr.forEach(e->{
			System.out.println(e);
			});
		
		
		
	}
}
