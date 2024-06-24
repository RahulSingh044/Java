class LogicalOperator {
    public static void main(String[] args) {
        int i = 8; 
        int j = 10;

        boolean result = i<j || i>j;
        System.out.println(result); // true

        boolean res = i<j && i>j;
        System.out.println(res); // false

        boolean res1 =!(i<j);
        System.out.println(res1); // false
    }
}