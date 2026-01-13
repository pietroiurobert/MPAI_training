package simpleinterpreter.domain;

import java.util.Map;

public class Plus extends CompositeExpression {

    public Plus(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }

}
