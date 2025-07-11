
public class JText
{
    public static String LW(String text)
    {
        if (text == null || text == "")
        {
            return "";
        }
        String[] words = text.split(" ");
        String res ="";
        for(String word : words)
        {
            if(word.length()>res.length())
            {
                res = word;
            }
        }
        return res;
    }

    public static Boolean Poli(String word)
    {
        if (word == null || word == "")
        {
            return true;
        }

        int left = 0;
        int right = word.length();
        while (left < right)
        {
            if(word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }

    public static String Bjaka(String text)
    {
        String OldWord = "бяка";
        String NewWord = "[вырезано цензурой]";

        String NewText = text.replace(OldWord,NewWord);
        return NewText;
    }

    public static Integer Entry(String text, String etext)
    {
        int index = 0;
        int num = 0;
        while ((index = text.indexOf(etext,index)) != -1)
        {
            num++;
            index += etext.length();
        }
        return num;
    }

    public static String Revers(String text)
    {
        String[] words = text.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words)
        {
            String res1 = new StringBuilder(word).reverse().toString();
            res.append(res1).append(" ");

        }
        return res.toString();
    }
}
