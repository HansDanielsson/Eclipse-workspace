package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import singlylinkedlist.SinglyLinkedList;

class SinglyLinkedListTest {

	private SinglyLinkedList<Integer> li;

	@BeforeEach
	void setUp() throws Exception {
		li = new SinglyLinkedList<>();
		assertNotNull(li);
	}

	@Test
	void testAddToFront() {
		li.addToFront(4);
		li.addToFront(3);
		li.addToFront(2);
		assertEquals(2, li.removeFromFront());
		assertEquals(4, li.removeFromBack());
		assertEquals(3, li.removeFromFront());
	}

	@Test
	void testAddToBack() {
		li.addToBack(10);
		li.addToBack(11);
		li.addToBack(12);
		assertEquals(12, li.removeFromBack());
		assertEquals(10, li.removeFromFront());
		assertEquals(11, li.removeFromBack());
	}

	@Test
	void testRemoveFromFront() {
		li.addToFront(10);
		li.addToFront(11);
		li.addToFront(12);
		assertEquals(12, li.removeFromFront());
		assertEquals(11, li.removeFromFront());
		assertEquals(10, li.removeFromFront());
	}

	@Test
	void testRemoveFromBack() {
		li.addToFront(10);
		li.addToFront(11);
		li.addToFront(12);
		assertEquals(10, li.removeFromBack());
		assertEquals(11, li.removeFromBack());
		assertEquals(12, li.removeFromBack());
	}
}
