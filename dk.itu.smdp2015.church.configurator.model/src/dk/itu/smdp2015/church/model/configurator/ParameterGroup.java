/**
 */
package dk.itu.smdp2015.church.model.configurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.ParameterGroup#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameterGroup()
 * @model
 * @generated
 */
public interface ParameterGroup extends AbstractParameter {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.smdp2015.church.model.configurator.AbstractParameter}.
	 * It is bidirectional and its opposite is '{@link dk.itu.smdp2015.church.model.configurator.AbstractParameter#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameterGroup_Parameters()
	 * @see dk.itu.smdp2015.church.model.configurator.AbstractParameter#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<AbstractParameter> getParameters();

} // ParameterGroup
