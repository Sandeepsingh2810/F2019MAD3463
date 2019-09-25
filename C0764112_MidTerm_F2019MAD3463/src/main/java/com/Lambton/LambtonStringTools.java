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