package com.mall.demo.component;

public class OrderTimeOutCancelTask {

   // List list = new ArrayList<>(Arrays.asList("a","b"));
    //request.getRequestDispatcher("a.jsp").forword(request,response);
    /**
     * 饿汉式
     */
 /*

    private static OrderTimeOutCancelTask instance = new OrderTimeOutCancelTask();

    public static  OrderTimeOutCancelTask getInstance(){
        return  instance;
    }

    private OrderTimeOutCancelTask(){ }//私有化构造器
    */


    /**
     * 懒汉式
     */
    /*1.先定义一个存放单例的变量
    * 2.定义私有构造器，表示只在类内部使用，亦使单例的实例只能在单例类内部使用
    * 3.定义一个公共的公开的方法来返回该类的实例，由于是懒汉式，需要在第一次使用时生成实例
    * 所以为了线程安全，使用synchronized关键字来确保只会生成单例*/
   /*private static OrderTimeOutCancelTask jag = null;
   private OrderTimeOutCancelTask(){}
   //getInstance 返回一个实例化对象，此对象是静态的，在内存中保留着他的引用，可以直接使用，调用多次返回同一个对象
   public  static  synchronized  OrderTimeOutCancelTask getInstance(){
       if(jag == null){
           jag = new OrderTimeOutCancelTask();
       }
       return jag;
   }*/

}
