package exercise2;


public class MiniDataSet extends DataSet implements Runnable{
    
    private int min;

    public MiniDataSet(int[] data) {
        super(data);
    }
    
    @Override
    public void run(){
        int minIndex = 0;
        for(int i = 0; i < data.length; i++){
            if(data[minIndex] > data[i]){
                min = data[i];
            }    
        }
        System.out.println("The minimum value is: "+getMinimumValue());
    }
    
    public int getMinimumValue(){
        return min;
    }
    
}
