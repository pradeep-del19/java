import java.util.Scanner;
class Main{
    int id;
    Main(int id){
        this.id=id;
    }
    void show(){
        System.out.println(id);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main[] obj=new Main[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter id for object " + (i+1)+":");
            int id=sc.nextInt();
            obj[i]=new Main(id);
        }
        System.out.println("Output:");
        for (int i=0;i<3;i++){
            obj[i].show();
        }
    }
}