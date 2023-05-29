public class Five {
    public static void main(String[] args) {
        int par=0;
        int mas[]=new int[15];
        for(int i=0;i< mas.length;i++){
            mas[i]=(int)(Math.random()*10);
            System.out.println(mas[i]);
        }
        for(int a:mas){
            if (a%2==0){
               par++;
            }
        }
        System.out.println("Парних = "+par);
    }
}
