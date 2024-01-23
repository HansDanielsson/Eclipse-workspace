/**
 * Class MazePath represents a path through a maze 
 * composed of a doubly-linked list of MazeSteps (positions)
 * 
 * @author Raquel M. Crespo-Garcia <rcrespo@it.uc3m.es>
 */

package root;

public class Path {
	/** First position in the path */
	private PathStep first;

	/** Last position in the path */
	private PathStep last;

	/**
	 * Initializes empty path
	 */
	public Path() {
		this.first = null;
		this.last = null;
	}

	/**
	 * Insert the given coordinates as a new step in the first position of the path
	 */
	public void insertFirst(int row, int col) {
		// Learning concepts:
		// Insert first element in doubly linked list
		PathStep newNode = new PathStep(row, col, first, null);
		if (first != null) {
			first.setPrev(newNode);
		}
		first = newNode;
		if (last == null) {
			last = newNode;
		}
	}

	/**
	 * Insert the given coordinates as a new step in the last position of the path
	 */
	public void insertLast(int row, int col) {
		// Learning concepts:
		// Insert last element in doubly linked list
		PathStep newNode = new PathStep(row, col, null, last);
		if (last != null) {
			last.setNext(newNode);
		}
		last = newNode;
		if (first == null) {
			first = newNode;
		}
	}

	/**
	 * Returns the coordinates of the first step in the path and removes it from the
	 * path. If the Path is empty, returns null.
	 */
	public int[] extractFirst() {
		// Learning concepts:
		// Extract first element of doubly linked list
		int[] result = null;
		if (first != null) {
			result = new int[] { first.getRow(), first.getCol() };
			first = first.getNext();
			if (first == null) {
				last = null;
			} else {
				first.setPrev(null);
			}
		}
		return result;
	}

	/**
	 * Returns the coordinates of the last step in the path and removes it from the
	 * path. If the Path is empty, returns null.
	 */
	public int[] extractLast() {
		// Learning concepts:
		// Extract last element of doubly linked list
		int[] result = null;
		if (last != null) {
			result = new int[] { last.getRow(), last.getCol() };
			last = last.getPrev();
			if (last == null) {
				first = null;
			} else {
				last.setNext(null);
			}
		}
		return result;
	}

	/**
	 * Returns a String based representation of the Path. If the Path is empty,
	 * returns an empty String ("") If the Path is not empty, returns an String with
	 * the format: (row1, col1), (row2, col2), ..., (rowN, colN)
	 */
	public String toString() {

		String sPath = "";

		// Traverse a linked list concatenating the coordinates of each step.
		// Recommendation: use the toString method in the PathStep class to get the
		// "(row, col)" String corresponding to the pair of coordinates of each step.

		// Learning concepts:
		// traverse a linked list
		// Important: the Path must not be modified by the method!
		PathStep current = first;
		while (current != null) {
			sPath += current.toString();
			current = current.getNext();
		}
		return sPath;
	}
}