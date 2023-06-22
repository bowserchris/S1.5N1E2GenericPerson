package n1e2;

public class Person {
	
	private String nameFirst;
	private String nameLast;
	private int age;
	
	public Person(String nameFirst, String nameLast, int age) {
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.age = age;
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", age=" + age + "]";
	}
	
	

}
