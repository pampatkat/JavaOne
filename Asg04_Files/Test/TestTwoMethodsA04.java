import java.io.*;
import java.util.Scanner;

public class TestTwoMethodsA04 {

	/**
	 * A set of tests for numericPattern() method
	 */
	public static boolean testNumericPattern(PrintWriter outputStream) {

		int count = 0;
		int expectedCount = 4;

		outputStream.println("\r\n----numericPattern() Tests-------------------------------------------------------\r\n");

		if (A04Methods.numericPattern(1, true).equals("1") && A04Methods.numericPattern(1, false).equals("1")) {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 01 - pattern of size 1", "PASSED");
			count++;
		} else {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 01 - pattern of size 1", "FAILED");
		}

		// --- Test 2 ---//

		if (A04Methods.numericPattern(5, false).equals("543212345")
				&& A04Methods.numericPattern(6, true).equals("12345654321")) {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 02 - pattern of given positive size", "PASSED");
			count++;

		} else {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 02 - pattern of given positive size", "FAILED");
		}

		// --- Test 3 ---//
		try {
			A04Methods.numericPattern(0, false);
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - size 0",
					"FAILED");
		} catch (IllegalArgumentException e) {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - size 0",
					"PASSED");
			count++;
		}
		// --- Test 4 ---//
		try {
			A04Methods.numericPattern(-55, false);
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - negative size",
					"FAILED");
		} catch (IllegalArgumentException e) {
			outputStream.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - negative size",
					"PASSED");
			count++;
		}
		outputStream.print("\r\n++++ 4 Tests of numericPattern() method COMPLETE +++++++++++++++++++++++++++\r\n");
		
		if (count == expectedCount)
			return true;
		else
			return false;
	}

	public static boolean testFileAnalysis(PrintWriter outputStream) {

		int count = 0;
		int expectedCount = 7;
		outputStream.println("\r\n----fileAnalysis() Tests-------------------------------------------------------\r\n");

		Integer[] testIn1 = {};
		String[] testOut1 = { "Numeric data file \"testCaseIn1.txt\" is empty" };
		Integer[] testIn2 = { 0 };
		String[] testOut2 = { "Numeric data file \"testCaseIn2.txt\" has only one number: 0" };
		Integer[] testIn3 = { 0, 0 };
		String[] testOut3 = { "Numeric Data File \"testCaseIn3.txt\" Analysis", "Number of integers: 2",
				"The sum of all integers in file: 0", "The largest integer in the set: 0",
				"The smallest integer in the set: 0" };
		Integer[] testIn4 = { 33, 1, 0, 2 };
		String[] testOut4 = { "Numeric Data File \"testCaseIn4.txt\" Analysis", "Number of integers: 4",
				"The sum of all integers in file: 36", "The largest integer in the set: 33",
				"The smallest integer in the set: 0" };
		Integer[] testIn5 = { Integer.MAX_VALUE, Integer.MAX_VALUE };
		String[] testOut5 = { "Numeric Data File \"testCaseIn5.txt\" Analysis", "Number of integers: 2",
				"The sum of all integers in file: -2", "The largest integer in the set: 2147483647",
				"The smallest integer in the set: 2147483647" };
		Integer[] testIn6 = { Integer.MIN_VALUE, Integer.MAX_VALUE };
		String[] testOut6 = { "Numeric Data File \"testCaseIn6.txt\" Analysis", "Number of integers: 2",
				"The sum of all integers in file: -1", "The largest integer in the set: 2147483647",
				"The smallest integer in the set: -2147483648" };

		try {
			// --- Test 1 ---//
			// building test case files
			buildTestFile("testCaseIn1.txt", testIn1);
			buildTestFile("testCaseOut1.txt", testOut1);

			// calling method
			A04Methods.fileAnalysis("testCaseIn1.txt", "test01.txt");

			// comparing resulting files

			if (areEqualFiles("testCaseOut1.txt", "test01.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 01 - empty input file", "PASSED");
				count++;

			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 01 - empty input file", "FAILED");
			}

			// --- Test 2 ---//
			buildTestFile("testCaseIn2.txt", testIn2);
			buildTestFile("testCaseOut2.txt", testOut2);

			A04Methods.fileAnalysis("testCaseIn2.txt", "test02.txt");

			if (areEqualFiles("testCaseOut2.txt", "test02.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 02 - one number in input file", "PASSED");
				count++;

			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 02 - one number in input file", "FAILED");
			}

			// --- Test 3 ---//
			buildTestFile("testCaseIn3.txt", testIn3);
			buildTestFile("testCaseOut3.txt", testOut3);

			A04Methods.fileAnalysis("testCaseIn3.txt", "test03.txt");

			if (areEqualFiles("testCaseOut3.txt", "test03.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 03 - two zeros in input file", "PASSED");
				count++;

			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 03 - two zeros in input file", "FAILED");
			}

			// --- Test 4 ---//
			buildTestFile("testCaseIn4.txt", testIn4);
			buildTestFile("testCaseOut4.txt", testOut4);

			A04Methods.fileAnalysis("testCaseIn4.txt", "test04.txt");

			if (areEqualFiles("testCaseOut4.txt", "test04.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 04 - simple set of values", "PASSED");
				count++;

			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 04 - simple set of values", "FAILED");
			}

			// --- Test 5 ---//
			buildTestFile("testCaseIn5.txt", testIn5);
			buildTestFile("testCaseOut5.txt", testOut5);

			A04Methods.fileAnalysis("testCaseIn5.txt", "test05.txt");

			if (areEqualFiles("testCaseOut5.txt", "test05.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 05 - MAX_VALUEs in file", "PASSED");
				count++;

			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 05 - MAX_VALUEs in file", "FAILED");
			}

			// --- Test 6 ---//
			buildTestFile("testCaseIn6.txt", testIn6);
			buildTestFile("testCaseOut6.txt", testOut6);

			A04Methods.fileAnalysis("testCaseIn6.txt", "test06.txt");

			if (areEqualFiles("testCaseOut6.txt", "test06.txt")) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 06 - MIN_VALUE & MAX_VALUE in file", "PASSED");
				count++;
			} else {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 06 - MIN_VALUE & MAX_VALUE in file", "FAILED");
			}

			// --- Test 7 ---//
			// Test on exception(s) that your method is supposed to throw
			try
			{
				A04Methods.fileAnalysis("doesNotExist.txt", "test07.txt");
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 07 - IOException", "FAILED");
			}
			catch (FileNotFoundException e) {
				outputStream.printf("%-80s%-10s\n", "fileAnalysis() TEST 07 - IOException", "PASSED");
				count++;
			} 
		}
		catch (IOException e) {
			outputStream.printf("FAIL: Unexpected IOException. fileAnalysis() may not be implemented yet");
		}
		
		outputStream.print("\r\n++++ 7 Tests of fileAnalysis() method COMPLETE +++++++++++++++++++++++++++\r\n");		
		if (count == expectedCount)
			return true;
		else
			return false;
	}

	/**
	 * Builds a file with a given name with a content defined by an array of objects
	 * that are printed to the file as strings, one string per line
	 * 
	 * @param fileName name of file to write to
	 * @param testCase array of objects to print into file in string format
	 * @throws IOException throws exception when file fails to open for writing or
	 *                     writing fails
	 */
	public static void buildTestFile(String fileName, Object[] testCase) throws IOException {
		FileWriter file = new FileWriter(fileName);
		PrintWriter outputFile = new PrintWriter(file);

		for (Object a : testCase) {
			outputFile.println(a);
		}
		outputFile.close();
	}

	/**
	 * Compares content of two files and returns true if content is identical, false
	 * if not
	 * 
	 * @param fileName1 name of first file to be compared
	 * @param fileName2 name of second file to be compared
	 * @return true if the files are identical, false if not
	 * @throws IOException thrown when files fail to open for reading / writing
	 */
	public static boolean areEqualFiles(String fileName1, String fileName2) throws IOException {
		FileReader file1 = new FileReader(fileName1);
		FileReader file2 = new FileReader(fileName2);
		Scanner input1 = new Scanner(file1);
		Scanner input2 = new Scanner(file2);
		while (input1.hasNext() && input2.hasNext()) {
			String s1 = input1.nextLine().trim();
			String s2 = input2.nextLine().trim();
			if (!s1.equals(s2)) {
				input1.close();
				input2.close();
				return false;
			}
		}
		boolean res;
		if (!input1.hasNext() && !input2.hasNext())
			res = true;
		else
			res = false;
		input1.close();
		input2.close();
		return res;

	}

}
