import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

//        String ex = "everything is all right!";
//
//        char[] ch_arr = ex.toCharArray();
//
//        System.out.println(Arrays.toString(ch_arr));
//
//        String ex1 = new String(ch_arr);
//
//        System.out.println( ex1);


        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a);
        System.out.println(b);

        // ch -> ch[] -->
        String c = "123455";


        String d = new String(c);


        System.out.println("d입니다 : " + d);

        if (a.equals(b)) {

            System.out.println("true");

        } else {

            System.out.println("false");


        }

        Integer e = new Integer(10);
        Integer f = new Integer(10);


        int k = 10;
        int z = 10;


        if (k == z) {

            System.out.println("int" + "ture");

        } else {


            System.out.println("int" + "false");
        }

        System.out.println("integer123123132 : " + e);
        System.out.println("integer123123132 : " + f);


        if (e == f) {

            System.out.println("Integer" + "true");
        } else {

            System.out.println("Integer" + "false");

        }

        String ant = "12313123a;lfka;slkfa;lkf;as";
        String[] antM = ant.split("");
        System.out.println(Arrays.toString(antM));


        Exam z12 = new Exam2();

        z12.output();


    }



}

