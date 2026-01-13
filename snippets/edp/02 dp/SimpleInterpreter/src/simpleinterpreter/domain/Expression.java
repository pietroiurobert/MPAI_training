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
public interface Expression {
    public int interpret(Map<String,Expression> context);
}
