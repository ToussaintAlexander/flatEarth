package com.region09.processor.issuer.engine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.System.out;

/*****************************************************************************
 *****************************************************************************
 */
class HypotheticalProposition {
	
	protected String	name;
	protected String 	object;
	protected String 	operator;
	protected String 	value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
/*****************************************************************************
 *****************************************************************************
 */
class Antecedent extends HypotheticalProposition {
	
	@Override
	public String toString() {
		
		return "Antecedent [name=" + name + ", object=" + object
				+ ", operator=" + operator + ", value=" + value + "]";
	}	
	
}
/*****************************************************************************
 *****************************************************************************
 */
class Consequent extends HypotheticalProposition {
	
	@Override
	public String toString() {
		
		return "Consequent [name=" + name + ", object=" + object
				+ ", operator=" + operator + ", value=" + value + "]";
	}	
	
}	 
/*****************************************************************************
 *****************************************************************************
 */
class Rule {
	
	private boolean		 status;		// Don't fire a rule twice
	private Antecedent[] antecedent;	// Need a mechanism for	OR & AND	 
	private Consequent 	 consequent;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Antecedent[] getAntecedent() {
		return antecedent;
	}
	public void setAntecedent(Antecedent[] antecedent) {
		this.antecedent = antecedent;
	}
	public Consequent getConsequent() {
		return consequent;
	}
	public void setConsequent(Consequent consequent) {
		this.consequent = consequent;
	}	
	
}
/*****************************************************************************
 *****************************************************************************
 */
public class InferenceEngineImpl {

	private static Stack<Consequent> 	factsDatabase;		// contains facts
	private static Stack<Rule> 			rulesDatabase;		// contains rules
	
	private static String 				goal;				// rule consequent
	private static int 					lnowledgebaseDepthCounter;				// iterations
	private static Rule					rule;				// antecedent[] + consequent
	private static boolean				match;				// When a database fact matches a knowledge base antecedent
	private static boolean  			fire;				// Pushes a sub-goal onto the database
	
	private static int					position;
	
	private static List<Antecedent> antecedentsNotFoundinDatabase = new ArrayList<Antecedent>();
	
	private static boolean goalFound = false;
	private static boolean knowledgebaseSearchExhausted = false;
	
	private static final String facts = "displayFactsDatabase";
	private static final String rules = "displayRulesDatabase";
	private static final String scan  = "scanRulesDatabase";
	
	static String newSubgoal = null;		// variable
	static String originalGoal = null;		// static
	
	static int knowledgebaseDepthTerminus = 0;
	
