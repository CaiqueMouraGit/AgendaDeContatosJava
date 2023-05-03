package AgendaDeContatos;

public class AgendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GerenciadorContatos agendaContatos = new GerenciadorContatos(50);

		Boolean rodandoBoolean = true;
		String nome;
		
		while (rodandoBoolean) {
			System.out.println("---------------------");
			System.out.println("Agenda de contatos \n"
					+ "\n1 - Adicionar contatos"
					+ "\n2 - Mostrar contatos"
					+ "\n3 - Apagar contatos"
					+ "\n4 - Buscar contatos"
					+ "\n5 - sair");

			System.out.print("\nDigite sua opção: ");
			int i = agendaContatos.scanner().nextInt();

			switch (i) {
			case 1:
				agendaContatos.adicionarContato();
				break;

			case 2:
				agendaContatos.mostrarContato();
				break;

			case 3:
				System.out.println("Digite o nome do contato para apaga-lo: ");
				nome = agendaContatos.scanner().next();
				agendaContatos.apagarContato(nome);
				break;

			case 4:
				System.out.println("Digite o nome do contato para busca-lo: ");
				nome = agendaContatos.scanner().next();
				agendaContatos.buscarContato(nome);
				break;

			case 5:
				rodandoBoolean = false;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
			
			
			
		}
	}
}
