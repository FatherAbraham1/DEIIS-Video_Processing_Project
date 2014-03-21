

/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.DocumentAnnotation;


import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class Image extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Image.class);
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
  protected Image() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Image(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Image(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Image(JCas jcas, int begin, int end) {
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
  //* Feature: features

  /** getter for features - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeatures() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "edu.cmu.deiis.types.Image");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Image_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(FSArray v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "edu.cmu.deiis.types.Image");
    jcasType.ll_cas.ll_setRefValue(addr, ((Image_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public DoubleArray getFeatures(int i) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "edu.cmu.deiis.types.Image");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Image_Type)jcasType).casFeatCode_features), i);
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Image_Type)jcasType).casFeatCode_features), i)));}

  /** indexed setter for features - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, DoubleArray v) { 
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "edu.cmu.deiis.types.Image");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Image_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Image_Type)jcasType).casFeatCode_features), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    