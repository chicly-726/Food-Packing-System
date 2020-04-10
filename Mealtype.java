import java.io.*;
import java.util.*;
import java.util.ArrayList.*;
class Mealtype
{
public Meal prepareBegMeal()
{
Meal meal=new Meal();
meal.addItem(new Vegburger());
meal.addItem(new Coke());
return meal;
}
public Meal prepareNonVegMeal(){
	Meal meal=new Meal();
	meal.addItem(new Chickenburger());
meal.addItem(new Pepsi());
return meal;
}
}