package model;

public class StoryTree {
    private String body;
    private String name;
    private StoryTree left;
    private StoryTree right;

    public StoryTree() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoryTree getLeft() {
        return left;
    }

    public void setLeft(StoryTree left) {
        this.left = left;
    }

    public StoryTree getRight() {
        return right;
    }

    public void setRight(StoryTree right) {
        this.right = right;
    }
}
