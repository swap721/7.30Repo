
public class swiftVXI extends swiftVIDI
{
	int abc;
	public void basecolor()
	{
		System.out.println("basecolor is white");
	}
	public static void main(String[] args) {
		swiftVXI s1= new swiftVXI();
		s1.abc=244;
		System.out.println("value of abc:"+s1.abc);
		s1.mtype();
		s1.modeltype();s1.basecolor();
		s1.abc=789;
				System.out.println("abc:"+s1.abc);
	}
}
