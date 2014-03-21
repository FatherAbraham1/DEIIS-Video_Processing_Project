

/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/videoProcessingUIMA/src/main/resources/descriptors/videoProc_typeSystem.xml
 * @generated */
public class Query extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Query.class);
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
  protected Query() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Query(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Query(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Query(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Source getSource() {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.deiis.types.Query");
    return (Source)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Query_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Source v) {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.deiis.types.Query");
    jcasType.ll_cas.ll_setRefValue(addr, ((Query_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: image

  /** getter for image - gets 
   * @generated
   * @return value of the feature 
   */
  public Image getImage() {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "edu.cmu.deiis.types.Query");
    return (Image)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Query_Type)jcasType).casFeatCode_image)));}
    
  /** setter for image - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImage(Image v) {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "edu.cmu.deiis.types.Query");
    jcasType.ll_cas.ll_setRefValue(addr, ((Query_Type)jcasType).casFeatCode_image, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: type_query

  /** getter for type_query - gets 
   * @generated
   * @return value of the feature 
   */
  public String getType_query() {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_type_query == null)
      jcasType.jcas.throwFeatMissing("type_query", "edu.cmu.deiis.types.Query");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Query_Type)jcasType).casFeatCode_type_query);}
    
  /** setter for type_query - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setType_query(String v) {
    if (Query_Type.featOkTst && ((Query_Type)jcasType).casFeat_type_query == null)
      jcasType.jcas.throwFeatMissing("type_query", "edu.cmu.deiis.types.Query");
    jcasType.ll_cas.ll_setStringValue(addr, ((Query_Type)jcasType).casFeatCode_type_query, v);}    
  }

    