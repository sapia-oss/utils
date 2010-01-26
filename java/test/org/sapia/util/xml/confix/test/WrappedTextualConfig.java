package org.sapia.util.xml.confix.test;

import org.sapia.util.xml.confix.ObjectWrapperIF;


/**
 *
 *
 * @author Jean-Cedric Desrochers
 *
 * <dl>
 * <dt><b>Copyright:</b><dd>Copyright &#169; 2002-2003 <a href="http://www.sapia-oss.org">Sapia Open Source Software</a>. All Rights Reserved.</dd></dt>
 * <dt><b>License:</b><dd>Read the license.txt file of the jar or visit the
 *        <a href="http://www.sapia-oss.org/license.html">license page</a> at the Sapia OSS web site</dd></dt>
 * </dl>
 */
public class WrappedTextualConfig implements ObjectWrapperIF {

  private TextualConfig _theConfig;

  public WrappedTextualConfig() {
    _theConfig = new TextualConfig();
  }

  public TextualConfig getTextualConfig() {
    return _theConfig;
  }

//  public void setText(String aContent) {
//    throw new UnsupportedOperationException("The method setText is not implemented");
//  }
//
//  public void setName(String aName) {
//    throw new UnsupportedOperationException("The method setName is not implemented");
//  }
//
//  public void addWrappedNamedValue(WrappedNamedValue aWrapper) {
//    throw new UnsupportedOperationException("The method addWrappedNamedValue is not implemented");
//  }
//
//  public void addNamedValue(NamedValue aNamedValue) {
//    throw new UnsupportedOperationException("The method addNamedValue is not implemented");
//  }

  public Object getWrappedObject() {
    return _theConfig;
  }
}
