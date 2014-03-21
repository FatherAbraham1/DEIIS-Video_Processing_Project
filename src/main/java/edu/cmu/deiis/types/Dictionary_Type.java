
/* First created by JCasGen Fri Mar 21 03:24:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * @generated */
public class Dictionary_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Dictionary_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Dictionary_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Dictionary(addr, Dictionary_Type.this);
  			   Dictionary_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Dictionary(addr, Dictionary_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Dictionary.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Dictionary");



  /** @generated */
  final Feature casFeat_visual_words;
  /** @generated */
  final int     casFeatCode_visual_words;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVisual_words(int addr) {
        if (featOkTst && casFeat_visual_words == null)
      jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    return ll_cas.ll_getRefValue(addr, casFeatCode_visual_words);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVisual_words(int addr, int v) {
        if (featOkTst && casFeat_visual_words == null)
      jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    ll_cas.ll_setRefValue(addr, casFeatCode_visual_words, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getVisual_words(int addr, int i) {
        if (featOkTst && casFeat_visual_words == null)
      jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVisual_words(int addr, int i, int v) {
        if (featOkTst && casFeat_visual_words == null)
      jcas.throwFeatMissing("visual_words", "edu.cmu.deiis.types.Dictionary");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_visual_words), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_cluster_method;
  /** @generated */
  final int     casFeatCode_cluster_method;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCluster_method(int addr) {
        if (featOkTst && casFeat_cluster_method == null)
      jcas.throwFeatMissing("cluster_method", "edu.cmu.deiis.types.Dictionary");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cluster_method);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCluster_method(int addr, String v) {
        if (featOkTst && casFeat_cluster_method == null)
      jcas.throwFeatMissing("cluster_method", "edu.cmu.deiis.types.Dictionary");
    ll_cas.ll_setStringValue(addr, casFeatCode_cluster_method, v);}
    
  
 
  /** @generated */
  final Feature casFeat_size_dictionary;
  /** @generated */
  final int     casFeatCode_size_dictionary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSize_dictionary(int addr) {
        if (featOkTst && casFeat_size_dictionary == null)
      jcas.throwFeatMissing("size_dictionary", "edu.cmu.deiis.types.Dictionary");
    return ll_cas.ll_getIntValue(addr, casFeatCode_size_dictionary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSize_dictionary(int addr, int v) {
        if (featOkTst && casFeat_size_dictionary == null)
      jcas.throwFeatMissing("size_dictionary", "edu.cmu.deiis.types.Dictionary");
    ll_cas.ll_setIntValue(addr, casFeatCode_size_dictionary, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Dictionary_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_visual_words = jcas.getRequiredFeatureDE(casType, "visual_words", "uima.cas.FSArray", featOkTst);
    casFeatCode_visual_words  = (null == casFeat_visual_words) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_visual_words).getCode();

 
    casFeat_cluster_method = jcas.getRequiredFeatureDE(casType, "cluster_method", "uima.cas.String", featOkTst);
    casFeatCode_cluster_method  = (null == casFeat_cluster_method) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cluster_method).getCode();

 
    casFeat_size_dictionary = jcas.getRequiredFeatureDE(casType, "size_dictionary", "uima.cas.Integer", featOkTst);
    casFeatCode_size_dictionary  = (null == casFeat_size_dictionary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_size_dictionary).getCode();

  }
}



    