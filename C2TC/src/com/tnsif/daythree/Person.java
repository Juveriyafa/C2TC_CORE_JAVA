package com.tnsif.daythree;
//entity class
//Program to demonstrate person information and calculate taxes
public class Person {
	// Data members
	
		private	String name;//good practice is to declare all data members as private as we do same in companies
		private	int income;
		private	String gender;
		private	int age ;
		private	int taxes;
		 
			
		// getters and setters
		public void setName(String name) {
			this.name = name;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getTaxes() {
			return taxes;
		}
		public void setTaxes(int taxes) {
			this.taxes = taxes;
		}

		@Override
		
		/*When you use the toString() method on an object,
		 *  it returns a textual representation of that object.
		 *   This can be particularly useful for debugging and logging purposes,
		 *    as well as for providing meaningful information about an object's state when printing or displaying it.
		 */
		public String toString() {
			return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", taxes="
					+ taxes + "]";
		}
		
		
		

}
