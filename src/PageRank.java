/*import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
 
class PageRank
{
	//Graph datatype
	public static class Graph {
		String node;
		//String[] OutGoingEdge = new String[50];
		ArrayList<String> OutGoingEdge = new ArrayList<String>();
		int count = OutGoingEdge.size();
		float PR=1f;
		}
	
	//Parsing data
		public static ArrayList<Graph> aGraph = new ArrayList<Graph>();;
		static ArrayList<String> list = new ArrayList<String>();
		List<String> newList = new ArrayList<String>(new HashSet<String>(list));
		
		static void parsing() throws IOException
		{
			
		String fileName = "C:/Users/Shantanu/Desktop/prog2-sample-small.txt";
	    Path path = Paths.get(fileName);
	    String[] strs = new String[50];
	    int i=0,k=0;
	    Scanner scanner = new Scanner(path);
	    
	    while (scanner.hasNextLine())
	    {
	        strs[i]=scanner.nextLine();
	    	//System.out.println(strs[i]);
	    	i++;
	    }
	    //System.out.println(i);
	    
	    scanner.close();
	    
	    
	    //for graph functions
	    
	    for(int f=0; f<i; f++)
	    {
	    	
	    	Graph gr = new Graph();
	    	int index = strs[f].indexOf(" ");
	    	gr.node = strs[f].substring(0, index);
	    	
	    	String remain = strs[f].substring(index+1,strs[f].length());
	    	//System.out.println(index);
	    	//System.out.println(gr.node);
	    	//System.out.println(remain);
	    
		for(String nxtnode : remain.split(" "))
	    		{
	    			gr.OutGoingEdge.add(nxtnode);
	    		}	       
			
		for(int t =0; t<gr.OutGoingEdge.size();t++)
	    {
	    	//System.out.println(gr.OutGoingEdge.get(t));
	    }
		gr.count = gr.OutGoingEdge.size();
		//System.out.println(gr.count);
		//float PR = 1f;
		aGraph.add(gr);
		//System.out.println("Getting out");
		}
		}

		public static ArrayList<Graph> getList() {
			   //System.out.println("Shantanu");
			   //System.out.println(aGraph.size());
		       return aGraph;
		   }
		
		//static ArrayList<Graph> cGraph = new ArrayList<Graph>();
		public static void CalculatePRank(ArrayList<Graph> aGraph)
		{
			//cGraph = bGraph;
			//System.out.println(cGraph.size());
			//for(int t=0; t<cGraph.size();t++ )
			for(int t=0; t<aGraph.size();t++ )
			{
				Graph grh = aGraph.get(t);
				//System.out.println(grh.node);
				float PR = grh.PR;
				//System.out.println(PR);
				//Dcalculate dcal = new Dcalculate();
				//float f = Addition(grh);
				//System.out.println(f);
				PR = (float) (0.15 + 0.85*Addition(grh));
				aGraph.get(t).PR=PR;
				System.out.println( "PR "  +PR);
				//System.out.println(f);
			}

		}
		private static float Addition(Graph grh) {
			
					String check = grh.node;
					float add = 0;
					System.out.println(check);
					//System.out.println("shantanu");
					//System.out.println(cGraph.size());
					//for (int i=0; i< cGraph.size();i++)
					for (int i=0; i<aGraph.size();i++)
					{
						add=0f;
						//System.out.println(cGraph.size());
						for(int j=0; j<aGraph.size();j++)
						{
							//System.out.println(cGraph.get(j).OutGoingEdge.size());
							//System.out.println(cGraph.get(j).OutGoingEdge.contains(check));
							if(aGraph.get(j).OutGoingEdge.contains(check))
							{
								//System.out.println(cGraph.get(j).OutGoingEdge.contains(check));
								add = add+(aGraph.get(j).PR/aGraph.get(j).count);
								//System.out.println(add);
								//System.out.println(add);
								//add=add+1;
							}
							else
							{
								//System.out.println("hahaha :)");
							}
						}
						//System.out.println("final "+add);
						break;
					}
					return add;
				}

	
	public static void main(String args[]) throws IOException
	{
		//get data from text file
		   //Parser ps= new Parser();
		   //ArrayList<Graph> bGraph ;
		   
		   //bGraph = getList();
		   //System.out.println(bGraph.size());
		   
		   //System.out.println(bGraph.size());
		   parsing();
		   //System.out.println(aGraph.size());
		   CalculatePRank(aGraph);
	 
	}
}*/



