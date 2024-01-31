public static void inverted_rotated_half_pyramid(int n){
    //outer
    for(int i=1; i<=n; i++){
        //spaces
        for(int j=1; i<=n-i; j++){
            System.out.print("*");
            
        }
        System.out.println();
    }
}
public static void main(String args[]){
    inverted_rotated_half_pyramid(n);
}