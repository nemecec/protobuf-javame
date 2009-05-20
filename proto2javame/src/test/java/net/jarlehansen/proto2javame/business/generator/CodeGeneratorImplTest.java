package net.jarlehansen.proto2javame.business.generator;

import static org.junit.Assert.assertEquals;

import java.io.File;

import net.jarlehansen.proto2javame.io.exception.InvalidInputException;
import net.jarlehansen.proto2javame.testutils.TestConstants;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author hansjar@gmail.com Jarle Hansen
 * 
 */
public class CodeGeneratorImplTest {
	private CodeGenerator codeGenerator;

	@Before
	public void setUp() {
		codeGenerator = CodeGeneratorImpl.newInstance();
	}

	@Test
	public void testGenerateJavaSourceCodeValidInput() {
		final File testGenerated = new File(TestConstants.GENERATED_FILE);
		final boolean deleted = testGenerated.delete();
		System.out.println(this.getClass().getName() + " - The file " + TestConstants.GENERATED_FILE + " was delete? " + deleted);

		codeGenerator.generateJavaSourceCode(TestConstants.JAVA_OUT, TestConstants.PROTO_FILE);

		assertEquals(true, new File(TestConstants.GENERATED_FILE).isFile());
	}

	@Test(expected = InvalidInputException.class)
	public void testGenerateJavaSourceCodeTooFewInputValues() {
		codeGenerator.generateJavaSourceCode(TestConstants.JAVA_OUT);
	}

	@Test(expected = InvalidInputException.class)
	public void testGenerateJavaSourceCodeTooManyInputValues() {
		codeGenerator.generateJavaSourceCode(TestConstants.JAVA_OUT, TestConstants.PROTO_FILE, "test");
	}

	@Test(expected = InvalidInputException.class)
	public void testGenerateJavaSourceCodeInvalidJavaOutInput() {
		codeGenerator.generateJavaSourceCode("test", TestConstants.PROTO_FILE);
	}

	@Test(expected = InvalidInputException.class)
	public void testGenerateJavaSourceCodeInvalidProtoLocationInput() {
		codeGenerator.generateJavaSourceCode(TestConstants.JAVA_OUT, "test");
	}
}
