
public class Method_Overload {

	public static void main(String[] args) {
		Test t=new Test();
		t.m(); //method call......exact match is searched by the compiler
		t.m(56);
		t.m(67.87);
		t.m('a');
		t.m(10l);
	}

}

class Test
{
	public void m()
	{
		System.out.println("No Arguments");
	}
	public void m(int i)
	{
		System.out.println("Integer Arguments");
	}
	public void m(double d)
	{
		System.out.println("Double Arguments");
	}
}