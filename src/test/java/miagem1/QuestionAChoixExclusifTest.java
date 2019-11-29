/*
 * Cette classe a pour but de tester la classe QuestionAchoixExclusif pour savoir si elle se comporte comme prévu.
 */

package miagem1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class QuestionAChoixExclusifTest {
	private QuestionAChoixExclusif uneQuestion;
	
	@Before
	public void setUp() throws Exception{
		// given : initialiser un objet de type QuestionAChoixExclusif
		uneQuestion = new QuestionAChoixExclusif("un énoncé", 2);
	}

	@Test
	public void testgetEnonce() {
		//when : on demande l'énoncé à la question
		String resEnonce = uneQuestion.getEnonce();
		// then : l'énoncé est non null
		assertNotNull(resEnonce);
		//and : l'énoncé est bien celui fourni à la construction
		assertEquals(resEnonce, "un énoncé");
		
	}
	
	@Test
	public void testgetScoreForIndice() {
		// when: un étudiant fournit l'indice correspondant à la bonne réponse
		int indiceEtudiant = 2;
		// and: on calcule le score
		Float resScore = uneQuestion.getScoreForIndice(indiceEtudiant);
		// then : le score obtenu est 100
		assertEquals(new Float(100f), resScore);
		// when : un étudiant fournit l'indice correspondant à une mauvaise réponse
		indiceEtudiant = 3;
		// on demande le calcul du score:
		resScore = uneQuestion.getScoreForIndice(indiceEtudiant);
		// then : le score obtenu est 0
		assertEquals(new Float(0f), resScore);
	}
	
	

}
