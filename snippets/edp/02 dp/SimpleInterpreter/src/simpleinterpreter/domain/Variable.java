/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinterpreter.domain;

import java.util.Map;

/**
 *
 * @author null
 */
public class Variable extends TerminalExpression {

    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    public int interpret(final Map<String, Expression> variables) {
        if (null == variables.get(name)) {
            return 0;
        }
        return variables.get(name).interpret(variables);
    }

}
