import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinkedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LinkedList myList = new LinkedList();
		myList.insertItem(10);
		myList.insertItem(5);
		assertEquals(2, myList.getListSize());
		//int ret_value = myList.deleteItem(19);
		//assertEquals(0, ret_value);
		//ret_value = myList.deleteItem(5); 
		//assertEquals(1, myList.getListSize());
	}

}
