import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1, 2,23, 42, 12, 11, 2);

		
		//Creating a stream  int
		Stream<Integer> Str = list.stream();
            
		//List<Integer> newlist = Str.filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> newlist1 = Str.filter(i->i>2).collect(Collectors.toList());
		System.out.println(newlist1);
		
//		
//		
//		
//		Stream<Integer> Str1 = list.stream();
//		List<Integer>  newlist2=  Str.filter(i->i==2).collect(Collectors.toList());
//
//
//		System.out.println(newlist2);
//		
//		
//		
		
		
		
//		List<String>  list1= List.of("vishwa","rohan","abhi");
//	
//		Stream<String> Str1 = list1.stream();
//		
//		List<String>  newlist1List=Str1.filter(i->)

		
		//using array 
		
		
		String Emp[]= {"first","second","third"};
		
		Stream<String> Arr=Stream.of(Emp);
		Arr.forEach(e->{
			System.out.println(e);
			});
	}

}
