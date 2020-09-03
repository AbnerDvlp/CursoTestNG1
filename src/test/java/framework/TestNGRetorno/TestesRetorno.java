package framework.TestNGRetorno;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestesRetorno {
	@Parameters("saudacao")
	@Test(groups= {"testandoGroup1","TesteRetorno"})
	public String  saudacao(String saudacao) {
		System.out.println(saudacao);
		return saudacao;
		
	}
	
	@Test(groups= {"testandoGroup1","booleano"})
	public boolean  verdadeiroFalso() {
		
		return true;
		
	}
	
	@Test
	public void  teste3ClasseRetorno() {
		
		System.out.println("Teste void");
		
	}
	
	@Test
	public void  teste4ClasseRetorno() {
		
		System.out.println("Teste void 2");
		
	}

}
