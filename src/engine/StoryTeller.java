package engine;

import engine.model.StoryTree;
import engine.model.Variants;

public class StoryTeller {
    private StoryTree story;
    private StoryTree current;

    public StoryTeller(StoryTree story) {
        this.story = story;
        current = story;
    }

    public StoryTree moveLeft(){
        current = current.getLeft();
        return current;
    }

    public StoryTree moveRight(){
        current = current.getRight();
        return current;
    }

    public Variants getVariants(){
        return current.getVariants();
    }

    public StoryTree back(){
        current = current.getParent();
        return current;
    }

    public StoryTree getStory() {
        return story;
    }

    public void setStory(StoryTree story) {
        this.story = story;
    }
}
