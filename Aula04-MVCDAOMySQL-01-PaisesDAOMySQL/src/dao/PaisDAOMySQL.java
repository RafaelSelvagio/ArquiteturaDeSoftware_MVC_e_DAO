package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pais;

public class PaisDAOMySQL {
    // URL de conexão com o banco de dados MySQL
    private final String URL = "jdbc:mysql://localhost:3306/PrimeiroBanco";
    private final String USUARIO = "root";
    private final String SENHA = "aluno";

    // Método para obter a lista de países (nome, capital)
    public List<Pais> listarPaises() {
        List<Pais> listaDePaises = new ArrayList<>();

        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "SELECT nome, capital FROM pais";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        String nome = rs.getString("nome");
                        String capital = rs.getString("capital");
                        Pais pais = new Pais(nome, capital);
                        listaDePaises.add(pais);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDePaises;
    }
}
