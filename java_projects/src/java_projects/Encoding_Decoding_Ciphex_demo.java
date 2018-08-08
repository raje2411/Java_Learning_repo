package java_projects;

import java.util.Scanner;

class Encrypt {
	int encode_key;
	String encoded_msg;
	String decoded_msg;

	Encrypt(int key_value) {
		encode_key = key_value;
		decoded_msg = encoded_msg = "";
	}

	public void encode(String input_to_be_encoded) {
		// System.out.println("The message you have give me to encrypt is
		// :\""+input_to_be_encoded+"\"");
		for (int index = 0; index < input_to_be_encoded.length(); index++) {
			encoded_msg = encoded_msg + (char) (input_to_be_encoded.charAt(index) ^ encode_key);
		}

		System.out.println("Hooray we have encrypted your data, here is your encrypted data");
		System.out.println(encoded_msg);
	}

	public void decode() {
		for (int index = 0; index < encoded_msg.length(); index++) {
			decoded_msg = decoded_msg + (char) (encoded_msg.charAt(index) ^ encode_key);
		}
		System.out.println("Hooray we have decrypted your data, here is your decrypted data");
		System.out.println(decoded_msg);
	}
}

public class Encoding_Decoding_Ciphex_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encrypt obj_enc = new Encrypt(200);
		Scanner input_scanner = new Scanner(System.in);
		String input_string = "";

		System.out.print("Enter the String to be encrypted : ");
		for (;;) {
			if (input_scanner.hasNextLine()) {
				input_string = input_string + input_scanner.nextLine();   //use nextLine() to read the multiple words , use next() to 1 word
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
