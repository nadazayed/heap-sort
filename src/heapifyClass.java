
public class heapifyClass 
{
	static int input[]={40,60,10,20,50,30};  
    static int n=6;
    
	public  void heapify (int i)
    {
        
        int min=i;
        int left=2*i+1;
        int right=2*i+2;
        int temp;
        //System.out.println("min:"+min+"\t i:"+i+"\t left:"+left+"\t right:"+right+"\n");
        if(left<n && input[left]<input[min])
        {
            //System.out.println("left: "+input[left]+" < "+"min: "+input[min]);
            min=left;
        }
        
        if(right<n && input[right]<input[min])
        {
            //System.out.println("right: "+input[right]+" < "+"min: "+input[min]);
            min=right;
        }
        
        //System.out.println("new min:"+min+"\n");
        
        if(min!=i)  //left or right should be swaped
        {
            //System.out.println("swap "+input[i]+"\t"+input[min]);
            
            temp=input[i];
            input[i]=input[min];
            input[min]=temp;
            
            //for (int j=0;j<n;j++) //print update
            //System.out.print(input[j]+"\t");
            //System.out.println("\n");
            heapify(min);
        }
        
    }
}
