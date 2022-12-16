package com.jdbcCrud.partha;
import java.util.Scanner;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int id=0,age=0;
			String name="",addr="",query="";
				System.out.println("1.View all entries");
				System.out.println("2. Create a entry");
				System.out.println("3. Update a entry");
				System.out.println("4. Delete a Entry");
				System.out.println("5. Exit");
				System.out.print("Enter operation number you want to perform :");
				int inputNumber=sc.nextInt();
				switch(inputNumber) {
				case 1:
					Read.display();
					break;
				case 2:
					System.out.print("Enter StudentID :");
					id =sc.nextInt();
					System.out.print("\nEnter Student Name :");
					name=sc.nextLine();
					System.out.print("\nEnter Student Age: ");
					age=sc.nextInt();
					System.out.print("\nEnter Student Address");
					addr=sc.nextLine();
					query=String.format("INSERT INTO student (sid, sname, sage,saddr)VALUES (%d,%s, %d,%s)", id,name,age,addr);
					Insert.insertData(query);
					break;
				case 3:
					System.out.print("Enter StudentID :");
					id =sc.nextInt();
					System.out.print("\nEnter Student Name :");
					name=sc.nextLine();
					System.out.print("\nEnter Student Age: ");
					age=sc.nextInt();
					System.out.print("\nEnter Student Address");
					addr=sc.nextLine();
					query=String.format("UPDATE student SET sname=%s, sage=%d,saddr=%s) WHERE sid=%d",name,age,addr,id);
					Update.updateData(query);
					break;
				case 4:
					System.out.print("Enter StudentID :");
					id=sc.nextInt();
					query=String.format("DELETE FROM student WHERE sid=%d",id);
					Delete.deleteData(query);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter proper operation number--");
			}
		}

	}

}
