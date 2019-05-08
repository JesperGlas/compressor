import java.util.BitSet;

public class Compressor {

    // ### Variables ###
    public static String input = "Hej";
    public static BitSet input_bits;

    public static void main(String[] args) {
        System.out.println( "Welcome to Simple Compressor!" );
        System.out.println("Input: " + input);
        stringToBinary(input);
    }
    
    // ### Methods ###

    public static String stringToBinary(String input) {
        System.out.println( "Converting string to binary string" );
        String binary_str = "";
        for (int i = 0; i < input.length(); i++) {
            char temp_char = input.charAt(i);
            String temp_binary = Integer.toBinaryString(temp_char);
            System.out.println(temp_char);
            System.out.println(temp_binary);
            
            binary_str = binary_str + temp_binary;
        }
        System.out.println( binary_str );
        return binary_str;
    }

    public static String binaryToString(String input) {
        System.out.println( "Converting binary to string" );
        String str = "";
        for (int i = 0; i < input.length(); i++) {

        }
        return "";
    }
    
}