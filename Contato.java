package AgendaDeContatos;

public class Contato {

	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		
	}
	
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		System.out.println("*- toString -*");
		return "Nome: " + nome +
				"\nTelefone: " + telefone +
				"\nEmail: "+ email +
				"\n---------------------------------";
	}
	
	//Getter and Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
