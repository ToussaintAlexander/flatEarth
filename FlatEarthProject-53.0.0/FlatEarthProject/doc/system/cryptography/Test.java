package flatearth.common.utilities;

public class Test {

	public static String zero_pad_bin_char(String bin_char){
	    int len = bin_char.length();
	    if(len == 8) return bin_char;
	    String zero_pad = "0";
	    for(int i=1;i<8-len;i++) zero_pad = zero_pad + "0"; 
	    return zero_pad + bin_char;
	}
	public static String plaintext_to_binary(String pt){
	    return hex_to_binary(plaintext_to_hex(pt));
	}
	public static String binary_to_plaintext(String bin){
	    return hex_to_plaintext(binary_to_hex(bin));
	}
	public static String plaintext_to_hex(String pt) {
	    String hex = "";
	    for(int i=0;i<pt.length();i++){
	        String hex_char = Integer.toHexString(pt.charAt(i));
	        if(i==0) hex = hex_char;
	        else hex = hex + hex_char;
	    }
	    return hex;  
	}
	public static String binary_to_hex(String binary) {
	    String hex = "";
	    String hex_char;
	    int len = binary.length()/8;
	    for(int i=0;i<len;i++){
	        String bin_char = binary.substring(8*i,8*i+8);
	        int conv_int = Integer.parseInt(bin_char,2);
	        hex_char = Integer.toHexString(conv_int);
	        if(i==0) hex = hex_char;
	        else hex = hex+hex_char;
	    }
	    return hex;
	}
	public static String hex_to_binary(String hex) {
	    String hex_char,bin_char,binary;
	    binary = "";
	    int len = hex.length()/2;
	    for(int i=0;i<len;i++){
	        hex_char = hex.substring(2*i,2*i+2);
	        int conv_int = Integer.parseInt(hex_char,16);
	        bin_char = Integer.toBinaryString(conv_int);
	        bin_char = zero_pad_bin_char(bin_char);
	        if(i==0) binary = bin_char; 
	        else binary = binary+bin_char;
	        //System.out.printf("%s %s %2s", hex_char,bin_char, " ");
	        System.out.printf("%s %s %s", hex_char,bin_char, " ");
	    }
	    return binary;
	}
	public static String hex_to_plaintext(String hex) {
	    String hex_char;
	    StringBuilder plaintext = new StringBuilder();
	    char pt_char;
	    int len = hex.length()/2;
	    for(int i=0;i<len;i++){
	        hex_char = hex.substring(2*i,2*i+2);
	        pt_char = (char)Integer.parseInt(hex_char,16);
	        plaintext.append(pt_char);
	        //out.printf("%s %s\n", hex_char,bin_char);
	    }
	    return plaintext.toString();
	}
	public static void main (String [] args) {
		
		hex_to_binary("4210001102C04804");
		
		System.out.println();
		System.out.println();
		
		System.out.println(binary_to_hex("01000010"));
		
	}
	
}
