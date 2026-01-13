package simpleinterpreter.domain;

import java.util.Map;
import java.util.Stack;

public class Evaluator {

    private final Expression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<Expression> expressionStack = new Stack<>();
        Expression right, left, subExpression;
        for (final String token : expression.split(" ")) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                expressionStack.push(new NumberLiteral(token));
            } else {
                switch (token) {
                    case "+":
                        right = expressionStack.pop();
                        left = expressionStack.pop();
                        subExpression = new Plus(left, right);
                        expressionStack.push(subExpression);
                        break;
                    case "-":
                        right = expressionStack.pop();
                        left = expressionStack.pop();
                        subExpression = new Minus(left, right);
                        expressionStack.push(subExpression);
                        break;
                    default:
                        expressionStack.push(new Variable(token));
                }

            }

        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret(final Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }

}
