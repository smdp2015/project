/**
 */
package dk.itu.smdp2015.church.model.configurator;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named And Described Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.NamedAndDescribedElement#getName <em>Name</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.NamedAndDescribedElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getNamedAndDescribedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedAndDescribedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getNamedAndDescribedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.NamedAndDescribedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getNamedAndDescribedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.NamedAndDescribedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // NamedAndDescribedElement
