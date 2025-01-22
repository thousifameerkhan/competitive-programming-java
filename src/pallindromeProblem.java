public class pallindromeProblem {


    public boolean canConstruct(String s, int k) {

        boolean result = false;

        if(k<=s.length())
        {
            int[] charCount = new int[26];

            for(char c:s.toCharArray())
                charCount[c-'a']++;

            int oddNumberChars,evenNumberChars;
            evenNumberChars = oddNumberChars = 0;

            for(int i=0;i<26;i++)
                if(charCount[i]%2 == 0)
                    evenNumberChars++;
                else oddNumberChars++;

            if(oddNumberChars>k){
                result = false;
            }
            else
            {
                result=true;
            }
        }
        return result;

    }




}
