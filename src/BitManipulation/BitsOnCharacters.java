package BitManipulation;

public class BitsOnCharacters {
    public static void main(String[] args) {
        PrintingBinaryDigits.printBits('A');
        // making it in lower case have to set the 5th bit
        char ch = 'A';
        char ch2 = (char)(ch | (1<<5));
        PrintingBinaryDigits.printBits(ch2);
        System.out.println(ch2);

        // if I have to change lowercase to uppercase
        // have to AND with the ~(1<<5)

        char ch3 = 'a';
        PrintingBinaryDigits.printBits(ch3);
        char ch4 = (char)(ch3 & (~(1<<5)));
        PrintingBinaryDigits.printBits(ch4);
        System.out.println(ch4);


        // we can also use ' ' space and '_' underscore to fo the same
        // ' ' has binary as 0100000
        // '_' has binary as 1011111
        char ch5 = 'a';
        PrintingBinaryDigits.printBits(' ');
        PrintingBinaryDigits.printBits('_');

        // so for changing the Uppercase to Lowercase
        // have to OR with ' '

        System.out.println((char)('A' | ' '));

        System.out.println((char)('a' & '_'));
    }
}
