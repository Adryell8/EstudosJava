package pooAtividades.Domain.CadastroSimplesSeminario;

public class ProfessorSeminario {
	private String nome;
	private String especializacao;
	private Seminario[] seminarios;

	public ProfessorSeminario() {
		
	}
	
	public ProfessorSeminario(String nome, String especializacao) {
		this.nome = nome;
		this.especializacao = especializacao;
	}

	public ProfessorSeminario(String nome, String especializacao, Seminario[] seminarios) {
		this.nome = nome;
		this.especializacao = especializacao;
		this.seminarios = seminarios;
	}

	public void relatorio() {
		System.out.println("--- Professores ---");
		System.out.println("Professor: " + this.nome);
		System.out.println("Especialização: " + this.especializacao);
		if(this.seminarios == null) return;
		System.out.println("--- Detalhes seminarios ---");
		for(Seminario seminario: this.seminarios) {
			System.out.println("Titulo do seminario: "+seminario.getTitulo());
			System.out.println("Local do seminario: "+seminario.getLocal().getEndereco());
			if(seminario.getAluno() == null) continue;
			System.out.println("--- Alunos ---");
			for(Aluno aluno: seminario.getAluno()) {
				System.out.println("Aluno: "+"\nNome: "+aluno.getNome()+"\nidade: "+aluno.getIdade());
			}
		}
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setseminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
}
