class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double v = 0.0;
        switch(choice){
            case 1:
                v = Math.PI*arr.get(0)*arr.get(0);
                break;
            case 2:
                v =  arr.get(0)*arr.get(1);
                break;
        }
        return v;
    }
}
