public class School {
	public static void main(String[] args) {
		
		Student st1=new Student("Piotr","Tyrlicz",3, 3.4);
		Student st2=new Student("Jan","Kowalski",4, 3.4);
		Teacher teacher1 = new Teacher("Alan", "Grzyb", "Matematyka", 33);


		System.out.println(st1.show());
		System.out.println(st2.show());
		System.out.println(teacher1.show());


	}

}
