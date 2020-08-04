
public class main 
{
	static int input[]={40,60,10,20,50,30};  
    static int n=6;

	public static void main(String[] args) 
	{
		int output[]=new int [n];
        int j=0;
        
        sortClass s= new sortClass();
        
        System.out.println("--original array--");
        
        for (int i=0;i<n;i++)
            System.out.print(input[i]+"\t");
        System.out.println("\n");
        while (n!=0)
        {
            s.sort();
            //System.out.println("back");
            output[j]=input[0]; //fill nodes
            input[0]=input[n-1]; //replace last with first
            n--; //remove last node
            j++;
        }
        
        System.out.println("--heaped array--");
        
        for (int i=0;i<output.length;i++)
            System.out.print(output[i]+"\t");
        System.out.println("\n");
	}

}
