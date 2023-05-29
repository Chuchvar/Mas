public class Second {
    public static void main(String[] args) {
        int mas[]=new int[20];
        for (int i=0;i< mas.length;i++){
            mas[i]=(int)(Math.random()*9);
            if (i%2!=0){
                mas[i]=0;
            }
            System.out.println(mas[i]+"");
        }

    }
}
