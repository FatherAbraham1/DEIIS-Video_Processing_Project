

/* First created by JCasGen Fri Mar 21 03:24:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class Dictionary extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Dictionary.class);
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
  protected Dictionary() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Dictionary(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Dictionary(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Dictionary(JCas jcas, int begin, int end) {
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
  //* Feature: visual_words

  /** getter for visual_words - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getVisual_words() {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_visual_words == null)
      jcasType.jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words)));}
    
  /** setter for visual_words - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVisual_words(FSArray v) {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_visual_words == null)
      jcasType.jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    jcasType.ll_cas.ll_setRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for visual_words - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DoubleArray getVisual_words(int i) {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_visual_words == null)
      jcasType.jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words), i);
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words), i)));}

  /** indexed setter for visual_words - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVisual_words(int i, DoubleArray v) { 
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_visual_words == null)
      jcasType.jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Dictionary_Type)jcasType).casFeatCode_visual_words), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: cluster_method

  /** getter for cluster_method - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCluster_method() {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_cluster_method == null)
      jcasType.jcas.throwFeatMissing("cluster_method", "edu.cmu.deiis.types.Dictionary");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Dictionary_Type)jcasType).casFeatCode_cluster_method);}
    
  /** setter for cluster_method - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCluster_method(String v) {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_cluster_method == null)
      jcasType.jcas.throwFeatMissing("cluster_method", "edu.cmu.deiis.types.Dictionary");
    jcasType.ll_cas.ll_setStringValue(addr, ((Dictionary_Type)jcasType).casFeatCode_cluster_method, v);}    
   
    
  //*--------------*
  //* Feature: size_dictionary

  /** getter for size_dictionary - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSize_dictionary() {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_size_dictionary == null)
      jcasType.jcas.throwFeatMissing("size_dictionary", "edu.cmu.deiis.types.Dictionary");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Dictionary_Type)jcasType).casFeatCode_size_dictionary);}
    
  /** setter for size_dictionary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSize_dictionary(int v) {
    if (Dictionary_Type.featOkTst && ((Dictionary_Type)jcasType).casFeat_size_dictionary == null)
      jcasType.jcas.throwFeatMissing("size_dictionary", "edu.cmu.deiis.types.Dictionary");
    jcasType.ll_cas.ll_setIntValue(addr, ((Dictionary_Type)jcasType).casFeatCode_size_dictionary, v);}    
  }

    