public class LabClass {


    void lab1() {
//            int a=(int) (Math.random()*15);
//            int b=(int) (Math.random()*15);
//            int c=(int) (Math.random()*15);
//            int d=(int) (Math.random()*15);

        int a, b, c, d;
        a = b = c = 5;
        d = 4;
        System.out.println("the 4 integers are: "+a+","+b+","+c+","+d);
        if (a>=b && a>=c && a>=d){
            System.out.println("the largest is: "+a);
        }
        else if (b>=a && b>=c && b>=d) {
            System.out.println("the largest is: "+b);
        }
        else if (c>=a && c>=b && c>=d){
            System.out.println("the largest is: "+c);
        }
        else {
            System.out.println("the largest is: "+d);
        }
    }

    void lab2() {
        //declare string local variable
        String addr="NT0800";
        //state code in string
        String state=addr.substring(0,addr.length()-4);
        //postcode in integer
        String code=addr.substring(addr.length()-4);
        int post=Integer.parseInt(code);
        //state in uppercase
        String stateUpper=state.toUpperCase();
        String capcity;
        switch (stateUpper) {
            case "NSW":
                capcity = "Sydney";
                break;
            case "VIC":
                capcity = "Melbourne";
                break;
            case "NT":
                capcity = "Darwin";
                break;
            case "SA":
                capcity = "Adelaide";
                break;
            case "WA":
                capcity = "Perth";
                break;
            case "TSA":
                capcity = "Hobart";
                break;
            case "ACT":
                capcity = "Canberra";
            case "QLD":
                capcity="Brisbane";
                break;
            default:
                capcity = "Unknown state or territory";
        }
        if (post%2==0 && !capcity.equals("Unknown state or territory"))
            System.out.println("Your capital city is "+capcity+" and you live in a suburb with an even number of postcode");
        else if (post%2!=0 && !capcity.equals("Unknown state or territory"))
            System.out.println("Your capital city is "+capcity+" and you live in a suburb with an odd number of postcode");
        else
            System.out.println("Unknown state or territory");

        /*
        other address tests:
        when String addr="ABDE3654", output: Unknown state or territory
        when String addr="SA5002", output: Your capital city is Adelaide and you live in a suburb with an even number of postcode
        when String addr="act2620", output: Your capital city is Canberra and you live in a suburb with an even number of postcode
        when String addr="Qld4217", output: Your capital city is Brisbane and you live in a suburb with an odd number of postcode
        when String addr="TsA7305", output: Your capital city is Hobart and you live in a suburb with an odd number of postcode
        when String addr="NsW2481", output: Your capital city is Sydney and you live in a suburb with an odd number of postcode
        when String addr="NT0800", output: Your capital city is Darwin and you live in a suburb with an even number of postcode
         */

    }

    void lab3() {
        // your code for lab task 3
    }

    void lab4() {
        // your code for lab task 4
    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        // to execute, uncomment one method at a time
        //labClass.lab1();
        labClass.lab2();
        //labClass.lab3();
        //labClass.lab4();

    }


}
