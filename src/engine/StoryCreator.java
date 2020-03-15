package engine;

import engine.model.StoryTree;

public class StoryCreator {
    private StoryTree head;
    private StoryTree current;

    public StoryCreator() {}

    public StoryCreator(StoryTree head) {
        this.head = head;
        this.current = head;
    }

    public StoryTree back(){
        current = current.getParent();
        return current;
    }

    public StoryTree moveLeft(){
        current = current.getLeft();
        return current;
    }

    public StoryTree moveRight(){
        current = current.getRight();
        return current;
    }

    public StoryTree getHead() {
        return head;
    }

    public void setHead(StoryTree head) {
        this.head = head;
    }
}
