/**
 */
package avroclipse.avroIDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see avroclipse.avroIDL.AvroIDLFactory
 * @model kind="package"
 * @generated
 */
public interface AvroIDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "avroIDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://avroclipse/AvroIDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "avroIDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AvroIDLPackage eINSTANCE = avroclipse.avroIDL.impl.AvroIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.AvroIDLFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.AvroIDLFileImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getAvroIDLFile()
   * @generated
   */
  int AVRO_IDL_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVRO_IDL_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVRO_IDL_FILE__PROTOCOLS = 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVRO_IDL_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ImportImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ProtocolImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ElementImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.RPCMessageImpl <em>RPC Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.RPCMessageImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getRPCMessage()
   * @generated
   */
  int RPC_MESSAGE = 4;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE__RETURN_TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE__NAME = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE__ARGUMENTS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Error</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE__ERROR = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Oneway</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE__ONEWAY = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>RPC Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ArgumentImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ReturnTypeLinkImpl <em>Return Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ReturnTypeLinkImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getReturnTypeLink()
   * @generated
   */
  int RETURN_TYPE_LINK = 6;

  /**
   * The number of structural features of the '<em>Return Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE_LINK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.VoidTypeLinkImpl <em>Void Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.VoidTypeLinkImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getVoidTypeLink()
   * @generated
   */
  int VOID_TYPE_LINK = 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_LINK__TARGET = RETURN_TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Void Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_LINK_FEATURE_COUNT = RETURN_TYPE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.TypeDefImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__ANNOTATIONS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__TYPE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.TypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ErrorTypeImpl <em>Error Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ErrorTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getErrorType()
   * @generated
   */
  int ERROR_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Error Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.RecordTypeImpl <em>Record Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.RecordTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getRecordType()
   * @generated
   */
  int RECORD_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.FieldImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getField()
   * @generated
   */
  int FIELD = 12;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME_ANNOTATIONS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 3;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DEFAULT = 4;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.FieldTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 13;

  /**
   * The number of structural features of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.SimpleFieldTypeImpl <em>Simple Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.SimpleFieldTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getSimpleFieldType()
   * @generated
   */
  int SIMPLE_FIELD_TYPE = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD_TYPE__TYPE = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.UnionFieldTypeImpl <em>Union Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.UnionFieldTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getUnionFieldType()
   * @generated
   */
  int UNION_FIELD_TYPE = 15;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_FIELD_TYPE__TYPES = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Union Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_FIELD_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ArrayFieldTypeImpl <em>Array Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ArrayFieldTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArrayFieldType()
   * @generated
   */
  int ARRAY_FIELD_TYPE = 16;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FIELD_TYPE__ANNOTATION = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FIELD_TYPE__TYPE = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FIELD_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.MapFieldTypeImpl <em>Map Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.MapFieldTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getMapFieldType()
   * @generated
   */
  int MAP_FIELD_TYPE = 17;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD_TYPE__ANNOTATION = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD_TYPE__TYPE = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FIELD_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.TypeLinkImpl <em>Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.TypeLinkImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getTypeLink()
   * @generated
   */
  int TYPE_LINK = 18;

  /**
   * The number of structural features of the '<em>Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LINK_FEATURE_COUNT = RETURN_TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.PrimativeTypeLinkImpl <em>Primative Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.PrimativeTypeLinkImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getPrimativeTypeLink()
   * @generated
   */
  int PRIMATIVE_TYPE_LINK = 19;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMATIVE_TYPE_LINK__TARGET = TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primative Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMATIVE_TYPE_LINK_FEATURE_COUNT = TYPE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.CustomTypeLinkImpl <em>Custom Type Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.CustomTypeLinkImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getCustomTypeLink()
   * @generated
   */
  int CUSTOM_TYPE_LINK = 20;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE_LINK__TARGET = TYPE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Type Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_TYPE_LINK_FEATURE_COUNT = TYPE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.FixedTypeImpl <em>Fixed Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.FixedTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getFixedType()
   * @generated
   */
  int FIXED_TYPE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE__SIZE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fixed Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.EnumTypeImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__LITERALS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.AnnotationImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUES = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ValuesImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getValues()
   * @generated
   */
  int VALUES = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__VALUE = 0;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ValueImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getValue()
   * @generated
   */
  int VALUE = 26;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.ArrayImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 25;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.BooleanValueImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 27;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.NullImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getNull()
   * @generated
   */
  int NULL = 28;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.StringValueImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 29;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.impl.IntValueImpl
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 30;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link avroclipse.avroIDL.ImportType <em>Import Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see avroclipse.avroIDL.ImportType
   * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getImportType()
   * @generated
   */
  int IMPORT_TYPE = 31;


  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.AvroIDLFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see avroclipse.avroIDL.AvroIDLFile
   * @generated
   */
  EClass getAvroIDLFile();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.AvroIDLFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see avroclipse.avroIDL.AvroIDLFile#getImports()
   * @see #getAvroIDLFile()
   * @generated
   */
  EReference getAvroIDLFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.AvroIDLFile#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocols</em>'.
   * @see avroclipse.avroIDL.AvroIDLFile#getProtocols()
   * @see #getAvroIDLFile()
   * @generated
   */
  EReference getAvroIDLFile_Protocols();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see avroclipse.avroIDL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Import#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see avroclipse.avroIDL.Import#getType()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Type();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see avroclipse.avroIDL.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see avroclipse.avroIDL.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.Protocol#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see avroclipse.avroIDL.Protocol#getAnnotations()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Annotations();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Protocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.Protocol#getName()
   * @see #getProtocol()
   * @generated
   */
  EAttribute getProtocol_Name();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.Protocol#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see avroclipse.avroIDL.Protocol#getElements()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Elements();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see avroclipse.avroIDL.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.RPCMessage <em>RPC Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RPC Message</em>'.
   * @see avroclipse.avroIDL.RPCMessage
   * @generated
   */
  EClass getRPCMessage();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.RPCMessage#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see avroclipse.avroIDL.RPCMessage#getReturnType()
   * @see #getRPCMessage()
   * @generated
   */
  EReference getRPCMessage_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.RPCMessage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.RPCMessage#getName()
   * @see #getRPCMessage()
   * @generated
   */
  EAttribute getRPCMessage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.RPCMessage#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see avroclipse.avroIDL.RPCMessage#getArguments()
   * @see #getRPCMessage()
   * @generated
   */
  EReference getRPCMessage_Arguments();

  /**
   * Returns the meta object for the reference '{@link avroclipse.avroIDL.RPCMessage#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Error</em>'.
   * @see avroclipse.avroIDL.RPCMessage#getError()
   * @see #getRPCMessage()
   * @generated
   */
  EReference getRPCMessage_Error();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.RPCMessage#isOneway <em>Oneway</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Oneway</em>'.
   * @see avroclipse.avroIDL.RPCMessage#isOneway()
   * @see #getRPCMessage()
   * @generated
   */
  EAttribute getRPCMessage_Oneway();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see avroclipse.avroIDL.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Argument#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see avroclipse.avroIDL.Argument#getDefault()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Default();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.ReturnTypeLink <em>Return Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Type Link</em>'.
   * @see avroclipse.avroIDL.ReturnTypeLink
   * @generated
   */
  EClass getReturnTypeLink();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.VoidTypeLink <em>Void Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type Link</em>'.
   * @see avroclipse.avroIDL.VoidTypeLink
   * @generated
   */
  EClass getVoidTypeLink();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.VoidTypeLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see avroclipse.avroIDL.VoidTypeLink#getTarget()
   * @see #getVoidTypeLink()
   * @generated
   */
  EAttribute getVoidTypeLink_Target();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see avroclipse.avroIDL.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.TypeDef#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see avroclipse.avroIDL.TypeDef#getAnnotations()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.TypeDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.TypeDef#getType()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Type();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see avroclipse.avroIDL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.ErrorType <em>Error Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Type</em>'.
   * @see avroclipse.avroIDL.ErrorType
   * @generated
   */
  EClass getErrorType();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.ErrorType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see avroclipse.avroIDL.ErrorType#getFields()
   * @see #getErrorType()
   * @generated
   */
  EReference getErrorType_Fields();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type</em>'.
   * @see avroclipse.avroIDL.RecordType
   * @generated
   */
  EClass getRecordType();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.RecordType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see avroclipse.avroIDL.RecordType#getFields()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Fields();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see avroclipse.avroIDL.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.Field#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see avroclipse.avroIDL.Field#getAnnotations()
   * @see #getField()
   * @generated
   */
  EReference getField_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.Field#getNameAnnotations <em>Name Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Annotations</em>'.
   * @see avroclipse.avroIDL.Field#getNameAnnotations()
   * @see #getField()
   * @generated
   */
  EReference getField_NameAnnotations();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Field#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see avroclipse.avroIDL.Field#getDefault()
   * @see #getField()
   * @generated
   */
  EReference getField_Default();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see avroclipse.avroIDL.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.SimpleFieldType <em>Simple Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Field Type</em>'.
   * @see avroclipse.avroIDL.SimpleFieldType
   * @generated
   */
  EClass getSimpleFieldType();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.SimpleFieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.SimpleFieldType#getType()
   * @see #getSimpleFieldType()
   * @generated
   */
  EReference getSimpleFieldType_Type();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.UnionFieldType <em>Union Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Field Type</em>'.
   * @see avroclipse.avroIDL.UnionFieldType
   * @generated
   */
  EClass getUnionFieldType();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.UnionFieldType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see avroclipse.avroIDL.UnionFieldType#getTypes()
   * @see #getUnionFieldType()
   * @generated
   */
  EReference getUnionFieldType_Types();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.ArrayFieldType <em>Array Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Field Type</em>'.
   * @see avroclipse.avroIDL.ArrayFieldType
   * @generated
   */
  EClass getArrayFieldType();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.ArrayFieldType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see avroclipse.avroIDL.ArrayFieldType#getAnnotation()
   * @see #getArrayFieldType()
   * @generated
   */
  EReference getArrayFieldType_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.ArrayFieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.ArrayFieldType#getType()
   * @see #getArrayFieldType()
   * @generated
   */
  EReference getArrayFieldType_Type();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.MapFieldType <em>Map Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Field Type</em>'.
   * @see avroclipse.avroIDL.MapFieldType
   * @generated
   */
  EClass getMapFieldType();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.MapFieldType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see avroclipse.avroIDL.MapFieldType#getAnnotation()
   * @see #getMapFieldType()
   * @generated
   */
  EReference getMapFieldType_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.MapFieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see avroclipse.avroIDL.MapFieldType#getType()
   * @see #getMapFieldType()
   * @generated
   */
  EReference getMapFieldType_Type();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.TypeLink <em>Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Link</em>'.
   * @see avroclipse.avroIDL.TypeLink
   * @generated
   */
  EClass getTypeLink();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.PrimativeTypeLink <em>Primative Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primative Type Link</em>'.
   * @see avroclipse.avroIDL.PrimativeTypeLink
   * @generated
   */
  EClass getPrimativeTypeLink();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.PrimativeTypeLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see avroclipse.avroIDL.PrimativeTypeLink#getTarget()
   * @see #getPrimativeTypeLink()
   * @generated
   */
  EAttribute getPrimativeTypeLink_Target();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.CustomTypeLink <em>Custom Type Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Type Link</em>'.
   * @see avroclipse.avroIDL.CustomTypeLink
   * @generated
   */
  EClass getCustomTypeLink();

  /**
   * Returns the meta object for the reference '{@link avroclipse.avroIDL.CustomTypeLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see avroclipse.avroIDL.CustomTypeLink#getTarget()
   * @see #getCustomTypeLink()
   * @generated
   */
  EReference getCustomTypeLink_Target();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.FixedType <em>Fixed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Type</em>'.
   * @see avroclipse.avroIDL.FixedType
   * @generated
   */
  EClass getFixedType();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.FixedType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see avroclipse.avroIDL.FixedType#getSize()
   * @see #getFixedType()
   * @generated
   */
  EAttribute getFixedType_Size();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see avroclipse.avroIDL.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the attribute list '{@link avroclipse.avroIDL.EnumType#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Literals</em>'.
   * @see avroclipse.avroIDL.EnumType#getLiterals()
   * @see #getEnumType()
   * @generated
   */
  EAttribute getEnumType_Literals();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see avroclipse.avroIDL.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see avroclipse.avroIDL.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Annotation#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see avroclipse.avroIDL.Annotation#getValues()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Values();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see avroclipse.avroIDL.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the containment reference list '{@link avroclipse.avroIDL.Values#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see avroclipse.avroIDL.Values#getValue()
   * @see #getValues()
   * @generated
   */
  EReference getValues_Value();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see avroclipse.avroIDL.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference '{@link avroclipse.avroIDL.Array#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see avroclipse.avroIDL.Array#getValues()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Values();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see avroclipse.avroIDL.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see avroclipse.avroIDL.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.BooleanValue#isVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see avroclipse.avroIDL.BooleanValue#isVal()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Val();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see avroclipse.avroIDL.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.Null#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see avroclipse.avroIDL.Null#getVal()
   * @see #getNull()
   * @generated
   */
  EAttribute getNull_Val();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see avroclipse.avroIDL.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.StringValue#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see avroclipse.avroIDL.StringValue#getVal()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Val();

  /**
   * Returns the meta object for class '{@link avroclipse.avroIDL.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see avroclipse.avroIDL.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link avroclipse.avroIDL.IntValue#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see avroclipse.avroIDL.IntValue#getVal()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Val();

  /**
   * Returns the meta object for enum '{@link avroclipse.avroIDL.ImportType <em>Import Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Import Type</em>'.
   * @see avroclipse.avroIDL.ImportType
   * @generated
   */
  EEnum getImportType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AvroIDLFactory getAvroIDLFactory();

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
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.AvroIDLFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.AvroIDLFileImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getAvroIDLFile()
     * @generated
     */
    EClass AVRO_IDL_FILE = eINSTANCE.getAvroIDLFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVRO_IDL_FILE__IMPORTS = eINSTANCE.getAvroIDLFile_Imports();

    /**
     * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVRO_IDL_FILE__PROTOCOLS = eINSTANCE.getAvroIDLFile_Protocols();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ImportImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__TYPE = eINSTANCE.getImport_Type();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ProtocolImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__ANNOTATIONS = eINSTANCE.getProtocol_Annotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__ELEMENTS = eINSTANCE.getProtocol_Elements();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ElementImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.RPCMessageImpl <em>RPC Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.RPCMessageImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getRPCMessage()
     * @generated
     */
    EClass RPC_MESSAGE = eINSTANCE.getRPCMessage();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC_MESSAGE__RETURN_TYPE = eINSTANCE.getRPCMessage_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RPC_MESSAGE__NAME = eINSTANCE.getRPCMessage_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC_MESSAGE__ARGUMENTS = eINSTANCE.getRPCMessage_Arguments();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPC_MESSAGE__ERROR = eINSTANCE.getRPCMessage_Error();

    /**
     * The meta object literal for the '<em><b>Oneway</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RPC_MESSAGE__ONEWAY = eINSTANCE.getRPCMessage_Oneway();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ArgumentImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__DEFAULT = eINSTANCE.getArgument_Default();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ReturnTypeLinkImpl <em>Return Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ReturnTypeLinkImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getReturnTypeLink()
     * @generated
     */
    EClass RETURN_TYPE_LINK = eINSTANCE.getReturnTypeLink();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.VoidTypeLinkImpl <em>Void Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.VoidTypeLinkImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getVoidTypeLink()
     * @generated
     */
    EClass VOID_TYPE_LINK = eINSTANCE.getVoidTypeLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOID_TYPE_LINK__TARGET = eINSTANCE.getVoidTypeLink_Target();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.TypeDefImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__ANNOTATIONS = eINSTANCE.getTypeDef_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__TYPE = eINSTANCE.getTypeDef_Type();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.TypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ErrorTypeImpl <em>Error Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ErrorTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getErrorType()
     * @generated
     */
    EClass ERROR_TYPE = eINSTANCE.getErrorType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_TYPE__FIELDS = eINSTANCE.getErrorType_Fields();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.RecordTypeImpl <em>Record Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.RecordTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getRecordType()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getRecordType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELDS = eINSTANCE.getRecordType_Fields();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.FieldImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ANNOTATIONS = eINSTANCE.getField_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__NAME_ANNOTATIONS = eINSTANCE.getField_NameAnnotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__DEFAULT = eINSTANCE.getField_Default();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.FieldTypeImpl <em>Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.FieldTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getFieldType()
     * @generated
     */
    EClass FIELD_TYPE = eINSTANCE.getFieldType();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.SimpleFieldTypeImpl <em>Simple Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.SimpleFieldTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getSimpleFieldType()
     * @generated
     */
    EClass SIMPLE_FIELD_TYPE = eINSTANCE.getSimpleFieldType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FIELD_TYPE__TYPE = eINSTANCE.getSimpleFieldType_Type();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.UnionFieldTypeImpl <em>Union Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.UnionFieldTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getUnionFieldType()
     * @generated
     */
    EClass UNION_FIELD_TYPE = eINSTANCE.getUnionFieldType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_FIELD_TYPE__TYPES = eINSTANCE.getUnionFieldType_Types();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ArrayFieldTypeImpl <em>Array Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ArrayFieldTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArrayFieldType()
     * @generated
     */
    EClass ARRAY_FIELD_TYPE = eINSTANCE.getArrayFieldType();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_FIELD_TYPE__ANNOTATION = eINSTANCE.getArrayFieldType_Annotation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_FIELD_TYPE__TYPE = eINSTANCE.getArrayFieldType_Type();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.MapFieldTypeImpl <em>Map Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.MapFieldTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getMapFieldType()
     * @generated
     */
    EClass MAP_FIELD_TYPE = eINSTANCE.getMapFieldType();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FIELD_TYPE__ANNOTATION = eINSTANCE.getMapFieldType_Annotation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FIELD_TYPE__TYPE = eINSTANCE.getMapFieldType_Type();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.TypeLinkImpl <em>Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.TypeLinkImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getTypeLink()
     * @generated
     */
    EClass TYPE_LINK = eINSTANCE.getTypeLink();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.PrimativeTypeLinkImpl <em>Primative Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.PrimativeTypeLinkImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getPrimativeTypeLink()
     * @generated
     */
    EClass PRIMATIVE_TYPE_LINK = eINSTANCE.getPrimativeTypeLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMATIVE_TYPE_LINK__TARGET = eINSTANCE.getPrimativeTypeLink_Target();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.CustomTypeLinkImpl <em>Custom Type Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.CustomTypeLinkImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getCustomTypeLink()
     * @generated
     */
    EClass CUSTOM_TYPE_LINK = eINSTANCE.getCustomTypeLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_TYPE_LINK__TARGET = eINSTANCE.getCustomTypeLink_Target();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.FixedTypeImpl <em>Fixed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.FixedTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getFixedType()
     * @generated
     */
    EClass FIXED_TYPE = eINSTANCE.getFixedType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_TYPE__SIZE = eINSTANCE.getFixedType_Size();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.EnumTypeImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_TYPE__LITERALS = eINSTANCE.getEnumType_Literals();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.AnnotationImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__VALUES = eINSTANCE.getAnnotation_Values();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ValuesImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUES__VALUE = eINSTANCE.getValues_Value();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ArrayImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__VALUES = eINSTANCE.getArray_Values();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.ValueImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.BooleanValueImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VAL = eINSTANCE.getBooleanValue_Val();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.NullImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL__VAL = eINSTANCE.getNull_Val();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.StringValueImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VAL = eINSTANCE.getStringValue_Val();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.impl.IntValueImpl
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VAL = eINSTANCE.getIntValue_Val();

    /**
     * The meta object literal for the '{@link avroclipse.avroIDL.ImportType <em>Import Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see avroclipse.avroIDL.ImportType
     * @see avroclipse.avroIDL.impl.AvroIDLPackageImpl#getImportType()
     * @generated
     */
    EEnum IMPORT_TYPE = eINSTANCE.getImportType();

  }

} //AvroIDLPackage
