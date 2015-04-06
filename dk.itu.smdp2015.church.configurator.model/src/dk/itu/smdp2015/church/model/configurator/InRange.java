/**
 */
package dk.itu.smdp2015.church.model.configurator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.InRange#getRange <em>Range</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.InRange#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getInRange()
 * @model
 * @generated
 */
public interface InRange extends Expression {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(ValueRange)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getInRange_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueRange getRange();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.InRange#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ValueRange value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getInRange_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.InRange#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // InRange
