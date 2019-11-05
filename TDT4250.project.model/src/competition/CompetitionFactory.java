/**
 */
package competition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see competition.CompetitionPackage
 * @generated
 */
public interface CompetitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompetitionFactory eINSTANCE = competition.impl.CompetitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Competition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Competition</em>'.
	 * @generated
	 */
	Competition createCompetition();

	/**
	 * Returns a new object of class '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Season</em>'.
	 * @generated
	 */
	Season createSeason();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score</em>'.
	 * @generated
	 */
	Score createScore();

	/**
	 * Returns a new object of class '<em>Standing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standing</em>'.
	 * @generated
	 */
	Standing createStanding();

	/**
	 * Returns a new object of class '<em>Positon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positon</em>'.
	 * @generated
	 */
	Positon createPositon();

	/**
	 * Returns a new object of class '<em>Matchday</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matchday</em>'.
	 * @generated
	 */
	Matchday createMatchday();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompetitionPackage getCompetitionPackage();

} //CompetitionFactory
