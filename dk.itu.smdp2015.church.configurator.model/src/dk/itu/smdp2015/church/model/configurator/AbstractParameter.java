/**
 */
package dk.itu.smdp2015.church.model.configurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getAbstractParameter()
 * @model abstract="true"
 * @generated
 */
public interface AbstractParameter extends DescribedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(Expression)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getAbstractParameter_Visibility()
	 * @model containment="true"
	 * @generated
	 */
	Expression getVisibility();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Expression value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.smdp2015.church.model.configurator.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getAbstractParameter_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // AbstractParameter
