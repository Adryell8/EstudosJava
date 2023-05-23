package pooAtividades.Domain.InterfacesDomain;

public class FileLoader implements DataLoader, DataRemove{

	@Override
	public void load() {
		System.out.println("Carrega dados de um arquivo");
	}
	
	@Override
	public void remove() {
		System.out.println("Deletando dados de um arquivo");
	}
	
}
