package ProjetoFinalJava;

public class Video implements AcoesVideo {
	
	private String titulo;
	private int avaliacao;
	private float views;
	private float curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova=0;
		nova = (int) ((this.avaliacao + avaliacao) / views);
		this.avaliacao = nova;
	}

	public float getViews() {
		return views;
	}

	public void setViews(float views) {
		this.views = views;
	}

	public float getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(float curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	

	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas ++;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + 
				", avaliacao=" + avaliacao + 
				", views=" + views + 
				", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	

}
