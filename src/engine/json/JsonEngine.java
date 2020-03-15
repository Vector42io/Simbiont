package engine.json;

import engine.model.StoryTree;
import org.json.JSONObject;

public class JsonEngine {
    public static StoryTree getStoryFromJson(JSONObject object, StoryTree parent){
        if (object.isEmpty()){
            return null;
        }
        StoryTree response = new StoryTree();
        response.setBody(object.getString("body"));
        response.setName(object.getString("name"));
        response.setLeft(getStoryFromJson(
                object.getJSONObject("left"), response
                ));
        response.setRight(
                getStoryFromJson(object.getJSONObject("right"), response
                ));
        return response;
    }
}
