public class MakingTreeEx2 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){ // i = 0 , 1, 2, 3
            for(int j=0;j<3-i;j++){ // j - 3회, 2회, 1회
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){ // k = 1, 3, 5, 7
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
