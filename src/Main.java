public class Main {
    public static void main(String[] args) {
        int masth[]=new int[50];
        for (int i=1,j=0;j< masth.length;i+=2,j++){
            masth[j]=i;
            System.out.println(masth[j]+"");
        }
    }
}