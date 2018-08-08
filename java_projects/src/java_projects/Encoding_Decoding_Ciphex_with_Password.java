package java_projects;

import java.util.Scanner;

class Encrypt_password {
	String encode_password;
	String encoded_msg;
	String decoded_msg;

	Encrypt_password(String Password) {
		encode_password = Password;
		decoded_msg = encoded_msg = "";
	}

	public void encode(String input_to_be_encoded) {

		for (int index = 0, j = 0; index < input_to_be_encoded.length(); index++) {
			encoded_msg = encoded_msg + (char) (input_to_be_encoded.charAt(index) ^ encode_password.charAt(j));
			j++;
			if (j == encode_password.length()) {
				j = 0;
			}
			;
		}

		System.out.println("Hooray we have encrypted your data, here is your encrypted data");
		System.out.println(encoded_msg);
		System.out.println("");
	}

	public char decode() {
		System.out.print("Enter the password to be decrypt your message : ");
		Scanner input_scanner1 = new Scanner(System.in);
		String Compare_password = "";
		if (input_scanner1.hasNext()) {
			Compare_password = input_scanner1.next();
		} else {
			System.out.println("Invalid input. Please try again.");
			//input_scanner1.next();
		}
		input_scanner1.close();

		if (Compare_password != encode_password) {
			System.out.println("Sorry your password id wrong");
		} else if ((Compare_password == encode_password)) {
			for (int index = 0, j = 0; index < encoded_msg.length(); index++) {
				input_scanner1.close();
				decoded_msg = decoded_msg + (char) (encoded_msg.charAt(index) ^ encode_password.charAt(j));
				j++;
				if (j == encode_password.length()) {
					j = 0;
				}
				;
			}
			System.out.println("Hooray we have decrypted your data, here is your decrypted data");
			System.out.println("");
			System.out.println(decoded_msg);
		
		}
		return (char) 0;
	}

}

public class Encoding_Decoding_Ciphex_with_Password {

	public static void main(String[] args) {
		Scanner input_scanner = new Scanner(System.in);
		String input_string = "";
		String input_password = "Rajesh";

		Encrypt_password obj_enc = new Encrypt_password(input_password);
		System.out.println("");

		System.out.print("Enter the String to be encrypted : ");
		for (;;) {
			if (input_scanner.hasNextLine()) {
				input_string = input_string + input_scanner.nextLine(); // use nextLine() to read the multiple words ,
																		// use next() to 1 word
				break;
			}
		}
		input_scanner.close();

		System.out.println("Sending your text for encryption:");
		obj_enc.encode(input_string);

		// For decrption
		obj_enc.decode();
	}

}
