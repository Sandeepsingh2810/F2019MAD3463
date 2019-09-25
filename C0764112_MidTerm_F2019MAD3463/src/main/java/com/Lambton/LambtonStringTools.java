package com.Lambton;

import com.sun.deploy.security.SelectableSecurityManager;

public class LambtonStringTools {
        public static String reverse(String s) {
            String reverse = "";


            for (int j = s.length() - 1; j >= 0; j--) {

                reverse = reverse + s.charAt(j);

            }


            return reverse;
        }


        public static String initial(String s)

        {
            String initial = "";
           String[] PartsOfName=s.split("");
            char ini;
            if (PartsOfName.length !=3);{

                return null;
        }
        else
            {


            for (int j=0;j<PartsOfName.length;j++)

            if(j<2)


            {
                ini = PartsOfName[j].charAt(0);
                initial = initial + ini +".";
                initial = initial.toUpperCase();
            }
            else
            {
                for(int i=0;i<PartsOfName[2].length();i++)
                if(i==0) {
                    ini = PartsOfName[2].charAt(i);
                    initial += ini;
                    initial = initial.toUpperCase();

                }



        }

        }

        }




