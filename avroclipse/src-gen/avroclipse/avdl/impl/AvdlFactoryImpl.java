/**
 */
package avroclipse.avdl.impl;

import avroclipse.avdl.*;

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
public class AvdlFactoryImpl extends EFactoryImpl implements AvdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AvdlFactory init()
  {
    try
    {
      AvdlFactory theAvdlFactory = (AvdlFactory)EPackage.Registry.INSTANCE.getEFactory(AvdlPackage.eNS_URI);
      if (theAvdlFactory != null)
      {
        return theAvdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AvdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvdlFactoryImpl()
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
      case AvdlPackage.AVDL_FILE: return createAvdlFile();
      case AvdlPackage.IMPORT: return createImport();
      case AvdlPackage.PROTOCOL: return createProtocol();
      case AvdlPackage.ELEMENT: return createElement();
      case AvdlPackage.RPC_MESSAGE: return createRPCMessage();
      case AvdlPackage.ARGUMENT: return createArgument();
      case AvdlPackage.RETURN_TYPE_LINK: return createReturnTypeLink();
      case AvdlPackage.VOID_TYPE_LINK: return createVoidTypeLink();
      case AvdlPackage.TYPE_DEF: return createTypeDef();
      case AvdlPackage.TYPE: return createType();
      case AvdlPackage.ERROR_TYPE: return createErrorType();
      case AvdlPackage.RECORD_TYPE: return createRecordType();
      case AvdlPackage.FIELD: return createField();
      case AvdlPackage.FIELD_TYPE: return createFieldType();
      case AvdlPackage.SIMPLE_FIELD_TYPE: return createSimpleFieldType();
      case AvdlPackage.UNION_FIELD_TYPE: return createUnionFieldType();
      case AvdlPackage.ARRAY_FIELD_TYPE: return createArrayFieldType();
      case AvdlPackage.MAP_FIELD_TYPE: return createMapFieldType();
      case AvdlPackage.TYPE_LINK: return createTypeLink();
      case AvdlPackage.PRIMATIVE_TYPE_LINK: return createPrimativeTypeLink();
      case AvdlPackage.CUSTOM_TYPE_LINK: return createCustomTypeLink();
      case AvdlPackage.FIXED_TYPE: return createFixedType();
      case AvdlPackage.ENUM_TYPE: return createEnumType();
      case AvdlPackage.ANNOTATION: return createAnnotation();
      case AvdlPackage.VALUES: return createValues();
      case AvdlPackage.ARRAY: return createArray();
      case AvdlPackage.VALUE: return createValue();
      case AvdlPackage.NULL: return createNull();
      case AvdlPackage.STRING_VALUE: return createStringValue();
      case AvdlPackage.INT_VALUE: return createIntValue();
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
      case AvdlPackage.IMPORT_TYPE:
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
      case AvdlPackage.IMPORT_TYPE:
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
  public AvdlFile createAvdlFile()
  {
    AvdlFileImpl avdlFile = new AvdlFileImpl();
    return avdlFile;
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
  public AvdlPackage getAvdlPackage()
  {
    return (AvdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AvdlPackage getPackage()
  {
    return AvdlPackage.eINSTANCE;
  }

} //AvdlFactoryImpl
