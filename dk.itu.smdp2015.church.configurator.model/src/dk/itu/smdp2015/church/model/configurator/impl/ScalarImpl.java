/**
 */
package dk.itu.smdp2015.church.model.configurator.impl;

import dk.itu.smdp2015.church.model.configurator.ConfiguratorPackage;
import dk.itu.smdp2015.church.model.configurator.ParameterGroup;
import dk.itu.smdp2015.church.model.configurator.Scalar;
import dk.itu.smdp2015.church.model.configurator.ScalarOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.impl.ScalarImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.itu.smdp2015.church.model.configurator.impl.ScalarImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalarImpl extends ExpressionImpl implements Scalar {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ScalarOperator OPERATOR_EDEFAULT = ScalarOperator.SUM;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ScalarOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected ParameterGroup id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorPackage.Literals.SCALAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ScalarOperator newOperator) {
		ScalarOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.SCALAR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup getId() {
		if (id != null && id.eIsProxy()) {
			InternalEObject oldId = (InternalEObject)id;
			id = (ParameterGroup)eResolveProxy(oldId);
			if (id != oldId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.SCALAR__ID, oldId, id));
			}
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup basicGetId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(ParameterGroup newId) {
		ParameterGroup oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.SCALAR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorPackage.SCALAR__OPERATOR:
				return getOperator();
			case ConfiguratorPackage.SCALAR__ID:
				if (resolve) return getId();
				return basicGetId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfiguratorPackage.SCALAR__OPERATOR:
				setOperator((ScalarOperator)newValue);
				return;
			case ConfiguratorPackage.SCALAR__ID:
				setId((ParameterGroup)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfiguratorPackage.SCALAR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ConfiguratorPackage.SCALAR__ID:
				setId((ParameterGroup)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfiguratorPackage.SCALAR__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ConfiguratorPackage.SCALAR__ID:
				return id != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ScalarImpl
