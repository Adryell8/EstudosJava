package pooAtividades.Domain.AtividadePedidoClienteDomain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> listItens = new ArrayList<OrderItem>();

	private Client client;

	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem listitens) {
		listItens.add(listitens);
	}

	public void removeItem(OrderItem listitens) {
		listItens.remove(listitens);
	}

	public double total() {
		double total = 0.0;
		for (OrderItem orderitem : listItens) {
			total += orderitem.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getListItens() {
		return listItens;
	}

	public void setListItens(List<OrderItem> listItens) {
		this.listItens = listItens;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("Order moment ");
		 sb.append(sdf.format(moment) + "\n");

		 sb.append("Order status: ");
		 sb.append(status + "\n");

		 sb.append("\nClient");
		 sb.append(client + "\n");

		 sb.append("\nOrder items");
		 for(OrderItem item : listItens) {
			 sb.append(item + "\n");
		 }
		 sb.append("\nTotal price: ");
		 sb.append(String.format("%.2f", total()));

		 
		 return sb.toString();
	}
}
