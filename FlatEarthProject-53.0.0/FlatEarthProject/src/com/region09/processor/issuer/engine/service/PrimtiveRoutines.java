package com.region09.processor.issuer.engine.service;

import static com.system.configuration.constants.Validate.*;

public class PrimtiveRoutines {

	// The value will always be validated as correct because on the detail rule will decide
	
	/*********************************************************************
	 * DATA ELEMENT 000
	 *********************************************************************
	 */
    public Differentia de000sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de000sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de000sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de000sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}
    
    public Differentia de000sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de000sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de000sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
    
    public Differentia de000sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 001
//	--------------------------------------------------------------------------       
    public Differentia de001sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de001sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de001sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
  
    public Differentia de001sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}
    
    public Differentia de001sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de001sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de001sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de001sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 002 SUBFIELD 00
//	--------------------------------------------------------------------------    
    public Differentia de002sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}
    
    public Differentia de002sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de002sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 002 SUBFIELD 01
//	--------------------------------------------------------------------------    
    public Differentia de002sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}
    
    public Differentia de002sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de002sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 002 SUBFIELD 02
//	--------------------------------------------------------------------------    
    public Differentia de002sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de002sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de002sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de002sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de002sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de002sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 003 SUBFIELD 00    
//	--------------------------------------------------------------------------
    public Differentia de003sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de003sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de003sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 003 SUBFIELD 01    
//	--------------------------------------------------------------------------    
    public Differentia de003sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de003sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de003sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 003 SUBFIELD 02    
//	--------------------------------------------------------------------------     
    public Differentia de003sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de003sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de003sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de003sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de003sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de003sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 004 SUBFIELD 00     
//	--------------------------------------------------------------------------
    public Differentia de004sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de004sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de004sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de004sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de004sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de004sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de004sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de004sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 005 SUBFIELD 00     
//	--------------------------------------------------------------------------
    public Differentia de005sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de005sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de005sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de005sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de005sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de005sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de005sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de005sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 006 SUBFIELD 00    
//	--------------------------------------------------------------------------
    public Differentia de006sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de006sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de006sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de006sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de006sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de006sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de006sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de006sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 007 SUBFIELD 00    
//	--------------------------------------------------------------------------
    public Differentia de007sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de007sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de007sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 007 SUBFIELD 01    
//	--------------------------------------------------------------------------    
    public Differentia de007sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de007sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de007sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 007 SUBFIELD 02    
//	--------------------------------------------------------------------------    
    public Differentia de007sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de007sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de007sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 007 SUBFIELD 03    
//	-------------------------------------------------------------------------- 
    public Differentia de007sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de007sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de007sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 007 SUBFIELD 04    
//	--------------------------------------------------------------------------    
    public Differentia de007sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de007sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de007sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de007sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de007sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de007sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 008 SUBFIELD 00    
