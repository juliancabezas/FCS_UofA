//==================================
// Foundations of Computer Science
// Student: Jonhatan Cotes
// id: a1792259
// Semester: 1
// Year: 2020
// Practical Number: 04-Part II
//===================================
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class HanoiTower extends JFrame{
	//All the attributes of HanoiTower, full explanation of choices on explanation.txt
	public int[] disks;
	public Color[] diskColors;
	//Variable to fill the rectangles (disks)
	public int height;
	public Graphics g;
	//Random numer to create random color for each disk
	public Random random = new Random();
	//Basic Constructor to create a HanoiTower class
	public HanoiTower(){
		//Set the number of disk to three
		int diskNumber = 3;
		//Create two arrays, one for the disk and another to save the color of each disk
		disks = new int[diskNumber];
		diskColors = new Color[diskNumber];
		//150 is the pixels available to fill all the disks, height is variable according to the number of disks
		height = 150 / disks.length;
		//Create random colors for each disk and create disk array
		for(int i = 0; i < disks.length; i++){
			disks[i] = i + 1;
			float red = random.nextFloat();
			float green = random.nextFloat();
			float blue = random.nextFloat();
			diskColors[i] = new Color(red, green, blue);
		}
		//Set background
		this.setBackground();
		g = getGraphics();
		//Paint the disks 
		this.paint(g);
	}
	//Parametric constructor, creates dTmp disks and stores them on the array
	public HanoiTower(int dTmp){
		//Create two arrays, one for the disk and another to save the color of each disk
		disks = new int[dTmp];
		diskColors = new Color[dTmp];
		height = 150 / disks.length;
		//Create random colors for each disk and create disk array
		for(int i = 0; i < disks.length; i++){
			disks[i] = i + 1;
			float red = random.nextFloat();
			float green = random.nextFloat();
			float blue = random.nextFloat();
			diskColors[i] = new Color(red, green, blue);
		}
		//Set background
		this.setBackground();
		g = getGraphics();
		//Paint the disks 
		this.paint(g);	
	}
	//Recursive method to solve the Hanoi Towers, it receives the number of disks to move, the pole that is in, the pole that is in, the auxiliar pole and the objective Pole
	public void solve(int disk, String originalPole, String auxPole, String objectivePole){
		//Validates that the number of disk is at least 1
		if(disk > 0){
			//It will do THREE things: 
			//FIRST: move n-1 disks from original pole to the auxiliar pole using the objective pole
			solve(disk - 1, originalPole, objectivePole, auxPole);
			//SECOND: Then it will move the n disk from the original pole to the objective pole.
			try{
				//Timer: 7 Seconds to paint each disk move:
				Thread.sleep(700);
				//Validate where the disk is originally is to erase the disk original position
				if(originalPole.equals("Pole 1")){
					//Clears the disk original pole position: (X position ,Y position, width, height)
					g.clearRect(210 - disk * height / 2, 200 + height * (disk - 1), disk * height, height);
					//Set the color to gray, to draw the pole
					g.setColor(Color.GRAY);
					//Draw that part of the pole again
					g.fillRect(200, 200 + height * (disk - 1) , 20, height);
				}
				else{
					//Same as pole one
					if(originalPole.equals("Pole 2")){
						g.clearRect(510 - disk * height / 2, 200 + height * (disk-1), disk * height, height);
						g.setColor(Color.GRAY);
						g.fillRect(500, 200 + height * (disk-1) , 20, height);
					}
					else{
						//Same as pole one
						if(originalPole.equals("Pole 3")){
							g.clearRect(810- disk * height / 2, 200 + height * (disk-1) , disk * height, height);
							g.setColor(Color.GRAY);
							g.fillRect(800, 200 + height * (disk-1) , 20, height);
						}
					}
				}
				//Set the color to the disk color
				g.setColor(diskColors[disk-1]);
				//Validate the objective pole to identify where to draw the disk
				if(objectivePole.equals("Pole 1")){
					//Draw the disk according to the pole position using: X position,Y position, width, height
					// 200 is the first pole position, 210 is used to set the disk on the center of the pole					
					g.fillRect(210 - disk * height / 2, 200 + height * (disk-1) , disk * height, height);
				}
				else{
					// 500 is the second pole position, 510 is used to set the disk on the center of the pole
					if(objectivePole.equals("Pole 2")){
						g.fillRect(510 - disk * height / 2, 200 + height * (disk-1) , disk * height, height);
					}
					else{
						// 800 is the last pole position, 810 is used to set the disk on the center of the pole
						if(objectivePole.equals("Pole 3")){
							g.fillRect(810 - disk * height / 2, 200 + height * (disk-1) , disk * height, height);
						}
					}
				}
				//Print the move in comand screen
				System.out.println("Move the disk " + disk + " from " + originalPole + " to " + objectivePole);
			}
			//Catch to use the timer
			catch (InterruptedException ie) {
   				Thread.currentThread().interrupt();
			}
			//THIRD: Finally it move n-1 disks from auxiliar pole to the objective pole using the original pole as a pivot
			solve(disk - 1, auxPole, originalPole, objectivePole);
		}
	}
	//Method to fill the background
	public void setBackground(){
		//Title of the background
		setTitle("Hanoi Towers");
		//Allows to close the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Size of the background
		setSize(1000, 500);
		//Set it on the center of the screen
		setLocationRelativeTo(null);
		//To be visible
		setVisible(true);
	}
	//Method to paint the poles and disks
	public void paint(Graphics g){
		//Draw the three poles
		g.setColor(Color.GRAY);
		g.fillRect(200,150,20,200);
		g.fillRect(500,150,20,200);
		g.fillRect(800,150,20,200);
		//Draw the disks on the first pole acoording to each disk color
		for (int i = 0; i < disks.length ; i++) {
			g.setColor(diskColors[i]);
			//Draw the disk on first pole position 
			g.fillRect( 210 - (i+1) * height / 2, 200 + height * i, (i+1) * height, height);
		}
	}
}

	
