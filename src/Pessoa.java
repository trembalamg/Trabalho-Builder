public class Pessoa {
	private String nome;
	private String ultimoNome;
	private String nomeDoMeio;
	private String apelido;

	private Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido) {
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.nomeDoMeio = nomeDoMeio;
		this.apelido = apelido;
	}

	@Override
	public String toString() {
		return "Pessoa: \n" + "Nome: " + nome + '\n' + "Nome do Meio: " + nomeDoMeio + '\n' + "Ultimo Nome: "
				+ ultimoNome + '\n' + "Apelido: " + apelido + '\n';
	}

	public static class PessoaBuilder {
		private String nome;
		private String ultimoNome;
		private String nomeDoMeio;
		private String apelido;

		public PessoaBuilder(String nome) {
			this.nome = nome;
		}

		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PessoaBuilder ultimoNome(String ultimoNome) {
			this.ultimoNome = ultimoNome;
			return this;
		}

		public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
			this.nomeDoMeio = nomeDoMeio;
			return this;
		}

		public PessoaBuilder apelido(String apelido) {
			this.apelido = apelido;
			return this;
		}

		public Pessoa build() {
			return new Pessoa(nome, ultimoNome, nomeDoMeio, apelido);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
