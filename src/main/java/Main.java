
public class Main {
	public static void main(String[] args) throws Throwable {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");

		cucumber.api.cli.Main.main(new String[] { "-g", 
				//"/home/adi/eclipse-workspace/snap/src/main/java/steps",
				"steps",
				"/home/adi/eclipse-workspace/snap/src/test/java/features/logPM.feature" });

		// My stepdefinition is inside java package at cucumber.sample.test
		// My feature file is inside src/test/resources/features/featurefile.feature

	}
}
