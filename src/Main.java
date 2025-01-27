

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        //String[] strs = {"dog","racecar","car"};

        //String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        //String[] words2 = {"l","e"};

        //Array2DVisit a = new Array2DVisit();
        //System.out.println(a.helloWorld());

//        int[]   arr = {1,3,4,2,10};
//        int[][] mat = {{1,4},{2,3}};

//        int[]   arr = {1,4,5,2,6,3};
        int[][] mat = {{20, 3, 20, 17, 2, 12, 15, 17, 4, 15}, {20, 10, 13, 14, 15, 5, 2, 3, 14, 3}};

        gridGame_v2 g = new gridGame_v2();
        System.out.println("result : " + g.gridGame(mat));

        //a.firstCompleteIndex(arr,mat);
        //System.out.println("result : "+a.firstCompleteIndex(arr,mat));

//        pallindromeProblem p = new pallindromeProblem();
//        String s = "true";
//        System.out.println(Boolean.toString(p.canConstruct(s,4)));

//        substringProblem s = new substringProblem();
//        System.out.println(s.helloWorld());
//
//        List<String> s2 = new ArrayList<>();
//        s2 = s.wordSubsets(words1,words2);


//        Main a = new Main();
//        //System.out.println("computer".substring(4));
//        String final_answer = a.longestCommonPrefix(strs);
//        System.out.println(" Result "+final_answer);


    }

    public String longestCommonPrefix(String[] strs) {

        String result_prefix = "";
        String temp_result = "";
        int string_array_length = strs.length;

        if (string_array_length == 1) {
            result_prefix = strs[0];

        } else if (string_array_length == 2) {
            result_prefix = common_prefix(strs[0], strs[1]);
        } else {

            temp_result = strs[0];
            for (int i = 1; i < string_array_length; i++) {
                temp_result = common_prefix(temp_result, strs[i]);
                if (temp_result.equals("")) {

                    break;
                }
            }
        }
        result_prefix = temp_result;
        return result_prefix;
    }

    public String common_prefix(String s1, String s2) {
        //make sure that s1 is smaller
        String sub_prefix = "";
        String temp;

        if (s1.length() > s2.length()) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }


        for (int k = 0; k < s1.length(); k++) {
            if (s1.charAt(k) == s2.charAt(k)) {
                sub_prefix = sub_prefix + s1.charAt(k);
            } else {
                break;
            }
        }
        return sub_prefix;
    }


    public int countPrefixSuffixPairs(String[] words) {

        int n = words.length;
        int result = 0;

        for (int i = 0; i < n; i = i + 1) {
            //System.out.println(words[i]);
            for (int j = i + 1; j < n; j = j + 1) {
                System.out.println(words[i]);
                if (isPrefixAndSuffix(words[i], words[j])) {
                    result++;
                }
            }
        }
        return result;
    }


    public boolean isPrefixAndSuffix(String A, String B) {
        boolean result_prefix_suffix = false;

        System.out.println(" A string : " + A);
        System.out.println(" B string : " + B);

        int a_length = A.length();
        int b_length = B.length();
        String prefix, suffix;

        if (a_length > b_length) {
            result_prefix_suffix = false;
        } else {
            prefix = B.substring(0, a_length);
            suffix = B.substring(b_length - a_length);

            System.out.println("prefix : " + prefix);
            System.out.println("suffix : " + suffix);

            if (A.equals(prefix) && prefix.equals(suffix)) {

                System.out.println("came in : ");
                result_prefix_suffix = true;
            }
        }
        return result_prefix_suffix;
    }


}




