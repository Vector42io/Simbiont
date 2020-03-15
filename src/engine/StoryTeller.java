package engine;

import engine.model.StoryTree;

public class StoryTeller {
    private StoryTree story;

    public StoryTeller(StoryTree story) {
        this.story = story;
    }

    public StoryTree getStory() {
        return story;
    }

    public void setStory(StoryTree story) {
        this.story = story;
    }
}
