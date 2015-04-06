/**
 */
package dk.itu.smdp2015.church.model.configurator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Binary#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.Binary#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.itu.smdp2015.church.model.configurator.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getBinary_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Binary#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see dk.itu.smdp2015.church.model.configurator.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Binary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage#getBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link dk.itu.smdp2015.church.model.configurator.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Binary
