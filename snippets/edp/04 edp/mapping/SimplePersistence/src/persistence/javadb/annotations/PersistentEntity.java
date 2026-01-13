/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.javadb.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import persistence.javadb.types.AttributeTypes;

/**
 *
 * @author null
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PersistentEntity {
     String name();
}
