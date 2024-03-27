package ProjetoFinalJava;

public class ProjetoYoutube {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		Gafanhoto g[] = new Gafanhoto [2];
		Visualizacao visu[] = new Visualizacao[3];
		
		v[0]= new Video("Ultima aula de Java");
		v[1]= new Video("Exercicio");
		v[2]= new Video("Resolução do exercicio");
		
		g[0]= new Gafanhoto("Pedro", 19, "Masculino", "Kingofreal");
		g[1]= new Gafanhoto("Mari", 19, "Feminino", "Marijks");
		
		
//		System.out.println(v[0].toString());
//		System.out.println(g[0].toString());
//		
//		System.out.println(g[1].toString());
		
		visu[0]= new Visualizacao(g[1], v[0]);
		System.out.println(visu[0].toString());
		
		visu[0]= new Visualizacao(g[1], v[1]);
		System.out.println(visu[0].toString());
		
		visu[0]= new Visualizacao(g[1], v[1]);
		System.out.println(visu[0].toString());
	}

}
