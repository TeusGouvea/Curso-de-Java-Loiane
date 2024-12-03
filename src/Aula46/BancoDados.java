package Aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDl {

    void abrirConexao();
    void fecharConexao();

}
