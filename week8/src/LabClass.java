public class LabClass {
    void l1() {
        String[] arrTest={"abcd","31","50","-2","11.234","15.7","32.333","Olivia","21","12","22"};
        for (int i=0; i<arrTest.length; i++){
            System.out.println("When the input is "+arrTest[i]+" , the output is "+daySuffix(arrTest[i]));
        }

        for (int i=1; i<=31;i++){
            String day=Integer.toString(i);
            System.out.println("When the input is "+i+ " , the output is "+daySuffix(day));
        }
    }

    public String daySuffix (String s){
        String returnValue;
        String suffix;
        if (isNumeric(s)){
            double dayDouble=Double.parseDouble(s);
            double dayRound=Math.round (dayDouble);
            int dayInt=(int)dayRound;
            if (dayInt>=1 && dayInt<=31){
                if (dayInt==1||dayInt==21||dayInt==31){
                    suffix="st";
                }
                else if (dayInt==2||dayInt==22){
                    suffix="nd";
                }
                else if (dayInt==3||dayInt==23) {
                    suffix = "rd";
                }
                else {
                    suffix="th";
                }
                returnValue=dayInt+suffix;
            }
            else{ //from 4 to 20 or from 24 to 30
                returnValue=null;
            }
        }
        else {  //not numeric
            returnValue=null;
        }
        return returnValue;
    }


    void l2() {
        System.out.println("When n=4,x=8, expected output is 30.479 and output is "+calcSeries(4,8));
        System.out.println("When n=3,x=6, expected output is 13.206 and output is "+calcSeries(3,6));
        System.out.println("When n=5,x=8, expected output is 65.147 and output is "+calcSeries (5,8));
    }
    public double calcSeries (int n, int x){
        double y;
        double sum=0;
        for (int i=1; i<=n; i++){
            double numerator=Math.pow(i,3);
            double denominator=Math.sqrt(i+x);
            double element=numerator/denominator;
            sum+=element;
        }
        y=sum+1;
        return y;
    }


    void l3() {
        int[]arr={2,3,4,7,8};
        int[]result=productOfPrevious(arr);
        for (int i=0; i<arr.length;i++){
            System.out.println(result[i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public int[] productOfPrevious (int[]arr){
        int[]newArr =new int[arr.length];
        if (arr.length>0){
            int product=1;
            for (int i=0; i<arr.length; i++){
                product*=arr[i];
                newArr[i]=product;
            }
        }
        return newArr;
    }

    void l4() {
        int result=backwardNumber(102340670);
        System.out.println(result);
    }

    public int backwardNumber (int input){
        int success=0;
        while (input>0){
            if (input%2==0){
                int newSuccess=input%10;
                success=success*10+newSuccess;
            }
            input/=10;
        }
        return success;
    }

    void l5() {
        // your code for lab task 5
    }

    void l6() {
        // your code for lab task 6
    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();


        // to execute, uncomment one method at a time
        //labClass.l1();
        //labClass.l2();
        //labClass.l3();
        labClass.l4();
        //labClass.l5();
        //labClass.l6();

    }

    static boolean isNumeric(String st){
        boolean isNum=false;
        try{
            // try to convert it
            Double.parseDouble(st);
            isNum=true;
        }
        catch (Exception e){
            // ignore the error, the default return is false.
        }
        return (isNum);
    }


}
