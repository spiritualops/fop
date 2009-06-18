/*-- $Id$ -- 

 ============================================================================
                   The Apache Software License, Version 1.1
 ============================================================================
 
    Copyright (C) 1999 The Apache Software Foundation. All rights reserved.
 
 Redistribution and use in source and binary forms, with or without modifica-
 tion, are permitted provided that the following conditions are met:
 
 1. Redistributions of  source code must  retain the above copyright  notice,
    this list of conditions and the following disclaimer.
 
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
 
 3. The end-user documentation included with the redistribution, if any, must
    include  the following  acknowledgment:  "This product includes  software
    developed  by the  Apache Software Foundation  (http://www.apache.org/)."
    Alternately, this  acknowledgment may  appear in the software itself,  if
    and wherever such third-party acknowledgments normally appear.
 
 4. The names "Fop" and  "Apache Software Foundation"  must not be used to
    endorse  or promote  products derived  from this  software without  prior
    written permission. For written permission, please contact
    apache@apache.org.
 
 5. Products  derived from this software may not  be called "Apache", nor may
    "Apache" appear  in their name,  without prior written permission  of the
    Apache Software Foundation.
 
 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES,
 INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 FITNESS  FOR A PARTICULAR  PURPOSE ARE  DISCLAIMED.  IN NO  EVENT SHALL  THE
 APACHE SOFTWARE  FOUNDATION  OR ITS CONTRIBUTORS  BE LIABLE FOR  ANY DIRECT,
 INDIRECT, INCIDENTAL, SPECIAL,  EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLU-
 DING, BUT NOT LIMITED TO, PROCUREMENT  OF SUBSTITUTE GOODS OR SERVICES; LOSS
 OF USE, DATA, OR  PROFITS; OR BUSINESS  INTERRUPTION)  HOWEVER CAUSED AND ON
 ANY  THEORY OF LIABILITY,  WHETHER  IN CONTRACT,  STRICT LIABILITY,  OR TORT
 (INCLUDING  NEGLIGENCE OR  OTHERWISE) ARISING IN  ANY WAY OUT OF THE  USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 
 This software  consists of voluntary contributions made  by many individuals
 on  behalf of the Apache Software  Foundation and was  originally created by
 James Tauber <jtauber@jtauber.com>. For more  information on the Apache 
 Software Foundation, please see <http://www.apache.org/>.
 
 */
package org.apache.fop.fo.pagination;

// FOP
import org.apache.fop.fo.FObj;
import org.apache.fop.fo.PropertyList;
import org.apache.fop.fo.properties.Overflow;
import org.apache.fop.datatypes.ColorType;
import org.apache.fop.apps.FOPException;
import org.apache.fop.layout.RegionArea;
import org.apache.fop.layout.BodyRegionArea;
import org.apache.fop.messaging.MessageHandler;

public class RegionBody extends Region {

 
    public static class Maker extends FObj.Maker {
	public FObj make(FObj parent, PropertyList propertyList) throws FOPException {
	    return new RegionBody(parent, propertyList);
	}
    }

    public static FObj.Maker maker() {
	return new RegionBody.Maker();
    }	
    
    public static final String REGION_CLASS = "body";
    
    ColorType backgroundColor;

    protected RegionBody(FObj parent, PropertyList propertyList)
	throws FOPException
    {
	super(parent, propertyList);
    }
    
    RegionArea makeRegionArea(int allocationRectangleXPosition,
		      int allocationRectangleYPosition,
		      int allocationRectangleWidth,
		      int allocationRectangleHeight) {
		int marginTop = this.properties.get("margin-top").getLength().mvalue();
		int marginBottom = this.properties.get("margin-bottom").getLength().mvalue();
		int marginLeft = this.properties.get("margin-left").getLength().mvalue();
		int marginRight = this.properties.get("margin-right").getLength().mvalue();

            this.backgroundColor = this.properties.get(
                                     "background-color").getColorType();

		BodyRegionArea body = new BodyRegionArea(allocationRectangleXPosition + marginLeft,
			  allocationRectangleYPosition - marginTop,
			  allocationRectangleWidth - marginLeft -
			  marginRight, allocationRectangleHeight -
			  marginTop - marginBottom);
			  
		int overflow = this.properties.get("overflow").getEnum();
		String columnCountAsString = this.properties.get("column-count").getString();
		int columnCount = 1;
		try
		{
			columnCount = Integer.parseInt(columnCountAsString); 
		}
		catch (NumberFormatException nfe)
		{
			MessageHandler.errorln("Bad value on region body 'column-count'");
			columnCount = 1;
		}
		if ((columnCount > 1) && (overflow == Overflow.SCROLL))
		{
			// recover by setting 'column-count' to 1. This is allowed but
			// not required by the spec.
			MessageHandler.errorln("Setting 'column-count' to 1 because "
				+ "'overflow' is set to 'scroll'");
			columnCount = 1;
		}
		body.setColumnCount(columnCount);
		
		int columnGap = this.properties.get("column-gap").getLength().mvalue();
		body.setColumnGap(columnGap);
		
        body.setBackgroundColor(backgroundColor);

		return body;
    }
	
    protected String getDefaultRegionName() 
    {
	return "xsl-region-body";
    }
    
    protected String getElementName() 
    {
	return "fo:region-body";
    }

    public String getRegionClass() 
    {
	return REGION_CLASS;
    }

}
