import java.util.Random;

class RandomStringBuilder {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder stringBuilder = new StringBuilder();
        Random randomNum = new Random();

        int stringLength = 10;

        for(int i = 0; i < stringLength; i++) {
            int index = randomNum.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            stringBuilder.append(randomChar);
        }

        String randomString = stringBuilder.toString();
        System.out.println("Newly generated Random String : " + randomString);

    }
}