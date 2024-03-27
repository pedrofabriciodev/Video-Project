package ProjetoFinalJava;

public class Gafanhoto extends Pessoa {

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistidos = 0;
	}


	private String login;
	private int totAssistidos;
	
	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getTotAssistidos() {
		return totAssistidos;
	}


	public void setTotAssistidos(int totAssistidos) {
		this.totAssistidos = totAssistidos;
	}


	public void verVideo() {
		
	}


	@Override
	public String toString() {
		return super.toString() + " \nGafanhoto [login=" + login + ", totAssistidos=" + totAssistidos + "] \n";
	}
	
	
}
