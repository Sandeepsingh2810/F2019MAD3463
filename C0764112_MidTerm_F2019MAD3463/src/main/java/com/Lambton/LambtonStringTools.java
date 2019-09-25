package com.Lambton;

public class LambtonStringTools {
    public static String reverse(String s) {
        String reverse = "";


        for (int j = s.length() - 1; j >= 0; j--) {

            reverse = reverse + s.charAt(j);

        }


        return reverse;
    }






    public static String initials(String s) {

        String initial = "";
        String[] PartsofName = s.split(" ");
        char ini;
        if (PartsofName.length != 3)

        {
            return null;
        }
        else

            {

                for (int j = 0; j < PartsofName.length; j++) {
                if (j!= 2) {
                    ini = PartsofName[j].charAt(0);
                    initial = initial + ini + ".";
                    initial = initial.toUpperCase();
                } else {
                    for (int k = 0; k < 1; k++)
                    {
                        ini = PartsofName[2].charAt(k);
                        initial += ini;
                        initial = initial.toUpperCase();
                    }
                    for (int l = 1; l< PartsofName[2].length(); l++) {
                        ini = PartsofName[2].charAt(l);
                        initial = initial + Character.toLowerCase(ini);
                        initial = initial;
                    }
                }
            }
            return (initial);
        }
    }
}


    public static String replaceSubString(String s1,String s2, String s3)


    {

        int j = s3.indexOf(s1);
        if (j < 0) {
            return s3;
        }       String prevst = s3.substring(0, j);
        String afst  = s3.substring(j + s1.length());

        return prevst + s2 + afst;
    }
}

