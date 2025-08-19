//common  interface for read and delete as it requires ID
public interface Operations {
    void read(String id);
    void delete(String id);
}
