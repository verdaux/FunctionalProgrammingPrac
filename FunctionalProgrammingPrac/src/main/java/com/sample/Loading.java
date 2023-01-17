package com.sample;

public class Loading
{


    public void print(Integer i) throws Exception
    {
        System.out.println("Wrapper");
    }

    public int print(int i) throws Exception
    {
        System.out.println("prim");
        return 0;
    }

    public static void main(String[] args) throws Exception
    {
        Loading load = new Loading();
        Integer i =1;
        load.print(i);

        int[] arr = {2,4,5,7,1,3,2,5};

    }
}
