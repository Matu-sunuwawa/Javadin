
package The_Credit_And_Saving;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;//to accept input from keyboard


//the class extends from 'Bank_one'............
class Bank_body extends Bank_one{



        /*CARRING TASKS............the body part that
        contain the whole functions with body*/

    double doubleValue;
    double acc_checker;
    double pin_checker;
        Scanner meth=new Scanner(System.in);

        //The first part of our program display...................
        //The login........................
        public void login() {
            try {
                checker();

                //use menu for input purpose.........
                Scanner menu = new Scanner(System.in);

                //ok start.........!!

                System.out.print("INSERT THE CUSTOMER NUMBER: ");
                //enter using the above object "menu"..............
                customnumber = menu.nextLine();
                System.out.print("ENSERT THE PIN NUMBER: ");
                //also enter the pin which identify you whether you are bank member.............
                pin = menu.nextLine();

                double acco = Double.parseDouble(customnumber);
                double pinnum = Double.parseDouble(pin);
                //String acc_read2 =Double.toString(doubleValue);
                if (acco == acc_checker && pinnum == pin_checker) {
                    System.out.println();
                    getAccountType();
                } else if (acco != acc_checker || pinnum != pin_checker) {
                    System.out.println();
                    System.out.println("...............................Wrong customer or pin number.");
                    login();
                } else {
                    login();
                }

                //our fault...............................
                //if the customer violet our rule the ff code will notify him/her(the customer)
                /*if (customnumber.length() != 7 || pin.length() != 4) {
                    //untill the customer get to correct it will remind him/her infinitely.........
                    while (customnumber.length() != 7 || pin.length() != 4) {

                        System.out.println();

                        System.out.println("WRONG CUSTOMER OR PIN NUMBER.");

                        System.out.println();

                        System.out.print("ENSERT THE CUSTOMER NUMBER: ");
                        customnumber = menu.nextLine();
                        System.out.print("ENSERT THE PIN NUMBER: ");
                        pin = menu.nextLine();
                    }
                }

                 */

                //LETS BEGIN...............DIVE INTO DEEP........

         /*ok it is the first part and let get to next functions
         if the customer is our bank member..............
          */


            } catch(Exception e){
                System.out.println();
                System.out.println("...............................Wrong Input!!!Enter the correct input.");
                login();
            }
        }

