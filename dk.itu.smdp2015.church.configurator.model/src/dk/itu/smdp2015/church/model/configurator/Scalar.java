/**
 */
package dk.itu.smdp2015.church.model.configurator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Scalar#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Scalar#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getScalar()
 * @model
 * @generated
 */
public interface Scalar extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.smdp2015.church.model.configurator.ScalarOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.ScalarOperator
	 * @see #setOperator(ScalarOperator)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getScalar_Operator()
	 * @model required="true"
	 * @generated
	 */
	ScalarOperator getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Scalar#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.ScalarOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ScalarOperator value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(ParameterGroup)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getScalar_Id()
	 * @model required="true"
	 * @generated
	 */
	ParameterGroup getId();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Scalar#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ParameterGroup value);

} // Scalar
