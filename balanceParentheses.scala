import scala.collection.mutable.Stack

def balance(chars: List[Char]): Boolean = { 
	def evalulateExpression(chars: List[Char], parentheses: Stack[Char]): Boolean = {
		if (chars.isEmpty) {
			if (parentheses.size == 0) true else false
		} else if (chars.head == '(') {
			parentheses.push(chars.head)
			evalulateExpression(chars.tail, parentheses)
		} else if (chars.head == ')') {
			if (parentheses.size <= 0) {
				false
			} else {
				parentheses.pop
				evalulateExpression(chars.tail, parentheses)
			}
		} else {
			evalulateExpression(chars.tail, parentheses)
		}
	}
	evalulateExpression(chars, Stack[Char]())
}
