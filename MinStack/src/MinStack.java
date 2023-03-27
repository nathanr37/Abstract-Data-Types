import java.util.ArrayList;

public class MinStack<T>{
	Stack main;
	Stack cache; 
	
	int min;
	
	
    //add a constructor
	public MinStack() {
		main = new Stack();
		cache = new Stack();
		
		min = 15;
	}
	
    public void push(int num){
    	main.push(num);
    	
    	if(num < min) {
    		cache.push(num);
    		min = num;
    	}else {
    		cache.push(min);
    	}
    	
    }

    public int pop(){
    	cache.pop();
    	return main.pop();
    	
    } 

    public int size(){
    	return main.size();
    }

    /* returns the minimum element in the list.
       Does NOT modify the list */
    public int min(){
        
    	return cache.peek();
    	
    }


}
