/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package di.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author null
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Injectable {
     String repositoryKey() default "[unassigned]";
}
