package katas;

public class ConvertStringToCamelCase {
    public String toCamelCase(String s){
        int item = 0;
        String [] array = s.split("-|_");
        for (String string :
                array) {
            if (item == 0){
                array[item] = string;
                item++;
            }
            else {
                String first = string.substring(0, 1);
                String afterLast = string.substring(1);
                array[item] = first.toUpperCase() + afterLast.toLowerCase();
                item++;
            }
        }
        return String.join("", array);
    }
}
