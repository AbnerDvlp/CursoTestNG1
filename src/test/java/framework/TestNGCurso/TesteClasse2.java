package framework.TestNGCurso;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TesteClasse2 {
	
	@BeforeClass
	public void antesClasse2() {
		System.out.println("I Execute before class");
	}
	
	@Test
	public void testClass2() {
		System.out.println("I am a first test method in class 2");
	}
	

	@Ignore
	@Test
	public void test2Class2() {
		System.out.println("I am a second test method in class 2");
	}

	@Test(groups="testandoGroup1")
	public void test3Class2() {
		System.out.println("I am a third test method in class 2");
	}

	@Test(groups="testandoGroup2")
	public void test4Class2() {
		System.out.println("I am a fourth test method in class 2");
	}

}
