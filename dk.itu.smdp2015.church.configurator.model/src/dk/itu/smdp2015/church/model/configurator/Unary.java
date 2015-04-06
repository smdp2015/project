/**
 */
package dk.itu.smdp2015.church.model.configurator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Unary#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Unary#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getUnary()
 * @model
 * @generated
 */
public interface Unary extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.smdp2015.church.model.configurator.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getUnary_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Unary#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(Expression)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getUnary_Inner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInner();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Unary#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(Expression value);

} // Unary
