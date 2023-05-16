package pooAtividades.Domain.EnumDomain;

public enum TipoPagamento {
	DEBITO{
		@Override
		public double calcDesconto(double valor) {
			return valor * 0.1;
		}
		
	}, CREDITO{
		@Override
		public double calcDesconto(double valor) {
			return valor * 0.05;
		}
	};
	
	
	
	public double calcDesconto(double valor) {
		return 0;
	}
}
