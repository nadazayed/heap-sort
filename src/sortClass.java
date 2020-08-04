
public class sortClass 
{
	public void sort()
    {
	    int n=6;
		heapifyClass h = new heapifyClass();
		
        for (int i=(int) Math.floor((double)n/2-1);i>=0;i--) //step 2
        {
            //System.out.println("here n: "+n+"\there i=n/2-1: "+i);
            h.heapify(i);
        }
    }
}
