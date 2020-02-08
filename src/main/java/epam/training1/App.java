package epam.training1;
import sweets.*;
import tasks.*;
public class App
{
	private static final int START = 25;
	private static final int END = 40;

	// Creating objects
	private static final Jalebi Jalebi1 = new Jalebi("Jalebi1", 10, 10);
	private static final Jalebi Jalebi2 = new Jalebi("Jalebi2", 15, 15);
	private static final Jalebi Jalebi3 = new Jalebi("Jalebi3", 25, 20);
	private static final mysorepak mysorepak1 = new mysorepak("mysorepak1", 10, 50);
	private static final mysorepak mysorepak2 = new mysorepak("mysorepak2", 20, 50);
	private static final Laddo Laddo1 = new Laddo("Laddo1", 20, 15);
	private static final Laddo Laddo2 = new Laddo("Laddo2", 30, 20);

	// Creating container
	private static final  tasks GIFT = new tasks();

	public static tasks getGift() {
		return GIFT;
	}