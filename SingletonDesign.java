package DesignPattens;

 class Singleton {
     private static Singleton singleton_instance =null;
     private Singleton(){}
     public  static  Singleton getInstance()
     {
         if(singleton_instance == null)
         {
             synchronized (Singleton.class)
             {
                 if(singleton_instance==null)
                 {
                     return singleton_instance= new Singleton();
                 }
             }
         }
         return singleton_instance;
     }
 }
 class SingletonDesign
 {
     public static void main(String[] args)
     {
         Singleton x=Singleton.getInstance();
         Singleton y=Singleton.getInstance();

         if(x==y)
         {
             System.out.println("points to same locations");
         }
         else
         {
             System.out.println("points to different references");
         }
     }
 }
