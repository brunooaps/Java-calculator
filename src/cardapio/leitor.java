package cardapio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class leitor {

	public static void leitorComida() throws FileNotFoundException {
		
		File arquivo_comida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pratos.csv");
		Scanner leitor_comida = new Scanner(arquivo_comida, "UTF-8");
		String linha_comida = leitor_comida.nextLine();
		
		int contador = 1;
		System.out.println("\nOs pratos do cardápio são: \n");
		while(leitor_comida.hasNextLine()) {
			linha_comida = leitor_comida.nextLine();
			String[] partes = linha_comida.split(";");
			String comida = partes[0];
			String preco = partes[1];
			System.out.println(contador + ")" + comida + " " + "| " + preco + " R$\n");
			contador++;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Por favor, escolha qual prato gostaria: \n");
	}
	
	public static void leitorBebida() throws FileNotFoundException {
		
		File arquivo_bebida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\bebidas.txt");
		Scanner leitor_bebida = new Scanner(arquivo_bebida,"UTF-8");
		String linha_bebida  = leitor_bebida.nextLine();
		
		int contador = 1;
		System.out.println("\nAs bebidas do cardápio são: \n");
		while(leitor_bebida.hasNext()) {
			linha_bebida = leitor_bebida.nextLine();
			String[] partes = linha_bebida.split("	");
			String preco_bebida = partes[0];
			String bebida = partes[1];
			System.out.println(contador + ")" + bebida + " " + "| " + preco_bebida + " R$\n");
			contador++;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Por favor, escolha qual bebida gostaria: ");
	}
	
	public static void leitorVinho() throws IOException {
		
		File arquivo_vinho = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\vinhos.txt");
		Scanner leitor_vinho = new Scanner(arquivo_vinho, "UTF-8");
		String linha_vinho = leitor_vinho.nextLine();
		
		int contador = 1;
		System.out.println("\nOs vinhos do cardápio são: \n");
		while(leitor_vinho.hasNext()) {
			linha_vinho = leitor_vinho.nextLine();
			String[] partes = linha_vinho.split("	");
			String preco_vinho = partes[0];
			String vinho = partes[1];
			System.out.println(contador + ")" + vinho + " " + "| " + preco_vinho+ " R$\n");
			contador++;
			}
		System.out.println("--------------------------------------------");
		System.out.println("Por favor, escolha qual vinho gostaria: ");
	}
}
