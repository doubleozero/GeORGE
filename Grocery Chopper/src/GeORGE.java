public class GeORGE {
	
	public static void main(String[] args){
		StartUp begin = new StartUp();
		begin.startUp();
			
		// Test case - remove later
		TestCase test = new TestCase();
		test.runTest();
		
		// Now let's test creating a GUI:
		new UserInterface();               // constructor
		// After I moved the above from TestCase, the following message appears in the console:
		// [0x7FFD49F2EF10] ANOMALY: meaningless REX prefix used
		// This appears to simply be an issue with the graphics card and largely benign. 
	}
}

// NOTE: If at any point I have a task that all instances of a class have in common (and yield the same result), I should code it as a static method, and may also require a static initializer. 