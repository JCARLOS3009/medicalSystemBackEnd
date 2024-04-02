package system;

public class Paciente {
    private String ;
    private int idade;

    public Paciente(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    // Getters e setters para os atributos podem ser adicionados conforme necessário
}
