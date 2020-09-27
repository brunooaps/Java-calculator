package cardapio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class cardapio 
{
	static boolean exit;
	
	//Dar boas vindas e apresentar as opções
	public static void main(String[] args) throws IOException {
		cardapio menu = new cardapio();
		menu.runMenu();
	}
	
	//Codigo que apresenta o boas vindas e opções
	public static void runMenu() throws IOException {
		printHeader();
			printMenu();
			int choice = getInput();
			performAction(choice);
	}
	
	//boas vindas
	public static void printHeader() {
		System.out.println("+-----------------------------------+");
		System.out.println("|             Bem vindo             |");
		System.out.println("|           Ao Restaurante          |");
		System.out.println("+-----------------------------------+");
	}
	
	//op��es
	public static void printMenu() {
		System.out.println("\nSelecione que tipo deseja: ");
		System.out.println("1) Pratos");
		System.out.println("2) Bebidas");
		System.out.println("3) Vinhos");
		System.out.println("0) Sair");
	}
	
	//recolher a escolha do cliente
	private static int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 0 || choice > 3) {
			try {
				System.out.println("\nEscolha uma opção: "); //quando escolher entre pratos bebiba e vinho, apresentar as opções de tal
				choice = Integer.parseInt(kb.nextLine());
				}	
			catch(NumberFormatException e) {
				System.out.println("Seleção invalida, tente novamente"); //escolheu uma opção invalida
				}
			}
		
		return choice;
		}
	
	//codigo apartir da escolha, at� o fim do pedido
	private static void performAction(int choice) throws IOException {
		switch(choice) {
			case 0:
				exit = true;											//caso tenha escolhido sair
				System.out.println("Obrigado por usar minha aplicação");
				break;
			case 1:
				
				leitor.leitorComida();									//caso tenha escolhido pratos
				listaDePedidos.listaComidas();
				listaDePedidos.continuarComidas();
				
				break;
			case 2:
				
				leitor.leitorBebida();									//caso tenha escolhido bebidas
				listaDePedidos.listaBebidas();
				listaDePedidos.continuarBebidas();
				
				break;
			case 3:
				
				leitor.leitorVinho();									//caso tenha escolhido vinhos
				listaDePedidos.listaVinhos();
				listaDePedidos.continuarVinhos();
				
				break;
			default:
				System.out.println("Ocorreu um erro inesperado");		//erro
		}
	}
	
}
