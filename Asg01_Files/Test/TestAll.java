import java.io.*;

/**
 * @author Alexandra Vaschillo
 */

public class TestAll {
	public static void main(String[] args)
	{
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
			
			TestSwap.tests(out);
			TestCircleArea.tests(out);
			TestRestaurantBill.tests(out);
			TestInterestEarned.tests(out);
			
			out.close();
			System.out.println("\nTesting complete. See results in file \"_gradingLog.txt\"\n");
		}
		catch (IOException e)
		{
			System.out.println("File IO troubles"+ e.getMessage());
		}	

	}
}
