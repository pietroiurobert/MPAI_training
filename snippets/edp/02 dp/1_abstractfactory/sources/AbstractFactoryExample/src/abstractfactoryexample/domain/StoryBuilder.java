/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample.domain;

/**
 *
 * @author null
 */
public class StoryBuilder {
    public void buildStory(AbstractStoryFactory factory){
        Story story = factory.write("some title", "some content");
        System.out.println(story.read());
    }
}