//	--------------------------------------------------------------------------    
    public Differentia de008sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de008sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de008sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de008sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de008sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de008sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de008sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}

    public Differentia de008sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 009 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de009sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de009sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de009sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de009sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de009sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de009sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de009sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de009sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 010 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de010sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de010sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de010sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de010sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de010sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de010sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de010sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de010sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 011 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de011sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de011sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de011sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de011sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de011sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de011sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de011sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de011sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 012 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de0120sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de0120sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de0120sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de0120sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de0120sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de0120sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de0120sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de0120sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 012 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de012sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de012sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de012sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de012sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de012sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de012sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de012sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 012 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de012sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de012sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de012sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de012sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de012sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de012sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de012sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de012sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 013 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de013sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de013sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de013sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de013sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de013sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de013sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de013sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 013 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de013sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de013sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de013sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de013sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de013sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de013sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de013sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de013sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 014 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de014sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de014sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de014sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de014sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de014sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de014sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de014sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 014 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de014sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de014sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de014sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de014sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de014sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de014sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de014sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de014sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 015 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de015sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de015sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de015sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de015sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de015sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de015sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de015sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 015 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de015sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de015sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de015sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de015sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de015sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de015sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de015sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de015sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 016 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de016sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de016sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de016sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de016sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de016sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de016sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de016sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 016 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de016sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de016sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de016sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de016sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de016sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de016sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de016sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de016sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 017 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de017sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de017sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de017sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de017sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de017sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de017sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de017sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 017 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de017sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de017sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de017sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de017sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de017sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de017sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de017sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de017sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 018 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de018sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de018sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de018sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de018sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de018sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de018sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de018sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de018sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 019 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de019sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de019sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de019sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de019sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de019sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de019sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de019sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de019sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 020 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de020sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de020sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de020sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de020sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de020sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de020sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de020sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de020sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 021 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de021sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de021sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de021sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de021sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de021sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de021sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de021sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de021sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 022 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de022sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de022sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de022sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de022sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de022sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de022sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de022sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 022 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de022sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de022sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de022sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de022sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de022sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de022sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de022sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de022sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 023 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de023sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de023sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de023sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de023sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de023sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de023sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de023sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de023sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 024 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de024sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de024sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de024sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de024sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de024sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de024sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de024sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de024sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 025 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de025sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de025sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de025sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de025sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de025sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de025sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de025sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de025sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 026 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de026sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de026sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de026sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de026sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de026sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de026sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de026sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de026sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 027 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de027sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de027sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de027sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de027sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de027sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de027sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de027sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de027sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 028 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de028sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de028sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de028sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de028sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de028sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de028sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de028sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 028 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de028sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de028sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de028sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de028sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de028sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de028sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de028sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de028sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 029 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de029sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de029sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de029sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de029sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de029sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de029sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de029sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 029 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de029sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de029sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de029sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de029sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de029sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de029sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de029sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de029sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 030 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de030sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de030sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de030sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de030sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de030sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de030sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de030sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 030 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de030sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de030sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de030sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de030sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de030sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de030sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de030sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de030sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 031 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de031sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de031sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de031sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de031sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de031sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de031sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de031sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 031 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de031sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de031sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de031sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de031sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de031sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de031sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de031sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de031sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 032 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de032sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de032sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de032sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de032sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de032sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de032sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de032sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de032sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 033 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de033sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de033sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de033sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de033sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de033sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de033sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de033sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de033sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 034 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de034sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de034sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de034sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de034sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de034sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de034sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de034sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de034sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de035sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de035sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de035sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de035sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de035sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de035sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de035sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 07     
//	--------------------------------------------------------------------------    
    public Differentia de035sf07rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf07rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf07rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf07rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf07rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf07rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf07rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf07rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 08     
//	--------------------------------------------------------------------------    
    public Differentia de035sf08rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf08rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf08rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf08rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf08rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf08rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf08rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf08rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 09     
//	--------------------------------------------------------------------------    
    public Differentia de035sf09rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf09rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf09rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf09rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf09rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf09rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf09rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf09rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 035 SUBFIELD 10     
//	--------------------------------------------------------------------------    
    public Differentia de035sf10rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf10rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de035sf10rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf10rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de035sf10rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de035sf10rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de035sf10rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de035sf10rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de036sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de036sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de036sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de036sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de036sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de036sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de036sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 07     
//	--------------------------------------------------------------------------    
    public Differentia de036sf07rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf07rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf07rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf07rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf07rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf07rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf07rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf07rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 08     
//	--------------------------------------------------------------------------    
    public Differentia de036sf08rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf08rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf08rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf08rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf08rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf08rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf08rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf08rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 09     
//	--------------------------------------------------------------------------    
    public Differentia de036sf09rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf09rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf09rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf09rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf09rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf09rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf09rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf09rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 10     
//	--------------------------------------------------------------------------    
    public Differentia de036sf10rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf10rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf10rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf10rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf10rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf10rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf10rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf10rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 11     
//	--------------------------------------------------------------------------    
    public Differentia de036sf11rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf11rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf11rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf11rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf11rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf11rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf11rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf11rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 12     
//	--------------------------------------------------------------------------    
    public Differentia de036sf12rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf12rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf12rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf12rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf12rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf12rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf12rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf12rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 13     
//	--------------------------------------------------------------------------    
    public Differentia de036sf13rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf13rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf13rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf13rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf13rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf13rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf13rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf13rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}

//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 14     
//	--------------------------------------------------------------------------    
    public Differentia de036sf14rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf14rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf14rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf14rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf14rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf14rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf14rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf14rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 15     
//	--------------------------------------------------------------------------    
    public Differentia de036sf15rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf15rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf15rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf15rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf15rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf15rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf15rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf15rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 16     
//	--------------------------------------------------------------------------    
    public Differentia de036sf16rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf16rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf16rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf16rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf16rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf16rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf16rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf16rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 17     
//	--------------------------------------------------------------------------    
    public Differentia de036sf17rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf17rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf17rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf17rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf17rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf17rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf17rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf17rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 18     
