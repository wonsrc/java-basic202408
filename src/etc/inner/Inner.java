package etc.inner;


    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = new Inner();

        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println(r1);

        }
}
