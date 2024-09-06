/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		Salesman blade = new Salesman("Blade", 101);
		Salesman jon = new Salesman("Jon", 1100);
		Salesman tim = new Salesman("Tim", 100);
		Salesman litmen = new Salesman("Litmen", 300);
		Salesman abram = new Salesman("Abram", 1101);
		Salesman frank = new Salesman("Frank", 80);
		Salesman luna = new Salesman("Luna", 500);
		Salesman macus = new Salesman("Macus", 2000);
		Salesman jack = new Salesman("Jack", 600);
		Salesman[] sales = new Salesman[] {blade, jon, tim, litmen, abram, frank, luna, macus, jack};
		Salesman[] top5 = Salesman.topFive(sales);
		for(int i = 0; i < top5.length; i++)
		{
		    System.out.println((i + 1) + " " + top5[i].display());
		}
	}
}
