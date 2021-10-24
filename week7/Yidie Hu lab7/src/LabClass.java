import java.util.Random;

public class LabClass {
    void l1() {
        //roll 2 dices
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        System.out.println("dice1 is "+dice1+"and dice2 is "+dice2);
        //already rolled once
        int count=1;
        //check 1st roll conditions
        while (dice1!=dice2){ //value controlled
            //roll 2 dices again
            dice1=(int)(Math.random()*6+1);
            dice2=(int)(Math.random()*6+1);
            count++;  //roll count increases by 1 each time
            System.out.println("dice1 is "+dice1+" and dice2 is "+dice2);;
        }
        System.out.println("we rolled "+(count-1)+" times before same value and we rolled "+count+" times all together");
    }

    void l2() {
        //if the last time (same value) is counted
        int trialNumber=0;   //how many trials we have in total
        int totalCounts=0;   //total rolls in each trial
        while (trialNumber<=2000000){ //counter controlled
            int dice1=(int) (Math.random()*6+1);
            int dice2=(int) (Math.random()*6+1);
            int eachCount=1;
            while (dice1 != dice2) {
                dice1 = (int) (Math.random() * 6 + 1);
                dice2 = (int) (Math.random() * 6 + 1);
                eachCount++;
            }
            totalCounts+=eachCount;  //add every total rolls in each trial->total rolls in all the trials
            trialNumber++; //2nd trial, 3rd trial, 4th trial...
        }
        double average=(double)totalCounts/trialNumber;
        System.out.println("we expect average number around 6 and we get the result "+average +" if we count the last time");

        //if the last time (same value) is not counted
        int trialNumber1=0;   //how many trials we have in total
        int totalCounts1=0;   //total rolls in each trial
        while (trialNumber1<=2000000){ //counter controlled
            int dice1A=(int) (Math.random()*6+1);
            int dice2A=(int) (Math.random()*6+1);
            int eachCount1=0;
            while (dice1A != dice2A) { //value controlled
                dice1A = (int) (Math.random() * 6 + 1);
                dice2A= (int) (Math.random() * 6 + 1);
                eachCount1++;
            }
            totalCounts1+=eachCount1;  //add every total rolls in each trial->total rolls in all the trials
            trialNumber1++; //2nd trial, 3rd trial, 4th trial...
        }
        double average1=(double)totalCounts1/trialNumber1;
        System.out.println("we expect average number around 5 and we get the result "+average1 +" if we do not count the last time");
    }

    void l3() {
        String target="Olivia";

        //test 1
        String[]arr1={"a","bc","FIT","week7","Olivia"};
        int i1=0;
        if (arr1.length>0){ //SETINEL controlled
            while (i1<arr1.length && !arr1[i1].equals(target)){
                i1++;
            }
            if (i1 < arr1.length) {
                System.out.println("the expected index is 4 and the result is "+i1);
            }
            else {
                System.out.println("the string is not found in the array");
            }
        }
        else {
            System.out.println("Empty array!");
        }

        //test 2
        String[]arr2={};
        int i2=0;
        if (arr2.length>0){
            while (i2<arr2.length-1 && !arr2[i2].equals(target)){
                i2++;
            }
            if (arr2[i2].equals(target)) {
                System.out.println(i2);
            }
            else {
                System.out.println("the string is not found in the array");
            }
        }
        else {
            System.out.println("the string is not found in the array");
        }

       //test 3
       String[]arr3={"a","bc","def","ghi","hello world","tree","code"};
        int i3=0;
        if (arr3.length>0){
            while (i3<arr3.length-1 && !arr3[i3].equals(target)){
                i3++;
            }
            if (arr3[i3].equals(target)) {
                System.out.println(i3);
            }
            else {
                System.out.println("the string is not found in the array");
            }
        }
        else {
            System.out.println("the string is not found in the array");
        }

        //test 4
        String[]arr4={"hello","Olivia","cat","Melbourne","dog","Olivia","week4"};
        int i4=0;
        if (arr4.length>0){
            while (i4<arr4.length-1 && !arr4[i4].equals(target)){
                i4++;
            }
            if (arr4[i4].equals(target)) {
                System.out.println("the expected index is 1 and the result is "+i4);
            }
            else {
                System.out.println("the string is not found in the array");
            }
        }
        else {
            System.out.println("the string is not found in the array");
        }
    }