    public void checker(){
        //Read from file................
        try {
            File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\Custom_Acc");

            Scanner reading = new Scanner(myobj);
            while (reading.hasNextLine()) {
                //String acc_read = reading.nextLine();
                String data = reading.nextLine();
                acc_checker = Double.parseDouble(data);
                //store =data;
                //store_out = doubleValue;
                //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
            }
            reading.close();

        } catch (Exception e) {
            System.out.println();
            System.out.println("...............................something error occured!!!");
        }
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\Coustom_Pin");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String pin_read = reading.nextLine();
                    pin_checker = Double.parseDouble(pin_read);
                    //store =data;
                    //store_out = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println();
                System.out.println("...............................something error occured!!!");
                //e.printStackTrace();
            }
    }

        //checking account............

        /*The check_balance check yhe balance and display the result
        but the stored balance account should be Positive(+ve),
        otherwise it can not handle it..........

         */
        public void view_credit_balance(){
            //Read from file................
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Credit_File");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String data = reading.nextLine();
                    doubleValue = Double.parseDouble(data);
                    //store =data;
                    store_out = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println();
                System.out.println("...............................something error occured!!!");
                //e.printStackTrace();
            }
            Scanner obj=new Scanner(System.in);
            if (store_out ==0){
                System.out.println("CURRENT CREDIT AMOUNT: $"+ store_out);
                System.out.println("...............................you are free from any credit");
            }
            else if (store_out < 0){
                System.out.println("CURRENT CREDIT AMOUNT: $"+ (-1)*store_out);
            }

            System.out.println();

        }
        /*the deposite method will accept the amount that
        the customer need to enter*/
        public void deposite_fund(){
            //Read from file..............
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Credit_File");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String data = reading.nextLine();
                    doubleValue = Double.parseDouble(data);
                    //store =data;
                    store_out = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println();
                System.out.println("...............................something error occurred!!!");
                //e.printStackTrace();
            }
            Scanner obj=new Scanner(System.in);
            System.out.print("ENTER THE AMOUNT: ");
            amount_in=obj.nextDouble();
            //store_change1();

            //do not allow to pass from this condition.............
            if (amount_in <0){
                System.out.println("...............................there is no  such input");
                System.out.println("...............................please do not interrupt the system!!!");
                getcredit();
            }
            else if (amount_in ==0){
                System.out.println("...............................are you kidding me?");
                System.out.println("...............................there is no 'Zero(0)' Deposit");
            } else{     store_change1();
                if ((-1)*store_out >= amount_in){
                    if (store_in >=0){
                        if (store_out <=0){
                            store_out+=amount_in;//store_out=store_out+amount_in;
                            System.out.println("YOU ENTERED THE AMOUNT: $"+amount_in);
                        }else{
                            System.out.println("...............................It is not saving account, keep free from credit");
                        }
                    } else {
                        System.out.println();
                    }
                } else{
            /*It not handle the request of saving.....
            'it is the credit account'...............*/
                    System.out.println("...............................It is not saving account, keep free from credit");
                }
            }
            //Write into file..................
            try {
                FileWriter writing = new FileWriter("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Credit_File");

                //writing.write("THE CURRENT AMOUNT: "+(int) amount);
                //System.out.println(); "YOUR SAVING AMOUNT: $" +
                //String.valueOf(store);
                //double doubleValue = Double.parseDouble(String.valueOf(store));
                writing.write(String.valueOf(store_out));
                //System.out.println();
                //writing.write("i write my first typing.");
                System.out.println();

                writing.close();
            } catch (IOException e){
                System.out.println();
                System.out.println("...............................something error occurred!!!");
            }


        }
    /*the withdraw part will substract the entered amount
    from existed amount but if the amount entered that greater than
    the previous sored amount; It will not handled "Balance can not be handled".............*/

    public void withdraw_fund(){
        //Read from file....................
        try {
            File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Credit_File");

            Scanner reading = new Scanner(myobj);
            while (reading.hasNextLine()) {
                String data = reading.nextLine();
                doubleValue = Double.parseDouble(data);
                //store =data;
                store_out = doubleValue;
                //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
            }
            reading.close();

        } catch (IOException e) {
            System.out.println();
            System.out.println("...............................something error occurred!!!");
            //e.printStackTrace();
        }
        Scanner obj=new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT: ");
        amount_out=obj.nextDouble();
        System.out.println();
        //store_change2();
        if (amount_out <0){
            System.out.println("...............................there is no such input!!");
            System.out.println("...............................please do not interrupt the system");
            getcredit();
        }else if (amount_out ==0){
            System.out.println("...............................are you kidding me?");
            System.out.println("...............................there is no 'Zero(0)' withdraw");
        }else {
            System.out.println("YOU ENTERED AMOUNT: $"+ amount_out);
            store_change2();
        }
        //Write into file..................
        try {
            FileWriter writing = new FileWriter("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Credit_File");

            //writing.write("THE CURRENT AMOUNT: "+(int) amount);
            //System.out.println(); "YOUR SAVING AMOUNT: $" +
            writing.write(String.valueOf(store_out));
            //writing.write("i write my first typing.");
            // System.out.println();

            writing.close();
        } catch (IOException e){
            System.out.println();
            System.out.println("...............................something error occurred!!!");
        }



    }

        /*the ff two methods are to store the changes
        either during 'deposite' OR 'withdraw'*/
    //the third party will involve that store the changed amount...........
        public double store_change1(){
            return store_in+=amount_in;//store=store+amount
        }

        //the value always negative(-ve).............
        public double store_change2(){
            return store_out-=amount_out;//store=store-amount
        }



   /*-----------------------------------------------------------------------------------------------*/


        //THE SAVING ACC.....................

        /*it is also the saving account the same with
        check_accout in all features...........*/
        public void saving_balance(){
            //Read from file................
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Saving_File");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String data = reading.nextLine();
                    doubleValue = Double.parseDouble(data);
                    //store =data;
                    Newstore_in = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println();
                System.out.println("...............................something error occurred!!!");
                //e.printStackTrace();
            }
            if (Newstore_in ==0){
                System.out.println("YOUR SAVING AMOUNT IS: $"+ Newstore_in);
                System.out.println("...............................You have not any amount");
            }
            else if(Newstore_in >0){
                System.out.println("YOUR SAVING AMOUNT IS: $" + Newstore_in);
            }
            else if(Newstore_out < 0){
                System.out.println("...............................balance can not be negative!!");
            }  else {
                System.out.println("YOUR SAVING AMOUNT IS: $" + Newstore_out);
            }
            System.out.println();


        }

        public void saving_deposite(){
            //Read from file................
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Saving_File");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String data = reading.nextLine();
                    doubleValue = Double.parseDouble(data);
                    //store =data;
                    Newstore_in = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println("...............................something error occurred!!!");
                e.printStackTrace();
            }
            Scanner obj =new Scanner(System.in);
            System.out.print("AMOUNT YOU WANT TO DEPOSITE FROM SAVING ACCOUUNT : ");
            Newamount_in=obj.nextDouble();
            if (Newamount_in < 0){
                System.out.println("...............................there is no such input!!");
                System.out.println("...............................please do not interrupt the system!!");
                getSaving();
            }else if (Newamount_in ==0){
                System.out.println("...............................are you kidding me?");
                System.out.println("...............................there is no 'Zero(0)' Deposit");
            } else{
                System.out.println("YOU ENTERED THE AMOUNT OF: $"+Newamount_in);
                Newstore_change1();
            }


            try {
                FileWriter writing = new FileWriter("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Saving_File");

                //writing.write("THE CURRENT AMOUNT: "+(int) amount);
                //System.out.println(); "YOUR SAVING AMOUNT: $" +
                //String.valueOf(store);
                //double doubleValue = Double.parseDouble(String.valueOf(store));
                writing.write(String.valueOf(Newstore_in));
                //System.out.println();
                //writing.write("i write my first typing.");

                writing.close();
            } catch (IOException e){
                System.out.println();
                System.out.println("...............................something error occurred!!!");
            }


        }

        public void saving_withdraw(){
            //Read from file....................
            try {
                File myobj = new File("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Saving_File");

                Scanner reading = new Scanner(myobj);
                while (reading.hasNextLine()) {
                    String data = reading.nextLine();
                    doubleValue = Double.parseDouble(data);
                    //store =data;
                    Newstore_in = doubleValue;
                    //System.out.println("YOUR SAVING AMOUNT: $" +doubleValue);
                }
                reading.close();

            } catch (IOException e) {
                System.out.println();
                System.out.println("...............................something error occurred!!!");
                //e.printStackTrace();
            }
            Scanner obj=new Scanner(System.in);
            System.out.print("AMOUNT YOU WANT TO WITHDRAW FROM SAVING ACCOUNT : ");
            Newamount_out=obj.nextDouble();

            /*the 'Newamount_out' that we enter above can not be
            greater than Newstore_in. THe reason is 'BALANCE CAN'T BE NEGATIVE'*/
            if(Newamount_out <0){
                System.out.println("...............................there is no such input!!");
                System.out.println("...............................please do not interrupt the system!!");
                getSaving();
            }else if (Newamount_out ==0){
                System.out.println("...............................are you kidding me?");
                System.out.println("...............................there is no 'Zero(0)' withdraw");
            }  else {
                Newstore_change2();

                if (Newstore_in >= Newamount_out) {
                    if (Newstore_out < 0) {
                        if (Newstore_in > 0) {
                            //The place the storage connected 'the deposit & the withdraw part'
                            Newstore_in -= Newamount_out;//Newstore_in =Newstore_in -Newamount_out
                            System.out.println("YOU WITHDRAW THE AMOUNT OF: $" + Newamount_out);
                            Newstore_change2();

                        } else {
                            System.out.println("...............................balance can not be negative!!");
                            //Newstore_out += Newamount_out;//Newstore_out =Newstore_out +Newamount_out;
                        }
                    } else {
                        System.out.println();
                    }
                } else {
                    System.out.println("...............................balance can not be negative!!");
                    //Newstore_out += Newamount_out;//Newstore_out =Newstore_out +Newamount_out;
                }
            }
            //Write into file..................
            try {
                FileWriter writing = new FileWriter("C:\\Users\\User\\IdeaProjects\\The_Credit_And_Saving\\src\\The_Credit_And_Saving\\The_Saving_File");

                //writing.write("THE CURRENT AMOUNT: "+(int) amount);
                //System.out.println(); "YOUR SAVING AMOUNT: $" +
                writing.write(String.valueOf(Newstore_in));
                //writing.write("i write my first typing.");
                // System.out.println();

                writing.close();
            } catch (IOException e){
                System.out.println();
                System.out.println("...............................something error occurred!!!");
            }

        }

        public double Newstore_change1(){
            return Newstore_in+=Newamount_in;//Newstore_in=Newstore_in +Newamount_in;
        }
        public double Newstore_change2(){
            return Newstore_out-=Newamount_out;//Newstore_out=Newstore_out -Newamount_out;
        }


        //......................................................................//


        //The Major Container.........
        public void getAccountType () {

            //TRY AND CATCH USED!!!...............
            try{
                Scanner menu = new Scanner(System.in);

                System.out.println("Select the Account you want to access: ");
                System.out.println("Type 1 - Credit Account");
                System.out.println("Type 2 - Saving Account");
                System.out.println("TYPE 3 -Cancel");
                System.out.print("Choice: ");


                int choose = menu.nextInt();
                switch (choose) {

                    case 1:
                        getcredit();
                        break;
                    case 2:
                        getSaving();
                        break;
                    case 3:
                        System.out.println();
                        login();
                        break;
                    default:
                        System.out.println();
                        System.out.println("...............................incorrect input!!!please enter the correct key!! ");
                        System.out.println();
                        getAccountType();
                        break;
                }
            } catch (Exception e){
                System.out.println();
                System.out.println("...............................Wrong Input!!!Enter the correct input.");
                getAccountType();
                }
        }



        //ITS DO LETS Credit ACCOUNT..............

        //the majore First function.............
        public double getcredit(){

            //Try And Catch used.............
            try{
                Scanner meth = new Scanner(System.in);
                System.out.println("Checking Account: ");
                System.out.println("Type 1 - view Credit Balance");
                System.out.println("Type 2 - Credit Funds");
                System.out.println("Type 3 - Deposit Funds");
                System.out.println("TYPE 4 -RETURN TO ORIGIN");
                System.out.print("Choice: ");

                int acc_choose = meth.nextInt();
                switch (acc_choose) {
                    case 1:
                        view_credit_balance();
                        getcredit();
                        break;
                    case 2:
                        withdraw_fund();
                        getcredit();
                        break;
                    case 3:
                        deposite_fund();
                        getcredit();
                        break;
                    case 4:
                        System.out.println();
                        getAccountType();
                        break;
                    default:
                        System.out.println();
                        System.out.println("...............................incorrect input!!!please enter the correct key!!");
                        System.out.println();
                        getcredit();
                        break;

                }
            }catch (Exception e){
                System.out.println();
                System.out.println("...............................Wrong Input!!!Enter the correct input.");
            } finally{
                getcredit();
            }

            return 0;
        }

        //our fault sample...............................
    /*
        public double getChecking(){

            try {
                Scanner meth = new Scanner(System.in);

                System.out.println("Checking Account: ");
                System.out.println("Type 1 - view Balance");
                System.out.println("Type 2 - withdraw Funds");
                System.out.println("Type 3 - Deposit Funds");
                System.out.println("TYPE 4 -RETURN TO ORIGIN");
                System.out.println("Type 5 - Exit");
                System.out.print("Choice: ");

                int acc_choosing = meth.nextInt();
                switch (acc_choosing) {


                    case 1:
                        check_balance();
                        getChecking();
                        break;
                    case 2:
                        withdraw();
                        getChecking();
                        break;
                    case 3:
                        deposite();
                        getChecking();
                        break;
                    case 4:
                        System.out.println();
                        getAccountType();
                        break;
                    case 5:
                        Second_Exit();
                        break;
                    default:
                        System.out.println();
                        System.out.println("INCORRECT!!!.INPUT THE CORRECT KEY!!!..................");
                        System.out.println();
                        getChecking();
                        break;
                }

            }catch (Exception e){
                System.out.println();
                System.out.println("...............................Wrong Input!!!Enter the correct input.");

            } finally {
                getChecking();
            }

            return 0;

        }*/


        //ITS DO LETS SAVING ACCOUNT..............

        //The major Second function..........
        public double getSaving(){

            //Try And catch used............
            try{
                Bank_test myobj3 = new Bank_test();

                Scanner meth = new Scanner(System.in);

                System.out.println("Saving Account: ");
                System.out.println("Type 1 - view Balance");
                System.out.println("Type 2 - Widthdraw Funds");
                System.out.println("Type 3 - Deposit Funds");
                System.out.println("TYPE 4 -RETURN TO ORIGIN");
                System.out.print("Choice: ");

                int sav_choosing = meth.nextInt();
                switch (sav_choosing) {
                    case 1:
                        saving_balance();
                        getSaving();
                        break;
                    case 2:
                        saving_withdraw();
                        getSaving();
                        break;
                    case 3:
                        saving_deposite();
                        getSaving();
                        break;
                    case 4:
                        System.out.println();
                        getAccountType();
                        break;
                    default:
                        System.out.println();
                        System.out.println("...............................incorrect input!!!please enter the correct key!!");
                        System.out.println();
                        getSaving();
                        break;
                }
            } catch (Exception e){
                System.out.println();
                System.out.println("...............................Wrong Input!!!Enter the correct input.");
            } finally {
                getSaving();
            }

            return 0;

        }

    //The exit code from system..............
    public double Exit(){
        System.out.println("...............................thanks for using our products!!!Bye");
        return 0;
    }


    //it is the first requirement to enter to use other functions...........
        String customnumber;
        String pin;

        /*this is the declarations that
         used in the above program.............also the
         above codes functions are explained.........*/
        private double store_in=0;
        private double store_out=0;
        private double amount_in=0;
        private double amount_out=0;
        private double Newstore_in=0;
        private double Newstore_out=0;
        private double Newamount_in=0;
        private double Newamount_out=0;

    }