//	--------------------------------------------------------------------------    
    public Differentia de036sf18rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf18rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf18rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf18rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf18rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf18rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf18rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf18rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 19     
//	--------------------------------------------------------------------------    
    public Differentia de036sf19rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf19rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf19rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf19rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf19rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf19rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf19rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf19rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 20     
//	--------------------------------------------------------------------------    
    public Differentia de036sf20rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf20rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf20rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf20rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf20rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf20rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf20rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf20rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 21     
//	--------------------------------------------------------------------------    
    public Differentia de036sf21rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf21rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf21rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf21rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf21rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf21rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf21rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf21rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 22     
//	--------------------------------------------------------------------------    
    public Differentia de036sf22rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf22rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf22rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf22rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf22rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf22rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf22rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf22rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 23     
//	--------------------------------------------------------------------------    
    public Differentia de036sf23rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf23rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf23rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf23rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf23rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf23rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf23rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf23rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 24     
//	--------------------------------------------------------------------------    
    public Differentia de036sf24rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf24rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf24rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf24rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf24rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf24rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf24rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf24rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 25     
//	--------------------------------------------------------------------------    
    public Differentia de036sf25rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf25rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf25rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf25rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf25rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf25rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf25rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf25rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 26     
//	--------------------------------------------------------------------------    
    public Differentia de036sf26rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf26rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf26rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf26rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf26rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf26rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf26rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf26rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 27     
//	--------------------------------------------------------------------------    
    public Differentia de036sf27rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf27rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf27rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf27rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf27rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf27rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf27rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf27rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 28     
//	--------------------------------------------------------------------------    
    public Differentia de036sf28rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf28rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf28rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf28rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf28rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf28rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf28rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf28rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 036 SUBFIELD 29     
//	--------------------------------------------------------------------------    
    public Differentia de036sf29rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf29rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de036sf29rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf29rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de036sf29rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de036sf29rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de036sf29rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de036sf29rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de037sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de037sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de037sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de037sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de037sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de037sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de037sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de037sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de037sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de037sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de037sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de037sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de037sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de037sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de037sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 038 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de038sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de038sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de038sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de038sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de038sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de038sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de038sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de038sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 039 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de039sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de039sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de039sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de039sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de039sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de039sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de039sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de039sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 040 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de040sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de040sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de040sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de040sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de040sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de040sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de040sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de040sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 041 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de041sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de041sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de041sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de041sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de041sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de041sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de041sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de041sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 042 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de042sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de042sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de042sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de042sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de042sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de042sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de042sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de042sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 043 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de043sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de043sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de043sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 043 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de043sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de043sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de043sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 043 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de043sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de043sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de043sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 043 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de043sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de043sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de043sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de043sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de043sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de043sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 044 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de044sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de044sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de044sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de044sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de044sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de044sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de044sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de044sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de045sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de045sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de045sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de045sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de045sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de045sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de045sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 07     
//	--------------------------------------------------------------------------    
    public Differentia de045sf07rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf07rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf07rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf07rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf07rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf07rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf07rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf07rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 08     
//	--------------------------------------------------------------------------    
    public Differentia de045sf08rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf08rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf08rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf08rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf08rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf08rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf08rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf08rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 09     
//	--------------------------------------------------------------------------    
    public Differentia de045sf09rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf09rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf09rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf09rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf09rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf09rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf09rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf09rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 10     
//	--------------------------------------------------------------------------    
    public Differentia de045sf10rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf10rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf10rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf10rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf10rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf10rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf10rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf10rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 11     
//	--------------------------------------------------------------------------    
    public Differentia de045sf11rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf11rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf11rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf11rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf11rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf11rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf11rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf11rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 12     
//	--------------------------------------------------------------------------    
    public Differentia de045sf12rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf12rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf12rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf12rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf12rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf12rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf12rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf12rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 045 SUBFIELD 13     
//	--------------------------------------------------------------------------    
    public Differentia de045sf13rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf13rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de045sf13rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf13rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de045sf13rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de045sf13rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de045sf13rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de045sf13rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 046 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de046sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de046sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de046sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de046sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de046sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de046sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de046sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de046sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de047sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de047sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de047sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de047sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de047sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de047sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de047sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de047sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 048 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de048sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de048sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de048sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de048sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de048sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de048sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de048sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de048sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 049 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de049sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de049sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de049sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de049sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de049sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de049sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de049sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de049sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 050 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de050sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de050sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de050sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de050sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de050sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de050sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de050sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de050sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 037 SUBFIELD 00     	
