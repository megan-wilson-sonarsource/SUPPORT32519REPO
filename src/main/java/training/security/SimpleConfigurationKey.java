package training.security;

import java.util.List;
import java.util.ArrayList;

public class SimpleConfigurationKey {

    private String name;
    private String extname;
    private String store;
    public String value;
    private List<String> values = new ArrayList<String>();

    public String store(){
        return this.store;
    }
    public String name(){
        return this.name;
    }
    public String extName(){
        return this.extname;
    }
    public List values(){
        return this.values;
    }
}