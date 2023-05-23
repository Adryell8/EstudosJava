package pooAtividades.Domain.InterfacesDomain;

public class DataBaseLoader implements DataLoader, DataRemove {

	@Override
	public void load() {
		System.out.println("Carregando dados do banco de dados");
	}

	@Override
	public void remove() {
		System.out.println("Deletando dados de um banco de dados");
	}
	
	
}
