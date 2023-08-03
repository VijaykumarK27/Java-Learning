 class hello {
    static int c = 500;
    int a = 100;
    int b = 200;
    public static void main(String[]args){
        hello t1 = new hello();
        hello t2 = new hello();
        System.out.println(t1.c);
        System.out.println(t2.a+t1.c);
        System.out.println(c);
    }
}
