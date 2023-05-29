public class Three {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        int mas[]=new int[5];
        int mas2[]=new int[5];
        int mas3[]=new int[5];
        for (int i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*5);
            mas2[i]=(int)(Math.random()*5);
            mas3[i]=(int)(Math.random()*5);
            System.out.println(mas[i]+" "+mas2[i]+" "+mas3[i]);
            a=a+mas[i];
            b=b+mas2[i];
            c=c+mas3[i];
        }
        a=a/mas.length;
        b=b/mas2.length;
        c=c/mas3.length;
        System.out.println(a+" "+b+" "+c);
        if(a==b && a==c){
            System.out.println("Вони всі рівні");
        }
        else if(a== b && a>=c){
            System.out.println("Mas1 & Mas2 є обидва більші за  Mas3");
        }
        else if(a== c && a>=b){
            System.out.println("Mas1 & Mas3 є обидва більші за  Mas2");
        }else if(c== b && c>=a){
            System.out.println("Mas2 & Mas3 є обидва більші за  Mas1");
        }
        else if (a>=b && a>=b){
            System.out.println("Mas1 має найбільше середнє значення");
        }
        else if (b>=c && b>=c){
            System.out.println("Mas2 має найбільше середнє значення");
        }
        else if (c>=b && c>=a){
            System.out.println("Mas3 має найбільше середнє значення");
        }
    }
}
