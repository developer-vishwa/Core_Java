import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class String_Filter {
public static void main(String[] args) {
	
	
	
	List<String>  name=List.of("vishwa","dada","rohan");
	
	
	 List<String>  finalname= name.stream().filter(e-> e.startsWith("r")).collect(Collectors.toList());
System.out.println("Filter a Start Alpha with a :"+finalname);

}}
