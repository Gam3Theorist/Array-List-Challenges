import java.util.Collections;
import java.util.ArrayList;


public class printArrayList
	{

		static ArrayList<String> names = new ArrayList<String>();

		public static void main(String[] args)
			{
fillArray();
//printArrayList();
sortNames();
firstAndLast();
			}

		public static void fillArray()
		{
			names.add( "Adam");
			names.add("Caden");
			names.add("JT");
			names.add("Grace");
			names.add("Noelle");
			names.add("Ava Lynn");
			names.add("Matthew");
			names.add("Ben");
			names.add("Reece");
			names.add( "Will");
			names.add("Laurel");
		}
		
		public static void printArrayList()
			{
for(int i =0; i <names.size(); i++)
	{
		System.out.println(names.get(i));
	}
			}
	
		public static void sortNames()
		{
			Collections.sort(names);
//			for(int i =0; i <names.size(); i++)
//				{
//					System.out.println(names.get(i));
//				}	
		}
		public static void firstAndLast()
			{
				System.out.println(names.get(0));
				System.out.println(names.get((names.size())-1));
			}
	}