public class DoingIt {
    public void lab1() {
        int n;
        boolean result;
        //test values: -5,-10,6,7,-8,0,-200,-101;

        //1st value:
        n=-5;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect false, get: "+result);
        //2nd value:
        n=-10;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect true, get: "+result);
        //3rd value:
        n=6;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect false, get: "+result);
        //4th value:
        n=7;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect false, get: "+result);
        //5th value:
        n=-8;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect true, get: "+result);
        //6th value:
        n=0;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect false, get: "+result);
        //7th value:
        n=-200;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect true, get: "+result);
        //8th value:
        n=-101;
        result=n<0 && n%2==0;
        System.out.println("n: "+n+" expect false, get: "+result);
    }

    public void lab2() {
        int n;
        boolean result;
        //test values: -31, 151, 27, 54, 92, 107, 85, 86, 87, 88

        //1st value:
        n=-31;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect false, get: "+result);
        //2nd value
        n=151;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect false, get: "+result);
        //3rd value
        n=27;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //4th value
        n=54;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //5th value
        n=92;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //6th value
        n=107;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //7th value
        n=85;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //8th value
        n=86;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect false, get: "+result);
        //9th value
        n=87;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect true, get: "+result);
        //10th value
        n=88;
        result=n>=-30 && n<=150 && !(n>80 && n<90 && n%2==0);
        System.out.println("n: "+n+" expect false, get: "+result);
    }

    public void lab3() {
        String userInput;
        String s1="FIT";
        String s2="1051";
        String s3="week";
        boolean result;

        //exact match:
        //test values: FIT,fit,hello,WEEK, 1052, 1051, week,WEek, hello1051, FITweek1051
        //1st value
        userInput="FIT";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //2nd value
        userInput="fit";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //3rd value
        userInput="hello";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //4th value
        userInput="WEEK";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //5th value
        userInput="1052";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //6th value
        userInput="1051";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //7th value
        userInput="week";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //8th value
        userInput="WEek";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //9th value
        userInput="hello1051";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //10th value
        userInput="FITweek1051";
        result=userInput.equals(s1)||userInput.equals(s2)||userInput.equals(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);

        System.out.println("The following is for substring using .contains()");

        //contain substring:
        //1st value
        userInput="FIT1051week";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //2nd value
        userInput="Fit1052";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //3rd value
        userInput="Hello week";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //4th value
        userInput="Week10511052";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //5th value
        userInput="WEEKfit1052";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //6th value
        userInput="HelloWorldWEEK10512222";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //7th value
        userInput="week5 fit";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //8th value
        userInput="FIT hello WEEK 4";
        result=userInput.contains(s1)||userInput.contains(s2)||userInput.contains(s3);
        System.out.println("String: "+userInput+" expect true, get: "+result);
    }

    public void lab4() {
        //exact match
        String userInput;
        String s="FIT1051";
        boolean result;
        //1st value
        userInput="fit1051";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //2nd value
        userInput="FIT1051";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //3rd value
        userInput="FIT1052";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //4th value
        userInput="FiT1051";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //5th value
        userInput="FIT";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //6th value
        userInput="1051";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //7th value
        userInput="FIt1051";
        result=userInput.equals(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);

        System.out.println("The following is for substring using .contains()");

        //substring:
        //1st value
        userInput="FIT 1051";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //2nd value
        userInput="FIT1051aaaaaaa";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //3rd value
        userInput="Fit1051 hello";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //4th value
        userInput="Hello FIT1051";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //5th value
        userInput="Hello FIT 1051";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //6th value
        userInput="FITabcd1051";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
        //7th value
        userInput="I am studying FIT1051 week4";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect true, get: "+result);
        //8th value
        userInput="I am studying FIT 1051 week4";
        result=userInput.contains(s);
        System.out.println("String: "+userInput+" expect false, get: "+result);
    }

    public void lab5() {
        //swap two int variables without declaring another variable:
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapping a=10 and b=20: the result is a="+a+" and b="+b);

        //swap two double variables with declaring another variable:
        double c=1.45;
        double d=3.42;
        double sum=c+d;
        d=c;
        c=sum-d;
        System.out.println("swapping c=1.45 and d=3.42: the result is c="+c+" amd d="+d);

        //swap two int variables with declaring another variable but without arithmetic operation:
        int e=5;
        int f=8;
        int spare=e;
        e=f;
        f=spare;
        System.out.println("swapping e=5 and f=8: the result is e="+e+" and f="+f);
        

        //swap two boolean variables:
        boolean x=false;
        boolean y=true;
        //declaring a storage to store initial value of f;
        boolean storage;
        storage=y;
        y=x;
        x=storage;
        System.out.println("after swapping, initial x(false) and y(true) turn to x: "+x+" and y: "+y);
    }

    public void lab6() {
        double a=2.2;
        double b=7.3;
        double c=5.1;
        double bpower=Math.pow(b,2);
        double discriminant=bpower-4*a*c;
        double d=Math.sqrt(discriminant);
        double numerator1=-b+d;
        double numerator2=-b-d;
        double denominator=2*a;
        double root1=numerator1/denominator;
        double root2=numerator2/denominator;
        System.out.println("root1 is: "+root1+" root2 is: "+root2);
    }
}
