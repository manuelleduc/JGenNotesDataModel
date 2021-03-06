/**
 * generated by Xtext 2.12.0
 */
package eu.jgen.notes.dm.dataModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dm.dataModel.Identifier#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dm.dataModel.DataModelPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EntityFeature
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link eu.jgen.notes.dm.dataModel.EntityFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see eu.jgen.notes.dm.dataModel.DataModelPackage#getIdentifier_Features()
   * @model
   * @generated
   */
  EList<EntityFeature> getFeatures();

} // Identifier
