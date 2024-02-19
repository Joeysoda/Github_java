class FloatPounds {
    public static void main(String[] args) {
        float twentyPence = 0.2f;//不添加f就将默认为double类型
        System.out.println("20 pence = " + twentyPence);
        for (int i = 0; i < 1000; i++) {
            twentyPence += 0.2;
        }
        System.out.println("total = " + twentyPence);
    }
}
