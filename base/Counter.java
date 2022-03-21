public class Counter {

    private int count = 0;
    private int max = 10;

    public Counter(int count, int max){
        this.count = count;
        this.max = max;
    }


    public int getCount(){
        return this.count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getMax(){
        return this.max;
    }

    public void setMax(int max){
        this.max = max;
    }

    public int increase(){

        if (count < max){
           
            return count++ ;
        }
        else{
            return reset();
        }
    }

    public int increase(int n){

        if (n < max){
           
            return n++ ;
        }
        else{
            return reset();
        }
    }

    public int decrease(){

        if (count > 0){
           
            return count-- ;
        }
        else{
            return reset();
        }
    }

    public int reset(){

        return count = 0;
    }

    public String toString(){
        return "Count: " + count + " Max: " + max;
    }
    
}
