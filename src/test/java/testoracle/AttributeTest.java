package testoracle;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class AttributeTest {

	@Test
	public void testAttribute() {
		Attribute a = new Attribute("Tot", "a&p");
		assertEquals("Tot", a.getKey());
		assertEquals("a&p", a.getValue());
	}
	
	@Test
	public void testSetKey() {
		Attribute a = new Attribute("Tot", "a&p");
		a.setKey("Hello");
		assertEquals("Hello", a.getKey());
		assertEquals("a&p", a.getValue());
	}
	
	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testHtml() {
		fail("Not yet implemented");
	}

	@Test
	public void testHtmlAppendableOutputSettings() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateFromEncoded() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsDataAttribute() {
		fail("Not yet implemented");
	}

	@Test
	public void testShouldCollapseAttribute() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsBooleanAttribute() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

}
