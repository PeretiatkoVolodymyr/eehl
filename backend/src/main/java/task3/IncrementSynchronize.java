package task3;

public class IncrementSynchronize {

    private int value = 0;

    //sync method
    public synchronized int getNextValue1(){
        return value++;
    }

    //sync block code
    public int getNextValue2(){
        synchronized(this){
            return value++;
        }
    }

    //sync block class
    public int getNextValue3(){
        synchronized (IncrementSynchronize.class){
            return value++;
        }
    }

}
