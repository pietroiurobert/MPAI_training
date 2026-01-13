/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmapfactory.domain;

/**
 *
 * @author null
 */
public class MountainFactory implements AbstractSquareFactory{

    @Override
    public MapSquare build() {
        return new MountainSquare();
    }
    
}
