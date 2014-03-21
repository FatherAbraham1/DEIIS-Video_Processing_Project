
/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
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
public class Query_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Query_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Query_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Query(addr, Query_Type.this);
  			   Query_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Query(addr, Query_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Query.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Query");



  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "edu.cmu.deiis.types.Query");
    return ll_cas.ll_getRefValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "edu.cmu.deiis.types.Query");
    ll_cas.ll_setRefValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_image;
  /** @generated */
  final int     casFeatCode_image;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getImage(int addr) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "edu.cmu.deiis.types.Query");
    return ll_cas.ll_getRefValue(addr, casFeatCode_image);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImage(int addr, int v) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "edu.cmu.deiis.types.Query");
    ll_cas.ll_setRefValue(addr, casFeatCode_image, v);}
    
  
 
  /** @generated */
  final Feature casFeat_type_query;
  /** @generated */
  final int     casFeatCode_type_query;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getType_query(int addr) {
        if (featOkTst && casFeat_type_query == null)
      jcas.throwFeatMissing("type_query", "edu.cmu.deiis.types.Query");
    return ll_cas.ll_getStringValue(addr, casFeatCode_type_query);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setType_query(int addr, String v) {
        if (featOkTst && casFeat_type_query == null)
      jcas.throwFeatMissing("type_query", "edu.cmu.deiis.types.Query");
    ll_cas.ll_setStringValue(addr, casFeatCode_type_query, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Query_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "edu.cmu.deiis.types.Source", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_image = jcas.getRequiredFeatureDE(casType, "image", "edu.cmu.deiis.types.Image", featOkTst);
    casFeatCode_image  = (null == casFeat_image) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_image).getCode();

 
    casFeat_type_query = jcas.getRequiredFeatureDE(casType, "type_query", "uima.cas.String", featOkTst);
    casFeatCode_type_query  = (null == casFeat_type_query) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_type_query).getCode();

  }
}



    