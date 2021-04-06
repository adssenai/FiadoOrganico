package fiado;

public class consumidor {
	
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	
	public consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10];		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//_________________________________________
	
	public consumidorFone(String fone) {
		this.fone = fone;
		this.fone = new int[10];		
	}
	
	public String getFone() {
		return this.fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	//____________________________________________
	
	
	
		
		
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;

		}
		return total;
	}
	
	
	
}
