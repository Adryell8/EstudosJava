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
	
	public static OrderStatus tipoClientePorNomeRelatorio(String status) {
		for(OrderStatus tipo : values()) {
			if(tipo.getSTATUS().equals(status)) {
				return tipo;
			}
		}
		return null;
	}

	public String getSTATUS() {
		return STATUS;
	}
}
