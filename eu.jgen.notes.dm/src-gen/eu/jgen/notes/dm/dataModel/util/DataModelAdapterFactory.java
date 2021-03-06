/**
 * generated by Xtext 2.12.0
 */
package eu.jgen.notes.dm.dataModel.util;

import eu.jgen.notes.dm.dataModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.jgen.notes.dm.dataModel.DataModelPackage
 * @generated
 */
public class DataModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DataModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DataModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelSwitch<Adapter> modelSwitch =
    new DataModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseDataModel(DataModel object)
      {
        return createDataModelAdapter();
      }
      @Override
      public Adapter caseSubjectArea(SubjectArea object)
      {
        return createSubjectAreaAdapter();
      }
      @Override
      public Adapter caseSubjectAreaFeature(SubjectAreaFeature object)
      {
        return createSubjectAreaFeatureAdapter();
      }
      @Override
      public Adapter caseWorkset(Workset object)
      {
        return createWorksetAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityFeature(EntityFeature object)
      {
        return createEntityFeatureAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseIdComponent(IdComponent object)
      {
        return createIdComponentAdapter();
      }
      @Override
      public Adapter caseIdentifier(Identifier object)
      {
        return createIdentifierAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.DataModel
   * @generated
   */
  public Adapter createDataModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.SubjectArea <em>Subject Area</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.SubjectArea
   * @generated
   */
  public Adapter createSubjectAreaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.SubjectAreaFeature <em>Subject Area Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.SubjectAreaFeature
   * @generated
   */
  public Adapter createSubjectAreaFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.Workset <em>Workset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.Workset
   * @generated
   */
  public Adapter createWorksetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.EntityFeature <em>Entity Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.EntityFeature
   * @generated
   */
  public Adapter createEntityFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.IdComponent <em>Id Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.IdComponent
   * @generated
   */
  public Adapter createIdComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.jgen.notes.dm.dataModel.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.jgen.notes.dm.dataModel.Identifier
   * @generated
   */
  public Adapter createIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DataModelAdapterFactory
