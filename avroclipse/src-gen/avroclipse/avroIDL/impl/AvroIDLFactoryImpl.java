/**
 */
package avroclipse.avroIDL.impl;

import avroclipse.avroIDL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvroIDLFactoryImpl extends EFactoryImpl implements AvroIDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AvroIDLFactory init()
  {
    try
    {
      AvroIDLFactory theAvroIDLFactory = (AvroIDLFactory)EPackage.Registry.INSTANCE.getEFactory(AvroIDLPackage.eNS_URI);
      if (theAvroIDLFactory != null)
      {
        return theAvroIDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AvroIDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroIDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AvroIDLPackage.AVRO_IDL_FILE: return createAvroIDLFile();
      case AvroIDLPackage.IMPORT: return createImport();
      case AvroIDLPackage.PROTOCOL: return createProtocol();
      case AvroIDLPackage.ELEMENT: return createElement();
      case AvroIDLPackage.RPC_MESSAGE: return createRPCMessage();
      case AvroIDLPackage.ARGUMENT: return createArgument();
      case AvroIDLPackage.RETURN_TYPE_LINK: return createReturnTypeLink();
      case AvroIDLPackage.VOID_TYPE_LINK: return createVoidTypeLink();
      case AvroIDLPackage.TYPE_DEF: return createTypeDef();
      case AvroIDLPackage.TYPE: return createType();
      case AvroIDLPackage.ERROR_TYPE: return createErrorType();
      case AvroIDLPackage.RECORD_TYPE: return createRecordType();
      case AvroIDLPackage.FIELD: return createField();
      case AvroIDLPackage.FIELD_TYPE: return createFieldType();
      case AvroIDLPackage.SIMPLE_FIELD_TYPE: return createSimpleFieldType();
      case AvroIDLPackage.UNION_FIELD_TYPE: return createUnionFieldType();
      case AvroIDLPackage.ARRAY_FIELD_TYPE: return createArrayFieldType();
      case AvroIDLPackage.MAP_FIELD_TYPE: return createMapFieldType();
      case AvroIDLPackage.TYPE_LINK: return createTypeLink();
      case AvroIDLPackage.PRIMATIVE_TYPE_LINK: return createPrimativeTypeLink();
      case AvroIDLPackage.CUSTOM_TYPE_LINK: return createCustomTypeLink();
      case AvroIDLPackage.FIXED_TYPE: return createFixedType();
      case AvroIDLPackage.ENUM_TYPE: return createEnumType();
      case AvroIDLPackage.ANNOTATION: return createAnnotation();
      case AvroIDLPackage.VALUES: return createValues();
      case AvroIDLPackage.ARRAY: return createArray();
      case AvroIDLPackage.VALUE: return createValue();
      case AvroIDLPackage.BOOLEAN_VALUE: return createBooleanValue();
      case AvroIDLPackage.NULL: return createNull();
      case AvroIDLPackage.STRING_VALUE: return createStringValue();
      case AvroIDLPackage.INT_VALUE: return createIntValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AvroIDLPackage.IMPORT_TYPE:
        return createImportTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AvroIDLPackage.IMPORT_TYPE:
        return convertImportTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroIDLFile createAvroIDLFile()
  {
    AvroIDLFileImpl avroIDLFile = new AvroIDLFileImpl();
    return avroIDLFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPCMessage createRPCMessage()
  {
    RPCMessageImpl rpcMessage = new RPCMessageImpl();
    return rpcMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnTypeLink createReturnTypeLink()
  {
    ReturnTypeLinkImpl returnTypeLink = new ReturnTypeLinkImpl();
    return returnTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidTypeLink createVoidTypeLink()
  {
    VoidTypeLinkImpl voidTypeLink = new VoidTypeLinkImpl();
    return voidTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorType createErrorType()
  {
    ErrorTypeImpl errorType = new ErrorTypeImpl();
    return errorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType createRecordType()
  {
    RecordTypeImpl recordType = new RecordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType()
  {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleFieldType createSimpleFieldType()
  {
    SimpleFieldTypeImpl simpleFieldType = new SimpleFieldTypeImpl();
    return simpleFieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionFieldType createUnionFieldType()
  {
    UnionFieldTypeImpl unionFieldType = new UnionFieldTypeImpl();
    return unionFieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayFieldType createArrayFieldType()
  {
    ArrayFieldTypeImpl arrayFieldType = new ArrayFieldTypeImpl();
    return arrayFieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapFieldType createMapFieldType()
  {
    MapFieldTypeImpl mapFieldType = new MapFieldTypeImpl();
    return mapFieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLink createTypeLink()
  {
    TypeLinkImpl typeLink = new TypeLinkImpl();
    return typeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimativeTypeLink createPrimativeTypeLink()
  {
    PrimativeTypeLinkImpl primativeTypeLink = new PrimativeTypeLinkImpl();
    return primativeTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomTypeLink createCustomTypeLink()
  {
    CustomTypeLinkImpl customTypeLink = new CustomTypeLinkImpl();
    return customTypeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedType createFixedType()
  {
    FixedTypeImpl fixedType = new FixedTypeImpl();
    return fixedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportType createImportTypeFromString(EDataType eDataType, String initialValue)
  {
    ImportType result = ImportType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertImportTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroIDLPackage getAvroIDLPackage()
  {
    return (AvroIDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AvroIDLPackage getPackage()
  {
    return AvroIDLPackage.eINSTANCE;
  }

} //AvroIDLFactoryImpl
