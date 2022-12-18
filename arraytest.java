package BBbook;


import java.util.Scanner;
public class arraytest{
	public static void main(String[] args) {
		String[] books =new String[27];
		
		String titles[] =	{"Matthew","Mark", "Luke",
							"John", "Acts", "Romans",
							"Corinthians I", "Corinthians II", "Galatians",
							"Ephesians", "Philippians","Colossians",
							"Thessalonians I","Thessalonians II","Timothy I",
							"Timothy II", "Titus", "Philemon",
							"Hebrews", "James", "Peter I",
							"Peter II", "John I", "John II",
							"John III", "Jude", "Revelation"
							
		};
		
		int chapterNums[] = {28,16, 24,
							21, 28, 16,			//John Acts Romans
							16, 13, 6,			//Cor1,Cor2,Gal
							6, 4, 4,			//Eph, Phi, Col
							5, 4, 6,			//Thes1,Thes2,Tim1
							4, 3, 1,			//tim2,Titus,philem
							13, 5, 5,			//heb,James,pete1
							3,	5, 5,			//pete2,john1,john2
							1, 1, 27			//john3,jude,revelations
							
		}; 
		
		String descriptions[] = {"The Gospel according to Matthew.",
				"The Gospel according to Mark.", "The Gospel according to Luke.",
				"The Gospel according to John.","Acts of the Apostles.",
				"Letter of Paul to the Romans.","First Letter of Paul to the Corinthians.",
				"Second Letter of Paul to the Corinthians.","Letter of Paul to the Galatians.",
				"Letter of Paul to the Ephesians.","Letter of Paul to the Philippians.",
				"Letter of Paul to the Colossians.","First Letter of Paul to the Thessalonians.",
				"Second Letter of Paul to the Thessalonians.","First Letter of Paul to Timothy.",
				"Second Letter of Paul to TImothy.","Letter of Paul to Titus.",
				"Letter of Paul to Philemon.","Letter to the Hebrews.",
				"Letter of James.","First Letter of Peter.",
				"Second Letter of Peter.","First Letter of John.",
				"Second Letter of John.", "Third Letter of John.",
				"Letter of Jude.","The book of Revelation."
		
		
		
		
		};
		
	System.out.println(titles[0]);
	System.out.println(chapterNums[0]);
	System.out.println(descriptions[0]);
	
	System.out.println(titles[10]);
	System.out.println(chapterNums[10]);
	System.out.println(descriptions[10]);
	}		
				
				
}				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


