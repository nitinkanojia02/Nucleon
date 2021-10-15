
import java.util.Scanner;

public class Aptitute {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] questions = new String[20];
		String[][] options = new String[20][4];

		questions[0] = "MS-Word is an example of______";
		options[0] = new String[] { "An operating system", "A processing device", "Application software",
				"An input device" };
		questions[1] = "Ctrl, Shift and Alt are called ______keys.";
		options[1] = new String[] { "Modifier", "Fucntion", "Alphanumeric", "Adjustment" };
		questions[2] = "A computer cannot \"boot\" if it does not have the______ ";
		options[2] = new String[] { "Compiler", "Loader", "Operating system	", "Assembler" };
		questions[3] = "________ is the process of dividing the disk into tracks and sectors";
		options[3] = new String[] { "Tracking", "Formatting", "Crashing", "Allotting" };
		questions[4] = "Junk e-mail is also called ______";
		options[4] = new String[] { " Spam", "Spoof", "Sniffer script", "Spool" };
		questions[5] = "Microsoft Office is an example of a______";
		options[5] = new String[] { "Closed source software", "Open source software", "Horizontal market software",
				"vertical market software" };
		questions[6] = "By default, your documents print in ________ mode";
		options[6] = new String[]{"Landscape","Portrait","Page Setup","Print View"};
		questions[7] = "_____are attempts by individuals to obtain confidential information from you by falsifying their identity";
		options[7] = new String[] { " Phishing trips", "Computer viruses", "Phishing scams", "Spyware scams" };
		/*
		 * questions[8]="" options[8]=new String[] questions[9]="" options[9]=new
		 * String[] questions[10]="" options[10]=new String[] questions[11]=""
		 * options[11]=new String[]questions[11]="" questions[12]="" options[12]=new
		 * String[] questions[13]="" options[13]=new String[] questions[14]=""
		 * options[14]=new String[] questions[15]="" options[15]=new String[]
		 * questions[16]="" options[16]=new String[] questions[17]="" options[17]=new
		 * String[] questions[18]="" options[18]=new String[] questions[19]=""
		 * options[19]=new String[]
		 */
	int[] answers=new int[]{3,1,3,2,1,3,2,3};
	
		for(int i =0;i<8;i++)
		{
		System.out.println("Ques-"+(i+1)+".   "+questions[i]+"\n");
		for(int j =0;j<4;j++)
		System.out.println(j+1+". "+options[i][j]);
		System.out.println("\n"+"Select your answer:-");
		int choice = sc.nextInt();
		int flag = Integer.compare(answers[i], choice);
		if(flag==0)
			System.out.println("You Answered Correctly! \n");
		else 
			System.out.println("Your Answer is Wrong!\n");
		
	}
	

}
}
