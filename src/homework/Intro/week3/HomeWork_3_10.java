package homework.Intro.week3;

/**
 * 3.10*. Удалить из предложения слова которые повторяются.
 */
public class HomeWork_3_10 {
    public static void main(String[] args) {

        String str = "Lorem ipsum dolor sit sit sit amet dolor dolor consectetur adipiscing elit elit";
        System.out.println(str);

        //Suggestion to an array of words
        String[] strArr = str.split(" ");

        //check each word for a repeat in an array
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) { //starting with the nextElement word
                if(strArr[i].equals(strArr[j])) { //find duplicate
                    strArr[j]="";
                }
            }
        }

        for (String s : strArr) {
            if (s.isEmpty()) {
                continue; //Ignore empty
            }
            System.out.print(s + " ");
        }
    }
}
