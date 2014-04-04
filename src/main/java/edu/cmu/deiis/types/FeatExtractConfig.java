

/* First created by JCasGen Fri Mar 28 00:42:28 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Mar 28 00:42:28 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class FeatExtractConfig extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FeatExtractConfig.class);
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected FeatExtractConfig() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FeatExtractConfig(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FeatExtractConfig(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FeatExtractConfig(JCas jcas, int begin, int end) {
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
  //* Feature: imgExt

  /** getter for imgExt - gets 
   * @generated
   * @return value of the feature 
   */
  public String getImgExt() {
    if (FeatExtractConfig_Type.featOkTst && ((FeatExtractConfig_Type)jcasType).casFeat_imgExt == null)
      jcasType.jcas.throwFeatMissing("imgExt", "edu.cmu.deiis.types.FeatExtractConfig");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FeatExtractConfig_Type)jcasType).casFeatCode_imgExt);}
    
  /** setter for imgExt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImgExt(String v) {
    if (FeatExtractConfig_Type.featOkTst && ((FeatExtractConfig_Type)jcasType).casFeat_imgExt == null)
      jcasType.jcas.throwFeatMissing("imgExt", "edu.cmu.deiis.types.FeatExtractConfig");
    jcasType.ll_cas.ll_setStringValue(addr, ((FeatExtractConfig_Type)jcasType).casFeatCode_imgExt, v);}    
   
    
  //*--------------*
  //* Feature: featMethod

  /** getter for featMethod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFeatMethod() {
    if (FeatExtractConfig_Type.featOkTst && ((FeatExtractConfig_Type)jcasType).casFeat_featMethod == null)
      jcasType.jcas.throwFeatMissing("featMethod", "edu.cmu.deiis.types.FeatExtractConfig");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FeatExtractConfig_Type)jcasType).casFeatCode_featMethod);}
    
  /** setter for featMethod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatMethod(String v) {
    if (FeatExtractConfig_Type.featOkTst && ((FeatExtractConfig_Type)jcasType).casFeat_featMethod == null)
      jcasType.jcas.throwFeatMissing("featMethod", "edu.cmu.deiis.types.FeatExtractConfig");
    jcasType.ll_cas.ll_setStringValue(addr, ((FeatExtractConfig_Type)jcasType).casFeatCode_featMethod, v);}    
  }

    