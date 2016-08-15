
public class TestProj2 {

	public static void main(String args[])
	{
		System.out.println("Test2 has written");
		TestProj testProj = new TestProj();
		System.out.println(testProj.getTestPrintString());
		TestProj1 testProj1 = new TestProj1();
		System.out.println(testProj1.getTest1PrintString());
		System.out.println(getNewPrintString());
		
	}
	
	public static String getNewPrintString()
	{
		return "This is the new print string!";
	}
}
