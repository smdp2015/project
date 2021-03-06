/**
 */
package dk.itu.smdp2015.church.model.configurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Enumerated#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getEnumerated()
 * @model
 * @generated
 */
public interface Enumerated extends ValueRange {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.smdp2015.church.model.configurator.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getEnumerated_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // Enumerated
