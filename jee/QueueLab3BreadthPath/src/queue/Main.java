package queue;

/**
 * Main class of the Java program.
 */
public class Main {

	public static void main(String[] args) {

		// Test QueuePathFinder
		QueuePathFinder pf = new QueuePathFinder();

		System.out.println("Test QueuePathFinder");
		Maze maze;
		Path path;

		maze = new Maze(MazeSamples.SMAZE2);
		path = pf.findPath(maze);
		System.out.println(maze);
		System.out.println(path);

		maze = new Maze(MazeSamples.SMAZE3);
		path = pf.findPath(maze);
		System.out.println(maze);
		System.out.println(path);

		maze = new Maze(MazeSamples.SMAZE4);
		path = pf.findPath(maze);
		System.out.println(maze);
		System.out.println(path);
	}
}