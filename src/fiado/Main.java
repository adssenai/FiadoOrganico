package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
								
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o Nome do Cliente: ");
		String nome = scanner.nextLine();
		consumidor consumidor = new consumidor(nome);
		
		System.out.print("Informe o telefone do Cliente: ");
		String fone = scanner.nextLine();
		consumidor consumidorFone = new consumidor(fone);
				
		
		System.out.print("Informe o Valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);
		
		int total = consumidor.getFiado();
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " e ganhou um brinde");
		}else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);
			
		}

		

	}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}
	
	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];		
		}
		return total;
	}
	
	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
			
		}
		return total;
		
	}
		

}
