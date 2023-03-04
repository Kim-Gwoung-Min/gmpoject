package home1;

import java.util.ArrayList;

class Employee{
	String name;
	int[] hours;
	
	public Employee(String str, int[] arr) {
		this.name=str;
		this.hours = arr;
	}
	

	void printTotalHours() {
		System.out.printf("%s -> %d 시간 \n", name, totalHours());
		
	}
	int totalHours() {
		int sum =0;
		for( int i=0; i<hours.length; i++) {
			sum+=hours[i];
		}
		return sum; 
	}
	
}

public class EmployeeTest {
	public static void main(String[] args) {
			int[] hours0 = {2, 4, 3, 4, 5, 8,8};
			int[] hours1 = {7,3,4,3,3,4,1};
			int[] hours2 = {10,2,3,4,5,1};
			int[] hours3= {7,3,4,5,9,10,9};
			
			
			// 객체 생성 
			Employee e0 = new Employee("직원0", hours0);
			Employee e1 = new Employee("직원1", hours1);
			Employee e3 = new Employee("직원2", hours2);
			Employee e4 = new Employee("직원3", hours3);
		
			//객체 배열 만들기 
			Employee[] emp = {e0, e1, e3, e4};
			
			//정보 출력
			for (Employee employee : emp) {
				employee.printTotalHours();
			}
			
			
	}
}
