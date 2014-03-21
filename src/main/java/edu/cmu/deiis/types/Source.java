

/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class Source extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Source.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Source() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Source(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Source(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Source(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: path

  /** getter for path - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPath() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "edu.cmu.deiis.types.Source");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Source_Type)jcasType).casFeatCode_path);}
    
  /** setter for path - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPath(String v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "edu.cmu.deiis.types.Source");
    jcasType.ll_cas.ll_setStringValue(addr, ((Source_Type)jcasType).casFeatCode_path, v);}    
   
    
  //*--------------*
  //* Feature: type_source

  /** getter for type_source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getType_source() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_type_source == null)
      jcasType.jcas.throwFeatMissing("type_source", "edu.cmu.deiis.types.Source");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Source_Type)jcasType).casFeatCode_type_source);}
    
  /** setter for type_source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setType_source(String v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_type_source == null)
      jcasType.jcas.throwFeatMissing("type_source", "edu.cmu.deiis.types.Source");
    jcasType.ll_cas.ll_setStringValue(addr, ((Source_Type)jcasType).casFeatCode_type_source, v);}    
  }

    