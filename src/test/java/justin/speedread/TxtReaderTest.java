package justin.speedread;
import java.io.File;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TxtReaderTest {
	TxtReader txtReaderUnderTest;
	
	@Before
	public void init() {
		txtReaderUnderTest = new TxtReader();
		
	}
	@Test
	public void canReadTxt() {
		ArrayList<String> methodArray = new ArrayList<String>();
		
		File txtTestFile = new File("C:\\git\\SpeedReader\\ebooks\\txtTest.txt");
		methodArray = txtReaderUnderTest.readFile(txtTestFile);
		
		ArrayList<String> testArray = new ArrayList<String>();
		testArray.add("hi");
		testArray.add("hi2");
		testArray.add("hi3");
		
		
		//System.out.println(testArray.toString());
		
		Assert.assertEquals(testArray, methodArray);
	}
}
