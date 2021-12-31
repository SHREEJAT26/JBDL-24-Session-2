package com.company;

import com.company.MT.Count;
import com.company.MT.EvenCounter;
import com.company.MT.OddCounter;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        //Set<Integer> hashset = new HashSet();
        //Set<Integer> treeset = new TreeSet();
        //Set<Integer> linkedhashset = new LinkedHashSet();
        //System.out.println("HashSet : ");
        //func1(new HashSet<>());
        //System.out.println("TreeSet : ");
        /*func1(new TreeSet<>(new Comparator<Rating>() {

            @Override
            public int compare(final Rating o1,final Rating o2) {
                return o1.getCriticRating()-o2.getCriticRating();
            }
        }));*/
        //System.out.println("LinkedHashSet : ");
        //func1(new LinkedHashSet<>());
        Queue<Rating> queue = new PriorityQueue<Rating>(new Comparator<Rating>() {
            @Override
            public int compare(final Rating o1,final Rating o2) {
                return o1.getCriticRating()-o2.getCriticRating();
            }
        });
        //func3(queue);

        /*Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            System.out.print(sc.next());
        }
        //System.out.println(sc.nextLine());

         */
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("test.txt");
        FileOutputStream fileoutputStream = null;
        try {
            fileoutputStream = new FileOutputStream(file,true);
            fileoutputStream.write(br.readLine().getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }finally {
            try {
                fileoutputStream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        File file = new File("test.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
/*

        Thread t1 = new Thread(new Counter(10));
        t1.start();
        Thread t2 = new Thread(new Counter(5));
        t2.start();
*/
/*

        //Thread pool
        ExecutorService threadpool = Executors.newFixedThreadPool(1000);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for(int i = 0;i<1000;i++)
            tasks.add(new CounterCallable());

        try {
            List<Future<Integer>> futures = threadpool.invokeAll(tasks,100,TimeUnit.MILLISECONDS);
            for(Future<Integer> future : futures)
            {
                if(!future.isCancelled())
                {
                    System.out.println(future.get());
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            threadpool.shutdown();
        }
*/
        // There are two threads 1 prints odd value, another prints event value.
        //1,3,5,7...
        //2,4,6,...
        //Our task is to print values like 1,2,3,4,5..N
        /*Count count = new Count(50000,0);
        Thread evenT = new Thread(new EvenCounter(count));
        Thread oddT = new Thread(new OddCounter(count));
        evenT.start();
        oddT.start();*/


    }
        static void func1(Set<Integer> set)
        {
            set.add(1);
            set.add(5);
            set.add(3);
            set.add(4);
            set.add(2);
            for(Integer x : set)
            {
                System.out.println(x);
            }
            if(set.contains(5))
            {
                System.out.println("5 is present");
            }
        }

    static void func2(Set<Rating> set)
    {
        set.add(new Rating(0,1));
        set.add(new Rating(2,3));
        set.add(new Rating(4,5));
        set.add(new Rating(6,7));
        set.add(new Rating(8,9));
        for(Rating x : set)
        {
            System.out.println(x.getUserRating()+" "+x.getCriticRating());
        }

    }

    static void func3(Queue<Rating> queue)
    {
        queue.add(new Rating(0,1));
        queue.add(new Rating(2,3));
        queue.add(new Rating(4,5));
        queue.add(new Rating(6,7));
        queue.add(new Rating(8,9));
        System.out.println("Element with highest priority is : "+queue.peek().getUserRating()+" "+queue.peek().getCriticRating());
        for(Rating x : queue)
        {
            System.out.println(x.getUserRating()+" "+x.getCriticRating());
        }

    }
}
