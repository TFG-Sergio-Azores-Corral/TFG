/**
 */
package org.usecase.usecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.usecase.usecase.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link org.usecase.usecase.Model#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see org.usecase.usecase.UsecasePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.usecase.usecase.UMLElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.usecase.usecase.UsecasePackage#getModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLElement> getElements();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.usecase.usecase.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.usecase.usecase.UsecasePackage#getModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Model
