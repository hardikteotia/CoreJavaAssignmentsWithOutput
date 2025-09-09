package eventPackage;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Enter Capacity of event");
		Scanner sc = new Scanner(System.in);
		Person[] seats = new Person[sc.nextInt()];
		int countParticipants = 0;
		
		boolean exit =false;
		
		while(!exit) {
			System.out.println("Options - 1.Register Student \n" 
					+ "2. Register Faculty\n"
					+ "3. Display all details\n"
					+ "4. Display specific details\n "
					+ "5. Student Evaluation\n "
					+ "6. Submit feedback \n "
					+ "0. Exit ");

			switch(sc.nextInt()) {
			
			case 1: System.out.println("Enter first and last name "
					+ "graduation year, course, fees, marks");
					seats[countParticipants] = new Student(sc.next(), sc.next(), sc.nextInt(),
					sc.next(), sc.nextDouble(), sc.nextFloat());
					countParticipants++;
					break;
			
			case 2: System.out.println("Enter first and last name "
					+ "experienceInYears, speciality");
					seats[countParticipants] = new Faculty(sc.next(), sc.next(),
					sc.nextInt(), sc.next());
					countParticipants++;
					break;
			
			case 3: for(Person it : seats) {
					if (it != null) {
						System.out.println(it.toString());
					}
				}
					break;
			
			case 4: System.out.println("Enter seat number: ");
					int index = sc.nextInt()-1;
					if (index >= 0 && index < countParticipants) {
						System.out.println(seats[index]);
					} else
						System.out.println("Invalid seat no !");
					break;
					
			case 5: System.out.println
			// {f1, s1,s2,s3,f2,f3,s4,s5 .....null....}
			("Enter faculty seat no , student name & grade , "
					+ "for evaluation");
			index = sc.nextInt() - 1;
			String name=sc.next();
			String grade= sc.next();
			if (index >= 0 && index < countParticipants) {
				Person p = seats[index];
				if (p instanceof Faculty) {
					((Faculty) p).evaluateStudent(name,grade);
				} else
					System.out.println("Invalid Type !!!!");
			} else
				System.out.println("Invalid seat no !");
			break;
			
			
			// student in this seat no submit a feedback for specific 
			//faculty name with a  comment
		case 6:
			System.out.println("Enter student seat no , "
					+ "faculty name & comment ");
			index=sc.nextInt()-1;
			if(index >=0 && index < countParticipants)
			{
				Person p=seats[index];
				if(p instanceof Student)
				{
					((Student)p).submitFeedback(sc.next(), sc.next());
				} else
					System.out.println("Invalid Type !!!!!");
			} else
				System.out.println("Invalid seat no !");
			//to read off pending i/ps from the scanner
			sc.nextLine();
			break;
			
			}
			
		}

	}
	
}



