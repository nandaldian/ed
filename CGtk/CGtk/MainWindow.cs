using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

//		Console.WriteLine("27/10 = " + 27/10 + " resto = " + 27 % 10);
//
//
//		labelSaludo.Text = "Hola, pon tu nombre y pulsa adelante.";

		Table table = new Table (9, 10, true);

		for (uint index = 0; index < 90; index++) {
			uint row = index / 10;
			uint column = index % 10;
			int numero = (int)index + 1;
			Button button = new Button ();
			button.Label = numero.ToString();
			button.Visible = true;
			table.Attach (button, column, column + 1, row, row + 1);

//			button.Clicked += delegate {
//				Console.WriteLine ("Pulsado " + button.Label);
//			};
//			button.Clicked += OnButtonGoForwardClicked;
		}
		table.Visible = true;
		vBoxMain.Add (table);
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		Button button = (Button)sender;
		labelSaludo.Text = "Hola " + entryNombre.Text + " pulsado " + button.Label;
	}
}
