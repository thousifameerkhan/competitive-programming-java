import java.util.List;
import java.util.ArrayList;

public class substringProblem {

//public static void Main(String[] args)
//{
//    System.out.println("Hello World");
//}

    public String helloWorld()
    {
        return "HelloWorld from substring";
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> result_List = new ArrayList<>();

        for(String check_word:words1)
        {
            boolean isSubset = checkSubset(check_word,words2);
        }

//        Input: words1 = ["amazon","apple","facebook","google","leetcode"],
//        words2 = ["l","e"]
//        Output: ["apple","google","leetcode"]

        return result_List;

    }

    public boolean checkSubset(String s1,String[] c1)
    {
        boolean result_boolean = false;

        for(String c1_item:c1)
        {
            for(int i=0;i<c1_item.length();i++)
            {

            }
        }

        return result_boolean;
    }


}
