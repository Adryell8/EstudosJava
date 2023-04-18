package pooAtividades.Domain.CadastroSimplesSeminario;

public class Seminario {
	private String titulo;
	private Local local;
	private ProfessorSeminario professorseminario;
	private Aluno[] alunos; 
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}
	
	public Seminario(String titulo, Local local, Aluno[] alunos) {
		this.titulo = titulo;
		this.local = local;
		this.alunos = alunos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public ProfessorSeminario getProfessorSeminario() {
		return professorseminario;
	}
	public void setProfessorSeminario(ProfessorSeminario professorseminario) {
		this.professorseminario = professorseminario;
	}
	public Aluno[] getAluno() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos =  alunos;
	}
	
}
