package String;

public class ReverseWordsSentence {

    public static void main(String args[])
    {
        Distancebetweentwocharactersinstring fdistance=new Distancebetweentwocharactersinstring();
        fdistance.finddistance();
        Putspclcharacterinbetween spcl=new Putspclcharacterinbetween();
        spcl.putspecialcharacter();
        String sentence="Thi3s looks65 awesom4e!";
        ReverseWordsSentence callmethod=new ReverseWordsSentence();
        System.out.println(callmethod.reverseWords(sentence));
        ReverseInteger callreverseinteger=new ReverseInteger();
        long number=2147483647;
        System.out.println(callreverseinteger.reverse(number));
        String Jewel = "aA";
        String Stone = "zxer";
        JewelsandStones findcount=new JewelsandStones();
        System.out.println(findcount.numJewelsInStones(Jewel,Stone));
        LengthofLastWord findlength=new LengthofLastWord();
        System.out.println(findlength.lengthOfLastWord("Helloo"));
        StringClean st=new StringClean();
       st.cleanstring(sentence);
        Stringcleanthoughtporcessway dd=new Stringcleanthoughtporcessway();
        dd.rmspcl(sentence);

    }

    public String reverseWords(String s) {

        String words[] = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words)
        {

            sb.append(new StringBuilder(word).reverse()+" ");

        }
        return sb.toString().trim();
    }
}
