package justin.speedread;
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
		methodArray = txtReaderUnderTest.readFile();
		
		ArrayList<String> testArray = new ArrayList<String>();
		Assert.assertEquals(testArray, methodArray);
	}
}
