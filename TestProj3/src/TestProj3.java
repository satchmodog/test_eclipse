
public class TestProj3 {

	public static void main(String[] args) 
	{
		System.out.println("This is TestProj3.");
		TestProj2 newTest2 = new TestProj2();
		TestProj newTestProj = new TestProj();
		
		System.out.println(newTest2.getNewPrintString());
		System.out.println(newTestProj.getTestPrintString());
	}

}
