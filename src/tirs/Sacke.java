package tirs;

import java.util.Scanner;

public class Sacke {
    class None {
        public String date;
        public None none;

        public None(String a) {
            this.date = a;
            this.none = null;
        }

        @Override
        public String toString() {
            return "None{" +
                    "date=" + date +
                    '}';
        }
    }

    public None none;

    public Sacke() {
        none = new None(null);
    }

    public boolean iEesl() {
        return none.date == null;
    }

    public void add(String a) {
        None temp = this.none;
        if (temp.date == null) {
            temp.date = a;
        } else {
            None none1 = new None(a);
            while (true) {
                if (temp.none == null) {
                    break;

                }
                temp = temp.none;
            }
            temp.none = none1;
        }


    }

    public String Dadad() {
        None temp = this.none;
        if (temp.none == null) {
            String d =  temp.date;
            temp.date = null;
            return d;
        } else {
            while (true) {
                if (temp.none.none == null) {
                    break;
                }
                temp = temp.none;
            }
            String a =  temp.none.date;
            temp.none = null;
            return a;

        }
    }

    public void list() {
        None temp = this.none;
        while (true) {
            System.out.println(temp.date);
            if (temp.none == null) {
                break;
            }
            temp = temp.none;
        }
    }

    public String char1() {//查看
        None temp = this.none;
        while (true) {
            if (temp.none == null) {
                break;
            }
            temp = temp.none;
        }
        return (String) temp.date;
    }

    public int Char(String a) {
        switch (a) {
            case "*":
            case "/":
                return 1;

            case "-":
            case "+":
                return 2;
        }
        return -1;
    }



    public int Str(int d, String string) {
        int a = 0;
        int a1 = 0;
        for (int i = 0; i < string.length(); i++) {
            String s = string.substring(i, i + 1);

            if (forwal(s) && i != 0 && i != string.length()) {

                String s1 = string.substring(0, i);

                a = s1.length();

                a1 = 1;
                return a;

            } else if (forwal(s) && i != string.length()) {
                return 1;
            } else if (i == string.length() - 1) {
                String s1 = string.substring(0, i + 1);

                a = s1.length();


                return a;
            }
        }
        return -1;
    }

    public boolean forwal(String a) {
        return a.equals("*") || a.equals("/") || a.equals("+") || a.equals("-")||a.equals("(")||a.equals(")") ? true : false;

    }





    public String musn(String a, String b, String c) {
        String num;
        Double a1;
                Double a2;
        Double a3;
        switch (c) {
            case "*":
                a1=Double.parseDouble(a);
                a2 = Double.parseDouble(b);
                a3=a1*a2;

                num=String.valueOf(a3);
                return num;
            case "/":
                a1=Double.parseDouble(a);
                a2 = Double.parseDouble(b);
                a3=a2/a1;
                num=String.valueOf(a3);
                return num;
            case "-":
                a1=Double.parseDouble(a);
                a2 = Double.parseDouble(b);
                a3=a2-a1;
                num=String.valueOf(a3);
                return num;
            case "+":
                a1=Double.parseDouble(a);
                a2 = Double.parseDouble(b);
                a3=a1+a2;

                return a3.toString();

        }
        return null;

    }

    public boolean dayu(String s) {
        return s.equals(")")||s.equals("(");
    }
    public static void main(String[] args) {
        Sacke sacke = new Sacke();//数字栈
        Sacke sacke1 = new Sacke();//符号栈
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String str = scanner.next() ;
        int num = 0;
        String b = null;
        String a = null;
        String q = null;
        String c = null;//记录算数符
        int d = 0;//指针
        while (true) {
            if (d >= str.length()) {
                break;
            }

            c = str.substring(d, sacke.Str(d, str));
            num = c.length();
            str = str.substring(num);
            d = 0;
            if (sacke.forwal(c)) {//添加字符
                if (sacke1.iEesl()||!sacke.dayu(c)) {
                    sacke1.add(c);
                }else {
                    if (sacke1.Char(sacke1.char1()) <= sacke1.Char(c) && !sacke.dayu(c)) {//为真

                        a = sacke.Dadad();
                        b = sacke.Dadad();
                        q = sacke1.Dadad();

                        sacke.add(sacke.musn(a, b, q));
                        sacke1.add(c);

                    } else if (sacke.dayu(c)) {

                    } else {
                        sacke1.add(c);
                    }
                }


            } else {//添加数字
                sacke.add(c);
            }
        }
        while (true) {
            if (sacke1.iEesl()) {
                break;
            }
            a = sacke.Dadad();
            b = sacke.Dadad();
            q = sacke1.Dadad();
            sacke.add(sacke.musn(a, b, q));


        }
//        System.out.println("a = " + a);
        sacke.list();



    }


}
