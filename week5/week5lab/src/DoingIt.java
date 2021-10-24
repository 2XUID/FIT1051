import java.util.ArrayList;

public class DoingIt {
    public void lab1() {
        //part a
        String[] cars={"BMW","AUDI","MERCEDES BENZ","PORSCHE"};
        System.out.println(cars[cars.length-3]);

        //add another car to the end
        String[] cars1={"BMW","AUDI","MERCEDES BENZ","PORSCHE","VOLKSWAGEN"};

        //test 1: length 5
        System.out.println(cars1[cars1.length-3]);
        //test 2: length 8
        String[] cars2={"BMW","AUDI","MERCEDES BENZ","PORSCHE","VOLKSWAGEN","FORD","VOLVO","TOYOTA"};
        System.out.println(cars2[cars2.length-3]);
        //test3: length 10
        String[] cars3={"BMW","AUDI","MERCEDES BENZ","PORSCHE","VOLKSWAGEN","FORD","VOLVO","TOYOTA","MAZDA","LEXUS"};
        System.out.println(cars3[cars3.length-3]);
        //test4: length 11
        String[] cars4={"BMW","AUDI","MERCEDES BENZ","PORSCHE","VOLKSWAGEN","FORD","VOLVO","TOYOTA","MAZDA","LEXUS","HONDA"};
        System.out.println(cars4[cars4.length-3]);

        //remove the element
        String[] oldCars={"BMW","AUDI","MERCEDES BENZ","PORSCHE"};

        //part b display the total number
        int len1=cars[0].length();
        int len2=cars[1].length();
        int len3=cars[2].length();
        int len4=cars[3].length();
        int total=len1+len2+len3+len4;
        System.out.println(total);

        //part c
        boolean result=cars[0].length()==cars[cars.length-1].length();
        System.out.println(result);
        //test 1.
        String[] cars5={"AUDI","BMW","MERCEDES BENZ","PORSCHE","VOLKSWAGEN","VOLVO","TOYOTA","FORD"};
        boolean result1=cars5[0].length()==cars5[cars5.length-1].length();
        System.out.println(result1);
        //test 2.
        String[] cars6={"LEXUS","AUDI","BMW","MERCEDES BENZ","PORSCHE","VOLKSWAGEN","TOYOTA","FORD","VOLVO"};
        boolean result2=cars6[0].length()==cars6[cars6.length-1].length();
        System.out.println(result2);
        //test 3.
        String[] cars7={"MERCEDES BENZ","PORSCHE","VOLKSWAGEN","FORD","VOLVO","TOYOTA"};
        boolean result3=cars7[0].length()==cars7[cars7.length-1].length();
        System.out.println(result3);


    }

    public void lab2() {
        /*
        compile error: variable myStringArray might not have been initialized
        String[] myStringArray;
        System.out.println(myStringArray);
        myStringArray=new String[3];
        myStringArray[0]="green";
         */

        /*
        run-time error: NullPointerException
        String[] myStringArray;
        myStringArray=new String[3];
        myStringArray[0]="green";
        System.out.println(myStringArray[1].length());
         */

        /*run-time error: ArrayIndexOutOfBoundsException
        String[] myStringArray;
        myStringArray=new String[3];
        myStringArray[0]="green";
        System.out.println(myStringArray[3]);
         */

        String[] myStringArray;
        myStringArray=new String[3];
        myStringArray[0]="green";
        System.out.println(myStringArray[0].length());


    }

    public void lab3() {
        //1. Declare an ArrayList of float values
        ArrayList<Float> arrList=new ArrayList<>();

        //2. add five random values in range 0<=x<10
        arrList.add((float)Math.random()*10);
        arrList.add((float)Math.random()*10);
        arrList.add((float)Math.random()*10);
        arrList.add((float)Math.random()*10);
        arrList.add((float)Math.random()*10);

        //3. print out the ArrayList
        System.out.println(arrList);

        //4. print the sum of the first three values in the ArrayList
        float num1=arrList.get(0);
        float num2=arrList.get(1);
        float num3=arrList.get(2);
        float sum=num1+num2+num3;
        System.out.println(sum);

        //5. delete the first cell
        arrList.remove(0);

        //6. add a new random value to the end
        float element=(float)Math.random()*10;
        arrList.add(arrList.size(),element);

        //7. delete the second value
        arrList.remove(1);

        //8. change the last value
        arrList.set(arrList.size()-1,(float)Math.random()*10);

        //9.print out the arraylist
        System.out.println(arrList);
    }

    public void lab4() {
        //test 1
        String s1="ChLORoPHIlL";
        String s1Lower=s1.toLowerCase();
        String firstLetter1=s1Lower.substring(0,1);
        String newFirstLetter1=firstLetter1.toUpperCase();
        String rest1=s1Lower.substring(1);
        String newS1=newFirstLetter1+rest1;
        System.out.println(newS1);

        //test 2
        String s2="ELEphANt";
        String s2Lower=s2.toLowerCase();
        String firstLetter2=s2Lower.substring(0,1);
        String newFirstLetter2=firstLetter2.toUpperCase();
        String rest2=s2Lower.substring(1);
        String newS2=newFirstLetter2+rest2;
        System.out.println(newS2);

        //test 3
        String s3="StUDEnT";
        String s3Lower=s3.toLowerCase();
        String firstLetter3=s3Lower.substring(0,1);
        String newFirstLetter3=firstLetter3.toUpperCase();
        String rest3=s3Lower.substring(1);
        String newS3=newFirstLetter3+rest3;
        System.out.println(newS3);

        //test 4
        String s4="AtMOsPHErE";
        String s4Lower=s4.toLowerCase();
        String firstLetter4=s4Lower.substring(0,1);
        String newFirstLetter4=firstLetter4.toUpperCase();
        String rest4=s4Lower.substring(1);
        String newS4=newFirstLetter4+rest4;
        System.out.println(newS4);

        //test 5
        String s5="uniCODe";
        String s5Lower=s5.toLowerCase();
        String firstLetter5=s5Lower.substring(0,1);
        String newFirstLetter5=firstLetter5.toUpperCase();
        String rest5=s5Lower.substring(1);
        String newS5=newFirstLetter5+rest5;
        System.out.println(newS5);
    }

    public void lab5() {
        String bear = "\ud83d\udc3b";
        String s1=bear;
        String s2=bear+bear;
        String s3=bear+bear+bear;
        String s4=bear+bear+bear+bear;
        System.out.println(String.format("%5s\n%6s\n%7s\n%8s",s1,s2,s3,s4));
    }

    public void lab6() {

    }
}
