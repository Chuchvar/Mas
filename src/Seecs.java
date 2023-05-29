public class Seecs {
    public static void main(String[] args) {
        int mas[][]=new int [15][];
        mas[0]=new int[5];
        mas[1]=new int[5];
        mas[2]=new int[5];
        mas[3]=new int[5];
        mas[4]=new int[8];
        mas[5]=new int[8];
        mas[6]=new int[8];
        mas[7]=new int[8];
        mas[8]=new int[3];
        mas[9]=new int[3];
        mas[10]=new int[3];
        mas[11]=new int[3];
        mas[12]=new int[9];
        mas[13]=new int[9];
        mas[14]=new int[9];
        for(int i=0;i< mas.length;i++){
            System.out.println((i+1)+" Стобець");
            int j=0;
            for (int a:mas[i]) {
                mas[i][j]=(int)(Math.random()*15);
                System.out.println((j+1)+".Стрічка="+mas[i][j]);
                j++;
            }
            System.out.println("");
        }
    }
}
