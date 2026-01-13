/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample.domain;

/**
 *
 * @author null
 */
public class NovelFactory implements AbstractStoryFactory{

    @Override
    public Story write(String title, String content) {
        Novel novel = new Novel(title, content);
        return novel;
    }
    
}
