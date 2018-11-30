import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class app {

	//Function to write questions to file
	public static void initialize(String filename) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "rw");
			Question quiz = new Question();

			for (int idx = 1; idx <= 10; idx++) {
				file.seek((idx - 1) * quiz.sizeof());
				file.writeInt(quiz.getId());
				file.writeUTF(quiz.getPrompt());
				file.writeUTF(quiz.getAnswer());
			}

		} catch (IOException err) {
			System.err.println(err);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException err) {
					System.err.println(err);
				}
			}
		}
	}
	
	
	public static void writeRecord(String testName) {
		
		String[] accounting = {
				"\r\n" + 
				"The accounting profession can be divided into three major categories; specifically, the practice of public accounting, private accounting, \r\n" + 
				"and governmental accounting. A somewhat unique and important service of public accountants is:\r\n" + 
				"\r\n" + 
				" a) Financial accounting-\r\n" + 
				" 	\r\n" + 
				" b) Auditing	\r\n" + 
				"\r\n" , 
				"The primary private sector agency that oversees external financial reporting standards is the:\r\n" + 
				"\r\n" + 
				" a)Financial Accounting Standards Board.-\r\n" + 
				"	\r\n" + 
				" b)Federal Bureau of Investigation.	\r\n" + 
				"\r\n" , 
				"Which of the following equations properly represents a derivation of the fundamental accounting equation?\r\n" + 
				"\r\n" + 
				"a) Cash = assets.\r\n" + 
				"\r\n" + 
				"b) Assets – liabilities = owner's equity-\r\n" + 
				"\r\n" , 
				"Wilson Company owns land that cost $100,000. If a “quick sale” of the land was necessary to generate cash, the company feels it would receive only $80,000. \r\n" + 
				"The company continues to report the asset on the balance sheet at $100,000. Which of the following concepts justifies this?\r\n" + 
				"\r\n" + 
				"a) The historical-cost principle	\r\n" + 
				"\r\n" + 
				"b) The money-cost principle\r\n" + 
				"\r\n" , 
				"Retained earnings will change over time because of several factors. Which of the following factors would explain an increase in retained earnings?\r\n" + 
				"\r\n" + 
				"a) Net income	-\r\n" + 
				"\r\n" + 
				"b) Dividends	\r\n" + 
				"\r\n" , 
				"Which of these items would be accounted for as an expense?\r\n" + 
				"\r\n" + 
				"a) The purchase of land\r\n" + 
				"	\r\n" + 
				"b) Payment of the current period's rent-\r\n" + 
				"\r\n" , 
				"Which of the following transactions would have no impact on stockholders’ equity?\r\n" + 
				"\r\n" + 
				"a) Purchase of land from the proceeds of a bank loan-\r\n" + 
				"\r\n" + 
				"b) Dividends to stockholders \r\n" + 
				"\r\n" , 
				"Which of the following would not be included on a balance sheet?\r\n" + 
				"\r\n" + 
				"a) Sales -\r\n" + 
				"\r\n" + 
				"b) Cash \r\n" + 
				"\r\n" , 
				"Gerald had beginning total stockholders’ equity of $160,000. During the year, total assets increased by $240,000 and total liabilities increased by $120,000.\r\n" + 
				"Gerald’s net income was $180,000. No additional investments were made; however,dividends did occur during the year. How much were the dividends?\r\n" + 
				"\r\n" + 
				"a) 60,000 -\r\n" + 
				"\r\n" + 
				"b) 80,000 \r\n" + 
				"\r\n" , 
				"The long term assets that have no physical existence but are rights that have value is known as\r\n" + 
				"\r\n" + 
				"a) Current assets\r\n" + 
				"\r\n" + 
				"b) Intangible assets-\r\n" + 
				""
				};
		String[] accAns = {"a", "a", "b", "b","a","b","a", "a", "a","b"};
		
		
		//Bio Questions
		
		String[] biology = {
				"Ordinary table salt is sodium chloride. What is baking soda?\r\n" + 
				"\r\n" + 
				"a) Potassium chloride\r\n" + 
				"	\r\n" + 
				"b) Sodium bicarbonate -\r\n" + 
				"\r\n" + 
				"	\r\n", 
				"Ozone hole refers to\r\n" + 
				"\r\n" + 
				"a) hole in ozone layer\r\n" + 
				"	\r\n" + 
				"b) decrease in thickness of ozone layer in stratosphere -\r\n" + 
				"\r\n"+ 
				"	\r\n" , 
				"Pine, fir, spruce, cedar, larch and cypress are the famous timber-yielding plants of which several also occur widely in the hilly regions of India. All these belong to\r\n" + 
				"\r\n" + 
				"a) angiosperms\r\n" + 
				"\r\n" + 
				"b) gymnosperms-\r\n" + 
				"\r\n" +
				"\r\n", 
				"Pollination is best defined as\r\n" + 
				"\r\n" + 
				"a) transfer of pollen from anther to stigma\r\n" + 
				"\r\n" + 
				"b) visiting flowers by insects\r\n" + 
				"\r\n" , 
				"Plants receive their nutrients mainly from\r\n" + 
				"\r\n" + 
				"a) chlorophyll\r\n" + 
				"\r\n" + 
				"b) soil-\r\n" + 
				"\r\n" , 
				"Movement of cell against concentration gradient is called\r\n" + 
				"\r\n" + 
				"a) osmosis\r\n" + 
				"\r\n" + 
				"b) active transport-\r\n" + 
				"\r\n" + 
				"	\r\n" , 
				"Photosynthesis generally takes place in which parts of the plant?\r\n" + 
				"\r\n" + 
				"a) Leaf and other chloroplast bearing parts\r\n" + 
				"\r\n" + 
				"b) stem and leaf -\r\n" + 
				"\r\n" , 
				"Plants synthesis protein from\r\n" + 
				"\r\n" + 
				"a) starch\r\n" + 
				"\r\n" + 
				"b) amino acids-\r\n" + 
				"\r\n" , 
				"Plants absorb dissolved nitrates from soil and convert them into\r\n" + 
				"\r\n" + 
				"a) free nitrogen -\r\n" + 
				"\r\n" + 
				"b) urea\r\n" + 
				"\r\n" , 
				"One of the following is not a function of bones.\r\n" + 
				"\r\n" + 
				"a) Place for muscle attachment\r\n" + 
				"\r\n" + 
				"b) Secretion of hormones for calcium regulation in blood and bones-\r\n" + 
				""		
		};
		
		//Answers for Bio
		
		String[] bioAns = {"b","b","b","a","b","b","b","b","a","b"};
		
		
		//Computing Questions
		
		String[] computing = {
				" Person who analyze information system and have practical experience of computers is classified as\r\n" + 
				"\r\n" + 
				"a) system analyst-\r\n" + 
				"\r\n" + 
				"b) system updater\r\n" + 
				"\r\n", 
				" Programmer who writes system software is called\r\n" + 
				"\r\n" + 
				"a) system programmer-\r\n" + 
				"\r\n" + 
				"b)train programmer\r\n" + 
				"\r\n" ,
				"Programmer who works with high level languages and have better understanding with applications are considered as\r\n" + 
				"\r\n" + 
				"a)design programmer\r\n" + 
				"\r\n" + 
				"b)application programmer-\r\n" + 
				"\r\n" ,
				"People who accept tasks from computer users, processes it and then return user there complete tasks are considered as\r\n" + 
				"\r\n" + 
				"a)terminal control staff\r\n" + 
				"\r\n" + 
				"b)data control staff-\r\n" + 
				"\r\n" ,
				"Person who keeps disc and tape files up to date for computer installation is called\r\n" + 
				"\r\n" + 
				"a)file librarian\r\n" + 
				"\r\n" + 
				"b)punch librarian\r\n" + 
				"\r\n" ,
				"Type of programmer who write programs for a specific user to carry out special instructions is classified as\r\n" + 
				"\r\n" + 
				"a)applications programmer-\r\n" + 
				"\r\n" + 
				"b)train programmers\r\n" + 
				"\r\n" ,
				"Checking of submitted jobs, preparation of keyed in data and returning output to users are duties of\r\n" + 
				"\r\n" + 
				"a)peripheral control staff\r\n" + 
				"\r\n" + 
				"b)data control staff-\r\n" + 
				"\r\n" ,
				"Duties of programmer does not includes\r\n" + 
				"\r\n" + 
				"a)program maintenance\r\n" + 
				"\r\n" + 
				"b)defining methods of data collection-\r\n" + 
				"\r\n" ,
				" Analysis of present system, carrying out feasibility report and designing new system are duties of\r\n" + 
				"\r\n" + 
				"a)data manager\r\n" + 
				"b) CUP\r\n" + 
				"\r\n" ,
				"Checking of submitted jobs, preparation of keyed in data and returning output to users are duties of\r\n" + 
				"\r\n" + 
				"a)peripheral control staff\r\n" + 
				"\r\n" + 
				"b)data control staff-\r\n" + 
				"\r\n" + 
				"b)systems analyst-"
		};
		
		String[] comAns = {"a","a","b","b","a","a","b","b","a","b"};
		
		//entrepreneurship Questions
		
		String[] entrepreneurship = {
				"A lifestyle firm exists primarily to support the owners and usually has…….growth opportunity.\r\n" + 
				"\r\n" + 
				"a)high\r\n" + 
				"\r\n" + 
				"b)low-\r\n" + 
				"\r\n" , 
				"Foundation companies are………created from research and development that lay the foundation for a new  industry:\r\n" + 
				"\r\n" + 
				"a)Firm-\r\n" + 
				"\r\n" + 
				"b)Big companies\r\n" + 
				"\r\n" , 
				"High powered ventures  are also called  \r\n" + 
				"\r\n" + 
				"a)Creditors\r\n" + 
				"\r\n" + 
				"b)Gazelles-\r\n" + 
				"\r\n" , 
				"How many entreprenuer venture are there?\r\n" + 
				"\r\n" + 
				"a)9\r\n" + 
				"\r\n" + 
				"b)3-\r\n" + 
				"\r\n" , 
				"A lifestyle firm exists primarily to support the……..\r\n" + 
				"\r\n" + 
				"a)Owner\r\n" + 
				"\r\n" + 
				"b)Investor \r\n" + 
				"\r\n" , 
				"Following personal skills are required in entrepreneurship EXCEPT\r\n" + 
				"\r\n" + 
				"a)Inner Control\r\n" + 
				"\r\n" + 
				"b)Comic\r\n" + 
				"\r\n" , 
				"Following technical skills are required in entrepreneurship EXCEPT\r\n" + 
				"\r\n" + 
				"a)Web designing -\r\n" + 
				"\r\n" + 
				"b)Writing\r\n" + 
				"\r\n" , 
				"Following management skills are required in entrepreneurship EXCEPT\r\n" + 
				"\r\n" + 
				"a)Planning\r\n" + 
				"\r\n" + 
				"b)Inovative-\r\n" + 
				"\r\n" , 
				"Intrapreneurship means\r\n" + 
				"\r\n" + 
				"a)Entrepreneurship in joint ventures\r\n" + 
				"\r\n" + 
				"b)Entrepreneurship within an existing company -\r\n" + 
				"\r\n" , 
				"Following technical skills are required in entrepreneurship EXCEPT\r\n" + 
				"\r\n" + 
				"a)Web designing -\r\n" + 
				"\r\n" + 
				"b)Writing"
				
		};
		//Answers for Entrep 
		String[] entAns = {"a","a","b","b","a","b","a","b","b","a"};
		
		String[] informationTechnology = {
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				" Guns of color present in a computer color screen are\r\n" + 
				"\r\n" + 
				"a)2\r\n" + 
				"\r\n" + 
				"b)3-\r\n" + 
				"\r\n" , 
				"Semiconductor memory device in which stored data will remain permanently stored as long as power is supplied is\r\n" + 
				"\r\n" + 
				"a)dynamic memory device\r\n" + 
				"\r\n" + 
				"b)static memory device\r\n" + 
				"\r\n" , 
				"Computer word size is a multiple of\r\n" + 
				"\r\n" + 
				"a)16 bits-\r\n" + 
				"\r\n" + 
				"b)10 bits\r\n" + 
				"\r\n" , 
				" In computer terminology, OCR stands for\r\n" + 
				"\r\n" + 
				"a)Optical Character Reader-\r\n" + 
				"\r\n" + 
				"b)Online Computer Retrieval\r\n" + 
				"\r\n" , 
				" Type of computer memory in which access time is not constant but varies depending on address location is known as\r\n" + 
				"\r\n" + 
				"a)RAM\r\n" + 
				"\r\n" + 
				"b)SAM\r\n" + 
				"\r\n" ,
				" Device that takes data from user and convert it into form that can be easily understandable by computer is\r\n" + 
				"\r\n" + 
				"a)storage device\r\n" + 
				"\r\n" + 
				"b)input device-\r\n" + 
				"\r\n" , 
				"In computer terminology IME stands for\r\n" + 
				"\r\n" + 
				"a)Infinite Memory Engine-\r\n" + 
				"\r\n" + 
				"b)Input Method Editor\r\n" + 
				"\r\n" , 
				"Computer chain printer consist of a chain of\r\n" + 
				"\r\n" + 
				"a)lines\r\n" + 
				"\r\n" + 
				"b)characters-\r\n" + 
				"\r\n" , 
				"Computer general-purpose software is basically a\r\n" + 
				"\r\n" + 
				"a)system software-\r\n" + 
				"\r\n" + 
				"b)application software\r\n" + 
				"\r\n" , 
				"In computer, testing of a program's component is called\r\n" + 
				"\r\n" + 
				"a)pilot testing\r\n" + 
				"\r\n" + 
				"b)unit testing-"
		}; 
		
		//IT answers
		String[] infAns = {"b","a","a","a","b","b","a","b","a","b"};
		
		String[] mathematics = {
				"Whats is the longest distance ?\r\n" + 
				"\r\n" + 
				"a)10m-\r\n" + 
				"\r\n" + 
				"b)50cm\r\n" + 
				"\r\n" , 
				"What is 10% of 100?\r\n" + 
				"\r\n" + 
				"a)10-\r\n" + 
				"\r\n" + 
				"b)1\r\n" + 
				"\r\n" , 
				"Let f(x) = x2 + 2x + 4. Which of the following statements is NOT true? \r\n" + 
				"\r\n" + 
				"a) f(x) has a maximum value-\r\n" + 
				"\r\n" + 
				"b) The graph of f is not a line \r\n" + 
				"\r\n" , 
				"Simplify: 9log9(4) = \r\n" + 
				"\r\n" + 
				"a) 3 -\r\n" + 
				"\r\n" + 
				"b) 4 \r\n" + 
				"\r\n" , 
				"Simplify: 3log3(-5) = \r\n" + 
				"\r\n" + 
				"a)-5 \r\n" + 
				"\r\n" + 
				"b) undefined\r\n" + 
				"\r\n" , 
				"If logx(3) = 1/4, then x = \r\n" + 
				"\r\n" + 
				"a) 81 \r\n" + 
				"\r\n" + 
				"b) 1/81\r\n" + 
				"\r\n", 
				"The number of points of intersections of the graphs of y = 2x and y = -x2 + 2 is equal to \r\n" + 
				"\r\n" + 
				"a) 0\r\n" + 
				"\r\n" + 
				"b) 2-\r\n" + 
				"\r\n" , 
				"For all x real, v(x2 -4x + 4) = \r\n" + 
				"a)x - 2-\r\n" + 
				"\r\n" + 
				"b)|x - 2|\r\n" + 
				"\r\n" , 
				"What is 30 percent of 50?\r\n" + 
				"\r\n" + 
				"a) 15 -\r\n" + 
				"\r\n" + 
				"b) 5\r\n" + 
				"\r\n" , 
				"What is the 60 percent of 1000?\r\n" + 
				"\r\n" + 
				"a) 600-\r\n" + 
				"\r\n" + 
				"b) 500\r\n" + 
				""};
 		
		//Math Ans
		
		String[] matAns = {"a", "a","a","a","a","a","a","b","a","a"};
		
		//physics
		
		String[] physics = {
				"\r\n" + 
				"A man presses more weight on earth at :\r\n" + 
				"\r\n" + 
				"a) Sitting position\r\n" + 
				"\r\n" + 
				"b) Standing Position-\r\n" + 
				"\r\n" , 
				"A piece of ice is dropped in a vesel containing kerosene. When ice melts, the level of kerosene will\r\n" + 
				"\r\n" + 
				"a) Rise\r\n" + 
				"\r\n" + 
				"b) Fall-\r\n" + 
				"\r\n" , 
				"Young's modulus is the property of\r\n" + 
				"\r\n" + 
				"a) Gas only\r\n" + 
				"\r\n" + 
				"b) Solid only-\r\n" + 
				"\r\n" , 
				"An artificial Satellite revolves round the Earth in circular orbit, which quantity remains constant?\r\n" + 
				"\r\n" + 
				"a) Angular Momentum-\r\n" + 
				"\r\n" + 
				"b) Linear Velocity\r\n" + 
				".\r\n" , 
				"If electrical conductivity increases with the increase of temperature of a substance, then it is a:\r\n" + 
				"\r\n" + 
				"a) Conductor\r\n" + 
				"\r\n" + 
				"b) Semiconductor-\r\n" + 
				"\r\n" , 
				"Minimum distance between and object and real image of a convex lense is:\r\n" + 
				"\r\n" + 
				"a) 4<i>f</i> -\r\n" + 
				"\r\n" + 
				"b) 3<i>f</i>\r\n" + 
				"\r\n" , 
				"Product of Force and Velocity is called:\r\n" + 
				"\r\n" + 
				"a) Work\r\n" + 
				"\r\n" + 
				"b) Power -\r\n" + 
				"\r\n" , 
				"Which one of the following has the highest value of specific heat ?\r\n" + 
				"\r\n" + 
				"a) Alcohol\r\n" + 
				"\r\n" + 
				"b) Water-\r\n" + 
				"\r\n" , 
				"With the increase of pressure, the boiling point of any substance\r\n" + 
				"\r\n" + 
				"a) Increases-\r\n" + 
				"\r\n" + 
				"b) Decreases\r\n" + 
				"\r\n" , 
				"Elecronegativity is the measure of\r\n" + 
				"\r\n" + 
				"a) Metallic character-\r\n" + 
				"\r\n" + 
				"b) Non-metallic character"
		};
		
		//Physics Ans
		String[] phyAns = {"b","b","b","a","b","a","b","b","a","a"};
		
		String[] psycology = {
				"\r\n" + 
				"An assessment is __________ if it consistently achieves the same results with the same students\r\n" + 
				"\r\n" + 
				"a) Valid\r\n" + 
				"		\r\n" + 
				"c) Reliable-	\r\n" + 
				"\r\n" , 
				"A/An __________ assessment is one which measures what it is intended to measure\r\n" + 
				"\r\n" + 
				"a) Valid\r\n" + 
				"	\r\n" + 
				"b) Reliable	-\r\n" + 
				"\r\n" , 
				"The use of technology to enhance learning process is called __________ in education.\r\n" + 
				"\r\n" + 
				"a) IT\r\n" + 
				"\r\n" + 
				"b) ICT-\r\n" + 
				"\r\n" , 
				"The philosopher who worked in mathematical and scientific didactics was?\r\n" + 
				"\r\n" + 
				"a) Jean Piaget\r\n" + 
				"	\r\n" + 
				"b) Martin Wagenschein	-\r\n" + 
				"\r\n" , 
				"According to John Dewey, the teacher should guide students the way of the knowledge as a __________ in learning process.\r\n" + 
				"\r\n" + 
				"a) facilitator\r\n" + 
				"	\r\n" + 
				"b) partner-\r\n" + 
				"\r\n" , 
				"The primary aim of educational psychology is\r\n" + 
				"\r\n" + 
				"a) To contribute to an understanding of sound educational practices.-\r\n" + 
				"\r\n" + 
				"b) To provide a theoretical framework for educational research.\r\n" + 
				"\r\n" , 
				" According to Psychology, all education is\r\n" + 
				"\r\n" + 
				"a) Deliberate -\r\n" + 
				"	\r\n" + 
				"b)Self-education\r\n" + 
				"\r\n" , 
				" The best definition of Educational Psycho­logy is a study of teaching and learning” has been given by\r\n" + 
				"\r\n" + 
				"a) W. Kolesnik	\r\n" + 
				"\r\n" + 
				"b) Charles E. Skinner	-\r\n" + 
				"\r\n" , 
				"Curriculum is\r\n" + 
				"\r\n" + 
				"a) Course\r\n" + 
				"\r\n" + 
				"b) Over all activities of an institution -\r\n" + 
				"\r\n" , 
				"Which one of theories of intelligence advocates the presence of general intelligence 'g' and specific intelligence's' ?\r\n" + 
				"\r\n" + 
				"a) Anarchic theory\r\n" + 
				"\r\n" + 
				"b) Spearman's two factor theory-"
				
		};
		
		//Psy Answers
		String[] psyAns = {"c","b","b","b","b","a","a","b","b","b"};
		
		
		String prompt = "accounting", ans = "a", filename = "accounting.bat";
		
		
		RandomAccessFile file = null;
		try {
			
			for(int q = 0; q < 10; q++) {
				
			if(testName == "accounting") {
				
				prompt = accounting[q];
				ans = accAns[q];
				filename = "accounting.dat";
			}
			else if(testName == "biology") {
				
				prompt = biology[q];
				ans = bioAns[q];
				filename = "biology.dat";
			}
			else if(testName == "computing") {
				
				prompt = computing[q];
				ans = comAns[q];	
				filename = "computing.dat";
			}
			
			else if(testName == "entrepreneurship") {
				
				prompt = entrepreneurship[q];
				ans = entAns[q];
				filename = "entrepreneurship.dat";
			}
			else if(testName == "informationTechnology") {
				
				prompt = informationTechnology[q];
				ans = infAns[q];
				filename = "informationTechnology.dat";
			}
			else if(testName == "mathematics") {
				
				prompt = mathematics[q];
				ans = matAns[q];
				filename = "mathematics.dat";
			}
			
			
			else if(testName == "physics") {
				
				prompt = physics[q];
				ans = phyAns[q];
				filename = "physics.dat";
			}
			else if(testName == "psycology") {
				
				prompt = psycology[q];
				ans = psyAns[q];
				filename = "psycology.dat";
			}
			else {
				System.out.println("No Match found");
			}
			
				
			Question quiz = new Question(q,prompt,ans);
			
			file = new RandomAccessFile(filename, "rw");
			file.seek(((quiz.getId()+1) - 1) * quiz.sizeof());
			file.writeInt(quiz.getId());
			file.writeUTF(quiz.getPrompt());
			file.writeUTF(quiz.getAnswer());
			
			}
			
		} catch (IOException err) {
			System.err.println(err);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException err) {
					System.err.println(err);
				}
			}
		}
		
}//end method
	
	public static int takeTest(String filename) {
		int score = 0;
		
		RandomAccessFile file = null;
		
		try {
			file = new RandomAccessFile(filename, "rw");
			
			Question[] quiz = new Question[10];
			
			for(int i = 1; i <= 10; i++ ) {
				
			file.seek((i-1) * (4+(2*250)+(2*1)));
			int id = file.readInt();
			String prompt = file.readUTF();
			String answer = file.readUTF();
			
			
			quiz[i-1]= new Question(id, prompt, answer);
			
			}
			
			Scanner keyBoardInput = new Scanner(System.in);
			
			for(int a = 0; a <= 9; a++) {
				
				System.out.println(quiz[a].prompt);
				
				String userAnswer = keyBoardInput.nextLine();
				
				if(userAnswer.equals(quiz[a].answer)) {
					score++;
					
				}
				System.out.println("You got " + score + "/ 10");
			}	
				
		} catch (IOException err) {
			System.err.println(err);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException err) {
					System.err.println(err);
				}
			}
		}
		
		return score;	
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter \n 1. to initailize file \n 2. add questions \n 3. to take test. ");
		
		Scanner kbScanner = new Scanner(System.in);
		
		String userInput = kbScanner.nextLine();
		
		int choice = Integer.parseInt(userInput);
			
		
		switch(choice) {
		
		case 1 :
			//ToDo: Check if file was initialized before
			initialize("test.dat");
			break;
			
		case 2 : 
			//ToDo: Accept question id, question and answer from staff
			//Can have a loop here to call methods for 8 different courses
			//initialize("computing.dat");
			//writeRecord("computing");
			
			initialize("computing.dat");
			writeRecord("computing");
			
			initialize("entrepreneurship.dat");
			writeRecord("entrepreneurship");
			
			initialize("informationTechnology.dat");
			writeRecord("informationTechnology");
			
			initialize("physics.dat");
			writeRecord("physics");
			
			initialize("psycology.dat");
			writeRecord("psycology");
			
			initialize("accounting.dat");
			writeRecord("accounting");
			break;
		
		case 3:
			//ToDo: Store result in result file
			takeTest("computing.dat");
			break;
			
		default: 
			System.out.println("Default option");
		}
			
		
		
		
		
		}

}
