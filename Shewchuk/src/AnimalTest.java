
import org.junit.Test;
import static org.junit.Assert.*;



public class AnimalTest {
	
	@Test
	public void testEmpty(){
		Animal animal = new Animal();
		assertEquals(animal.isStringEmpty(""), true);
	}
	
	@Test
	public void testNotEmpty(){
		Animal animal = new Animal();
		assertEquals(animal.isStringEmpty("notempty"), false);
	}

}
