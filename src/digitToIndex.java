import java.util.Arrays;

/*
* here is my input
* i/p -- My0 name1 is2 Gaurav3
* o/p -- My name is Gaurav
* */
public class digitToIndex {
    public static void main(String[] args) {
        String inputString = "Gaurav3 My0 name1 is2";
        String[] stringArray = inputString.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for(String singleWordsFromArray: stringArray ){
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < singleWordsFromArray.length(); j++) {
                    char extractSingleCharacter = singleWordsFromArray.charAt(j);
                    if(Character.isDigit(extractSingleCharacter)){
                        int index = Integer.parseInt(Character.toString(extractSingleCharacter));
                        if(index != i){
                            changeStringArray(index,i,stringArray);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(stringArray));
    }

    private static void changeStringArray(int index, int i, String[] stringArray) {
        String temp = stringArray[i];
        stringArray[i] = stringArray[index];
        stringArray[index] = temp;
    }
}

