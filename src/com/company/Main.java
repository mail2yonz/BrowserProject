/*


Yonatan Mengesha
Java bootcamp
browser project
*/



package com.company;

import java.util.Scanner;

public class Main {

   static  Browser browser;

    public static void main(String[] args) {


        //Create the Browser object
        String yesNo="";

         browser = new Browser (  );
         Tab tab;
        //Creating a scanner object

        Scanner keyboard= new Scanner (System.in);

      String answer;
        String brow;

        System.out.println ("Please Enter a browser Title: " );
        brow= keyboard.nextLine ( );


        browser.setTitle ( brow );



       if(!brow.equalsIgnoreCase ( "InternetExplorer" ))
       {
           do{
               tab= new Tab();


               System.out.println ("Please Enter title for the Tab: " );

               tab.setTitle ( keyboard.nextLine () );

               System.out.println ("Please Enter url for the Tab: " );
               tab.setUrl (  keyboard.nextLine ());




               System.out.println ("Do you want to Add another tab? (yes/No)" );
               yesNo= keyboard.nextLine ();



//          do {
//          System.out.println ("Invalid Entry ,Enter a valid entry(Yes or No) " );
//
//             yesNo=keyboard.nextLine ();
//         }while (!yesNo.equalsIgnoreCase ( "Yes" )&& !yesNo.equalsIgnoreCase ( "No" ));
//


               browser.addTabs ( tab );

           }while(yesNo.equalsIgnoreCase ( "Yes" ) && !yesNo.equalsIgnoreCase ( "No" ));



           Prining();
       }else{
           System.out.println ("Use another Browser!" );
       }



    }
    public static void Prining()
    {
        System.out.println ("Browser Title: "+  browser.getTitle ());

        System.out.println ( );

        for( Tab tab:browser.tabArrayList)
        {
            System.out.println ("The title of the Tab is : "+ tab.getTitle () );
            System.out.println ("The url of the tab is : " + tab.getUrl () );
            System.out.println ( );
        }

    }
}
