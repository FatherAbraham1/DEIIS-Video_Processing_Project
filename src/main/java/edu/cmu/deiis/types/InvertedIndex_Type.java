
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
public class InvertedIndex_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (InvertedIndex_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = InvertedIndex_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new InvertedIndex(addr, InvertedIndex_Type.this);
  			   InvertedIndex_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new InvertedIndex(addr, InvertedIndex_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = InvertedIndex.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.InvertedIndex");



  /** @generated */
  final Feature casFeat_lucene_id;
  /** @generated */
  final int     casFeatCode_lucene_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLucene_id(int addr) {
        if (featOkTst && casFeat_lucene_id == null)
      jcas.throwFeatMissing("lucene_id", "edu.cmu.deiis.types.InvertedIndex");
    return ll_cas.ll_getIntValue(addr, casFeatCode_lucene_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLucene_id(int addr, int v) {
        if (featOkTst && casFeat_lucene_id == null)
      jcas.throwFeatMissing("lucene_id", "edu.cmu.deiis.types.InvertedIndex");
    ll_cas.ll_setIntValue(addr, casFeatCode_lucene_id, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public InvertedIndex_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lucene_id = jcas.getRequiredFeatureDE(casType, "lucene_id", "uima.cas.Integer", featOkTst);
    casFeatCode_lucene_id  = (null == casFeat_lucene_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lucene_id).getCode();

  }
}



    