import java.io.*;
import java.util.*;
import java.util.ArrayList.*;
public class Meal
{
	private List<Item> item=new ArrayList<Item>();
	public void addItem(Item items)
	{
		item.add(items);
	}
	public float getCost(){
		float cost=0.0f;
		for(Item item:item)
		{
		cost +=item.price();	
		}
		return cost;
	}
	public void showItems(){
		for(Item item:item)
		{
		System.out.print("Item"+ item.name());	
		System.out.print(",Packing"+item.packing().pack());	
		System.out.println(",Price"+item.price());	
		}
	}
}