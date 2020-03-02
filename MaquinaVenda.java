import java.util.Scanner;

public class mv {

	public static void main(String[] args) {
		
		int qtde25;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Inserir nota de 10 ou 25?" );
		int nota = valor.nextInt();
		
		if(nota == 10) {
		System.out.println("Quantidade de Notas?");
		int qtde10= valor.nextInt();
		nota = nota *qtde10;
		System.out.println("Valor total inserido:"+nota);
		}
		if(nota == 25) {
		System.out.println("Quantidade de Notas?");
		int qtde20= valor.nextInt();
		nota = nota *qtde20;
		System.out.println("Valor total inserido:"+nota);
		}
		if(nota >45) {
		nota = nota-45;
		System.out.println("Retire sua Coca. Valor Perdido:"+nota);
		}else {
		System.out.println("NENHUM PRODUTO COM ESTE VALOR");
		}
		
	}

}
