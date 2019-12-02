package com.region09.processor.issuer.engine.service;

public class Facet {

		private int id;
		private int element;
		private int subElement;
		private int ruleValue;
		private int elementValue;
		
		public Facet() {}
		
		public Facet(int id, int element, int subElement, int ruleItem, int elementItem) {
			super();
			this.id = id;
			this.element = element;
			this.subElement = subElement;
			this.ruleValue = ruleItem;
			this.elementValue = elementItem;
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

}
