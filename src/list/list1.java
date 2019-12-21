package list;
//约瑟夫问题

public class list1 {
    Nous nous ;
    private Nous temp;

    class Nous {
        public int date;
        public Nous nous;

        public Nous(int date) {
            this.date = date;
            this.nous = null;        }
            public Nous() {
            this.nous=null;
            this.date=0;
            }

        @Override
        public String toString() {
            return "Nous{" +
                    "date=" + date +
                    '}';
        }
    }

    public list1(int a) {
        nous = new Nous(1);
        nous.nous=nous;
        for (int i = 2; i <= a; i++) {
            Nous nous1 = new Nous(i);
            Nous temp= nous;
            while (true) {
                if (temp.nous.date == this.nous.date) {
                    break;
                }
                temp=temp.nous;

            }
            temp.nous=nous1;
            nous1.nous=nous;


        }
    }

    public void list() {
        Nous temp = nous.nous;
        while (true) {
            System.out.println(temp.date);
            if (temp.nous == this.nous) {
                break;

            }
            temp=temp.nous;
        }
    }

    public void listfhu() {
        int a=1;
        Nous temp = this.nous;
        Nous temp1=this.nous;
        while (true) { if (temp1.nous == this.nous) break;temp1= temp1.nous; }


        while (temp!=temp1) {

            if (a == 2) {
                temp=temp.nous;
                temp1.nous=temp;
                a=1;

            }
            temp=temp.nous;
            temp1=temp1.nous;
a++;
            System.out.println(temp.date);


        }

    }

    public static void main(String[] args) {
        list1 list1 = new list1(10000);
//        System.out.println(list1.nous.date);
//        list1.list();
        list1.listfhu();
    }


}