//	--------------------------------------------------------------------------    
    public Differentia de051sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de051sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de051sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de051sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de051sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de051sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de051sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de051sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 052 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de052sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de052sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de052sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de052sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de052sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de052sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de052sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de052sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de053sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de053sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de053sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de053sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de053sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de053sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 053 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de053sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de053sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de053sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de053sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de053sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de053sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 054 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de054sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de054sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de054sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 054 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de054sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de054sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de054sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
    
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 054 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de054sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de054sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de054sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 054 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de054sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de054sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de054sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 054 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de054sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de054sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de054sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de054sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de054sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de054sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de055sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de055sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de055sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de055sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de055sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de055sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de055sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 07     
//	--------------------------------------------------------------------------    
    public Differentia de055sf07rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf07rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf07rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf07rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf07rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf07rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf07rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf07rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 08     
//	--------------------------------------------------------------------------    
    public Differentia de055sf08rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf08rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf08rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf08rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf08rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf08rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf08rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf08rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 09     
//	--------------------------------------------------------------------------    
    public Differentia de055sf09rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf09rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf09rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf09rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf09rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf09rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf09rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf09rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 10     
//	--------------------------------------------------------------------------    
    public Differentia de055sf10rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf10rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf10rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf10rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf10rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf10rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf10rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf10rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 11     
//	--------------------------------------------------------------------------    
    public Differentia de055sf11rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf11rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf11rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf11rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf11rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf11rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf11rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf11rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 12     
//	--------------------------------------------------------------------------    
    public Differentia de055sf12rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf12rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf12rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf12rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf12rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf12rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf12rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf12rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 13     
//	--------------------------------------------------------------------------    
    public Differentia de055sf13rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf13rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf13rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf13rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf13rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf13rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf13rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf13rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 14     
//	--------------------------------------------------------------------------    
    public Differentia de055sf14rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf14rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf14rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf14rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf14rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf14rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf14rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf14rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 15     
//	--------------------------------------------------------------------------    
    public Differentia de055sf15rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf15rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf15rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf15rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf15rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf15rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf15rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf15rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 16     
//	--------------------------------------------------------------------------    
    public Differentia de055sf16rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf16rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf16rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf16rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf16rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf16rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf16rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf16rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 17     
//	--------------------------------------------------------------------------    
    public Differentia de055sf17rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf17rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf17rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf17rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf17rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf17rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf17rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf17rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 18     
//	--------------------------------------------------------------------------    
    public Differentia de055sf18rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf18rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf18rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf18rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf18rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf18rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf18rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf18rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 19     
//	--------------------------------------------------------------------------    
    public Differentia de055sf19rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf19rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf19rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf19rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf19rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf19rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf19rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf19rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 20     
//	--------------------------------------------------------------------------    
    public Differentia de055sf20rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf20rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf20rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf20rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf20rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf20rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf20rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf20rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 21     
//	--------------------------------------------------------------------------    
    public Differentia de055sf21rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf21rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf21rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf21rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf21rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf21rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf21rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf21rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 22     
//	--------------------------------------------------------------------------    
    public Differentia de055sf22rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf22rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf22rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf22rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf22rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf22rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf22rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf22rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 23     
//	--------------------------------------------------------------------------    
    public Differentia de055sf23rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf23rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf23rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf23rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf23rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf23rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf23rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf23rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 055 SUBFIELD 24     
//	--------------------------------------------------------------------------    
    public Differentia de055sf24rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf24rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de055sf24rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf24rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de055sf24rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de055sf24rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de055sf24rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de055sf24rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 056 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de056sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de056sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de056sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de056sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de056sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de056sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de056sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de056sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 057 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de057sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de057sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de057sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de057sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de057sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de057sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de057sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de057sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 058 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de058sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de058sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de058sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de058sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de058sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de058sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de058sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de058sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 059 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de059sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de059sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de059sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de059sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de059sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de059sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de059sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de059sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 060 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de060sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de060sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de060sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 060 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de060sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de060sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de060sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 060 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de060sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de060sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de060sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 060 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de060sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de060sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de060sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 060 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de060sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de060sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de060sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de060sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de060sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de060sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 061 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de061sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de061sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de061sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de061sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de061sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de061sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de061sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 061 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de061sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de061sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de061sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de061sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de061sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de061sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de061sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de061sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de062sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de062sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de062sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de062sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de062sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de062sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 062 SUBFIELD 06     
