/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// Nithya Kemp
// Rasmussen
// AP Comp Sci Period 5
// 20 September 2019

public class ASCIIArt {

	// these are the two main parts of my ascii art: the fox, and the speech.
	public static void main(String[] args) {
		fox();
		speech();
	}

	// this is the fox
	public static void fox() {
		System.out.println("\t\t\t   /\\   /\\");
		System.out.println("      ____________________/  \\-/  \\");
		System.out.println("     /                      ^ -o^  |");
		System.out.println("    / -  _   _____   _   _\\___O___/");
		System.out.println("   /_/| | | |     | | | |");
		System.out.println("      | | | |     | | | |");
		System.out.println("       ==  ==      ==  ==");
	}

	// this is the speech. It's split up into the top, middle, and bottom.
	public static void speech() {
		topBox();
		middleBox();
		bottomBox();
	}

	public static void topBox() {
		System.out.print("            _______________/^\\__\n");
	}

	public static void middleBox() {
		System.out.println("            |                   |");
		System.out.println("            |\tYou got this!   |");
	}

	public static void bottomBox() {
		System.out.print("            |___________________|");
	}

}
