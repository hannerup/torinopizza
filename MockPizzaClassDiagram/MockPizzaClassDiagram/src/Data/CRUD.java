package Data;

public interface CRUD <T>{
    public boolean insert(T t);
    public boolean delete(T t);
    public T get(String Id);
    public T[] getAll();
    public boolean Update(T t);
}