//	--------------------------------------------------------------------------    
    public Differentia de062sf06rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf06rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de062sf06rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf06rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de062sf06rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de062sf06rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de062sf06rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de062sf06rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de063sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 01     
//	--------------------------------------------------------------------------    
    public Differentia de063sf01rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf01rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf01rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf01rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf01rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf01rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf01rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf01rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 02     
//	--------------------------------------------------------------------------    
    public Differentia de063sf02rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf02rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf02rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf02rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf02rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf02rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf02rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf02rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 03     
//	--------------------------------------------------------------------------    
    public Differentia de063sf03rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf03rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf03rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf03rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf03rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf03rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf03rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf03rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 04     
//	--------------------------------------------------------------------------    
    public Differentia de063sf04rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf04rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf04rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf04rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf04rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf04rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf04rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf04rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
//	--------------------------------------------------------------------------   
//  DATA ELEMENT 063 SUBFIELD 05     
//	--------------------------------------------------------------------------    
    public Differentia de063sf05rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf05rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de063sf05rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf05rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de063sf05rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de063sf05rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de063sf05rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de063sf05rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
    //	--------------------------------------------------------------------------   
//  DATA ELEMENT 064 SUBFIELD 00     
//	--------------------------------------------------------------------------    
    public Differentia de064sf00rtn01(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ID_CORRECT 			: ELEMENT_ID_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de064sf00rtn02(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIELD_CORRECT 		: ELEMENT_FIELD_INCORRECT; 		return new Differentia(element, i);}
    public Differentia de064sf00rtn03(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SUBFIELD_CORRECT 	: ELEMENT_SUBFIELD_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de064sf00rtn04(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FIRE_CORRECT		: ELEMENT_FIRE_INCORRECT; 		return new Differentia(element, i);}    
    
    public Differentia de064sf00rtn07(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_FORMAT_CORRECT 		: ELEMENT_FORMAT_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn08(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_SHORT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn09(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_LENGTH_CORRECT 		: ELEMENT_LENGTH_TOO_LONG; 		return new Differentia(element, i);}
    public Differentia de064sf00rtn10(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_ENCODING_CORRECT 	: ELEMENT_ENCODING_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn11(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DATATYPE_CORRECT 	: ELEMENT_DATATYPE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn12(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_SOURCE_CORRECT 		: ELEMENT_SOURCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn13(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_DIRECTION_CORRECT 	: ELEMENT_DIRECTION_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn14(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_EXISTENCE_CORRECT 	: ELEMENT_EXISTENCE_INCORRECT; 	return new Differentia(element, i);}
    public Differentia de064sf00rtn15(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_CHANGE_CORRECT 		: ELEMENT_CHANGE_INCORRECT; 	return new Differentia(element, i);}
 
    public Differentia de064sf00rtn16(Facet element)	{ int i = (element.getRuleItem() == element.getElementItem()) ? ELEMENT_VALUE_CORRECT 		: ELEMENT_VALUE_CORRECT; 		return new Differentia(element, i);}
    
    /*********************************************************************
	 *********************************************************************
	 */
    interface MoveAction {
        Differentia move (Facet element);
    }

	/*********************************************************************
	 *********************************************************************
	 */
    public MoveAction[] moveActions = new MoveAction[] {
      
//     	--------------------------------------------------------------------------   
//     	The Size of Row equals (==) Each Element Grouping in PrimitiveUtils
//     	--------------------------------------------------------------------------    		
    		
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de000sf00rtn16(element); }} ,
//  	--------------------------------------------------------------------------   
//  	DATA ELEMENT 001
//  	--------------------------------------------------------------------------     
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de001sf00rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 002
//	  	--------------------------------------------------------------------------     
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de002sf00rtn16(element); }} ,
//  	--------------------------------------------------------------------------      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de002sf01rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de002sf02rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 003
//	  	--------------------------------------------------------------------------  
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de003sf00rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de003sf01rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de003sf02rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 004
//	  	--------------------------------------------------------------------------
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de004sf00rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 005
//	  	--------------------------------------------------------------------------
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de005sf00rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 006
//	  	--------------------------------------------------------------------------
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de006sf00rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 007
//	  	--------------------------------------------------------------------------
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de007sf00rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de007sf01rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn15(element); }} , 
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de007sf02rtn16(element); }} ,
//  	-------------------------------------------------------------------------- 
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de007sf03rtn16(element); }} ,
//  	--------------------------------------------------------------------------       
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn15(element); }} , 
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de007sf04rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 008
//	  	--------------------------------------------------------------------------    
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de008sf00rtn16(element); }} ,
//	  	--------------------------------------------------------------------------   
//	  	DATA ELEMENT 009
//	  	--------------------------------------------------------------------------    
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn01(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn02(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn03(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn04(element); }} ,
      
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn07(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn08(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn09(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn10(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn11(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn12(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn13(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn14(element); }} ,
    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn15(element); }} ,
    	
//    	new MoveAction() { public Differentia move (Facet element) { return de009sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
//  	DATA ELEMENT 010 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn08(element); }} ,  
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn09(element); }} ,  
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn10(element); }} ,  
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de010sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 011 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de011sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 012 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de0120sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 012 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de012sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 012 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de012sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 013 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de013sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 013 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de013sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 014 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de014sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 014 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de014sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 015 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de015sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 015 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de015sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 016 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn15(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de016sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 016 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de016sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 017 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de017sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 017 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de017sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 018 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de018sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 019 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de019sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 020 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de020sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 021 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de021sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 022 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn15(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de022sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 022 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de022sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 023 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de023sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 024 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de024sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 025 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de025sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 026 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de026sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 027 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de027sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 028 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de028sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 028 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn15(element); }} ,
     
 //       new MoveAction() { public Differentia move (Facet element) { return de028sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 029 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de029sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 029 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de029sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 030 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de030sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 030 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de030sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 031 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de031sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 031 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de031sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 032 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de032sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 033 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de033sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 034 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de034sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 07     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf07rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 08     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf08rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 09     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf09rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 035 SUBFIELD 10     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de035sf10rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 07     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf07rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 08     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf08rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 09     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf09rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 10     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf10rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 11     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf11rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 12     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf12rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 13     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf13rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 14     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf14rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 15     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf15rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 16     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf16rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 17     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf17rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 18     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf18rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 19     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf19rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 20     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf20rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 21     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf21rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 22     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf22rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 23     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf23rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 24     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf24rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 25     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf25rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 26     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf26rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 27     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf27rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 28     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf28rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 036 SUBFIELD 29     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de036sf29rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de037sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de037sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de037sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de037sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 038 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de038sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 039 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de039sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 040 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de040sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 041 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de041sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 042 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de042sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 043 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de043sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 043 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de043sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 043 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de043sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 043 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de043sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 044 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de044sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 07     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf07rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 08     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf08rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 09     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf09rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 10     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf10rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 11     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf11rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 12     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf12rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 045 SUBFIELD 13     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de045sf13rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 046 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de046sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de047sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 048 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de048sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 049 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn15(element); }} ,
     
