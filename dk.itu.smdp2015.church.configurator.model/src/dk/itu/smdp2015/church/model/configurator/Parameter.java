/**
 */
package dk.itu.smdp2015.church.model.configurator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Parameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Parameter#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Parameter#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends AbstractParameter {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameter_Optional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Parameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(ValueRange)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameter_ValueRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueRange getValueRange();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Parameter#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(ValueRange value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Expression)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getParameter_Default()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefault();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Parameter#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Expression value);

} // Parameter
