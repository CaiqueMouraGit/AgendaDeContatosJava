package AgendaDeContatos;

import java.util.Scanner;

public class GerenciadorContatos {

	private Contato[] contatos;
	private int numTotalContatos = 0;

	public GerenciadorContatos(int t) {

		System.out.println("Lista criada: " + t + " elementos");
		System.out.println("===============================");

		contatos = new Contato[t];

		// Instanciando contatos
		for (int i = 0; i < contatos.length; i++) {
			contatos[i] = new Contato();
		}
	}

	public Contato criarContato() {

		System.out.println("Criando um contato");
		System.out.println("===============================");

		System.out.println("Nome: ");
		String nome = scanner().next();
		System.out.println("Telefone: ");
		String telefone = scanner().next();
		System.out.println("Email: ");
		String email = scanner().next();

		Contato contato = new Contato(nome, telefone, email);
		return contato;
	}

	public void adicionarContato() {

		System.out.println("Adicionando contatos na lista");
		System.out.println("===============================");

		contatos[numTotalContatos] = criarContato();
		numTotalContatos++;

	}

	public void mostrarContato() {

		System.out.println("Mostrar contato da lista");
		System.out.println("===============================");

		int totalContatos = 0;

		for (int i = 0; i < numTotalContatos; i++) {

			if (contatos[i].getNome() != null) {

				System.out.println(contatos[i].toString());
			} 
			else {
				totalContatos++;
			}			
		}
		if (totalContatos == numTotalContatos) {

			System.out.println("Você ainda não tem contatos adicionados");
		}
	}

	public void buscarContato(String nome) {

		System.out.println("Buscar contato");
		System.out.println("===============================");

		for (int i = 0; i < contatos.length; i++) {

			if (contatos[i].getNome().equals(nome)) {

				System.out.println(contatos[i].toString());
				return;
			}
		}
		System.out.println("Nome não encontrado ");
	}

	public void apagarContato(String nome) {

		System.out.println("Apagar contato");
		System.out.println("===============================");

		for (int i = 0; i < numTotalContatos; i++) {

			if (contatos[i].getNome().equals(nome)) {

				contatos[i] = new Contato();

				System.out.println("Nome removido do vetor.");
				return;
			}
		}

		System.out.println("Nome não encontrado ");
	}

	public Scanner scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}

}
