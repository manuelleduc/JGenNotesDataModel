/**
 * generated by Xtext 2.12.0
 */
package eu.jgen.notes.dm.dataModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dm.dataModel.Entity#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dm.dataModel.DataModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends SubjectAreaFeature
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dm.dataModel.EntityFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see eu.jgen.notes.dm.dataModel.DataModelPackage#getEntity_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EntityFeature> getElements();

} // Entity
