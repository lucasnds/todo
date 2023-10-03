package br.ucsal.lab.tarefas;

public class Tarefa implements Linha {

	private String titulo;
	private String descricao;
	private Boolean concluida;

	public Tarefa(String titulo, String descricao) {
		this(titulo, descricao, false);
	}

	public Tarefa(String titulo, String descricao, Boolean concluida) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String coluna1() {
		return getTitulo();
	}

	@Override
	public String coluna2() {
		return getDescricao();
	}

	@Override
	public String coluna3() {
		return getConcluida() ? "OK" : "";
	}

	@Override
	public String toString() {
		return "Tarefa [titulo=" + titulo + ", descricao=" + descricao +
				", concluida=" + concluida + "]";
	}

}
