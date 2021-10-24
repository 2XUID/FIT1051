public class MainClass {
    public void l1(){
        //without using variables at all
        System.out.println(3);
        System.out.println(8);
        System.out.println(5);
        System.out.println(2);
        System.out.println(3+8+5+2);

        //using independent variables and another variable for their sum
        int a=3;
        int b=8;
        int c=5;
        int d=2;
        int sum=a+b+c+d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(sum);

        //reusing one variable and another variable for sum
        int total=0;
        int i;
        i=3;
        total=total+i;
        System.out.println(i);
        i=8;
        total=total+i;
        System.out.println(i);
        i=5;
        total=total+i;
        System.out.println(i);
        i=2;
        total=total+i;
        System.out.println(i);
        System.out.println(total);
    }

    public void l2(){
        int height=168;
        System.out.println("Your height: "+height+"cm");

        String lightState="RED";
        System.out.println("The state of a traffic light: "+lightState);

        int studentNumber=202;
        System.out.println("The number of students enrolled in FIT1051 so far: "+studentNumber);

        int age=11;
        System.out.println("The age of a primary school student: "+age+" years old");

        double balance=5000.03;
        System.out.println("The balance of a bank account: "+balance+" dollars");

        int maxSpeed = 200;
        System.out.println("The maximum speed of an electric car: "+maxSpeed+"km/h");

        double capacity=100.0;
        System.out.println("The capacity of electric car batteries: "+capacity+"kw/h");
    }

    public void l3(){
        float f=35.1415F;
        System.out.println("float f: "+f);
        int i=1013;
        System.out.println("int i: "+i);
        char c='g';
        System.out.println("char c: "+c);
        String s="HelloWorld";
        System.out.println("String s: "+s);
        double d=55.34278698734;
        System.out.println("double d: "+d);
        boolean b=true;
        System.out.println("boolean b: "+b);

        /*
        assigning float to int:
        int i1=f;
        System.out.println(i1);     //error: incompatible types
        */
        int i1= (int)f;
        System.out.println("float 35.1415F to int: "+i1);   //35: conversion performs successfully with a cast but some information is lost (35.1415-->35)

        /*
        assigning float to char:
        char c1=f;
        System.out.println(c1);   //error: incompatible types
        */
        char c1=(char)f;
        System.out.println("float 35.1415F to char: "+c1);    //#: conversion performs successfully with a cast but it executes the ASCII value of 35 instead of 35.1415

        /*
        assigning float to String:
        String s1=f;
        System.out.println(s1);   //error: incompatible types
        String s1=(String)f;
        System.out.println(s1);  //error: incompatible types
        Therefore, Java cannot perform conversion from float to string with or without a cast
         */

        //assigning float to double:
        double d1=(double)f;
        System.out.println("float 35.1415F to double: "+d1);    //35.14149856567383: conversion performed automatically and the value becomes more precise

        /*
        assigning float to boolean:
        boolean b1=f;
        System.out.println(b1);  //error: incompatible types
        boolean b1=(boolean)f;
        System.out.println(b1);  //error: incompatible types
        Therefore, float cannot be converted to boolean with or without a cast
         */

        /*
        conclusion:
        float-->int: successful with cast
        float-->char: successful with cast
        float-->String: unsuccessful
        float-->double: automatically successful
        float-->boolean: unsuccessful
         */


        //assigning int to float:
        float f2=i;
        System.out.println("int 1013 to float: "+f2);// 1013.0: successful automatic conversion

        /*
        assigning int to char:
        char c2=i;
        System.out.println(c2);   //error: incompatible types
         */
        char c2=(char)i;
        System.out.println("int 1013 to char: "+c2);   //ϵ: successful with a cast

        /*
        assigning int to string:
        String s2=i;
        System.out.println(s2);   //error: incompatible types
        String s2=(String)i;
        System.out.println(s2);   //error: incompatible types
        Therefore, Java cannot perform conversion from int to string with or without a cast
         */

        //assigning int to double:
        double d2=i;
        System.out.println("int 1013 to double: "+d2);     //1013.0: successful automatic conversion

        /*
        assigning int to boolean:
        boolean b2=i;
        System.out.println(b2);  //error:incompatible types
        boolean b2=(boolean)i;
        System.out.println(b2);  //error: incompatible types
        Therefore, int cannot be converted to boolean with or without cast
         */

        /*
        conclusion:
        int-->float: automatically successful
        int-->char: successful with a cast
        int-->string: unsuccessful
        int-->double: automatically successful
        int-->boolean: unsuccessful
         */


        //assigning char to float:
        float f3=c;
        System.out.println("char 'g' to float: "+f3);  //103.0: successful automatic conversion

        //assigning char to int:
        int c3=c;
        System.out.println("char 'g' to int: "+c3);  //103: successful automatic conversion

        /*
        assigning char to String:
        String s3=c;
        System.out.println(s3);  //error: incompatible types
        String s3=(String)c;
        System.out.println(s3);  //error: incompatible types
        Therefore, char cannot be converted to String with or without a cast
         */

        //assigning char to double:
        double d3=c;
        System.out.println("char 'g' to double: "+d3);   // 103.0: automatically successful conversion

        /*
        assigning char to boolean:
        boolean b3=c;
        System.out.println(b3); //error:incompatible types
        boolean b3=(boolean)c;
        System.out.println(b3); //error:incompatible types
        */

        /*
        conclusion:
        char-->float:automatically successful
        char-->int: automatically successful
        char-->String: unsuccessful with or without a cast
        char-->double:automatically successful
        char-->boolean: unsuccessful with or without a cast
         */


        /*
        assigning String to float:
        float f4=s;
        System.out.println(f4);   //error: incompatible types
        float f4=(float)s;
        System.out.println(f4);   //error: incompatible types

        assigning String to int:
        int i4=s;
        System.out.println(i4);   //error: incompatible types
        int i4=(int)s;
        System.out.println(i4);   //error: incompatible types

        assigning String to char:
        char c4=s;
        System.out.println(c4);   //error: incompatible types
        char c4=(char)s;
        System.out.println(c4);   //error: incompatible types

        assigning String to double:
        double d4=s;
        System.out.println(d4);   //error: incompatible types
        double d4=(double)s;
        System.out.println(d4);   //error: incompatible types

        assigning String to boolean:
        boolean b4=s;
        System.out.println(b4);   //error: incompatible types
        boolean b4=(boolean)s;
        System.out.println(b4);   //error: incompatible types

        conclusion: String cannot be converted to float/int/char/double/boolean with or without a cast
         */


        /*
        assigning double to float:
        float f5=d;
        System.out.println(f5);    //error: incompatible types
         */
        float f5=(float)d;
        System.out.println("double 55.34278698734 to float: "+f5);   //55.34279: successful with a cast but some information is lost

        /*
        assigning double to int:
        int i5=d;
        System.out.println(i5);   //error: incompatible types
         */
        int i5=(int)d;
        System.out.println("double 55.34278698734 to int: "+i5); //55: successful with a cast

        /*
        assigning double to char:
        char c5=d;
        System.out.println(c5);   //error: incompatible types
         */
        char c5=(char)d;
        System.out.println("double 55.34278698734 to char: "+c5);  //7 (ASCII number 55-->character'7'): successful with a cast

        /*
        assigning double to String:
        String s5=d;
        System.out.println(s5);   //error: incompatible types
        String s5=(String)d;
        System.out.println(s5);   //error: incompatible types
        Therefore, double cannot be converted to String with or without a cast
         */

        /*
        assigning double to boolean:
        boolean b5=d;
        System.out.println(b5);   //error: incompatible types
        boolean b5=(boolean)d;
        System.out.println(b5);   //error: incompatible types
         */

        /*
        conclusion:
        double-->float: successful with a cast
        double-->int: successful with a cast
        double-->char: successful with a cast
        double-->String: unsuccessful with or without a cast
        double-->boolean: unsuccessful with or without a cast
         */

        /*
        assigning boolean to float:
        float f6=b;
        System.out.println(f6);   //error: incompatible types
        float f6=(float)b;
        System.out.println(f6);   //error: incompatible types

        assigning boolean to int:
        int i6=b;
        System.out.println(i6);   //error: incompatible types
        int i6= (int)b;
        System.out.println(i6);   //error: incompatible types

        assigning boolean to char:
        char c6=b;
        System.out.println(c6);   //error: incompatible types
        char c6=(char)b;
        System.out.println(c6);   //error: incompatible types

        assigning boolean to String:
        String s6=b;
        System.out.println(s6);   //error: incompatible types
        String s6=(String)b;
        System.out.println(s6);   //error: incompatible types

        assigning boolean to double:
        double d6=b;
        System.out.println(d6);   //error: incompatible types
        double d6=(double)b;
        System.out.println(d6);   //error: incompatible types

        conclusion: boolean cannot be converted to float/int/char/String/double/boolean
         */
    }

    public void l4(){
        char c1=(char)2147483646;   //char:0 to 65535   int:-2147483648 to 2147483647
        System.out.println("2147483647 to char is :"+c1);

        byte b1=(byte)128;  //byte:-128 to 127
        System.out.println("128 to byte is: "+b1);
        byte b2=(byte)145;
        System.out.println("145 to byte is: "+b2);

        
        int a=5;
        String b= "hello";
        boolean c=true;
        double d=1.2;
        System.out.println(a+b+c+d);
        //System.out.println(a+c);
        //System.out.println(d+c);

        double d4=12.978;
        byte b4=1;
        b4=(byte)d4;
        System.out.println(b4);
    }
}
