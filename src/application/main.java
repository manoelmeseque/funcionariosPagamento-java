package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;


public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <Funcionario> list = new ArrayList<>();
		System.out.println("Quantos funcionarios deseja listar? ");
		int n = sc.nextInt();
		
		for( int i = 1; i <= n; i++) {
			
			System.out.println("O funcionario é terceirizado? (s/n)");
			char r = sc.next().charAt(0);
			sc.nextLine();
			if(r == 's') {
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Horas: ");
				int horas = sc.nextInt();
				System.out.println("Valor por horas: R$");
				double valor = sc.nextDouble();
				System.out.println("Adicional: R$");
				double adicional = sc.nextDouble();
				
				list.add(new FuncionarioTerceirizado(nome, horas, valor, adicional));
				
			}else {
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Horas: ");
				int horas = sc.nextInt();
				System.out.println("Valor por horas: R$");
				double valor = sc.nextDouble();
				
				list.add(new Funcionario(nome, horas, valor));
			}
			
			
		}
		
		for (Funcionario f: list) {
			System.out.printf("%s - R$%.2f%n", f.getNome(), f.pagamento());
		}
		
		sc.close();

	}

}
