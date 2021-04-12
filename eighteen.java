import java.util.Scanner;
public class eighteen {

	public static void main(String[] args) {
		Scanner  entrada = new Scanner(System.in);
		int idade = entrada.nextInt();
		
		if (idade>=40) {
			System.out.printf("Está no grupo de risco. Fique em casa!");
		} else {
			System.out.printf("Não está dentro do grupo de risco. Previna-se!");
		}
	    entrada.close();

	}

}
