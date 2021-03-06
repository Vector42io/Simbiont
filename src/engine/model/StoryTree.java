package engine.model;

public class StoryTree {
    private String body;
    private String name;
    private StoryTree left;
    private StoryTree right;
    private StoryTree parent;

    public StoryTree() { }

    public StoryTree getParent() {
        return parent;
    }

    public void setParent(StoryTree parent) {
        this.parent = parent;
    }

    public Variants getVariants() {
        if (hasVariants()){
            return new Variants(left.getName(), right.getName());
        }else {
            return null;
        }
    }

    public boolean hasVariants(){
        return left != null && right != null;
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

    public String toJson() {
        return "{" +
                "\"body\":\"" + body + '"' +
                ", \"name\":\"" + name + '"' +
                ", \"left\":" + (left != null ? left.toJson() : "" ) +
                ", \"right\":" + (right !=  null ? right.toJson() : "") +
                '}';
    }
}
