package simpleinterpreter.domain;

import java.util.Map;

public class Minus extends CompositeExpression{

    public Minus(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }
		
    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
    
}
