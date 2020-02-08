package katas;

public class CreatePhoneNumber {
    public  String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");
        for (int item = 0; item < numbers.length; item++) {
            if (item <= 2){
                phoneNumber.append(numbers[item]);
            }
            if (item == 2){
                phoneNumber.append(") ");
            }
            if (item <= 5 && item >= 3){
                phoneNumber.append(numbers[item]);
            }
            if (item == 5){
                phoneNumber.append("-");
            }
            if (item > 5) {
                phoneNumber.append(numbers[item]);
            }
        }
        return phoneNumber.toString();
    }
}

