package com.Lambton;

    public class LambtonStringTools
{
    public static String reverse(String s)
    {
        String reverse = "";
        for(int j=s.length()- 1;j>=0;j--)
        {
            reverse = reverse+s.charAt(j);
        }
        return reverse;
    }
}
