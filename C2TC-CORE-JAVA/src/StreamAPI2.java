import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAPI2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(80);
		marks.add(67);
		marks.add(87);
		marks.add(32);
		marks.add(1);
		marks.add(0);
		marks.add(100);
		marks.add(120);
		marks.add(60);
		marks.add(90);
		
		System.out.println(marks);
		
		ArrayList<Integer> updatedmarks=(ArrayList<Integer>)marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedmarks);
		
		long fialedstudents=updatedmarks.stream().filter(i->i<33).count();
		System.out.println(fialedstudents);
	}

}
