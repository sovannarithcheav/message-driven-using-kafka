package info.sovannarith.userservice.engine;

import javax.annotation.PostConstruct;
import java.util.HashMap;

public class InternalStorage {

    public static HashMap<String, String> MAP;

    @PostConstruct
    public void init() {
        MAP = new HashMap<>();
    }

}
