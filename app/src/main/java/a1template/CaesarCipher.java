// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset){
        // Fill in here
        this.offset = offset;
        this.alphabet = new Character[26];
        for(int i = 0; i < 26; i++){
            alphabet[i] = (char) ('A' + i);
        }
        this.cipher = new DynamicArray<>(alphabet);
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        // This is a stub -- fill in the code and return the
        // value you calculate
        for (int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == val){
                return i; 
            }
        }
        return 0;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message) {
        String result = "";
        for (char c : message.toCharArray()) {
            int index = findIndex(c);
            if (index != -1) {
                result += cipher.get(index, offset);
             }
         }System.out.println(result);
        return result;
            
        }
    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        String result = "";
        for (char c : message.toCharArray()) {
            int index = findIndex(c);
            if (index != -1) { 
                result += cipher.get(index, -offset); 
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
       CaesarCipher cipher = new CaesarCipher(1);
        cipher.encode("HELLO");
        cipher.decode("IFMMP");
    }
    
}