import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
 
class PageRank
{
	//Graph datatype
	public static class Graph {
		String node;
		//String[] OutGoingEdge = new String[50];
		ArrayList<String> OutGoingEdge = new ArrayList<String>();
		int count = OutGoingEdge.size();
		float PR=1f;
		}
	
	//Parsing data
		public static ArrayList<Graph> aGraph = new ArrayList<Graph>();;
		static ArrayList<String> list = new ArrayList<String>();
		List<String> newList = new ArrayList<String>(new HashSet<String>(list));
		
		static void parsing() throws IOException
		{
			
		String fileName = "C:/Users/Shantanu/Desktop/prog2-sample-small.txt";
	    Path path = Paths.get(fileName);
	    String[] strs = new String[50];
	    int i=0,k=0;
	    Scanner scanner = new Scanner(path);
	    
	    while (scanner.hasNextLine())
	    {
	        strs[i]=scanner.nextLine();
	    	//System.out.println(strs[i]);
	    	i++;
	    }
	    //System.out.println(i);
	    
	    scanner.close();
	    
	    
	    //for graph functions
	    
	    for(int f=0; f<i; f++)
	    {
	    	
	    	Graph gr = new Graph();
	    	int index = strs[f].indexOf(" ");
	    	gr.node = strs[f].substring(0, index);
	    	
	    	String remain = strs[f].substring(index+1,strs[f].length());
	    	//System.out.println(index);
	    	//System.out.println(gr.node);
	    	//System.out.println(remain);
	    
		for(String nxtnode : remain.split(" "))
	    		{
	    			gr.OutGoingEdge.add(nxtnode);
	    		}	       
			
		for(int t =0; t<gr.OutGoingEdge.size();t++)
	    {
	    	//System.out.println(gr.OutGoingEdge.get(t));
	    }
		gr.count = gr.OutGoingEdge.size();
		//System.out.println(gr.count);
		//float PR = 1f;
		aGraph.add(gr);
		//System.out.println("Getting out");
		}
		}

		/*public static ArrayList<Graph> getList() {
			   //System.out.println("Shantanu");
			   //System.out.println(aGraph.size());
		       return aGraph;
		   }*/
		
		//static ArrayList<Graph> cGraph = new ArrayList<Graph>();
		/*public static void CalculatePRank(ArrayList<Graph> aGraph)
		{
			//cGraph = bGraph;
			//System.out.println(cGraph.size());
			//for(int t=0; t<cGraph.size();t++ )
			for(int t=0; t<aGraph.size();t++ )
			{
				Graph grh = aGraph.get(t);
				//System.out.println(grh.node);
				float PR = grh.PR;
				//System.out.println(PR);
				//Dcalculate dcal = new Dcalculate();
				//float f = Addition(grh);
				//System.out.println(f);
				PR = (float) (0.15 + 0.85*Addition(grh));
				aGraph.get(t).PR=PR;
				System.out.println( "PR "  +PR);
				//System.out.println(f);
			}

		}
*/		
		/*private static float Addition(Graph grh) {
			
					String check = grh.node;
					float add = 0;
					System.out.println(check);
					//System.out.println("shantanu");
					//System.out.println(cGraph.size());
					//for (int i=0; i< cGraph.size();i++)
					for (int i=0; i<aGraph.size();i++)
					{
						add=0f;
						//System.out.println(cGraph.size());
						for(int j=0; j<aGraph.size();j++)
						{
							//System.out.println(cGraph.get(j).OutGoingEdge.size());
							//System.out.println(cGraph.get(j).OutGoingEdge.contains(check));
							if(aGraph.get(j).OutGoingEdge.contains(check))
							{
								//System.out.println(cGraph.get(j).OutGoingEdge.contains(check));
								add = add+(aGraph.get(j).PR/aGraph.get(j).count);
								//System.out.println(add);
								//System.out.println(add);
								//add=add+1;
							}
							else
							{
								//System.out.println("hahaha :)");
							}
						}
						//System.out.println("final "+add);
						break;
					}
					return add;
				}
*/
	
	public static void main(String args[]) throws IOException
	{
		//get data from text file
		   //Parser ps= new Parser();
		   //ArrayList<Graph> bGraph ;
		   
		   //bGraph = getList();
		   //System.out.println(bGraph.size());
		   
		   //System.out.println(bGraph.size());
		   parsing();
		   //System.out.println(aGraph.size());
		   //CalculatePRank(aGraph);
	 
	}
}