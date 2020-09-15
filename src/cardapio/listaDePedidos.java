package cardapio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class listaDePedidos {
	static int n;
	public static void listaComidas() throws IOException {

		Scanner input = new Scanner(System.in);
		String foodChoosing = input.next();
		
		int n = Integer.parseInt(foodChoosing);
		if(n > 0 || n < 19) {
			
	      try{
	        String line = Files.readAllLines(Paths.get("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\teste.txt")).get(n - 1);
	        try {
	            FileWriter myWriter = new FileWriter("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
	            myWriter.write(line);
	            myWriter.close();
	          } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	          }
	        System.out.println("\n" + line + "\nAdicionado ao seu pedido");
	      } 
	      catch(IOException e){
	    	System.out.println("An error occurred.");
	        System.out.println(e);
	      }
		}
	}
	
	public static void continuarComidas() throws IOException {
		
		File verPedidosBebida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoBebida.txt");
		File verPedidosVinho = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoVinho.txt");
		if(verPedidosBebida.length() == 0 || verPedidosVinho.length() == 0) {
			System.out.println("\nDeseja algo para beber? (y/n)");
			Scanner continuarPedindo = new Scanner(System.in);
			String y = continuarPedindo.next();
			if(y.equals("y")) {
				System.out.println("\nSelecione qual tipo deseja: ");
				System.out.println("1)Bebidas");
				System.out.println("2)Vinhos");
				Scanner escolha = new Scanner(System.in);
				String marcarEscolha = escolha.next();
				if(marcarEscolha.equals("1")) {
					leitor.leitorBebida();
					listaDePedidos.listaBebidas();
					System.out.println("\nSeu pedido foi concluido!\n");
					File acharPedidoComida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
					Scanner acharComida = new Scanner(acharPedidoComida, "UTF-8");
					String printarComida = acharComida.nextLine();
					File acharPedidoBebida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoBebida.txt");
					Scanner acharBebida = new Scanner(acharPedidoBebida, "UTF-8");
					String printarBebida = acharBebida.nextLine();
					System.out.println("Seu pedido foi: \n" + printarComida + "\n" + printarBebida);
					
					printarComida = printarComida.replaceAll("\\D+","");
					printarBebida = printarBebida.replaceAll("\\D+","");
					int precoComida = Integer.parseInt(printarComida);
					int precoBebida = Integer.parseInt(printarBebida);
					int preco = precoComida + precoBebida;
					double precoFinal = preco / 100;
					System.out.println("\nTotal a pagar: " + String.format("%.2f",precoFinal) + " R$");
				}
				if(marcarEscolha.equals("2")) {
					leitor.leitorVinho();
					listaDePedidos.listaVinhos();
					System.out.println("\nSeu pedido foi concluido!\n");
					File acharPedidoComida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
					Scanner acharComida = new Scanner(acharPedidoComida);
					String printarComida = acharComida.nextLine();
					File acharPedidoVinho = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoVinho.txt");
					Scanner acharVinho = new Scanner(acharPedidoVinho);
					String printarVinho = acharVinho.nextLine();
					System.out.println("Seu pedido foi: \n" + printarComida + "\n" + printarVinho);
					
					printarComida = printarComida.replaceAll("\\D+","");
					printarVinho = printarVinho.replaceAll("\\D+","");
					int precoComida = Integer.parseInt(printarComida);
					int precoVinho = Integer.parseInt(printarVinho);
					int preco = precoComida + precoVinho;
					double precoFinal = preco / 100;
					System.out.println("\nTotal a pagar: " + String.format("%.2f",precoFinal) + " R$");
				}
			}
			if(y.equals("n")) {
				File acharPedido = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
				Scanner pagarPedido = new Scanner(acharPedido, "UTF-8");
				String pedido = pagarPedido.nextLine();
				System.out.println("Seu pedido foi: \n" + pedido);
				cardapio.exit = true;
			}
		}
		
	}
	
private static int IntergerparseInt(String line) {
		// TODO Auto-generated method stub
		return 0;
	}

public static void listaBebidas() throws FileNotFoundException {
		
	Scanner input = new Scanner(System.in);
	String foodChoosing = input.next();
	
	n = Integer.parseInt(foodChoosing);
	if(n > 0 || n < 19) {
		
      try{
        String line = Files.readAllLines(Paths.get("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\listaBebidas.txt")).get(n - 1);
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoBebida.txt");
            myWriter.write(line);
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        String pedidoBebida = line;
        System.out.println("\n" + line + "\nAdicionado ao seu pedido");
      } 
      catch(IOException e){
        System.out.println(e);
      }
      
	}
}

public static void continuarBebidas() throws IOException {
	
	File verPedidos = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");

	if(verPedidos.length() == 0) {
		System.out.println("\nDeseja algo para comer? (y/n)");
		Scanner continuarPedindo = new Scanner(System.in);
		String y = continuarPedindo.next();
		if(y.equals("y")) {
			leitor.leitorComida();
			listaDePedidos.listaComidas();
			
			System.out.println("\nSeu pedido foi concluido!\n");
			File acharPedidoComida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
			Scanner acharComida = new Scanner(acharPedidoComida, "UTF-8");
			String printarComida = acharComida.nextLine();
			File acharPedidoBebida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoBebida.txt");
			Scanner acharBebida = new Scanner(acharPedidoBebida, "UTF-8");
			String printarBebida = acharBebida.nextLine();
			System.out.println("Seu pedido foi: \n" + printarComida + "\n" + printarBebida);
			
			printarComida = printarComida.replaceAll("\\D+","");
			printarBebida = printarBebida.replaceAll("\\D+","");
			int precoComida = Integer.parseInt(printarComida);
			int precoBebida = Integer.parseInt(printarBebida);
			int preco = precoComida + precoBebida;
			double precoFinal = preco / 100;
			System.out.println("\nTotal a pagar: " + String.format("%.2f",precoFinal) + " R$");
		}
		if(y.equals("n")) {
			File acharPedido = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoBebida.txt");
			Scanner pagarPedido = new Scanner(acharPedido, "UTF-8");
			String pedido = pagarPedido.nextLine();
			System.out.println("Seu pedido foi: \n" + pedido);
			cardapio.exit = true;
		}
	}
	
}
public static void listaVinhos() throws FileNotFoundException {
	
	Scanner input = new Scanner(System.in);
	String foodChoosing = input.next();
	
	int n = Integer.parseInt(foodChoosing);
	if(n > 0 || n < 19) {
      try{
        String line = Files.readAllLines(Paths.get("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\listaVinhos.txt")).get(n - 1);
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoVinho.txt");
            myWriter.write(line);
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        System.out.println("\n" + line + "\nAdicionado ao seu pedido");
      } 
      catch(IOException e){
        System.out.println(e);
      }
	}
}

public static void continuarVinhos() throws IOException {
	
	File verPedidos = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");

	if(verPedidos.length() == 0) {
		System.out.println("\nDeseja algo para comer? (y/n)");
		Scanner continuarPedindo = new Scanner(System.in);
		String y = continuarPedindo.next();
		if(y.equals("y")) {
			leitor.leitorComida();
			listaDePedidos.listaComidas();
			
			System.out.println("\nSeu pedido foi concluido!\n");
			File acharPedidoComida = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoComida.txt");
			Scanner acharComida = new Scanner(acharPedidoComida, "UTF-8");
			String printarComida = acharComida.nextLine();
			File acharPedidoVinho = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoVinho.txt");
			Scanner acharVinho = new Scanner(acharPedidoVinho, "UTF-8");
			String printarVinho = acharVinho.nextLine();
			System.out.println("Seu pedido foi: \n" + printarComida + "\n" + printarVinho);
			
			printarComida = printarComida.replaceAll("\\D+","");
			printarVinho = printarVinho.replaceAll("\\D+","");
			int precoComida = Integer.parseInt(printarComida);
			int precoVinho = Integer.parseInt(printarVinho);
			int preco = precoComida + precoVinho;
			double precoFinal = preco / 100;
			System.out.println("\nTotal a pagar: " + String.format("%.2f",precoFinal) + " R$");
		}
		if(y.equals("n")) {
			File acharPedido = new File("C:\\Users\\Bruno\\Documents\\Faculdade\\java\\cardapio\\pedidoVinho.txt");
			Scanner pagarPedido = new Scanner(acharPedido, "UTF-8");
			String pedido = pagarPedido.nextLine();
			System.out.println("Seu pedido foi: \n" + pedido);
			cardapio.exit = true;
		}
	}
}
	 public static void main(String[] args) throws IOException {
		    
		 	listaComidas();
		 	listaBebidas();
		 	listaVinhos();
		 	
		  }
}
