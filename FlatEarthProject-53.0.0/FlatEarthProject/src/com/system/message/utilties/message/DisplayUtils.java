package com.system.message.utilties.message;

import java.util.ArrayList;
import java.util.List;

import com.region09.processor.issuer.engine.service.Differentia;
import com.region09.processor.issuer.engine.service.Facet;

public class DisplayUtils {

	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void reportColumns (String title, int selection) {
		
		System.out.println();
		System.out.println("Start of " + title + " Report");
		
		if ( selection == 1 ) {
			System.out.println();
			System.out.format("%10s %10s %13s  %5s %13s  \n"  , "Attribute", "Element",  "SubElement", "Rule"  , "Element");
			System.out.format("%3s  %15s  %9s %11s  %9s  \n"  , "ID"	   , "Number" ,  "Number"    , "Value" , "Value" );
			System.out.println();
		} else {
			System.out.println();
			System.out.format("%10s %10s %13s  %5s %13s %8s \n"  , "Attribute", "Element",  "SubElement", "Rule"  , "Element"	, "Result");
			System.out.format("%3s  %15s  %9s %11s  %9s %9s \n"  , "ID"	   , "Number" ,  "Number"    , "Value" , "Value"	, "Value" );
			System.out.println();
		}
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void endBanner (String title) {		
	
		System.out.println("End of " + title + " End Report");
	
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public void displayFacet(boolean displayOn, Facet facet ) {
		
		if ( displayOn ) {
		
			if (  facet.getId() == 0 ) {
				reportColumns ( "Individual Facets", 1 );
			}
			
			System.out.format( "%5d %13d %10d %10d %10d\n" 
					         , facet.getId()
					         , facet.getElement()
					         , facet.getSubElement()
					         , facet.getRuleItem()
					         , facet.getElementItem() 
					 		 );
		
		}
			
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public void displayFacetList( boolean displayOn, List<ArrayList<Facet>> facetList ) {
		
			for (int elementIndex = 0; elementIndex < facetList.size(); elementIndex++) {
				
				int maxSubElements = facetList.get(elementIndex).size();
				
				for (int subElementIndex = 0; subElementIndex < maxSubElements; subElementIndex++) {
				
					Facet facet = facetList.get(elementIndex).get(subElementIndex);
					
					if ( displayOn ) {
						
						if (  facet.getId() == 0 ) {
							reportColumns ( "Facet List", 1 );
						}
					
						System.out.format( "%5d %13d %10d %10d %10d\n" 
									     , facet.getId()
									     , facet.getElement()
									     , facet.getSubElement()
									     , facet.getRuleItem()
									     , facet.getElementItem() 
							         	 );
					}
				
				}
				
				//System.out.println(" ---------------------------------------------------");
				
			}
			
	}

	/*********************************************************************
	 *********************************************************************
	 */
	public void displayDifferentia( boolean displayOn, Differentia differentia ) {
		
		if ( displayOn ) {
		
			if (  differentia.getId() == 0 ) {
				reportColumns ( "Individual Differentia", 2 );
			}
			
			System.out.format( "%5d %13d %10d %10d %10d %10d\n" 
					         , differentia.getId()
					         , differentia.getElement()
					         , differentia.getSubElement()
					         , differentia.getRuleItem()
					         , differentia.getElementItem() 
					         , differentia.getResultItem()
					 		 );
		
		}
			
	}	
	/*********************************************************************
	 *********************************************************************
	 */
	public void displayDifferentiaList( boolean displayOn, List<ArrayList<Differentia>> differentia ) {
		
		if ( displayOn ) {
			
			if (  differentia.get(0).get(0).getId() == 0 ) {
					
				reportColumns ("Differentia List", 2);
			}
			
			for (int elementIndex = 0; elementIndex < differentia.size(); elementIndex++) {
				
				int maxSubElements = differentia.get(elementIndex).size();
				
				for (int subElementIndex = 0; subElementIndex < maxSubElements; subElementIndex++) {
				
					Differentia element = differentia.get(elementIndex).get(subElementIndex);
					
					System.out.format( "%5d %13d %10d %10d %10d %10d\n" 
									 , element.getId()
							         , element.getElement()
							         , element.getSubElement()
							         , element.getRuleItem()
							         , element.getElementItem() 
							         , element.getResultItem() 	
							         );
				}
				
			}
			
			//System.out.println(" --------------------------------------------------------------");	
			
		}	
			
	}
	/*********************************************************************
	 *********************************************************************
	 */
	public void displayD2( List<Differentia> message ) {
		
			reportColumns ("Process Differentia Rules", 2);
			
			for (int elementIndex = 0; elementIndex < message.size(); elementIndex++) {
				
				Differentia element = message.get(elementIndex);
					
				System.out.format( "%5d %13d %10d %10d %10d\n" 
								 , element.getId()
						         , element.getElement()
						         , element.getSubElement()
						         , element.getRuleItem()
						         , element.getElementItem() 
						         , element.getResultItem() 	
						         );
				
				System.out.println("  --------------------------------------------------");
				
			}
			
	}
	/*********************************************************************
	 * Usage: DriverUtils() - > main - enhanced #3
	 *********************************************************************
	 */
	public void display3( String title, int index, int elementIndex, int subElementIndex, Facet validatedAttribute ) {
		
			System.out.format( "%10s %10d %10d %10d %10d %10d\n"
						     , title
							 , index
						     , elementIndex
						     , subElementIndex
					         , validatedAttribute.getElement()
					         , validatedAttribute.getSubElement()
//					         , validatedAttribute.getResultItem()
					         );
			}
	
	}
