import java.io.*;
import java.util.*;
public abstract class ColdDrink implements Item
{
public Packing packing(){
	return new Bottle();
}
public abstract float price();
}