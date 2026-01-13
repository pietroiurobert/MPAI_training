package simpleinterpreter.domain;

import java.util.Map;

public class NumberLiteral extends TerminalExpression{

    private final int number;

    public NumberLiteral(final String representation) {
        this.number = Integer.parseInt(representation);
    }

    public NumberLiteral(int number) {
        this.number = number;
    }
    
    @Override
    public int interpret(Map<String, Expression> context) {
        return number;
    }

}
