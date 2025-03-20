import java.io.*;

public class TestAll {

	public static void main(String[] args)
	{
		int count = 0;
		int expectedCount = 3;
		try
		{
			System.out.println("Starting...");
			File file = new File("_gradingLog.txt");
			if(file.exists())
			{
				file.delete();
			}
			FileWriter fw = new FileWriter(file,true);
			PrintWriter out = new PrintWriter(fw,true);	
			
			if(TestPoint.tests(out)) count++;
			if(TestRightTriangle.tests(out)) count++;
			if(TestLongInteger.tests(out)) count++;
		
			
			out.close();
			out = new PrintWriter("tmp.txt");	
	        if (count==expectedCount) out.print("PASSED");
	        else {
	        	out.print("FAILED!!!");
	        }
	        out.close();
			System.out.println("Testing complete. See results in file \"_gradingLog.txt\"");
		}
		catch (IOException e)
		{
			System.out.println("File IO troubles"+ e.getMessage());
		}
	}
}
