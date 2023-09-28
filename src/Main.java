public class Main {
    public static void main(String[] args) {
            String str1 = "Victory";
            String str2 = "Fighting";
            String str3 = "Freedom";

            String middleChars1 = getMiddleChars(str1);
            String middleChars2 = getMiddleChars(str2);
            String middleChars3 = getMiddleChars(str3);

            System.out.println("Result for " + str1 + ": " + middleChars1);
            System.out.println("Result for " + str2 + ": " + middleChars2);
            System.out.println("Result for " + str3 + ": " + middleChars3);
        }

        public static String getMiddleChars(String str) {
            int length = str.length();
            int middleIndex = length / 2;

            // Checking if the length of the string is even
            // If it is odd, then we choose one middle symbol
            if (length % 2 == 0) {
                //If it is even, then we choose two middle symbols
                return str.substring(middleIndex - 1, middleIndex + 1);
            } else {
                // If it is odd, then we choose one middle symbol
                return str.substring(middleIndex, middleIndex + 1);
            }
        }
}




