package FlyweightDesignPattern.EmojiExample;

import java.util.HashMap;
import java.util.Map;

public class EmojiFactory {
    private static final Map<String,Emoji> cache = new HashMap<>();

    public static Emoji getEmoji(String type){
        if (!cache.containsKey(type)){
            switch (type){
                case "Heart" : cache.put("Heart",new HeartEmoji());
                case "Smile" : cache.put("Smile", new SmileEmoji());
            }
        }
        return cache.get(type);
    }
}
