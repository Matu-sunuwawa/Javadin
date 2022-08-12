
package The_Credit_And_Saving;



import java.util.*;



/*ok we already used the abstract class
to hide the code from customer.................
 */
abstract class Bank_one {





        //METHODS WHICH I USED...............

     /*the following are the whole methods
        which used to do our tasks.................
      */

        Scanner obj=new Scanner(System.in);

     /*ok there is two major tasks in the following lists
     the first one(1): is Credit account
     the second one(2): is Saving account...............
      */

        //Checker....................
        public abstract void checker();

        //The login..........................
        public abstract void login();

        //THE Credit account................

        public abstract void view_credit_balance();
        public abstract void deposite_fund();
        public abstract void withdraw_fund();

        public abstract double store_change1();
        public abstract double store_change2();

        //THE SAVING ACC.....................

        public abstract void saving_balance();
        public abstract void saving_deposite();
        public abstract void saving_withdraw();

        public abstract double Newstore_change1();
        public abstract double Newstore_change2();


        //......................................................................//


        //THE Major container.................
        public abstract void getAccountType();

        //ITS DO LETS CHECKING ACCOUNT..............

        //The fisrt task is:...............
        public abstract double getcredit();


        //ITS DO LETS SAVING ACCOUNT..............
        //The next/last task is:................
        public abstract double getSaving();


        //Exit functions.................
        public abstract double Exit();


    }
