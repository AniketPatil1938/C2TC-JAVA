import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		
	List<Integer> ol=List.of(13,78,67,88,54,90,8,73,24,0,91,98);
	System.out.println(ol);
	
//	List<Integer> el=new ArrayList<>();
//	for (Integer i:ol)
//	{
//		if(i%2==0)
//		{
//			el.add(i);
//		}
//	}
//	System.out.println(el);
	
	
	
	
	Stream<Integer> stream=ol.stream();
	List<Integer> evenlist=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(evenlist);
	
	}
	
}
