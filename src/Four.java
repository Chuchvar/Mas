public class Four {
    public static void main(String[] args) {
        int mas[]=new int[10];
        int mas2[]=new int[10];
        int mas3[]=new int[10];
        for (int i =0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*10);
            mas2[i]=(int)(Math.random()*10);
            mas3[i]=mas[i]+mas2[i];
            System.out.println(mas[i]+" "+mas2[i]+" "+mas3[i]);
        }
    }
}
