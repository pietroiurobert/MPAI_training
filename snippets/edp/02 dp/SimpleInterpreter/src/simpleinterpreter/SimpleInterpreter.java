package simpleinterpreter;

import java.util.HashMap;
import java.util.Map;
import simpleinterpreter.domain.Evaluator;
import simpleinterpreter.domain.Expression;
import simpleinterpreter.domain.NumberLiteral;

public class SimpleInterpreter {

    public static void main(String[] args) {
        final String expression = "x y z - +";
//        final String expression = "x y 1 - +";
//        String expression = "1 1 +";
        final Evaluator eval = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("x", new NumberLiteral(2));
        variables.put("y", new NumberLiteral(1));
        variables.put("z", new NumberLiteral(5));
        final int result = eval.interpret(variables);
        System.out.println(result);
    }

}
