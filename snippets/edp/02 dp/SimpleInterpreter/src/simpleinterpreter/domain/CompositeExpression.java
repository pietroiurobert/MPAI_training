package simpleinterpreter.domain;

public abstract class CompositeExpression implements Expression{
    
    protected Expression leftOperand;
    protected Expression rightOperand;

    public CompositeExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
    
    
}
