import java.io.*;    // for File
import java.util.*;  // for Scanner


//here is our main program
public class ByeFelishaMainProgram{
    public static void main(String[] args) throws FileNotFoundException {
        File areaCode = new File("areaCode2.txt"); //list of area codes and the U.S. state associated with the code
        Scanner input = new Scanner (areaCode);
        List<String> AREA_CODE = new ArrayList<>(); //will push all the area codes from text file to this arraylist
        List<String> SCAM_NUMBER = new ArrayList<>(); //this list will hold all the random scam phone numbers

        
        ByeFelisha byeFelisha = new ByeFelisha();
        byeFelisha.addScamNumber(input, AREA_CODE, SCAM_NUMBER);
    }
        }



//here is our class
public class ByeFelisha {
	/// constructor////////
	    public ByeFelisha() //constructor for Shasak to set up username and stuffs
    {
    }
    	//SHashank /// SHASHANK ////
	//////////////////////////////
	public static void Prompt() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t\tWELCOME TO BYE-FELISHA! SPAM CALL BLOCKER");
		System.out.print("\nPlease enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter your phone number: ");
		 long num = sc.nextLong();
		
		
	}
	static void Felisha() {
		System.out.println("  		     ██╗██████╗ ██╗   ██╗███████╗    ███████╗███████╗██╗     ██╗███████╗██╗  ██╗ █████╗ ██╗██╗██╗                   \r\n" + 
				"                    ██╔╝██╔══██╗╚██╗ ██╔╝██╔════╝    ██╔════╝██╔════╝██║     ██║██╔════╝██║  ██║██╔══██╗██║██║╚██╗                  \r\n" + 
				"                    ██║ ██████╔╝ ╚████╔╝ █████╗      █████╗  █████╗  ██║     ██║███████╗███████║███████║██║██║ ██║                  \r\n" + 
				"                    ██║ ██╔══██╗  ╚██╔╝  ██╔══╝      ██╔══╝  ██╔══╝  ██║     ██║╚════██║██╔══██║██╔══██║╚═╝╚═╝ ██║                  \r\n" + 
				"                    ╚██╗██████╔╝   ██║   ███████╗    ██║     ███████╗███████╗██║███████║██║  ██║██║  ██║██╗██╗██╔╝                  \r\n" + 
				"                     ╚═╝╚═════╝    ╚═╝   ╚══════╝    ╚═╝     ╚══════╝╚══════╝╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝╚═╝                   \r\n" + 
				"                                                                                                                                    \r\n" + 
				"███████╗██████╗  █████╗ ███╗   ███╗     ██████╗ █████╗ ██╗     ██╗         ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗███████╗██████╗ \r\n" + 
				"██╔════╝██╔══██╗██╔══██╗████╗ ████║    ██╔════╝██╔══██╗██║     ██║         ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝██╔════╝██╔══██╗\r\n" + 
				"███████╗██████╔╝███████║██╔████╔██║    ██║     ███████║██║     ██║         ██████╔╝██║     ██║   ██║██║     █████╔╝ █████╗  ██████╔╝\r\n" + 
				"╚════██║██╔═══╝ ██╔══██║██║╚██╔╝██║    ██║     ██╔══██║██║     ██║         ██╔══██╗██║     ██║   ██║██║     ██╔═██╗ ██╔══╝  ██╔══██╗\r\n" + 
				"███████║██║     ██║  ██║██║ ╚═╝ ██║    ╚██████╗██║  ██║███████╗███████╗    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗███████╗██║  ██║\r\n" + 
				"╚══════╝╚═╝     ╚═╝  ╚═╝╚═╝     ╚═╝     ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝\r\n" + 
				"                                                                                                                                    \r\n" + 
				"                                                                                                                                    \r\n" + 
				"                                                                                          ");
	}
	static void Thanks() {
		System.out.println("  _____ _   _    _    _   _ _  __ __   _____  _   _  \r\n" + 
				" |_   _| | | |  / \\  | \\ | | |/ / \\ \\ / / _ \\| | | | \r\n" + 
				"   | | | |_| | / _ \\ |  \\| | ' /   \\ V / | | | | | | \r\n" + 
				"   | | |  _  |/ ___ \\| |\\  | . \\    | || |_| | |_| | \r\n" + 
				"   |_| |_| |_/_/   \\_\\_| \\_|_|\\_\\   |_| \\___/ \\___(_)\r\n" + 
				"                                                     ");
	}
	
	static void Policy() {
		Scanner in = new Scanner(System.in);

		System.out.println("\n\n\t\t\tTO VIEW OUR USER AGREEMENT POLICY PLEASE PRESS 'V'");
		String choice = in.nextLine();
		
		if(choice.equals("v") || choice.equals("V")){
			Agreement();
		}
		
		System.out.println("\n\n\t\t\tPLEASE READ OUR AGREEMENT POLICY CAREFULLY.\nIF YOU ACCEPT OUR POLICY , PRESS 'Y'");
		String choice_0 = in.nextLine();
		
		if(choice_0.equals("Y") || choice_0.equals("y")) {
			Thanks();
		}
		
		
	}
	
	
	static void Agreement() {
		System.out.println("State of Texas\r\n" + 
				"\r\n" + 
				"Rev. 133EF48\r\n" + 
				"\r\n" + 
				"END USER LICENSE AGREEMENT\r\n" + 
				"\r\n" + 
				"This End-User License Agreement (this \"EULA\") is a legal agreement between you (\"Licensee\") and\r\n" + 
				"JANSL (\"Licensor\"), the author of Bye Felicia! Spam Call Blocker, including all HTML files, XML files,\r\n" + 
				"Java files, graphics files, animation files, data files, technology, development tools, scripts and programs,\r\n" + 
				"both in object code and source code (the \"Software\"), the deliverables provided pursuant to this EULA,\r\n" + 
				"which may include associated media, printed materials, and \"online\" or electronic documentation,\r\n" + 
				"\r\n" + 
				"By installing, copying, or otherwise using the Software, Licensee agrees to be bound by the terms and\r\n" + 
				"conditions set forth in this EULA. If Licensee does not agree to the terms and conditions set forth in this\r\n" + 
				"EULA, then Licensee may not download, install, or use the Software.\r\n" + 
				"\r\n" + 
				"1. Grant of License\r\n" + 
				"\r\n" + 
				"A) Scope of License. Subject to the terms of this EULA. Licensor hereby grants to Licensee a\r\n" + 
				"royalty-free, non-exclusive license to possess and to use a copy of the Software.\r\n" + 
				"\r\n" + 
				"B) Insallation and Use. Licensee may install and use an unlimited number of copies of the Software\r\n" + 
				"solely see's business and personal use.\r\n" + 
				"2. Description\r\n" + 
				"Rights and Limitations\r\n" + 
				"A) Limitations. Licensee and third parties may not reverse engineer, decompile, or disassemble the\r\n" + 
				"Software, except and only to the extent that such activity is expressly permitted by applicable law\r\n" + 
				"notwithstanding the limitation.\r\n" + 
				"B) Update and Maintenance. Licensor shall provide updates and maintenance on the Software every\r\n" + 
				"6 months.\r\n" + 
				"\r\n" + 
				"Close Preview\r\n" + 
				"\r\n" + 
				"C) Separation of Components. The Software is licensed as a single product. Its components may\r\n" + 
				"not be separated for use on more than one computer.\r\n" + 
				"\r\n" + 
				"3. Title to Software. Licensor represents and warrants that it has the legal right to enter into and perform\r\n" + 
				"its obligations under this EULA, and that use by the Licensee of the Software, in accordance with the\r\n" + 
				"terms of this EULA, will not infringe upon the intellectual property rights of any third parties.\r\n" + 
				"\r\n" + 
				"4. Intellectual Property. All now known or hereafter known tangible and intangible rights, title, interest\r\n" + 
				"copyrights and moral rights in and to the Software, including but not limited to all images, photographs,\r\n" + 
				"animations, video, audio, music, text, data, computer code, algorithms, and information, are owned by\r\n" + 
				"Licensor. The Software is protected by all applicable copyright laws and international treaties.\r\n" + 
				"\r\n" + 
				"5. Support. Licensor will provide phone support, available during normal business hours for a time\r\n" + 
				"period of 1 year.\r\n" + 
				"\r\n" + 
				"6. Duration. This EULA is perpetual or until:\r\n" + 
				"\r\n" + 
				"A) Automatically terminated or suspended if Licensee fails to comply with any of the terms and\r\n" + 
				"conditions set forth in this EULA: or\r\n" + 
				"\r\n" + 
				"B) Terminated or suspended by Licensor, with or without cause.\r\n" + 
				"\r\n" + 
				"In the event this EULA is terminated, you must cease use of the Software and destroy all copies of the\r\n" + 
				"Software\r\n" + 
				"\r\n" + 
				"7. Jurisdiction. This EULA shall be deemed to have been made in, and shall be construed pursuant to\r\n" + 
				"the laws of the State of Texas, without regard to conflicts of laws provisions thereof. Any legal action or\r\n" + 
				"proceeding relating to this EULA shall be brought exclusively in courts located in Lubbock, TX, and each\r\n" + 
				"party consents to the jurisdiction thereof. The prevailing party in any action to enforce this EULA shall be\r\n" + 
				"entitled to recover costs and expenses including, without limitation, attorneys' fees. This EULA Is made\r\n" + 
				"within the exclusive jurisdiction of the United States, and its jurisdiction shall supersede any other\r\n" + 
				"jurisdiction of either party's election.\r\n" + 
				"\r\n" + 
				"8. Non-Transferable. This EULA is not assignable or transferable by Licensee without the prior written\r\n" + 
				"consent of Licensor, and any attempt to do so shall be cold.\r\n" + 
				"\r\n" + 
				"9. Sevel No failure to exercise, and no delay in exercising, on the part of either party, any\r\n" + 
				"privilege nower or any rights hereunder will operate as a waiver thereof, nor will any single or partial\r\n" + 
				"exercise oasv right or power hereunder preclude further exercise of any other right hereunder. If any\r\n" + 
				"provision f nis EULA shall be adjudged by any court of competent jurisdiction to be unenforceable or\r\n" + 
				"invalid, that provision shall be limited or eliminated to the minimum extent necessary so that this EULA\r\n" + 
				"shall otherwise remain in full force and effect and enforceable.\r\n" + 
				"\r\n" + 
				"10. WARRANTY DISCLAIMER. LICENSOR, AND AUTHOR OF THE SOFTWARE, HEREBY\r\n" + 
				"EXPRESSLY DISCLAIM ANY WARRANTY FOR THE SOFTWARE. THE SOFTWARE AND ANY\r\n" + 
				"RELATED DOCUMENTATION IS PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER\r\n" + 
				"EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION. THE IMPLIED WARRANTIES OF\r\n" + 
				"MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT.\r\n" + 
				"LICENSEE ACCEPTS ANY AND ALL RISK ARISING OUT OF USE OR PERFORMANCE OF THE\r\n" + 
				"SOFTWARE\r\n" + 
				"\r\n" + 
				"11. LIMITATION OF LIABILITY. LICENSOR SHALL NOT BE LIABLE TO LICENSEE, OR ANY OTHER\r\n" + 
				"PERSON OR ENTITY CLAIMING THROUGH LICENSEE ANY LOSS OF PROFITS, INCOME,\r\n" + 
				"SAVINGS, OR ANY OTHER CONSEQUENTIAL, INCIDENTAL, SPECIAL, PUNITIVE, DIRECT OR\r\n" + 
				"INDIRECT DAMAGE, WHETHER ARISING IN CONTRACT, TORT, WARRANTY, OR OTHERWISE.\r\n" + 
				"THESE LIMITATIONS SHALL APPLY REGARDLESS OF THE ESSENTIAL PURPOSE OF ANY\r\n" + 
				"LIMITED REMEDY. UNDER NO CIRCUMSTANCES SHALL LICENSOR'S AGGREGATE LIABILITY TO\r\n" + 
				"2/3\r\n" + 
				"End User License Agreement (Rev. 133EF48)\r\n" + 
				"\r\n" + 
				"LICENSEE, OR ANY OTHER PERSON OR ENTITY CLAIMING THROUGH LICENSEE, EXCEED THE\r\n" + 
				"FINANCIAL AMOUNT ACTUALLY PAID BY LICENSEE TO LICENSOR FOR THE SOFTWARE.\r\n" + 
				"\r\n" + 
				"12. Entire Agreement. This EULA constitutes the entire agreement between Licensor and Licensee and\r\n" + 
				"supersedes all prior understandings of Licensor and Licensee, including any prior representation,\r\n" + 
				"statement, condition, or warranty with respect to the subject matter of this EULA.\r\n" + 
				"");
	}// END SHASHANK /// // //
	////////////////////////
    

    // // LIANE CODE /////////
	////////////////////////////
   // Author: vw-liane

