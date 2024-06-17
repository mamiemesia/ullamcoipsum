import java.util.HashMap;
import java.util.Map;

public class ExplicitKeyRepository {
    private Map<String, String> keys;

    public ExplicitKeyRepository() {
        this.keys = new HashMap<>();
    }

    public void addKey(String keyId, String keyValue) {
        keys.put(keyId, keyValue);
    }

    public String getKey(String keyId) {
        return keys.get(keyId);
    }

    public void removeKey(String keyId) {
        keys.remove(keyId);
    }
}