	public static String getGoal() {
		return goal;
	}
	public static void setGoal(String goal) {
		InferenceEngineImpl.goal = goal;
	}
	public static int getPass() {
		return lnowledgebaseDepthCounter;
	}
	public static void setPass(int pass) {
		InferenceEngineImpl.lnowledgebaseDepthCounter = pass;
	}
	public static Rule getRule() {
		return rule;
	}
	public static void setRule(Rule rule) {
		InferenceEngineImpl.rule = rule;
	}
	public static boolean isMatch() {
		return match;
	}
	public static void setMatch(boolean match) {
		InferenceEngineImpl.match = match;
	}
	public static boolean isFire() {
		return fire;
	}
	public static void setFire(boolean fire) {
		InferenceEngineImpl.fire = fire;
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static Stack<Consequent> createFactsDatabase (Stack<Consequent> factsDatabase) {
		
		Consequent fact1 = new Consequent();
		Consequent fact2 = new Consequent();
		Consequent fact3 = new Consequent();
		Consequent fact4 = new Consequent();
		Consequent fact5 = new Consequent();
		
		fact1.setName("A");
		fact1.setObject("Letter");
		fact1.setOperator("=");
		fact1.setValue("A");
		
		fact2.setName("B");
		fact2.setObject("Letter");
		fact2.setOperator("=");
		fact2.setValue("B");
		
		fact3.setName("C");
		fact3.setObject("Letter");
		fact3.setOperator("=");
		fact3.setValue("C");
		
		fact4.setName("D");
		fact4.setObject("Letter");
		fact4.setOperator("=");
		fact4.setValue("D");
		
		fact5.setName("E");
		fact5.setObject("Letter");
		fact5.setOperator("=");
		fact5.setValue("E");
		
		factsDatabase.push(fact1);
		factsDatabase.push(fact2);
		factsDatabase.push(fact3);
		factsDatabase.push(fact4);
		factsDatabase.push(fact5);
		
		return factsDatabase;
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void createRule1(Stack<Rule> knowledgebase) {
		
		Rule rule1 = new Rule();
		
		Antecedent[] antecedent1 	= new Antecedent[2];

		antecedent1[0] = new Antecedent();
		
		antecedent1[0].setName("Y");
		antecedent1[0].setObject("Letter");
		antecedent1[0].setOperator("="); 
		antecedent1[0].setValue("Y");

		antecedent1[1] = new Antecedent();
		
		antecedent1[1].setName("D");
		antecedent1[1].setObject("Letter");
		antecedent1[1].setOperator("="); 
		antecedent1[1].setValue("D");
		
		Consequent consequent1 	= new Consequent();
		
		consequent1.setName("Z");
		consequent1.setObject("Letter");
		consequent1.setOperator("="); 
		consequent1.setValue("Z");
		
		rule1.setStatus(false);
		rule1.setAntecedent(antecedent1);
		rule1.setConsequent(consequent1);
		
		knowledgebase.push(rule1);
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void createRule2(Stack<Rule> knowledgebase) {
		
		Rule rule2 = new Rule();
		
		Antecedent[] antecedent2 	= new Antecedent[3];

		antecedent2[0] = new Antecedent();
		
		antecedent2[0].setName("X");
		antecedent2[0].setObject("Letter");
		antecedent2[0].setOperator("="); 
		antecedent2[0].setValue("X");

		antecedent2[1] = new Antecedent();
		
		antecedent2[1].setName("B");
		antecedent2[1].setObject("Letter");
		antecedent2[1].setOperator("="); 
		antecedent2[1].setValue("B");

		antecedent2[2] = new Antecedent();
		
		antecedent2[2].setName("E");
		antecedent2[2].setObject("Letter");
		antecedent2[2].setOperator("="); 
		antecedent2[2].setValue("E");
		
		Consequent consequent2 	= new Consequent();
		
		consequent2.setName("Y");
		consequent2.setObject("Letter");
		consequent2.setOperator("="); 
		consequent2.setValue("Y");
		
		rule2.setStatus(false);
		rule2.setAntecedent(antecedent2);
		rule2.setConsequent(consequent2);
		
		knowledgebase.push(rule2);	
		
	}	
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void createRule3(Stack<Rule> knowledgebase) {
		
		Rule rule3 = new Rule();
		
		Antecedent[] antecedent3 	= new Antecedent[1];

		antecedent3[0] = new Antecedent();
		
		antecedent3[0].setName("A");
		antecedent3[0].setObject("Letter");
		antecedent3[0].setOperator("="); 
		antecedent3[0].setValue("A");
		
		Consequent consequent3 	= new Consequent();
		
		consequent3.setName("X");
		consequent3.setObject("Letter");
		consequent3.setOperator("="); 
		consequent3.setValue("X");
		
		rule3.setStatus(false);
		rule3.setAntecedent(antecedent3);
		rule3.setConsequent(consequent3);
		
		knowledgebase.push(rule3);	
		
	}	
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void createRule4(Stack<Rule> knowledgebase) {
		
		Rule rule4 = new Rule();
		
		Antecedent[] antecedent4 	= new Antecedent[1];

		antecedent4[0] = new Antecedent();
		
		antecedent4[0].setName("C");
		antecedent4[0].setObject("Letter");
		antecedent4[0].setOperator("="); 
		antecedent4[0].setValue("C");
		
		Consequent consequent4 	= new Consequent();
		
		consequent4.setName("L");
		consequent4.setObject("Letter");
		consequent4.setOperator("="); 
		consequent4.setValue("L");
		
		rule4.setStatus(false);
		rule4.setAntecedent(antecedent4);
		rule4.setConsequent(consequent4);
		
		knowledgebase.push(rule4);	
		
	}	
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void createRule5(Stack<Rule> knowledgebase) {
		
		Rule rule5 = new Rule();
		
		Antecedent[] antecedent5 	= new Antecedent[2];

		antecedent5[0] = new Antecedent();
		
		antecedent5[0].setName("L");
		antecedent5[0].setObject("Letter");
		antecedent5[0].setOperator("="); 
		antecedent5[0].setValue("L");

		antecedent5[1] = new Antecedent();
		
		antecedent5[1].setName("M");
		antecedent5[1].setObject("Letter");
		antecedent5[1].setOperator("="); 
		antecedent5[1].setValue("M");
		
		Consequent consequent5 	= new Consequent();
		
		consequent5.setName("N");
		consequent5.setObject("Letter");
		consequent5.setOperator("="); 
		consequent5.setValue("N");
		
		rule5.setStatus(false);
		rule5.setAntecedent(antecedent5);
		rule5.setConsequent(consequent5);
		
		knowledgebase.push(rule5);	
		
	}	
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static Stack<Rule> createRulesDatabase (Stack<Rule> knowledgebase) {
		
		createRule1(knowledgebase);
		createRule2(knowledgebase);
		createRule3(knowledgebase);
		createRule4(knowledgebase);
		createRule5(knowledgebase);	
		
		return knowledgebase;	
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static  void  createEnvironment(InferenceEngineImpl backwardChain) {
		
		Stack<Consequent> emptyDatabase = new Stack<Consequent>();
		
		factsDatabase = createFactsDatabase (emptyDatabase);
		
		displayFactsDatabase(facts);
		
		Stack<Rule> emptyKnowledgebase = new Stack<Rule>();
		
		rulesDatabase = createRulesDatabase (emptyKnowledgebase);
		
		displayRulesDatabase(rules);
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static List<Antecedent> scanFactsDatabase (Rule rule) {
		
		List<Antecedent>  subgoal = new ArrayList<Antecedent>();
		
		for (int i = 0; i < rule.getAntecedent().length; i++) {
			subgoal.add(rule.getAntecedent().clone()[i]);	
		}
		
		antecedentsNotFoundinDatabase.clear();	
		
		int j;
		
		for (int i = 0; i < subgoal.size(); i ++) {
			
			for (j = 0; j < factsDatabase.size(); j++) {
			
				if (subgoal.get(i).getName().equals(factsDatabase.get(j).getName())) {
					
					break;
 
				} else {
					
					if (j == factsDatabase.size() - 1) {
						antecedentsNotFoundinDatabase.add(position, subgoal.get(i));
					}
				}
			}
		}
		
		return antecedentsNotFoundinDatabase;	
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void displayFactsDatabase (final String methodName) {  
		
		for (int j = 0; j < factsDatabase.size(); j++) {
			
			out.println
			
				(methodName + ": Consequent [ name="   + factsDatabase.get(j).getName()		+
				          				 ", object="   + factsDatabase.get(j).getObject()	+
				          				 ", operator=" + factsDatabase.get(j).getOperator()	+
				          				 ", value="    + factsDatabase.get(j).getValue()	+
				          				 " ]"
				);		
		}
		
		out.println (" ");
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static void displayDatabaseRule (String methodName,Rule rule) {
	
		out.println(methodName + " Rule : RuleStatus [ status=" + rule.isStatus() + " ]");
		
		for (int j = 0; j < rule.getAntecedent().length; j++) {
			
			out.println
			
				(methodName + " Rule : Antecedent [ name="   + rule.getAntecedent().clone()[j].getName()		+
	    	                                   ", object="   + rule.getAntecedent().clone()[j].getObject()		+
	    	                                   ", operator=" + rule.getAntecedent().clone()[j].getOperator()	+
	    	                                   ", value="    + rule.getAntecedent().clone()[j].getValue()		+
	    	                                   " ]"
	    	    );
		}
	
		out.println(methodName + " Rule : Consequent [ name="    + rule.getConsequent().getName()		+
									       		   ", object="   + rule.getConsequent().getObject()		+
									       		   ", operator=" + rule.getConsequent().getOperator()	+
									       		   ", value="    + rule.getConsequent().getValue()		+
									       		   " ]"													+
									       		   "\n"
				   );	
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static void displayRulesDatabase (String methodName) {
	
		for (Rule rule : rulesDatabase) {
		
			out.println(methodName + " Rule : RuleStatus [ status=" + rule.isStatus() + " ]");
			
			for (int i = 0; i < rule.getAntecedent().length; i++) {
				
				out.println
				
					(methodName + " : Antecedent [ name="   + rule.getAntecedent().clone()[i].getName()		+
     	    	                              ", object="   + rule.getAntecedent().clone()[i].getObject()	+
     	    	                              ", operator=" + rule.getAntecedent().clone()[i].getOperator()	+
     	    	                              ", value="    + rule.getAntecedent().clone()[i].getValue()	+
     	    	                        	  " ]"
     	    	    );
			}
			
			out.println
			
				(methodName + " : Consequent [ name="   + rule.getConsequent().getName()		+
                     					  ", object="   + rule.getConsequent().getObject()		+
                     					  ", operator=" + rule.getConsequent().getOperator()	+
                     					  ", value="    + rule.getConsequent().getValue()		+
                     					  " ]"													+
                     					  "\n"
							  );
				
	    }	
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static Rule scanRulesDatabase(String goal) {
		
		for (Rule rule : rulesDatabase) {
			
			if (rule.getConsequent().getName().equals(goal) ) {		
				
				displayDatabaseRule(scan, rule);
				
				return rule;
				
			}
		}		
		
		return null;	
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void fireRule (Rule				rule
								,Stack<Consequent> 	database) {

		displayFactsDatabase ("Before Fire Rule        ");
		
		Consequent fact = rule.getConsequent();
		database.push(fact);
		
		rule.setStatus(true);		// Don't fire again
		
		if(rule.getConsequent().getName().equals(getGoal())) {
			goalFound = true;
		}	
		
		displayFactsDatabase ("After Fire Rule         ");
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static void initialization () {
		
		setGoal("Z");						// goal
		
		newSubgoal   = getGoal();			// variable
		originalGoal = getGoal();			// static
		
		lnowledgebaseDepthCounter  = 0;  	// knowledge layer counter
		knowledgebaseDepthTerminus = 6;		// knowledge layer terminus
		
		InferenceEngineImpl backwardChain = new InferenceEngineImpl();
		
		createEnvironment(backwardChain);
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static void printBanner () {
		
		lnowledgebaseDepthCounter++;
		
		out.println("====================================== LOOP "	+ 
				     lnowledgebaseDepthCounter 						+
				    " ====================================="		
				   );
		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */	
	public static void engine () {
		
		while (!goalFound && !knowledgebaseSearchExhausted) {

			printBanner ();
			
			Rule foundRule = scanRulesDatabase(newSubgoal);	 			 
			
			antecedentsNotFoundinDatabase =	scanFactsDatabase (foundRule);	 	

			if (antecedentsNotFoundinDatabase.isEmpty()) {
				
				fireRule (foundRule, factsDatabase);								 
				newSubgoal = originalGoal;
			}
  
			else {
				
			    newSubgoal = antecedentsNotFoundinDatabase.get(position).getName();		 
			    antecedentsNotFoundinDatabase.remove(position);							 
			}

			if (lnowledgebaseDepthCounter >= knowledgebaseDepthTerminus) {
				knowledgebaseSearchExhausted = true;
			}
		}

	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void termination () {
		
		if (goalFound) {
			
			out.println("Goal Found After Pass Number = " 	+ 
						 lnowledgebaseDepthCounter 			+
						" Knowledge Depth = "  				+
						 knowledgebaseDepthTerminus
					   );

		} else {
			

			out.println("Goal Not Found After Pass Number = " 	+ 
						 lnowledgebaseDepthCounter				+
						" Knowledge Depth = " 					+
						 knowledgebaseDepthTerminus
					   );
		}		
	}
	/*****************************************************************************
	 *****************************************************************************
	 */
	public static void main (String[] args) {
		
		initialization ();
		
		engine ();

		termination ();
	}
}