// METHOD 
// Description: Within ByeFelisha program system, when user chooses option 4
//  (see <sketch-of-program.txt>) "Display Blocked Calls", program reads file
//  created by usecase1. The file name to read is:  <user_log_blocked_calls.txt>

import java.nio.file.*;
import java.io.*;
import java.util.stream.Stream;
import java.util.*;  

class usecase5 
{
    // number of calls blocked from calling user
    static int numBlock = 0; 
    public static void main(String[] args) throws IOException
    {
        // find file with list of user blocked calls
        Path path1 = Paths.get("user_log_blocked_calls.txt");

        // try opening file
        try (Stream<String> content = Files.lines(path1))
        {
            // do stuff with each line
            content.forEach((String line) -> 
            {
                numBlock++;
                System.out.println(line);
            } // END CONTENT.FOREACH
            );
            System.out.println("These phone numbers have been blocked "
                    + "from calling you.");
            System.out.println("\nYou have a total of " + numBlock
                    " blocked calls.");
        }// END TRY STREAM   
    } // END MAIN-USECASE-five



} // // END LIANE CODE /// /////
	////////////////////////////
    
    //THIS NHI NANCY'S CODE
    //adding scam phone numbers from blacklist to database
    public void addScamNumber(Scanner input, List<String> AREA_CODE, List<String> SCAM_NUMBER) {
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                String area = input.nextInt();
                AREA_CODE.add(String.valueOf(area));
            } // adding all the area codes from text file to the arrayList AREA_CODE
            else input.next();
        }
         //create random number by (1) taking a random area code from AREA_CODE and (2) randomly generate 7 digit number
        Random rand = new Random();
        for (int i = 0; i < 500; i++) {//generate 500 random scam numbers
            int randomArea = rand.nextInt(AREA_CODE.size()); //random from 0-the number of area codes available
            String numberGenerated = "";
            numberGenerated = numberGenerated + AREA_CODE.get(randomArea); //choose a random area code
            for (int i = 0; i < 7; i++) {  //generate 7 digit number following after area code
                int randomNumber = rand.nextInt(10);  //random from 0-9
                numberGenerated = numberGenerated + String.valueOf(randomNumber);
            }
            SCAM_NUMBER.add(numberGenerated); //add the full 9-digit number to this list, this is considered the database blacklist we are going to use
        }
    }
    
    //THIS IS THE END OF NANCY'S CODE
	
	
