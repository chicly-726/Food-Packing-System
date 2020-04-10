import java.io.*;
import java.util.*;
public class MealtypeMain 
{
public static void main(String[] args)
{
	Mealtype mealtype=new Mealtype();
	Meal vegMeal=mealtype.prepareBegMeal();
	System.out.println("Veg Meal");
	vegMeal.showItems();
	System.out.println("Total Cost: "+vegMeal.getCost());
	Meal nonvegMeal=mealtype.prepareBegMeal();
	System.out.println("Non Veg Meal");
	nonvegMeal.showItems();
	System.out.println("Total Cost: "+nonvegMeal.getCost());
}
}