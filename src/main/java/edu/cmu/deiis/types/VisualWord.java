

/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.Sofa;


/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class VisualWord extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VisualWord.class);
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
  protected VisualWord() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public VisualWord(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VisualWord(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public VisualWord(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (VisualWord_Type.featOkTst && ((VisualWord_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.deiis.types.VisualWord");
    return jcasType.ll_cas.ll_getIntValue(addr, ((VisualWord_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (VisualWord_Type.featOkTst && ((VisualWord_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.deiis.types.VisualWord");
    jcasType.ll_cas.ll_setIntValue(addr, ((VisualWord_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: vector

  /** getter for vector - gets 
   * @generated
   * @return value of the feature 
   */
  public Sofa getVector() {
    if (VisualWord_Type.featOkTst && ((VisualWord_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.VisualWord");
    return (Sofa)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((VisualWord_Type)jcasType).casFeatCode_vector)));}
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(Sofa v) {
    if (VisualWord_Type.featOkTst && ((VisualWord_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.VisualWord");
    jcasType.ll_cas.ll_setRefValue(addr, ((VisualWord_Type)jcasType).casFeatCode_vector, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    