package Aula46;

public interface SqlDDl {

    void create(String query);
    void alter(String query);
    void drop(String query);

}