    void l4() {
        int count=0; //count of even numbers
        int sum=0; //sum of even numbers
        int numberTotal=0; //how many numbers in total we have before we get 100 even numbers
        do {
            Random r = new Random();
            int number = r.nextInt(1001);
            numberTotal++;
            if (number%2==0){
                System.out.println(number);
                count++;
                sum+=number;
            }
        }
        while (count<100);
        System.out.println("we have "+numberTotal+" even and odd numbers in total till we get 100 even numbers");
        System.out.println("the total of first 100 even numbers is: "+sum);
        double average=(double)sum/count;
        System.out.println("the average of first 100 even numbers is: "+average);

        //try 1
        int count1=0; //count of even numbers
        int sum1=0; //sum of even numbers
        int numberTotal1=0; //how many numbers in total we have before we get 100 even numbers
        do {
            Random r1 = new Random();
            int number1 = r1.nextInt(1001);
            numberTotal1++;
            if (number1%2==0){
                System.out.println(number1);
                count1++;
                sum1+=number1;
            }
        }
        while (count1<5);
        System.out.println("we have "+numberTotal1+" even and odd numbers in total till we get 5 even numbers");
        System.out.println("the total of first 5 even numbers is: "+sum1);
        double average1=(double)sum1/count1;
        System.out.println("the average of first 5 even numbers is: "+average1);

        //try2
        int count2=0;
        int sum2=0;
        int numberTotal2=0;
        while (count2<5){
            Random r2 = new Random();
            int number2 = r2.nextInt(1001);
            numberTotal2++;
            if (number2%2==0) {
                System.out.println(number2);
                count2++;
                sum2 += number2;
            }
        }
        System.out.println("we have "+numberTotal2+" even and odd numbers in total till we get 5 even numbers");
        System.out.println("the total of first 5 even numbers is: "+sum2);
        double average2=(double)sum2/count2;
        System.out.println("the average of first 5 even numbers is: "+average2);
    }

    void l5() {
        String[]ar={"Olivia","rabbit","cat","cat","Olivia","Olivia","cat","cat"};
        String value1="Olivia";
        int count1=0;
        boolean result1;
        for (String element:ar){
            if (element.equals(value1)){
                count1+=1;
            }
        }
        if (count1>1) {
            result1 = true;
        }
        else {
            result1 = false;
        }
        System.out.println("value: "+value1+" occurrences: " +count1+"," +result1);

        String value2="cat";
        int count2=0;
        boolean result2;
        for (String element:ar){
            if (element.equals(value2)){
                count2+=1;
            }
        }
        if (count2>1) {
            result2 = true;
        }
        else {
            result2 = false;
        }
        System.out.println("value: "+value2+" occurrences: " +count2+"," +result2);

        String value3="rabbit";
        int count3=0;
        boolean result3;
        for (String element:ar){
            if (element.equals(value3)){
                count3+=1;
            }
        }
        if (count3>1) {
            result3 = true;
        }
        else {
            result3 = false;
        }
        System.out.println("value: "+value3+" occurrences: " +count3+"," +result3);



    }

    void l6(){ //counter controlled
        //test1
        int[]arr1={70,70,60,60,40,50,50,20};
        int largest1=arr1[0];
        int second1=-2147483648;
        for (int i1=1; i1<arr1.length; i1++){
            if (arr1[i1]>=largest1) {
                largest1 = arr1[i1];
                if (arr1[i1]>largest1){
                    second1=largest1;
                }
            }
            else{     //if arr[i]<largest
                if (arr1[i1]>second1){
                    second1=arr1[i1];
                }
            }
        }
        System.out.println("the expected value is 60 and the result is "+second1);

        //test2
        int[]arr2={-5,7,100,66,-9,20,88};
        int largest2=arr2[0];
        int second2=Integer.MIN_VALUE;
        for (int i2=1; i2<arr2.length; i2++){
            if (arr2[i2]>=largest2) {
                largest2 = arr2[i2];
                if (arr2[i2]>largest2){
                    second2=largest2;
                }
            }
            else{
                if (arr2[i2]>second2){
                    second2=arr2[i2];
                }
            }
        }
        System.out.println("the expected value is 88 and the result is "+second2);

        //test3.
        int[]arr3={1,10,6,8,3,3,8};
        int largest3=arr3[0];
        int second3=-2147483648;
        for (int i3=1; i3<arr3.length; i3++){
            if (arr3[i3]>=largest3) {
                largest3 = arr3[i3];
                if (arr3[i3]>largest3){
                    second3=largest3;
                }
            }
            else{
                if (arr3[i3]>second3){
                    second3=arr3[i3];
                }
            }
        }
        System.out.println("the expected value is 8 and the result is "+second3);

        //test4
        int[]arr4={1000,1000,888,1000,1000,888,6,4,-200,500,700};
        int largest4=arr4[0];
        int second4=-2147483648;
        for (int i4=1; i4<arr4.length; i4++){
            if (arr4[i4]>=largest4) {
                largest4 = arr4[i4];
                if (arr4[i4]>largest4){
                    second4=largest4;
                }
            }
            else{
                if (arr4[i4]>second4){
                    second4=arr4[i4];
                }
            }
        }
        System.out.println("the expected value is 888 and the result is "+second4);

    }



    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        // to execute, uncomment one method at a time
        //labClass.l1();
        //labClass.l2();
        labClass.l3();
        //labClass.l4();
        //labClass.l5();
        //labClass.l6();


    }


}
