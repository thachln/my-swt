package mksgroup.demo.swt.spring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GUI {

	protected Shell shell;
	private Text txtXinCho;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		txtXinCho = new Text(shell, SWT.BORDER);
		txtXinCho.setText("Xin chào, đây là bước đầu làm quen ứng dụng với  SWT.");
		txtXinCho.setBounds(10, 10, 376, 21);

	}
}
