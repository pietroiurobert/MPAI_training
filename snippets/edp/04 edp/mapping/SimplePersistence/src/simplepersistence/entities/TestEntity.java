/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepersistence.entities;

import persistence.javadb.annotations.PersistentAttribute;
import persistence.javadb.annotations.PersistentEntity;
import persistence.javadb.types.AttributeTypes;

/**
 *
 * @author null
 */
@PersistentEntity(name="test")
public class TestEntity {

    public TestEntity(int id, String someField) {
        this.id = id;
        this.someField = someField;
    }

  
    
    @PersistentAttribute(type= AttributeTypes.INTEGER)
    public int id;
    
    @PersistentAttribute(type= AttributeTypes.VARCHAR)
    public String someField;
}
