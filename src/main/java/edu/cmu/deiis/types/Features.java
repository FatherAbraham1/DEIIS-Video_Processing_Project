

/* First created by JCasGen Fri Mar 21 03:27:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.Sofa;


/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class Features extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Features.class);
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
  protected Features() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Features(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Features(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Features(JCas jcas, int begin, int end) {
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
  //* Feature: vector

  /** getter for vector - gets 
   * @generated
   * @return value of the feature 
   */
  public Sofa getVector() {
    if (Features_Type.featOkTst && ((Features_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.Features");
    return (Sofa)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Features_Type)jcasType).casFeatCode_vector)));}
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(Sofa v) {
    if (Features_Type.featOkTst && ((Features_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "edu.cmu.deiis.types.Features");
    jcasType.ll_cas.ll_setRefValue(addr, ((Features_Type)jcasType).casFeatCode_vector, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    