

/* First created by JCasGen Fri Mar 21 03:24:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class InvertedIndex extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(InvertedIndex.class);
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
  protected InvertedIndex() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public InvertedIndex(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public InvertedIndex(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public InvertedIndex(JCas jcas, int begin, int end) {
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
  //* Feature: lucene_id

  /** getter for lucene_id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLucene_id() {
    if (InvertedIndex_Type.featOkTst && ((InvertedIndex_Type)jcasType).casFeat_lucene_id == null)
      jcasType.jcas.throwFeatMissing("lucene_id", "edu.cmu.deiis.types.InvertedIndex");
    return jcasType.ll_cas.ll_getIntValue(addr, ((InvertedIndex_Type)jcasType).casFeatCode_lucene_id);}
    
  /** setter for lucene_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLucene_id(int v) {
    if (InvertedIndex_Type.featOkTst && ((InvertedIndex_Type)jcasType).casFeat_lucene_id == null)
      jcasType.jcas.throwFeatMissing("lucene_id", "edu.cmu.deiis.types.InvertedIndex");
    jcasType.ll_cas.ll_setIntValue(addr, ((InvertedIndex_Type)jcasType).casFeatCode_lucene_id, v);}    
  }

    