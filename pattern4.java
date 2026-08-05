public class pattern4 {
    public static void main(String[] args){
        int n = 4;
        for(int i=1; i <=n; i++){
            /* for(int j=1; j <=n-i+1; j++){
                System.out.print(j);
            } */
            for(int j=1; j <=n; j++){
                System.out.print(j);
            }

            System.out.println();

        }
        for(int i=1; i <=n/2; i++){
            for(int j=1; j <=n/2; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