//THIS IS JENCIE'S CODE (BEGINNING) ------------------------------------------------------------------------------------------------
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callblockermine1;

/**
 *
 * @author jencd
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.*;    // for File
import java.util.*;  // for Scanner

public class CallBlockerMine1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        String string;
        int lineNumber = 0;
        int phoneNumber;
        
        // TODO code application logic here
        File file = new File("C:\\Users\\jencd\\Documents\\Jencie Daniel1\\Texas Tech University\\Software Engineering I\\"
                + "Call Blocker\\CallBlockerMine1\\Numbers.txt");
        
       BufferedReader reader = new BufferedReader(new FileReader(file));
       
       while ((string = reader.readLine()) != null)
       {
           lineNumber++;
           
           
       }
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file); 
  
 //   while (sc.hasNextLine()) 
  //    System.out.println(sc.nextLine()); 
    
    System.out.println("");
    System.out.print("Enter the phone number to check if it is a spam number that is our system: ");
    int number = input.nextInt();
    
    
      int x = 3;
    int counter = 0;

    // Read all the numbers in the file, and count how many times x appears.
   // while(sc.hasNextInt()) 
    {
        int list = sc.nextInt();
        if(list == number)
        {
            System.out.println("Call is a scam. Call Blocked.");
        }
        
        else if (list != number)
        {
            System.out.println("Number is not in the system, call is not blocked.");
        }
                
    }
    
  /*  while(sc.hasNextInt()) 
    {
      //  int number = input.nextInt();
        if(number == )
            counter++;
    }*/

   
        
    }
}
    //THIS IS THE END OF JENCIE'S CODE--------------------------------------------------------------------------------------------
    
}
 
    
}
 
