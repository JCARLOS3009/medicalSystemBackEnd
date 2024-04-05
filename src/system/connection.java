import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String user = "seu_usuario";
        String password = "sua_senha";
        
        // SQL para inserir dados
        String sql = "INSERT INTO sua_tabela (coluna1, coluna2) VALUES (?, ?)";

        try (
            // Estabelece conexão com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);
            
            // Cria uma declaração preparada para evitar injeção de SQL
            PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            // Define os valores dos parâmetros da declaração preparada
            statement.setString(1, "valor_coluna1");
            statement.setString(2, "valor_coluna2");

            // Executa a declaração SQL para inserir os dados
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Os dados foram inseridos com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao tentar conectar ao banco de dados:");
            e.printStackTrace();
        }
    }
}
