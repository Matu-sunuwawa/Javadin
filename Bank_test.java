
//...................................The Credit And Saving System...................................


/*The credit account will handle only credit
that does not handle saving and the credit will sponsored by the bank
not connected with saving...............for conclusion
in this program the saving & the credit function will independently work
the requirement is to be member of bank*/


package The_Credit_And_Saving;


import java.util.*;
import java.io.*;


class Bank_test{


        //MAIN FUNCTION........which the program run

        public static void main(String[] args){


            //our project already connected with the class name Bank_body...........
            Bank_body myobj2=new Bank_body();


            System.out.println();

            //in the first page it will displayed.........
            System.out.println("                        ............................WELCOME TO THE Credit And Saving PROJECT........................");

            System.out.println();

            //it is recommendation which our bank follow..........
            System.out.println("NOTE THAT: YOUR CUSTOMER AND PIN NUMBER LENGTH ARE 7 & 4 RESPECTIVELY AS YOU KNOW...");

            System.out.println();

            System.out.println("/............................................................................../");

            System.out.println();


            try{
            myobj2.login();
            } catch(Exception e){
                System.out.println();
                System.out.println("...............................something error occured!!!");
                //e.printStackTrace();
            }


        }

    }
