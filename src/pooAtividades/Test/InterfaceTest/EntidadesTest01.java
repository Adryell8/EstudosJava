package pooAtividades.Test.InterfaceTest;

import pooAtividades.Domain.InterfacesDomain.DataBaseLoader;
import pooAtividades.Domain.InterfacesDomain.FileLoader;

public class EntidadesTest01 {

	public static void main(String[] args) {
		DataBaseLoader dbl = new DataBaseLoader();
		FileLoader fl = new FileLoader();
		
		dbl.load();
		dbl.remove();
		
		fl.load();
		fl.remove();
	}

}
