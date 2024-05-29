public class p_3000 {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int curr_max_area = 0;
        double max_diagonal=0.0;
        for (int i = 0; i < dimensions.length; i++) {
            int a[] = dimensions[i];
            double d = Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2));
            if(d>max_diagonal){
                curr_max_area=a[0]*a[1];
                max_diagonal=d;
            } else if (d == max_diagonal) {
                if(curr_max_area<(a[0]*a[1])){
                    curr_max_area = a[0] * a[1];
                }
            }
        }
        return curr_max_area;
    }
    
    public static void main(String[] args) {
        int dime[][] = { {3,4},{4,3},{ 39, 52},{25,60} };
        System.out.println(areaOfMaxDiagonal(dime));
}

}
