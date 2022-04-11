package celeb.model;
/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	private String celebClue;
	private String celebAnswer;
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		celebClue = "DEFAULT CLUE";
		celebAnswer = "DEFAULT ANSWER";
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return celebClue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return celebAnswer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		celebClue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		celebAnswer = answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		String desc = "";
		desc += "HI IA AM COMPUTERER PROGRAM \n";
		desc += "THE CLU TYAT U WERE GIVEN WAS " + celebClue + "\n";
		desc += "THE CELLEBRITY TJAT U GOT WAS UHHHHHHHHHH" + celebAnswer + "\n";
		desc += "THANK YOU 4 PLYING #celebrity guessing game# :D";
		return desc;
	}
	
}
