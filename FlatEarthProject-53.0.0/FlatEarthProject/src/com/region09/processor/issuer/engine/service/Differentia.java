package com.region09.processor.issuer.engine.service;

public class Differentia {

		private int id;
		private int element;
		private int subElement;
		private int ruleValue;
		private int elementValue;
		private int resultValue;
		
		public Differentia() {}
		
		public Differentia(int id, int element, int subElement, int ruleItem, int elementItem,int resultItem) {
			super();
			this.id = id;
			this.element = element;
			this.subElement = subElement;
			this.ruleValue = ruleItem;
			this.elementValue = elementItem;
			this.resultValue = resultItem;
		}
		
		public Differentia(Facet attribute) {
			super();
			this.id 			= attribute.getId();
			this.element 		= attribute.getElement();
			this.subElement 	= attribute.getSubElement();
			this.ruleValue 		= attribute.getRuleItem();
			this.elementValue 	= attribute.getElementItem();
			this.resultValue 	= 0;
		}
		public Differentia(Facet attribute, int resultItem) {
			super();
			this.id 			= attribute.getId();
			this.element 		= attribute.getElement();
			this.subElement 	= attribute.getSubElement();
			this.ruleValue 		= attribute.getRuleItem();
			this.elementValue 	= attribute.getElementItem();
			this.resultValue 	= resultItem;
		}
		/**********************************************************************
		 **********************************************************************
		 */

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getElement() {
			return element;
		}

		public void setElement(int element) {
			this.element = element;
		}

		public int getSubElement() {
			return subElement;
		}

		public void setSubElement(int subElement) {
			this.subElement = subElement;
		}

		public int getRuleItem() {
			return ruleValue;
		}

		public void setRuleItem(int ruleItem) {
			this.ruleValue = ruleItem;
		}

		public int getElementItem() {
			return elementValue;
		}

		public void setElementItem(int elementItem) {
			this.elementValue = elementItem;
		}

		public int getResultItem() {
			return resultValue;
		}

		public void setResultItem(int resultItem) {
			this.resultValue = resultItem;
		}

}
