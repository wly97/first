
import java.util.*;
public class Sizeyunsuan {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("������Ҫ������ٵ�������");
        int h=input.nextInt();
        String [] arr1=new String[h];
        System.out.println("��������Ҫ�����������ֵ");
        int g=input.nextInt();
        System.out.println("**************�˵�ѡ�����****************");
        System.out.println("��ѡ��Ҫʹ�õĹ��ܣ�");
        System.out.println("1.   �����Ӽ�������!");
        System.out.println("2.   ������������!");
        System.out.println("3.   �����ļӼ�����");
        System.out.println("4.   ��������������");
        System.out.println(" *********************************************");
        Random random = new Random();
        char arr[] = {'+','-','*','/'};
        int a=input.nextInt();
        switch(a){ 
        case 1:
        {
             System.out.println("��ѡ������Ƿ��и���;0:�޸�����1���и���");
             int f=input.nextInt();
             int i;
             switch(f)
             {
             case 0:
             {
                 for(i=0;i<h;i++)
                 {
                     String str=random.nextInt(g)+" "+arr[random.nextInt(2)]+" "+random.nextInt(g)+"=";
                      
                     
                     System.out.println(str);
                 }
                 break;
             }
             case 1:
             {
                 for(i=0;i<h;i++)
                 {
                    System.out.println(-random.nextInt()%g+" "+arr[random.nextInt(2)]+" "+(-random.nextInt())%g+"=");
                 }
                 break;
             }
             default:
                 System.out.println("�����������������0��1");
             }
             break;
        }
        case 2:
        {
            System.out.println("**************��������˵�ѡ�����****************");
            System.out.println("��ѡ��Ҫʹ�õĹ��ܣ�");
            System.out.println("1.   ��������������������!");
            System.out.println("2.   �ɸ�������������������!");
            System.out.println("3.   ����������������������");
            System.out.println("4.   �ɸ���������������������");
            System.out.println(" *********************************************");
            int f=input.nextInt();
             switch(f)
             {
             case 1:
             {
                 for(int i=0;i<h;i++)
                 {
                     int u=random.nextInt(g);
                     int v=random.nextInt(g)+1;
                     char w=arr[random.nextInt(4)];
                     if(u%v==0 && w=='/'){
                         System.out.println(u+" "+w+" "+v+"=");
                     }
                    else
                        System.out.println(u+" "+arr[random.nextInt(3)]+" "+v+"=");
                 }
                 break;
             }
             case 2:
             {
                 for(int i=0;i<h;i++)
                 {
                     int u=-random.nextInt()%g;
                     int v=-random.nextInt()%g;
                     char w=arr[random.nextInt(4)];
                     if(v!=0 && u%v==0 && w=='/' )
                         System.out.println(u+" "+w+" "+v+"=");
                    else
                        System.out.println(u+" "+arr[random.nextInt(3)]+" "+v+"=");
                 }
                 break;
             }
             case 3:
             {
                 for(int i=0;i<h;i++)
                 {
                     int u=random.nextInt(g);
                     int v=random.nextInt(g)+1;
                     char w=arr[random.nextInt(4)];
                     System.out.println(u+" "+w+" "+v+"=");
                 }
                 break;
             }
             case 4:
             {
                 for(int i=0;i<h;i++)
                 {
                 int u=-random.nextInt()%g;
                 int v=-random.nextInt()%g;
                 char w=arr[random.nextInt(4)];
                 System.out.println(u+" "+w+" "+v+"=");
                 }
                 break;
             }
             default:
                 System.out.print("�����������������1--4������");
             }
             
        }
        case 3:
        {
            System.out.println("��ѡ������Ƿ��и���;0:�޸�����1���и���");
             int f=input.nextInt();
             switch(f)
             {
             case 0:
             {
                 for(int i=0;i<h;i++)
                 {
                    System.out.println(random.nextInt(g)+"/"+random.nextInt(g)+1+" "+arr[random.nextInt(2)]+" "+random.nextInt(g)+"/"+random.nextInt(g)+1+"=");
                 }
                 break;
             }
             case 1:
             {
                 for(int i=0;i<h;i++)
                 {
                    System.out.println(-random.nextInt()%g+"/"+random.nextInt(g)+1+" "+arr[random.nextInt(2)]+" "+-random.nextInt()%g+"/"+random.nextInt(g)+1+"=");
                 }
                 break;
             }
             default:
                 System.out.println("�����������������0��1");
             }
            break;
        }
        case 4:
        {
            System.out.println("**************��������˵�ѡ�����****************");
            System.out.println("��ѡ��Ҫʹ�õĹ��ܣ�");
            System.out.println("1.   ��������������!");
            System.out.println("2.   �ɸ�������������!");
            System.out.println(" *********************************************");
            int f=input.nextInt();
             switch(f)
             {
             case 1:
             {
                 for(int i=0;i<h;i++)
                 {
                     int u=random.nextInt(g);
                     int v=random.nextInt(g)+1;
                     int x=random.nextInt(g);
                     int y=random.nextInt(g)+1;
                     char w=arr[random.nextInt(4)];
                    System.out.println(u+"/"+v+" "+w+" "+x+"/"+y+"=");
                 }
                 break;
             }
             case 2:
             {
                 for(int i=0;i<h;i++)
                 {
                     int u=-random.nextInt()%g;
                     int v=-random.nextInt()%g;
                     int x=-random.nextInt()%g;
                     int y=-random.nextInt()%g;
                     char w=arr[random.nextInt(4)];
                     if(v!=0 && w=='/' )
                         System.out.println(u+"/"+v+" "+w+" "+x+"/"+y+"=");
                    else
                        System.out.println(u+"/"+v+" "+arr[random.nextInt(3)]+" "+x+"/"+y+"=");
                 }
                 break;
             }
             default:
                 System.out.print("�����������������1��2");
             }
             break;
        }
         default:
             System.out.println("�����������������1--4������");
        }      
    }
}