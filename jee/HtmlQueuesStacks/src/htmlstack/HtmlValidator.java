package htmlstack;

import java.util.Queue;
import java.util.Stack;

/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {

	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {
		Stack<HtmlTag> isValid = new Stack<>();
		HtmlTag nextItem;
		boolean okLoop = true;
		while (okLoop) {
			nextItem = tags.remove();
			if (!nextItem.isSelfClosing())
				if (nextItem.openTag)
					isValid.push(nextItem);
				else if (!isValid.isEmpty())
					if (isValid.peek().matches(nextItem))
						isValid.pop();
					else
						okLoop = false;
				else {
					isValid = null;
					okLoop = false;
				}
			if (tags.isEmpty())
				okLoop = false;
		}
		return isValid;
	}
}