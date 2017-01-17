package eval;

import java.util.HashMap;

public class Environment {

    private final HashMap<String, SchemeValue> env = new HashMap<>();

    private final Environment parent;

    public Environment() {
        this(null);
    }

    public Environment(Environment parent) {
        this.parent = parent;
    }

    public SchemeValue getValue(String name) {
        if (this.env.containsKey(name)) {
            return this.env.get(name);
        } else if (this.parent != null) {
            return this.parent.getValue(name);
        } else {
            throw new RuntimeException("Name not found: " + name);
        }
    }

    public void putValue(String name, SchemeValue value) {
        this.env.put(name, value);
    }
}