package pooAtividades.Test.AtividadePedidoClienteTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.naming.NameClassPair;

import pooAtividades.Domain.AtividadePedidoClienteDomain.Client;
import pooAtividades.Domain.AtividadePedidoClienteDomain.Order;
import pooAtividades.Domain.AtividadePedidoClienteDomain.OrderItem;
import pooAtividades.Domain.AtividadePedidoClienteDomain.OrderStatus;
import pooAtividades.Domain.AtividadePedidoClienteDomain.Product;

public class TestOrder01 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		Product product;
		OrderItem orderitem;
		Order order = new Order();
		Client client;

		System.out.println("Name client:");
		String nameClient = input.nextLine();
		System.out.println("Email client:");
		String emailClient = input.nextLine();
		System.out.println("Birth date client (DD/MM/YYYY)");
		Date BirthDate = sdf.parse(input.next());
		client = new Client(nameClient, emailClient, BirthDate);

		System.out.println("Enter order data:");
		Date moment = sdf.parse(input.next());
		System.out.println("Status: Peding payment; Processing; Shipped; Delivered");
		OrderStatus status = OrderStatus.getOrderStatusFromString(input.next());

		order = new Order(moment, status, client);
		
		System.out.println("How many items to this order?");
		double quantityItem = input.nextDouble();		 
		
		for (int i = 0; i < quantityItem; i++) {
			input.nextLine();

			System.out.println("Enter #" + (i + 1) + " item data:");
						
			System.out.println("Product name:");
			String nameProduct = input.nextLine();
						
			System.out.println("Product price: ");
			double priceProduct = input.nextDouble();
			
			System.out.println("Quantity:");
			int quantityProduct = input.nextInt();
			
			product = new Product(nameProduct, priceProduct);
			orderitem = new OrderItem(quantityProduct, priceProduct, product);
			order.addItem(orderitem);
		}
		
		 System.out.println(order);   
		
	}
}
