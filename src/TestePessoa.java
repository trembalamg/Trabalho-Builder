public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa.PessoaBuilder("Caio").nomeDoMeio("Vitor").ultimoNome("Sousa").apelido("Caião").build();
		System.out.println(p);
	}
}