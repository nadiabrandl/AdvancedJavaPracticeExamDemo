/**
 * 
 */
package BrandlExamDemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nadiabrandl
 *
 */
public class BaseBallDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {

	ArrayList<TeamBallPlayer> TBPlayers = new ArrayList<TeamBallPlayer>();
	ArrayList<LittleLeaguePlayer> LLPlayers = new ArrayList<LittleLeaguePlayer>();
	ArrayList<JuniorVarsityPlayer> JVPlayers = new ArrayList<JuniorVarsityPlayer>();

	String name, age, repeat = "", position = null, jerseyNumber = null;

	Scanner input = new Scanner(System.in);
	do {

	    System.out.print("Name: ");
	    name = input.nextLine();

	    try {
		System.out.print("\nAge: ");
		age = input.nextLine();
		if (validAge(age) == true) {
		    if (Integer.parseInt(age) < 8) {
			System.out.println("Player is old enough to play Tee-ball");
		    } else if (Integer.parseInt(age) < 13) {
			System.out.println("Player is old enough to play Little League");
		    } else {
			System.out.println("Player is old enough to play Junior Varsity");
		    }
		}
		try {
		    System.out.print("Desired Jersey Number: ");
		    jerseyNumber = input.nextLine();

		    if (validJersey(jerseyNumber) == true) {
			System.out.println("Player can use this valid jersey number in the leagues.");
		    }
		} catch (JerseyNumberException e) {
		    System.out.println(e.getMessage());
		}

		try {
		    System.out.println("Desired Position: ");
		    position = input.nextLine();

		    if (validPosition(position, age) == true) {
			System.out.println("Position is valid");
		    }
		} catch (PositionException e) {
		    System.out.println(e.getMessage());
		}

		if (Integer.parseInt(age) < 8) {
		    TBPlayers.add(new TeamBallPlayer(name, age, jerseyNumber, position));
		} else if (Integer.parseInt(age) < 13) {
		    LLPlayers.add(new LittleLeaguePlayer(name, age, jerseyNumber, position));

		} else {
		    JVPlayers.add(new JuniorVarsityPlayer(name, age, jerseyNumber, position));
		}

	    } catch (AgeException e) {
		System.out.println(e.getMessage());
	    }

	    System.out.print("Would you like to enter another player? (Y,N)");
	    repeat = input.nextLine();

	} while (repeat.equalsIgnoreCase("Y"));

	// loops to display players
	System.out.println("\n\nTee-Ball Players\n");
	for (TeamBallPlayer p : TBPlayers) {
	    System.out.println(p.display());
	}

	System.out.println("\n\nLittle League Players\n");
	for (LittleLeaguePlayer p : LLPlayers) {
	    System.out.println(p.display());
	}

	System.out.println("\n\nJunior Varsity Players\n");
	for (JuniorVarsityPlayer p : JVPlayers) {
	    System.out.println(p.display());
	}
    }

    public static boolean validAge(String age) throws AgeException {

	// check conditions and throw exception
	if (Integer.parseInt(age) < 5 || Integer.parseInt(age) > 15) {
	    throw new AgeException("Age must be between 5 and 15 years old");
	}

	// if exception not thrown return true
	return true;
    }

    public static boolean validJersey(String jerseyNumber) throws JerseyNumberException {

	if (Integer.parseInt(jerseyNumber) < 0 || Integer.parseInt(jerseyNumber) > 99) {
	    throw new JerseyNumberException("Jersey number is invalid.");
	}

	return true;
    }

    public static boolean validPosition(String position, String age) throws PositionException {
	if (position.length() < 1 || position.length() > 2) {
	    throw new PositionException("Invalid Position");
	}

	if (Integer.parseInt(age) < 8) {
	    if (!position.equalsIgnoreCase("1B") && !position.equalsIgnoreCase("2B") && !position.equalsIgnoreCase("3B")
		    && !position.equalsIgnoreCase("C") && !position.equalsIgnoreCase("LF")
		    && !position.equalsIgnoreCase("CF") && !position.equalsIgnoreCase("RF")
		    && !position.equalsIgnoreCase("SS")) {
		throw new PositionException("Not a valid position for T-Ball.");
	    } else {

		if (!position.equalsIgnoreCase("1B") && !position.equalsIgnoreCase("2B")
			&& !position.equalsIgnoreCase("3B") && !position.equalsIgnoreCase("C")
			&& !position.equalsIgnoreCase("LF") && !position.equalsIgnoreCase("CF")
			&& !position.equalsIgnoreCase("RF") && !position.equalsIgnoreCase("SS")
			&& !position.equalsIgnoreCase("P")) {
		    throw new PositionException("Not a valid position for this league.");
		}
	    }
	}
	return true;
    }
}