//       new MoveAction() { public Differentia move (Facet element) { return de049sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 050 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de050sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 037 SUBFIELD 00     	
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de051sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 052 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de052sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 053 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de053sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 054 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de054sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 054 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de054sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 054 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de054sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 054 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de054sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 054 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de054sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 07     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf07rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 08     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf08rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 09     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf09rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 10     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf10rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 11     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf11rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 12     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf12rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 13     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf13rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 14     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf14rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 15     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf15rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 16     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf16rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 17     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf17rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 18     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf18rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 19     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf19rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 20     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf20rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 21     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf21rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 22     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf22rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 23     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf23rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 055 SUBFIELD 24     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de055sf24rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 056 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de056sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 057 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de057sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 058 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de058sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 059 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de059sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 060 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de060sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 060 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de060sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 060 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de060sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 060 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de060sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 060 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de060sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 061 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de061sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 061 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de061sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf05rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 062 SUBFIELD 06     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de062sf06rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf00rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 01     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf01rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 02     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf02rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 03     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf03rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 04     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf04rtn16(element); }} ,
//    	--------------------------------------------------------------------------   
    //  DATA ELEMENT 063 SUBFIELD 05     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de063sf05rtn16(element); }} ,
        //	--------------------------------------------------------------------------   
    //  DATA ELEMENT 064 SUBFIELD 00     
//    	--------------------------------------------------------------------------    
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn01(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn02(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn03(element); }} ,
     
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn04(element); }} ,    
        
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn07(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn08(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn09(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn10(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn11(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn12(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn13(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn14(element); }} ,
        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn15(element); }} ,
     
//        new MoveAction() { public Differentia move (Facet element) { return de064sf00rtn16(element); }} ,
    	
    };

	/*********************************************************************
	 *********************************************************************
	 */
    public void move(int index, Facet element) {
        moveActions[index].move (element);
    }
    
}
