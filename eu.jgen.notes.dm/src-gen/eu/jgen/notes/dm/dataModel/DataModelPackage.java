/**
 * generated by Xtext 2.12.0
 */
package eu.jgen.notes.dm.dataModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.jgen.notes.dm.dataModel.DataModelFactory
 * @model kind="package"
 * @generated
 */
public interface DataModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dataModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jgen.eu/notes/dm/DataModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dataModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataModelPackage eINSTANCE = eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.SubjectAreaFeatureImpl <em>Subject Area Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.SubjectAreaFeatureImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getSubjectAreaFeature()
   * @generated
   */
  int SUBJECT_AREA_FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_AREA_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Subject Area Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_AREA_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.SubjectAreaImpl <em>Subject Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.SubjectAreaImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getSubjectArea()
   * @generated
   */
  int SUBJECT_AREA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_AREA__NAME = SUBJECT_AREA_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_AREA__ELEMENTS = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subject Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_AREA_FEATURE_COUNT = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.WorksetImpl <em>Workset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.WorksetImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getWorkset()
   * @generated
   */
  int WORKSET = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSET__NAME = SUBJECT_AREA_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSET__ELEMENTS = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Workset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSET_FEATURE_COUNT = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.EntityFeatureImpl <em>Entity Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.EntityFeatureImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getEntityFeature()
   * @generated
   */
  int ENTITY_FEATURE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.AttributeImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = ENTITY_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ANNOTATIONS = ENTITY_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = ENTITY_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = ENTITY_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.EntityImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = SUBJECT_AREA_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ELEMENTS = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = SUBJECT_AREA_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.RelationshipImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = ENTITY_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = ENTITY_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET = ENTITY_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Relname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__RELNAME = ENTITY_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = ENTITY_FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.IdComponentImpl <em>Id Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.IdComponentImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getIdComponent()
   * @generated
   */
  int ID_COMPONENT = 8;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_COMPONENT__FEATURE = 0;

  /**
   * The number of structural features of the '<em>Id Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.jgen.notes.dm.dataModel.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.jgen.notes.dm.dataModel.impl.IdentifierImpl
   * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__NAME = ENTITY_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__FEATURES = ENTITY_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = ENTITY_FEATURE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see eu.jgen.notes.dm.dataModel.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.jgen.notes.dm.dataModel.DataModel#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see eu.jgen.notes.dm.dataModel.DataModel#getAnnotations()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link eu.jgen.notes.dm.dataModel.DataModel#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see eu.jgen.notes.dm.dataModel.DataModel#getImportSection()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_ImportSection();

  /**
   * Returns the meta object for the containment reference '{@link eu.jgen.notes.dm.dataModel.DataModel#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see eu.jgen.notes.dm.dataModel.DataModel#getElement()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Element();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.SubjectArea <em>Subject Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Area</em>'.
   * @see eu.jgen.notes.dm.dataModel.SubjectArea
   * @generated
   */
  EClass getSubjectArea();

  /**
   * Returns the meta object for the containment reference list '{@link eu.jgen.notes.dm.dataModel.SubjectArea#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see eu.jgen.notes.dm.dataModel.SubjectArea#getElements()
   * @see #getSubjectArea()
   * @generated
   */
  EReference getSubjectArea_Elements();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.SubjectAreaFeature <em>Subject Area Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject Area Feature</em>'.
   * @see eu.jgen.notes.dm.dataModel.SubjectAreaFeature
   * @generated
   */
  EClass getSubjectAreaFeature();

  /**
   * Returns the meta object for the attribute '{@link eu.jgen.notes.dm.dataModel.SubjectAreaFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.jgen.notes.dm.dataModel.SubjectAreaFeature#getName()
   * @see #getSubjectAreaFeature()
   * @generated
   */
  EAttribute getSubjectAreaFeature_Name();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.Workset <em>Workset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workset</em>'.
   * @see eu.jgen.notes.dm.dataModel.Workset
   * @generated
   */
  EClass getWorkset();

  /**
   * Returns the meta object for the containment reference list '{@link eu.jgen.notes.dm.dataModel.Workset#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see eu.jgen.notes.dm.dataModel.Workset#getElements()
   * @see #getWorkset()
   * @generated
   */
  EReference getWorkset_Elements();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see eu.jgen.notes.dm.dataModel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link eu.jgen.notes.dm.dataModel.Attribute#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see eu.jgen.notes.dm.dataModel.Attribute#getAnnotations()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link eu.jgen.notes.dm.dataModel.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see eu.jgen.notes.dm.dataModel.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see eu.jgen.notes.dm.dataModel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link eu.jgen.notes.dm.dataModel.Entity#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see eu.jgen.notes.dm.dataModel.Entity#getElements()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Elements();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.EntityFeature <em>Entity Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Feature</em>'.
   * @see eu.jgen.notes.dm.dataModel.EntityFeature
   * @generated
   */
  EClass getEntityFeature();

  /**
   * Returns the meta object for the attribute '{@link eu.jgen.notes.dm.dataModel.EntityFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.jgen.notes.dm.dataModel.EntityFeature#getName()
   * @see #getEntityFeature()
   * @generated
   */
  EAttribute getEntityFeature_Name();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see eu.jgen.notes.dm.dataModel.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link eu.jgen.notes.dm.dataModel.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.jgen.notes.dm.dataModel.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Type();

  /**
   * Returns the meta object for the reference '{@link eu.jgen.notes.dm.dataModel.Relationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.jgen.notes.dm.dataModel.Relationship#getTarget()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Target();

  /**
   * Returns the meta object for the reference '{@link eu.jgen.notes.dm.dataModel.Relationship#getRelname <em>Relname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Relname</em>'.
   * @see eu.jgen.notes.dm.dataModel.Relationship#getRelname()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Relname();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.IdComponent <em>Id Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Component</em>'.
   * @see eu.jgen.notes.dm.dataModel.IdComponent
   * @generated
   */
  EClass getIdComponent();

  /**
   * Returns the meta object for the containment reference '{@link eu.jgen.notes.dm.dataModel.IdComponent#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see eu.jgen.notes.dm.dataModel.IdComponent#getFeature()
   * @see #getIdComponent()
   * @generated
   */
  EReference getIdComponent_Feature();

  /**
   * Returns the meta object for class '{@link eu.jgen.notes.dm.dataModel.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see eu.jgen.notes.dm.dataModel.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the reference list '{@link eu.jgen.notes.dm.dataModel.Identifier#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see eu.jgen.notes.dm.dataModel.Identifier#getFeatures()
   * @see #getIdentifier()
   * @generated
   */
  EReference getIdentifier_Features();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataModelFactory getDataModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__ANNOTATIONS = eINSTANCE.getDataModel_Annotations();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__IMPORT_SECTION = eINSTANCE.getDataModel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__ELEMENT = eINSTANCE.getDataModel_Element();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.SubjectAreaImpl <em>Subject Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.SubjectAreaImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getSubjectArea()
     * @generated
     */
    EClass SUBJECT_AREA = eINSTANCE.getSubjectArea();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBJECT_AREA__ELEMENTS = eINSTANCE.getSubjectArea_Elements();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.SubjectAreaFeatureImpl <em>Subject Area Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.SubjectAreaFeatureImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getSubjectAreaFeature()
     * @generated
     */
    EClass SUBJECT_AREA_FEATURE = eINSTANCE.getSubjectAreaFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBJECT_AREA_FEATURE__NAME = eINSTANCE.getSubjectAreaFeature_Name();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.WorksetImpl <em>Workset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.WorksetImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getWorkset()
     * @generated
     */
    EClass WORKSET = eINSTANCE.getWorkset();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSET__ELEMENTS = eINSTANCE.getWorkset_Elements();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.AttributeImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ANNOTATIONS = eINSTANCE.getAttribute_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.EntityImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ELEMENTS = eINSTANCE.getEntity_Elements();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.EntityFeatureImpl <em>Entity Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.EntityFeatureImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getEntityFeature()
     * @generated
     */
    EClass ENTITY_FEATURE = eINSTANCE.getEntityFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_FEATURE__NAME = eINSTANCE.getEntityFeature_Name();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.RelationshipImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

    /**
     * The meta object literal for the '<em><b>Relname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__RELNAME = eINSTANCE.getRelationship_Relname();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.IdComponentImpl <em>Id Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.IdComponentImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getIdComponent()
     * @generated
     */
    EClass ID_COMPONENT = eINSTANCE.getIdComponent();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_COMPONENT__FEATURE = eINSTANCE.getIdComponent_Feature();

    /**
     * The meta object literal for the '{@link eu.jgen.notes.dm.dataModel.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.jgen.notes.dm.dataModel.impl.IdentifierImpl
     * @see eu.jgen.notes.dm.dataModel.impl.DataModelPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER__FEATURES = eINSTANCE.getIdentifier_Features();

  }

} //DataModelPackage
