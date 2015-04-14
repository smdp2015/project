/**
 */
package dk.itu.smdp2015.church.model.configurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Configurator#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getConfigurator()
 * @model
 * @generated
 */
public interface Configurator extends DescribedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.smdp2015.church.model.configurator.AbstractParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getConfigurator_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractParameter> getParameters();

} // Configurator
