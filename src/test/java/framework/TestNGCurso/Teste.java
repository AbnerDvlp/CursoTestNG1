package framework.TestNGCurso;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Teste {

	@BeforeTest
	public void antesTeste() {
		System.out.println("Executed before test");
	}

	@BeforeClass
	public void antesClasse() {
		System.out.println("I Execute before class");
	}

	@BeforeMethod
	public void antesMetodo() {
		System.out.println("Excecuted before each method");
	}

	@Test(enabled = false)
	public void test1() {
		System.out.println("I am a first test method");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("I am a second test method");
	}

	@Test
	public void test3() {
		System.out.println("I am a third test method");
	}

	@Test
	public void test4() {
		System.out.println("I am a fourth test method");
	}
	
	@Test(groups = "testandoGroup1")
	public void test5() {
		System.out.println("I am a fifith test method");
	}

	@Test(groups = "testandoGroup2")
	public void test6() {
		System.out.println("I am a sixth test method");
	}

	@AfterMethod
	public void depoisMetodo() {
		System.out.println("Excecuted after each method");
	}

	@AfterClass
	public void depoisClasse() {
		System.out.println("Executed after class");
	}

	@AfterTest
	public void depoisTeste() {
		System.out.println("Executed after test");
	}
}
