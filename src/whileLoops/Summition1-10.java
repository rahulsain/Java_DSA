class whileLoopDemo { 
    public static void main(String args[]) 
    { 
        int x = 1, sum = 0; 
        while (x <= 10) { 
            // summing up x 
            sum = sum + x; 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        } 
        System.out.println("Summation: " + sum); 
    } 
}
