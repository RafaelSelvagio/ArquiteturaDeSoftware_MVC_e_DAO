package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoMySQL {
	public boolean testarConexao() {
        String url = "jdbc:mysql://127.0.0.1:3306/PrimeiroBanco";
        String usuario = "root";
        String senha = "aluno";

        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Se chegou até aqui sem erros, a conexão foi bem-sucedida
            System.out.println("Conexão bem-sucedida com o banco de dados MySQL.");

            // Não esqueça de fechar a conexão quando terminar de usá-la
            conexao.close();
            return true;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado. Verifique o driver no classpath.");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return false;
    }
}

