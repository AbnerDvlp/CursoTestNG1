package framework.TesteNGParametrizado;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesteParametrizado {

	//@Test(dataProvider = "dadosTeste")
	@Parameters({"nome","idade"})
	@Test
	public void nomes(String nome, int idade) {
		System.out.println(nome);
		System.out.println(idade);
	}
	@Parameters("cor")
	@Test
	public void cores(String cor) {
		System.out.println(cor);
	}

	/*@DataProvider(name = "dadosTeste")
	public Object[][] dados() {
		return new Object[][] { { "Erick", new Integer(34) }, { "Maria", new Integer(50) } };
	}*/
}
