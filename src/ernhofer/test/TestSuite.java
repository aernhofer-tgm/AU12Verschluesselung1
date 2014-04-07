package ernhofer.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Eine Klasse, die alle JUnit Klassen auf einmal aufruft.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MonoAlphabeticCipherTest.class, SubstitutionCipherTest.class/*, Weitere Klassennamen*/})
public class TestSuite {

}
