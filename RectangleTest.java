

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testPerimeter() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(3, 5);
		Point p4 = new Point(3, 0);
		
		Rectangle rect = new Rectangle(p1, p2, p3, p4);
		assertEquals(rect.perimeter(), 16);
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(3, 5);
		Point p4 = new Point(3, 0);
		
		Rectangle rect = new Rectangle(p1, p2, p3, p4);
		assertEquals(rect.area(), 15);
	}
	
	@Test
	void testIsRectangle() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(3, 5);
		Point p4 = new Point(3, 0);
		
		Rectangle rect = new Rectangle(p1, p2, p3, p4);
		assertEquals(rect.isRectangle(), true);
	}
	
	@Test
	void testIsSquare() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(3, 5);
		Point p4 = new Point(3, 0);
		
		Rectangle rect = new Rectangle(p1, p2, p3, p4);
		assertEquals(rect.isSquare(), false);
	}

}
