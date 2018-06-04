package exercise34;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * This is the test driver for Exercise 34.
 */
public class TestDriver {
	public static final int TOTAL_MESSAGES = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// define the message list
		ArrayList<Message> messages = new ArrayList<Message>();
		
		// create messages, add them to the message list
		for(int i = 1; i <= TOTAL_MESSAGES; i++) {
			
			// create a date and the text of a message
			Date date = new Date();
			String text = "This is message " + i + ".";

			// create message, add to list
			Message message = new Message(date, text);
			
			messages.add(message);
		}
		
		// print the size of the message list
		System.out.println(messages.size());
		
		// print all messages in the message list
		for(int i = 0; i < TOTAL_MESSAGES; i++) {
			System.out.println(messages.get(i).toString());
		}
	}
}