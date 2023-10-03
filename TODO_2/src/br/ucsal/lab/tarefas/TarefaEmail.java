package br.ucsal.lab.tarefas;

public class TarefaEmail extends Tarefa {

	
	private String email;
	
	public TarefaEmail(String titulo, String descricao, String email) {
		super(titulo, descricao, false);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String coluna3(){
		return getEmail();
	}

	@Override
	public String toString() {
		return super.toString()+" TarefaEmail [email=" + email + "]";
	}

	
	
}
