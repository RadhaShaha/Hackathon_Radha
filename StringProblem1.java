package Hackathon;
import java.util.Scanner;

class methodsOfString {
	   	int numberOfOccurrencesReplaceAppend(String source, String sentence)	
	   	//method to find number of occurrence of a word,remove word and print string, Append word
	   	{	
	   	    int occurrences = 0;
	        String newsen="";String temp="";
	        
	        	for(int i=0;i<sentence.length();i++)
	        		{
	        			char x=sentence.charAt(i);
	        				if(x!=' ')
	        					{
	        						temp=temp+x;
	        					}
	        				else
	        				{
	        					if(source.equals(temp))
	        						{occurrences = occurrences + 1; //word count
	        						}
	        					else
	        					{
	        						newsen=newsen+temp+" "; //remove word and print string
	                       	                       
	        					}
	        					temp="";
	        			}
	        }

	   		
	   		System.out.println("Number of occurrence of word-- "+source + (" -- is ")+ occurrences + " times.");
	   		System.out.println("String after removing-- "+source + (" --")+ newsen);
	   		
	    	String appendWord = sentence;
	    	StringBuffer s = new StringBuffer(sentence);
	    	for(int count=0;count<occurrences;count++)
	   	     {s.append(" " +source); 
	   	     }
	   	     System.out.println("String after appending at the end is --" + s);
	   	     return occurrences;
	}
	
}

	public class StringProblem1{
		public static void main(String args[]){
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a string");
			String sentence1 = in.nextLine();
			System.out.println("Enter a word");
			String source1 = in.nextLine();
			
			methodsOfString a = new methodsOfString();
			a.numberOfOccurrencesReplaceAppend(source1,sentence1);	
	    }
	}
	
