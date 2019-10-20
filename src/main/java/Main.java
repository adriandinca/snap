import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Main {

	static GraphicsConfiguration gc;
	static JFrame frame;
	private static ClassLoader loader;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				displayJFrame();
			}
		});
	}

	private static void displayJFrame() {
		frame = new JFrame("SNAP");

		JButton doPM = new JButton("Do PM kit!");
		JButton doTwentyPMs = new JButton("Do twenty PM kits!");

		try {
			BufferedImage myPicture = ImageIO.read(new java.io.File("resources/thanos.jpeg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			frame.add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}

		doPM.addActionListener(ev -> runScenario());
		doTwentyPMs.addActionListener(ev -> runTwentyScenarios());

		frame.getContentPane().setLayout(new FlowLayout());
		frame.add(doPM);
		frame.add(doTwentyPMs);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(320, 240));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private static synchronized ClassLoader getClassLoader() {
		if (loader == null)
			loader = Thread.currentThread().getContextClassLoader();
		return loader;
	}

	private static void runScenario() {
		try {
			cucumber.api.cli.Main.run(
					new String[] { "-g", "steps",
							"/home/adi/eclipse-workspace/snap/src/test/java/features/logPM.feature" },
					getClassLoader());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void runTwentyScenarios() {
		for (int i = 0; i < 20; i++) {
			runScenario();
		}
	}
}
