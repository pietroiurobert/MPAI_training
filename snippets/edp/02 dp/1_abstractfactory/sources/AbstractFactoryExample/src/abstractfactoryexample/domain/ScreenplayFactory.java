/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample.domain;

/**
 *
 * @author null
 */
public class ScreenplayFactory implements AbstractStoryFactory{
     @Override
    public Story write(String title, String content) {
        Screenplay screenplay = new Screenplay(title, content);
        return screenplay;
    }
}
