package pooAtividades.Domain.AtividadePedidoClienteDomain;

public enum OrderStatus {
	PEDING_PAYMENT("Peding payment"),
	PROCESSING("Processing"),
	SHIPEED("Shipped"),
	DELIVERED("Delivered");
	
	private String STATUS;

	private OrderStatus(String sTATUS) {
		STATUS = sTATUS;
	}
	
	public static OrderStatus getOrderStatusFromString(String statusString) {
		for(OrderStatus tipo : values()) {
			if(tipo.getSTATUS().equals(statusString)) {
				return tipo;
			}
		}
		return null;
	}

	public String getSTATUS() {
		return STATUS;
	}
}
